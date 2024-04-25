public class Motherboard {
    private String brand;
    private String model;
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private PSU powerSupply;
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public CPU getCpu() {
        return cpu;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public RAM getRam() {
        return ram;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }
    public Storage getStorage() {
        return storage;
    }
    public void setStorage(Storage storage) {
        this.storage = storage;
    }
    public PSU getPowerSupply() {
        return powerSupply;
    }
    public void setPowerSupply(PSU powerSupply) {
        this.powerSupply = powerSupply;
    }

    
}
