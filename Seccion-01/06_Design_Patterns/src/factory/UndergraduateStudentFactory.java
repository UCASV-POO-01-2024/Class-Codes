package factory;

public class UndergraduateStudentFactory extends StudentFactory {
    @Override
    public Student createStudent() {
        return new UndergraduateStudent();
    }
}
