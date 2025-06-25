package cl.zamorano.gestortareas;

import java.util.List;

public class ExportarTareasComando implements Comando {
    private List<Tarea> tareas;
    private Exportador exportador;

    public ExportarTareasComando(List<Tarea> tareas) {
        this.tareas = tareas;
        this.exportador = new ExportadorCSV(); // Aquí usamos el Adapter
    }

    @Override
    public void ejecutar() {
        exportador.exportar(tareas);
    }
}
