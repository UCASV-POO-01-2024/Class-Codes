package AbstractFactory;

import AbstractFactory.Sillas.Silla;
import AbstractFactory.Armarios.Armario;
import AbstractFactory.Mesas.Mesa;
import Enums.Materiales;

import static Enums.Materiales.*;

public class AbstractFactoryClient {
    private AbstractFactory currentFactory;

    public AbstractFactoryClient(Materiales factoryType) {
        setCurrentFactory(factoryType);
    }

    public AbstractFactory getCurrentFactory() {
        return currentFactory;
    }

    public void setCurrentFactory(Materiales factoryType) {
        switch (factoryType){
            case METAL:
                currentFactory = new FactoryMetales();
                break;
            case PLASTICO:
                currentFactory = new FactoryPlasticos();
                break;
            case MADERA:
                currentFactory = new FactoryMaderas();
                break;
        }
    }

    public Silla createSilla(){
        return currentFactory.createSilla();
    }

    public Mesa createMesa(){
        return currentFactory.createMesa();
    }

    public Armario createArmario(){
        return currentFactory.createArmario();
    }

}
