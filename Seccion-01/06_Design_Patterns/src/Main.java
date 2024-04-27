import singleton.*;
import factory.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Using Singleton
        Government2.initializeInstance(); //eagerness in action

        //lazy one
        Government1 g1 = Government1.getInstance();
        //eager one
        Government2 g2 = Government2.getInstance();

        System.out.println(g1.getCountry()+" and "+g2.getCountry());

        Government2.initializeInstance();

        //Using Factory
        StudentFactory factory = null;
        Student student;
        boolean flag = true;

        while(flag) {
            System.out.println("\n\nHello, what do you want to study?\n1. Undergradute program.\n2. Master's program.\n3. PhD.\n0.Salir.");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    factory = new UndergraduateStudentFactory();
                    break;
                case 2:
                    factory = new MasterStudentFactory();
                    break;
                case 3:
                    factory = new PhDStudentFactory();
                    break;
                default:
                    flag = false;
                    break;
            }
            if (flag){
                student = factory.createStudent();
                student.careerEnroll();
                student.courseEnroll();
                student.graduate();
            }
            else break;
        }
    }
}
