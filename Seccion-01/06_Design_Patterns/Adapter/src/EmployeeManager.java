public class EmployeeManager {
    public static void displayInfo(Employee e) {
        System.out.println("Name: " + e.getFullName());
        System.out.println("Age: " + e.getAge() + " years old");
        System.out.println("Height: " + e.getHeightCms() + " cm");
        System.out.println("Weight: " + e.getWeightKgs() + " Kg");
    }
}
