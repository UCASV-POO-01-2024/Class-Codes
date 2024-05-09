package Composite;

public class TareaSimple extends Tarea{

    public TareaSimple(int id, String titulo) {
        super(id, titulo);
    }

    // TareaSimple no puede buscar tareas
    public Tarea buscarTarea(int id) {
        return null;
    }

    public void eliminarTarea(int id) {
        //No hacemos nada
    }

    public void mostrarContenidoAux(int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
        System.out.println("- "+titulo);
    }

}
