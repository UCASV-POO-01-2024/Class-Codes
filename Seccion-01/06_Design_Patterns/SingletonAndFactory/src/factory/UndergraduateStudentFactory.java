package factory;

public class UndergraduateStudentFactory extends StudentFactory {
    public Student createStudent(){
        return new UndergraduateStudent();
    }
}
