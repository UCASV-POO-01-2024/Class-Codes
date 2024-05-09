package Factory;

public class SimpleFactory {
    private static SimpleFactory instance;

    private SimpleFactory(){}

    public static SimpleFactory getInstance(){
        if(instance == null){
            instance = new SimpleFactory();
        }
        return instance;
    }

    public Padre getHijo(String tipo, String[] atributos) throws ClassNotFoundException {
        if(tipo == "1"){
            return new Hijo1(atributos[0], atributos[1]);
        } else if(tipo == "2"){
            return new Hijo2(atributos[0], atributos[1], atributos[2]);
        } else {
            throw new ClassNotFoundException("No existe la clase indicada");
        }
    }
}
