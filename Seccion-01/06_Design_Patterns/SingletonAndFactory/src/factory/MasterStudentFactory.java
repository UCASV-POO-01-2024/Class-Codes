package factory;

public class MasterStudentFactory extends StudentFactory {
    @Override
    public Student createStudent() {
        return new MasterStudent();
    }
}
