package factory;

public class UndergraduateStudent implements Student {
    @Override
    public void careerEnroll() {
        System.out.println("I'm following the process to be in the Bachelor's Degree in Computer Science.");
    }

    @Override
    public void courseEnroll() {
        System.out.println("I will attend the Programming Fundamentals and Discrete Mathematics courses this semester.");
    }

    @Override
    public void graduate() {
        System.out.println("I now have a major in Computer Science.");
    }
}
