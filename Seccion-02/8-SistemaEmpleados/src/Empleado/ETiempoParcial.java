package Empleado;

import Persona.Persona;

public class ETiempoParcial extends Empleado implements PagoPorHoras{
    private int horasDeTrabajoBase;

    public ETiempoParcial(Persona persona, String carnet, float salarioBase, int horasDeTrabajoBase) {
        super(persona);
        setCarnet(carnet);
        setSalarioBase(salarioBase);
        this.horasDeTrabajoBase = horasDeTrabajoBase;
    }

    public int getHorasDeTrabajoBase() {
        return horasDeTrabajoBase;
    }

    public void setHorasDeTrabajoBase(int horasDeTrabajoBase) {
        this.horasDeTrabajoBase = horasDeTrabajoBase;
    }

    public float obtenerSalario() {
        return calcularSalario(horasDeTrabajoBase);
    }

    public float calcularSalario(int horasTrabajadas) {
        return horasTrabajadas*salarioBase;
    }
}
