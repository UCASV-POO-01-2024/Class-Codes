package AbstractFactory;

import AbstractFactory.Armarios.Armario;
import AbstractFactory.Armarios.ArmarioMetal;
import AbstractFactory.Mesas.Mesa;
import AbstractFactory.Mesas.MesaMetal;
import AbstractFactory.Sillas.Silla;
import AbstractFactory.Sillas.SillaMetal;

public class FactoryMetales implements AbstractFactory{
    public Silla createSilla() {
        return new SillaMetal();
    }

    public Mesa createMesa() {
        return new MesaMetal();
    }

    public Armario createArmario() {
        return new ArmarioMetal();
    }
}
