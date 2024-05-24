import estudios.Student;
import factories.PhDVirtualFactory;
import factories.StudentModelFactory;
import modalidad.Modalidad;

public class Main {
    public static void main(String[] args){
        Student student;
        Modalidad modalidad;
        StudentModelFactory factory;

        //El usuario ha pedido un estudiante de doctorado en modalidad virtual
        factory = new PhDVirtualFactory();

        factory.createStudent();
        student = factory.getStudent();

        factory.createModalidad();
        modalidad = factory.getModalidad();

        student.attend();
        modalidad.getSchedule();
    }
}
