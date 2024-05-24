package modalidad;

public class ModalidadPresencial implements Modalidad{
    @Override
    public void getEnrollmentSteps() {
        System.out.println("Ventanilla,Tesorerìa");
    }

    @Override
    public void getEquipmentRequirements() {
        System.out.println("Cuadernos,Lapiceros");
    }

    @Override
    public void getSchedule() {
        System.out.println("day");
    }
}
