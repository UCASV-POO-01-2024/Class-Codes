public class EmployeeAdapter {
    public static void displayInfo(EmpleadoUCA e){
        Employee n = new Employee();

        n.setFullName(e.getNombres()+" "+e.getApellidos());

        String[] dateParts = e.getFechaNacimiento().split("-");
        n.setAge(2024-Integer.valueOf(dateParts[2]));

        n.setHeightCms((int) (e.getAlturaMs()*100));

        n.setWeightKgs(e.getPesoLbs()/2.2);

        EmployeeManager.displayInfo(n);
    }
}
