package Empleado;

import Persona.Persona;

public class ETiempoCompleto extends Empleado {
    public ETiempoCompleto(Persona persona, String carnet, float salarioBase){
        super(persona, carnet, salarioBase);
    }

    public float obtenerSalario() {
        return salarioBase;
    }
}
