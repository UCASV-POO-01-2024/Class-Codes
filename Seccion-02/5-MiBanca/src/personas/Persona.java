package personas;

import java.util.Scanner;

public class Persona {
    private String DUI;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String correo;
    private String telefono;
    private String domicilio;

    private Persona(){

    }

    public Persona(String DUI, String nombre, String apellido, String fechaNacimiento, String correo, String telefono, String domicilio) {
        this.DUI = DUI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.domicilio = domicilio;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public static Persona crearPersona(){
        Persona p = new Persona();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su número de DUI:");
        p.setDUI(input.nextLine());
        System.out.println("Ingrese sus nombres:");
        p.setNombre(input.nextLine());
        System.out.println("Ingrese sus apellidos:");
        p.setApellido(input.nextLine());
        System.out.println("Ingrese su fecha de nacimiento:");
        p.setFechaNacimiento(input.nextLine());
        System.out.println("Ingrese su correo:");
        p.setCorreo(input.nextLine());
        System.out.println("Ingrese su número de teléfono:");
        p.setTelefono(input.nextLine());
        System.out.println("Ingrese su domicilio:");
        p.setDomicilio(input.nextLine());

        return p;
    }
}
