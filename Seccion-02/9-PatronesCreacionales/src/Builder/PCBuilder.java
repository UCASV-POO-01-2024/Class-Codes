package Builder;

public class PCBuilder implements Builder{
    private Motherboard motherboard;

    public PCBuilder() {
        reset();
    }

    public void reset() {
        motherboard = new Motherboard();
    }

    public void addRAM(String brand, String model, int freq, boolean rgb) {
        RAM ram = new RAM();
        ram.setModel(model);
        ram.setBrand(brand);
        ram.setFreq(freq);
        ram.setRgb(rgb);
        motherboard.setRam(ram);
    }

    public void addCPU(String brand, String model, int threads, int cores, int busSpeed) {
        //Agregar implementacion de crear CPU y asignarla
    }

    public void addPSU(String brand, String model, double voltage, double current, String certification) {
        //Agregar implementacion de crear PSU y asignarla
    }

    public void addOS(String brand, String model, String version) {
        if(motherboard.getStorage() != null){
            OS sistema = new OS();
            sistema.setBrand(brand);
            sistema.setModel(model);
            sistema.setVersion(version);
            motherboard.setOS(sistema);
        } else {
            System.out.println("Debe agregar primero un almacenamiento");
        }
    }

    public void addStorage(String marca, int capacityInGB, String type, int readSpd, int writeSpd) {
        Storage storage = new Storage();
        storage.setMarca(marca);
        storage.setCapacityInGB(capacityInGB);
        storage.setType(type);
        storage.setReadSpd(readSpd);
        storage.setWriteSpd(writeSpd);
        motherboard.setStorage(storage);
    }

    public Motherboard getResult(){
        return motherboard;
    }
}
