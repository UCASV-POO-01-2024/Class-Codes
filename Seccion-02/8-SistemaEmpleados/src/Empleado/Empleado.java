package Empleado;

import Persona.Persona;

public abstract class Empleado extends Persona {
    private String carnet;
    protected float salarioBase;

    public Empleado(){}

    public Empleado(Persona persona){
        super(persona);
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
