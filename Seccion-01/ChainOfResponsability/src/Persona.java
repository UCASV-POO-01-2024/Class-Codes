import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String profesion;
    private int timesReg;
    private int timesWF;
    private LocalDate fechaNacimiento;
    private LocalDate fechaInicioEstudios;

    public Persona(String nombre, String profesion, int timesReg, int timesWF, LocalDate fechaNacimiento, LocalDate fechaInicioEstudios) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.timesReg = timesReg;
        this.timesWF = timesWF;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaInicioEstudios = fechaInicioEstudios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getTimesReg() {
        return timesReg;
    }

    public void setTimesReg(int timesReg) {
        this.timesReg = timesReg;
    }

    public int getTimesWF() {
        return timesWF;
    }

    public void setTimesWF(int timesWF) {
        this.timesWF = timesWF;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaInicioEstudios() {
        return fechaInicioEstudios;
    }

    public void setFechaInicioEstudios(LocalDate fechaInicioEstudios) {
        this.fechaInicioEstudios = fechaInicioEstudios;
    }
}
