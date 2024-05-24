package factories;

import estudios.PhDStudent;
import estudios.Student;
import modalidad.Modalidad;
import modalidad.ModalidadVirtual;

public class PhDVirtualFactory implements StudentModelFactory{
    private Student student;
    private Modalidad modalidad;

    @Override
    public void createStudent() {
        student = new PhDStudent();
    }

    @Override
    public void createModalidad() {
        modalidad = new ModalidadVirtual();
    }

    public Student getStudent() {
        return student;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }
}
