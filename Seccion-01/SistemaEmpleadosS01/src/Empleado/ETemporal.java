package Empleado;

import Persona.Persona;

public class ETemporal extends Empleado {
    public ETemporal(Persona persona, String carnet, float salarioBase){
        inicializarEmpleado(persona, carnet, salarioBase);
    }

    public float obtenerSalario() {
        return salarioBase;
    }
}
