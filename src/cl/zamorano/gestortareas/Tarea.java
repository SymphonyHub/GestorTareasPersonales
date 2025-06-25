package cl.zamorano.gestortareas;

public class Tarea implements Cloneable {
    private String titulo;
    private String prioridad; // Baja, Media, Alta
    private boolean completada;

    public Tarea(String titulo, String prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.completada = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public boolean estaCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    @Override
    public Tarea clone() {
        try {
            return (Tarea) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar la tarea", e);
        }
    }

    @Override
    public String toString() {
        return "[ " + (completada ? "✔" : "✘") + " ] " + titulo + " (" + prioridad + ")";
    }
}
