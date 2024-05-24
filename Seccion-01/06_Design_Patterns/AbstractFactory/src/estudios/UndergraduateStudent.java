package estudios;

public class UndergraduateStudent implements Student{
    @Override
    public void enroll() {
        System.out.println("I enroll in an undergraduate program");
    }

    @Override
    public void attend() {
        System.out.println("I attend a basic course");
    }

    @Override
    public void graduate() {
        System.out.println("I am now an engineer");
    }
}
