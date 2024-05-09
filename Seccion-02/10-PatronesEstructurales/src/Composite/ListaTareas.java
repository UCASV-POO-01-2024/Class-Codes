package Composite;

import java.util.ArrayList;

public class ListaTareas extends Tarea{
    private ArrayList<Tarea> tareas;

    public ListaTareas(int id, String titulo) {
        super(id, titulo);
        tareas = new ArrayList<Tarea>();
    }

    public void agregarTarea(Tarea nuevaTarea){
        tareas.add(nuevaTarea);
    }

    // Metodo de busqueda recursivo
    public Tarea buscarTarea(int id){
        for (Tarea t: tareas) {
            if(t.id == id){
                return t;
            }else{
                Tarea aux = t.buscarTarea(id);
                if(aux != null) return aux;
            }
        }
        // Agregar busqueda recursiva
        return null;
    }

    public void eliminarTarea(int id){
        for (Tarea t: tareas) {
            if(t.id == id){
                tareas.remove(t);
                System.out.println("\nSe ha eliminado la tarea \""+t.titulo+"\" y sus sub-tareas...\n");
            }else{
                t.eliminarTarea(id);
            }
        }
    }

    public void mostrarContenidoAux(int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
        System.out.println("- "+titulo);

        // Reemplazar for con un iterator
        for (Tarea t: tareas) {
            t.mostrarContenidoAux(nivel+1);
        }
    }
}
