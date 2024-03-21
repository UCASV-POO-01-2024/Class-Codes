public class Storage {
    private String brand;
    private String model;
    private double capacity;
    private int readSpd;
    private int writeSpd;
    private String type;
    private OS system;

    public Storage(String brand, String model, double capacity, int readSpd, int writeSpd, String type, OS system) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.readSpd = readSpd;
        this.writeSpd = writeSpd;
        this.type = type;
        this.system = system;
    }

    public Storage(String brand, String model, double capacity, int readSpd, int writeSpd, String type) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.readSpd = readSpd;
        this.writeSpd = writeSpd;
        this.type = type;
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
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public int getReadSpd() {
        return readSpd;
    }
    public void setReadSpd(int readSpd) {
        this.readSpd = readSpd;
    }
    public int getWriteSpd() {
        return writeSpd;
    }
    public void setWriteSpd(int writeSpd) {
        this.writeSpd = writeSpd;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public OS getSystem() {
        return system;
    }
    public void setSystem(OS system) {
        this.system = system;
    }
}
