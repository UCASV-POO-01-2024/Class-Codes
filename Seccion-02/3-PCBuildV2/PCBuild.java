public class PCBuild {
    public static void main(String[] args) {
        //RAM memoria = new RAM();
        //memoria.setBrand("Kingston");
        //memoria.setModel("Fury");
        //memoria.setRgb(true);
        //memoria.setFreq(4200);

        // Constructor con parámetros
        RAM memoria = new RAM("Kingston", "Fury", 4200, true);
        
        CPU cpu = new CPU();
        cpu.setBrand("Intel"); // Viene del Padre
        cpu.setBusSpeed(2000); // Viene del Hijo
        cpu.setModel("i7-1077"); // Viene del Padre

        OS sistema = new OS();
        sistema.setBrand("Microsoft"); // Viene del Padre
        sistema.setModel("Windows 11"); // Viene del Padre
        sistema.setVersion("2024H1"); // Viene del Hijo



        Motherboard myPC = new Motherboard();
        myPC.setRam(memoria);
    }
}
