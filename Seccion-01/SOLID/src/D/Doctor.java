package D;

public class Doctor {
    private String nombre;
    private String medicalID;
    private String direccion;
    private Paciente paciente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicalID() {
        return medicalID;
    }

    public void setMedicalID(String medicalID) {
        this.medicalID = medicalID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void atender(String nombre, String apellido, int edad, String direccion){
        Paciente p = new Paciente(nombre, apellido, edad, direccion);

        examinar(p);
        diagnosticar(p);
    }

    private void diagnosticar(Paciente p) {
        System.out.println("Respire...");
    }

    private void examinar(Paciente p) {
        System.out.println("Tómese esto");
    }
}
