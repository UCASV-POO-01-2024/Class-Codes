package Factory;

public class FactoryMethodClient {
    public FactoryMethodClient(){

    }

    public Padre obtenerPadre(String tipo, String[] atributos){
        FactoryMethod fabrica = null;
        if(tipo == "1"){
            fabrica = new FactoryMethodHijo1();
        } else if (tipo == "2"){
            fabrica = new FactoryMethodHijo2();
        }

        if (fabrica != null){
            return fabrica.crearPadre(atributos);
        } else {
            System.out.println("No existe la factory seleccionada.");
            return null;
        }
    }
}
