package cl.zamorano.gestortareas;

import java.util.*;

public class GestorComandos {
    private List<Tarea> tareas;
    private Scanner scanner;

    public GestorComandos() {
        tareas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void ejecutar(String opcion) {
        Comando comando;

        switch (opcion) {
            case "1":
                comando = new CrearTareaComando(tareas, scanner);
                break;
            case "2":
                comando = new ListarTareasComando(tareas);
                break;
            case "3":
                comando = new CompletarTareaComando(tareas, scanner);
                break;
            case "4":
                comando = new EliminarTareaComando(tareas, scanner);
                break;
            
            case "5":
                comando = new ExportarTareasComando(tareas);
                break;
            case "6":
                comando = new ClonarTareaComando(tareas, scanner);
                break;
                
            case "7":
                System.out.println("Saliendo del sistema...");
                return;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        comando.ejecutar();
    }
}
