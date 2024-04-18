package Persona;

import java.util.Date;

public class Persona {
    private String DUI;
    private String nombre;
    private Date fechaNacimiento;
    private char sexo;
    private String telefono;

    public Persona() {}

    public Persona(String DUI, String nombre, Date fechaNacimiento, char sexo, String telefono) {
        this.DUI = DUI;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public Persona(Persona persona) {
        DUI = persona.DUI;
        nombre = persona.nombre;
        fechaNacimiento = persona.fechaNacimiento;
        sexo = persona.sexo;
        telefono = persona.telefono;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
