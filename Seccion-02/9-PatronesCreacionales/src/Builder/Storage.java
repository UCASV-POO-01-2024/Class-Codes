package Builder;

public class Storage {
    private String marca;
    private int capacityInGB;
    private String type;
    private int readSpd;
    private int writeSpd;
    private OS operatingSystem;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getCapacityInGB() {
        return capacityInGB;
    }
    public void setCapacityInGB(int capacityInGB) {
        this.capacityInGB = capacityInGB;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
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
    public OS getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(OS operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public String getOSVersion() {
        return operatingSystem.getVersion();
    }    
}
