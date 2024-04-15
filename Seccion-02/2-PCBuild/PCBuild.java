public class PCBuild {
    public static void main(String[] args) {
        RAM memoria = new RAM();
        memoria.setBrand("Kingston");
        memoria.setModel("Fury");
        memoria.setRgb(true);
        memoria.setFreq(4200);

        Motherboard myPC = new Motherboard();
        myPC.setRam(memoria);
    }
}
