package cl.zamorano.gestortareas;

import java.util.List;

public class ExportadorCSV implements Exportador {

    @Override
    public void exportar(List<Tarea> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas para exportar.");
            return;
        }

        System.out.println("\n📤 Exportando tareas en formato CSV simulado:");
        System.out.println("Titulo,Prioridad,Completada");

        for (Tarea tarea : tareas) {
            String linea = String.format(
                "%s,%s,%s",
                tarea.getTitulo(),
                tarea.getPrioridad(),
                tarea.estaCompletada() ? "Sí" : "No"
            );
            System.out.println(linea);
        }
    }
}
