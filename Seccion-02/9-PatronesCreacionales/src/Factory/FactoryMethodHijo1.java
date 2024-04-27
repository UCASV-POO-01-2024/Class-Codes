package Factory;

public class FactoryMethodHijo1 implements FactoryMethod{
    public Padre crearPadre(String[] atributos) {
        return new Hijo1(atributos[0]);
    }
}
