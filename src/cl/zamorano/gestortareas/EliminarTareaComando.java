package cl.zamorano.gestortareas;

import java.util.List;
import java.util.Scanner;

public class EliminarTareaComando implements Comando {
    private List<Tarea> tareas;
    private Scanner scanner;

    public EliminarTareaComando(List<Tarea> tareas, Scanner scanner) {
        this.tareas = tareas;
        this.scanner = scanner;
    }

    @Override
    public void ejecutar() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas para eliminar.");
            return;
        }

        System.out.println("\nSeleccione la tarea a eliminar:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        System.out.print("Número de tarea: ");
        try {
            int opcion = Integer.parseInt(scanner.nextLine());
            if (opcion >= 1 && opcion <= tareas.size()) {
                Tarea eliminada = tareas.remove(opcion - 1);
                System.out.println("🗑️ Tarea eliminada: " + eliminada.getTitulo());
            } else {
                System.out.println("❌ Número fuera de rango.");
            }
        } catch (NumberFormatException e) {
            System.out.println("❌ Entrada inválida.");
        }
    }
}
