package factories;

import estudios.MasterStudent;
import estudios.Student;
import modalidad.Modalidad;
import modalidad.ModalidadVirtual;

public class MasterVirtualFactory implements StudentModelFactory{

    @Override
    public Student createStudent() {
        return new MasterStudent();
    }

    @Override
    public Modalidad createModalidad() {
        return new ModalidadVirtual();
    }
}
