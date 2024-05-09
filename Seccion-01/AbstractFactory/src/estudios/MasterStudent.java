package estudios;

public class MasterStudent implements Student{
    @Override
    public void enroll() {
        System.out.println("I enroll in a master");
    }

    @Override
    public void attend() {
        System.out.println("I attend an advanced course");
    }

    @Override
    public void graduate() {
        System.out.println("I am a master");
    }
}
