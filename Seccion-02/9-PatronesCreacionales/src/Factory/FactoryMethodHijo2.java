package Factory;

public class FactoryMethodHijo2 implements FactoryMethod{
    public Padre crearPadre(String[] atributos) {
        return new Hijo2(atributos[0], atributos[1]);
    }
}
