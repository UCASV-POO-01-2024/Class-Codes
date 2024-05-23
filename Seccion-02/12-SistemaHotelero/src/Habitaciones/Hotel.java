package Habitaciones;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<ArrayList<Habitacion>> habitaciones;

    public Hotel(int filas, int columnas){
        habitaciones = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            ArrayList<Habitacion> fila= new ArrayList<>();
            for (int j = 0; j < columnas; j++) {
                fila.add(null);
            }
            habitaciones.add(fila);
        }
    }

    public Hotel(){
        habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(String tipo, int numeroHabitacion, double precio, int[] coordenadas){
        FactoryHabitaciones factory = null;
        switch (tipo){
            case "sencilla":
                factory = new FactorySencilla();
                break;
            case "premium":
                factory = new FactoryPremium();
                break;
            case "presidencial":
                factory = new FactoryPresidencial();
                break;
        }
        Habitacion nuevaHabitacion = factory.crearHabitacion(numeroHabitacion, precio);


        if(habitaciones.size() <= coordenadas[0]){
            for (int i = habitaciones.size(); i <= coordenadas[0]; i++){
                habitaciones.add(new ArrayList<>());
            }
        }

        ArrayList<Habitacion> fila = habitaciones.get(coordenadas[0]);

        if(fila.size() <= coordenadas[1]){
            for (int j = fila.size(); j <= coordenadas[1]; j++){
                fila.add(null);
            }
        }
        fila.set(coordenadas[1], nuevaHabitacion);
    }

    public void eliminarHabitacion(int fila, int columna, boolean eliminarCompleto){
        if (habitaciones.size() > fila){
            if(habitaciones.get(fila).size() > columna){
                if(eliminarCompleto) {
                    habitaciones.get(fila).remove(columna);
                }else{
                    habitaciones.get(fila).set(columna, null);
                }
            }
        }
    }

    public void mostrarHabitaciones(){
        for (ArrayList<Habitacion> fila: habitaciones) {
            for (Habitacion habitacion: fila) {
                System.out.print(
                        (habitacion==null
                        ?"Vacio"
                        :habitacion.obtenerTipoHabitacion())
                        + " | "
                );
            }
            System.out.println();
        }
    }
}
