package factory;

public class PhDStudent implements Student {
    @Override
    public void careerEnroll() {
        System.out.println("I'm following the process to be in the PhD in Computer Science program.");
    }

    @Override
    public void courseEnroll() {
        System.out.println("I will attend the Laminar flow simulation over pourous bodies course this semester.");
    }

    @Override
    public void graduate() {
        System.out.println("I am now a Doctor.");
    }
}
