package factory;

public class PhDStudentFactory extends StudentFactory {
    @Override
    public Student createStudent() {
        return new PhDStudent();
    }
}
