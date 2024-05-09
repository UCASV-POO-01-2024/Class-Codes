package AbstractFactory;

import AbstractFactory.Armarios.Armario;
import AbstractFactory.Armarios.ArmarioPlastico;
import AbstractFactory.Mesas.Mesa;
import AbstractFactory.Mesas.MesaPlastico;
import AbstractFactory.Sillas.Silla;
import AbstractFactory.Sillas.SillaPlastico;

public class FactoryPlasticos implements AbstractFactory{
    public Silla createSilla() {
        return new SillaPlastico();
    }

    public Mesa createMesa() {
        return new MesaPlastico();
    }

    public Armario createArmario() {
        return new ArmarioPlastico();
    }
}
