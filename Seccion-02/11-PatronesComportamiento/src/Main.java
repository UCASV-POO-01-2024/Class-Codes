import Observer.*;

public class Main {
    public static void main(String[] args) {
        Sensor sanSalvador = new Sensor();
        double [] coords = new double[2];
        coords[0] = 100;
        coords[1] = 50;

        Estacion a = new Estacion("A", coords);
        Estacion b = new Estacion("B", coords);
        Estacion c = new Estacion("C", coords);
        Estacion d = new Estacion("D", coords);

        sanSalvador.suscribir(a);
        sanSalvador.suscribir(c);
        sanSalvador.suscribir(d);

        sanSalvador.addMagnitud(0.0);
        sanSalvador.addMagnitud(0.0);
        sanSalvador.addMagnitud(0.0);
        sanSalvador.addMagnitud(0.0);
        sanSalvador.addMagnitud(0.0);
        sanSalvador.addMagnitud(3.0);
        sanSalvador.addMagnitud(7.0);
        sanSalvador.addMagnitud(5.0);
        sanSalvador.addMagnitud(4.5);
        sanSalvador.addMagnitud(1);
        sanSalvador.addMagnitud(3.0);
        sanSalvador.addMagnitud(7.0);

        sanSalvador.calcularMagnitud();

        sanSalvador.eliminarSuscripcion(a);

        System.out.println("\n---Eliminando estacion A---");
        sanSalvador.calcularMagnitud();
    }
}