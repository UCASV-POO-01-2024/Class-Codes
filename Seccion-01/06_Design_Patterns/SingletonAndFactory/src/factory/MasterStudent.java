package factory;

public class MasterStudent implements Student {
    @Override
    public void enroll() {
        System.out.println("I enroll in the MSc in CS.");
    }

    @Override
    public void attendCourse() {
        System.out.println("I will go to the Computer Vision course.");
    }

    @Override
    public void graduate() {
        System.out.println("I am now a Master.");
    }
}
