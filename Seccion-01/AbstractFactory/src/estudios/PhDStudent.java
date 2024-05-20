package estudios;

public class PhDStudent implements Student{
    @Override
    public void enroll() {
        System.out.println("I enroll in a phd");
    }

    @Override
    public void attend() {
        System.out.println("I write a thesis");
    }

    @Override
    public void graduate() {
        System.out.println("I am a doctor");
    }
}
