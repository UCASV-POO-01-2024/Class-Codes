package Empleado;

import Persona.Persona;

public abstract class Empleado extends Persona{
    private String carnet;
    protected float salarioBase;

    protected void inicializarEmpleado(Persona persona, String carnet, float salarioBase){
        copiarPersona(persona);
        setCarnet(carnet);
        setSalarioBase(salarioBase);
    }

    public abstract float obtenerSalario();

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
}
