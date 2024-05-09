package modalidad;

public class ModalidadVirtual implements Modalidad{
    @Override
    public void getEnrollmentSteps() {
        System.out.println("Website,Bank");
    }

    @Override
    public void getEquipmentRequirements() {
        System.out.println("PC,headphones");
    }

    @Override
    public void getSchedule() {
        System.out.println("night");
    }
}
