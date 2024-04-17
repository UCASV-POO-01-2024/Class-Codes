package Empleado;

import Persona.Persona;

public class ETemporal extends Empleado {
    public ETemporal() {}

    public ETemporal(Persona persona, String carnet, float salarioBase) {
        guardarDatosPersonales(persona);
        setCarnet(carnet);
        setSalarioBase(salarioBase);
    }

    public float obtenerSalario() {
        return super.salarioBase;
    }
}
