package Persona;

import java.util.Date;

public class Persona {
    private String DUI;
    private String nombre;
    private Date fechaNacimiento;
    private String numeroTel;
    private char sexo;

    public Persona() {}

    public Persona(String DUI, String nombre, Date fechaNacimiento, String numeroTel, char sexo) {
        this.DUI = DUI;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTel = numeroTel;
        this.sexo = sexo;
    }

    public void copiarPersona(Persona persona) {
        DUI = persona.DUI;
        nombre = persona.nombre;
        fechaNacimiento = persona.fechaNacimiento;
        numeroTel = persona.numeroTel;
        sexo = persona.sexo;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
