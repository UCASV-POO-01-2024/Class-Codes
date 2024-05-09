package AbstractFactory;

import AbstractFactory.Armarios.Armario;
import AbstractFactory.Armarios.ArmarioMadera;
import AbstractFactory.Mesas.Mesa;
import AbstractFactory.Mesas.MesaMadera;
import AbstractFactory.Sillas.Silla;
import AbstractFactory.Sillas.SillaMadera;

public class FactoryMaderas implements AbstractFactory{
    public Silla createSilla() {
        return new SillaMadera();
    }

    public Mesa createMesa() {
        return new MesaMadera();
    }

    public Armario createArmario() {
        return new ArmarioMadera();
    }
}
