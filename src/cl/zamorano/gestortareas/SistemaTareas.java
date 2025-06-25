package cl.zamorano.gestortareas;

import java.util.Scanner;

public class SistemaTareas {
    private static SistemaTareas instancia;
    private GestorComandos gestor;
    private Scanner scanner;

    // Constructor privado para Singleton
    private SistemaTareas() {
        gestor = new GestorComandos();
        scanner = new Scanner(System.in);
    }

    // Método estático para obtener la instancia única
    public static SistemaTareas getInstancia() {
        if (instancia == null) {
            instancia = new SistemaTareas();
        }
        return instancia;
    }

    public void iniciar() {
        System.out.println("===== GESTOR DE TAREAS =====");
        String opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextLine();
            gestor.ejecutar(opcion);
        } while (!opcion.equals("5"));
    }

    private void mostrarMenu() {
        System.out.println("\n1. Crear tarea");
        System.out.println("2. Listar tareas");
        System.out.println("3. Completar tarea");
        System.out.println("4. Eliminar tarea");
        System.out.println("5. Clonar tarea");
        System.out.println("6. Exportar tareas a CSV");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

}
