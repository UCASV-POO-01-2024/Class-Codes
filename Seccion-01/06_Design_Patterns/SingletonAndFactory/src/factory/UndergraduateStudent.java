package factory;

public class UndergraduateStudent implements Student {
    @Override
    public void enroll() {
        System.out.println("I enroll in the Bachelor's Degree in CS.");
    }

    @Override
    public void attendCourse() {
        System.out.println("I will go to the Programming Fundamentals course.");
    }

    @Override
    public void graduate() {
        System.out.println("I now have a major in CS.");
    }
}
