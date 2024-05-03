package AbstractFactory;

import AbstractFactory.Armarios.Armario;
import AbstractFactory.Sillas.Silla;
import AbstractFactory.Mesas.Mesa;

public interface AbstractFactory {
    Silla createSilla();
    Mesa createMesa();
    Armario createArmario();
}
