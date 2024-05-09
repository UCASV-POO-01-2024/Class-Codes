import Adapter.AdaptadorCircular;
import Adapter.AgujeroCircular;
import Adapter.PiezaCircular;
import Adapter.PiezaCuadrada;
import Composite.*;

public class Main {
    public static void main(String[] args) {
        //------------------Adapter-------------------------
        PiezaCircular pieza1 = new PiezaCircular(15);

        AgujeroCircular agujeroGrande = new AgujeroCircular(20);
        AgujeroCircular agujeroSmall = new AgujeroCircular(10);

        System.out.println("Probando con pieza circular");
        System.out.println(agujeroGrande.encaja(pieza1));
        System.out.println(agujeroSmall.encaja(pieza1));

        PiezaCuadrada pieza2 = new PiezaCuadrada(15);
        AdaptadorCircular piezaAdaptada = new AdaptadorCircular(pieza2);

        System.out.println("Probando con pieza cuadrada");
        System.out.println(agujeroGrande.encaja(piezaAdaptada));
        System.out.println(agujeroSmall.encaja(piezaAdaptada));

        //------------------Composite-------------------------
        System.out.println("\n---------Composite---------\n");

        //Un muy buen caso para un Builder
        ListaTareas miLista = new ListaTareas(1,"Tareas Semanales");

        ListaTareas tareasLunes = new ListaTareas(2,"Lunes");
        tareasLunes.agregarTarea(new TareaSimple(3,"Ir al super"));
        tareasLunes.agregarTarea(new TareaSimple(4,"Dar clase de POO"));

        ListaTareas tareasMiercoles = new ListaTareas(5,"Miercoles");
        tareasMiercoles.agregarTarea(new TareaSimple(6,"Lavar el carro"));
        tareasMiercoles.agregarTarea(new TareaSimple(7,"Dar clase de POO"));

        miLista.agregarTarea(tareasLunes);
        miLista.agregarTarea(tareasMiercoles);

        miLista.mostrarContenido();

        System.out.println("\nBuscando tareas");
        //Busqueda de tareas
        Tarea tareaBuscada = miLista.buscarTarea(5); // No importa el ID que se busque, la tarea se muestra correctamente
        if (tareaBuscada != null){
            System.out.println("\nTarea encontrada:");
            tareaBuscada.mostrarContenido();
        }else{
            System.out.println("\nNo se encontro la tarea seleccionada.");
        }

        System.out.println("\nEliminando tareas");
        miLista.eliminarTarea(6); // Pueden eliminarse TareaSimple y ListaTareas
        miLista.mostrarContenido();
    }
}