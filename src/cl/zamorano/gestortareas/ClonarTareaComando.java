package cl.zamorano.gestortareas;

import java.util.List;
import java.util.Scanner;

public class ClonarTareaComando implements Comando {
    private List<Tarea> tareas;
    private Scanner scanner;

    public ClonarTareaComando(List<Tarea> tareas, Scanner scanner) {
        this.tareas = tareas;
        this.scanner = scanner;
    }

    @Override
    public void ejecutar() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas para clonar.");
            return;
        }

        System.out.println("\nSeleccione la tarea a clonar:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        System.out.print("Número de tarea: ");
        try {
            int opcion = Integer.parseInt(scanner.nextLine());
            if (opcion >= 1 && opcion <= tareas.size()) {
                Tarea original = tareas.get(opcion - 1);
                Tarea clon = original.clone();

                // ¡Esto es lo importante! El clon comienza como no completado
                clon.marcarComoIncompleta();

                tareas.add(clon);
                System.out.println("🌀 Tarea clonada con éxito.");
            } else {
                System.out.println("❌ Número fuera de rango.");
            }
        } catch (NumberFormatException e) {
            System.out.println("❌ Entrada inválida.");
        } catch (RuntimeException e) {
            System.out.println("❌ Error al clonar la tarea: " + e.getMessage());
        }
    }
}
