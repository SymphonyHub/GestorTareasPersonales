package cl.zamorano.gestortareas;

import java.util.List;
import java.util.Scanner;

public class CompletarTareaComando implements Comando {
    private List<Tarea> tareas;
    private Scanner scanner;

    public CompletarTareaComando(List<Tarea> tareas, Scanner scanner) {
        this.tareas = tareas;
        this.scanner = scanner;
    }

    @Override
    public void ejecutar() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas para completar.");
            return;
        }

        System.out.println("\nSeleccione la tarea a completar:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        System.out.print("Número de tarea: ");
        try {
            int opcion = Integer.parseInt(scanner.nextLine());
            if (opcion >= 1 && opcion <= tareas.size()) {
                tareas.get(opcion - 1).marcarComoCompletada();
                System.out.println("✅ Tarea marcada como completada.");
            } else {
                System.out.println("❌ Número fuera de rango.");
            }
        } catch (NumberFormatException e) {
            System.out.println("❌ Entrada inválida.");
        }
    }
}
