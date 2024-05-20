package Observer;

import java.util.ArrayList;

public class Sensor {
    private ArrayList<Suscriptor> estaciones;
    private ArrayList<Double> magnitudes;

    public Sensor() {
        estaciones = new ArrayList<Suscriptor>();
        magnitudes = new ArrayList<Double>();
    }

    public ArrayList<Suscriptor> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Suscriptor> estaciones) {
        this.estaciones = estaciones;
    }

    public ArrayList<Double> getMagnitudes() {
        return magnitudes;
    }

    public void addMagnitud(double nuevaMagnitud) {
        if(magnitudes.size() >= 10) {
            magnitudes.removeFirst();
        }
        magnitudes.add(nuevaMagnitud);
    }

    public void suscribir(Suscriptor s){
        estaciones.add(s);
    }

    public void eliminarSuscripcion(Suscriptor s){
        estaciones.remove(s);
    }

    public void calcularMagnitud(){
        double mag = 0;
        for(Double magnitud: magnitudes){
            mag += magnitud;
        }
        mag /= magnitudes.size();

        for (Suscriptor s: estaciones){
            s.notificar(mag);
        }
    }
}
