import java.util.ArrayList;

public class Motherboard {
    private String brand;
    private String model;
    private CPU cpu;
    private RAM ram;
    private PSU psu;
    private ArrayList<Storage> storage;

    public Motherboard(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    
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
    public PSU getPsu() {
        return psu;
    }
    public void setPsu(PSU psu) {
        this.psu = psu;
    }
    public ArrayList<Storage> getStorage() {
        return storage;
    }
    public void setStorage(ArrayList<Storage> storage) {
        this.storage = storage;
    }

    
}
