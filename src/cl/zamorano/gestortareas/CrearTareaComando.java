package cl.zamorano.gestortareas;

import java.util.List;
import java.util.Scanner;

public class CrearTareaComando implements Comando {
    private List<Tarea> tareas;
    private Scanner scanner;

    public CrearTareaComando(List<Tarea> tareas, Scanner scanner) {
        this.tareas = tareas;
        this.scanner = scanner;
    }

    @Override
    public void ejecutar() {
        System.out.print("Ingrese el título de la tarea: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese la prioridad (Alta / Media / Baja): ");
        String prioridad = scanner.nextLine();

        Tarea nuevaTarea = new Tarea(titulo, prioridad);
        tareas.add(nuevaTarea);

        System.out.println("✅ Tarea creada con éxito.");
    }
}
