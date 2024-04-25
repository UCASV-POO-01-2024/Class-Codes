package factory;

public class MasterStudent implements Student {
    @Override
    public void careerEnroll() {
        System.out.println("I'm following the process to be in the Master's Degree in Computer Science.");
    }

    @Override
    public void courseEnroll() {
        System.out.println("I will attend the Computer Vision and Multithreaded Programming courses this semester.");
    }

    @Override
    public void graduate() {
        System.out.println("I am now a Master in Computer Science.");
    }
}
