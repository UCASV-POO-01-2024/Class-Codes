package factories;

import estudios.Student;
import estudios.UndergraduateStudent;
import modalidad.Modalidad;
import modalidad.ModalidadPresencial;

public class UndergraduatePresencialFactory implements StudentModelFactory{
    @Override
    public Student createStudent() {
        return new UndergraduateStudent();
    }

    @Override
    public Modalidad createModalidad() {
        return new ModalidadPresencial();
    }
}
