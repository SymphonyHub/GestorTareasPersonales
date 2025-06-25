package cl.zamorano.gestortareas;

import java.util.List;

public class ListarTareasComando implements Comando {
    private List<Tarea> tareas;

    public ListarTareasComando(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public void ejecutar() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        System.out.println("\n📋 Lista de tareas:");
        int i = 1;
        for (Tarea tarea : tareas) {
            System.out.println(i + ". " + tarea);
            i++;
        }
    }
}
