package Composite;

public abstract class Tarea {
    protected int id;
    protected String titulo;

    protected Tarea(int id, String titulo) {
        this.titulo = titulo;
        this.id = id; //La busqueda fallaba porque no se habia asignado el ID
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarContenido(){
        mostrarContenidoAux(0);
    }

    // Se agrega el contrato de buscar tarea para que no haya que tener distincion entre TareaSimple y ListaTareas
    public abstract Tarea buscarTarea(int id);

    // Igual que el caso anterior, necesitamos que este metodo exista en ambos tipos de tarea
    public abstract void eliminarTarea(int id);

    public abstract void mostrarContenidoAux(int nivel);
}
