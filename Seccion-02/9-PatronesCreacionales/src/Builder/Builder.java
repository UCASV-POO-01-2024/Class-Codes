package Builder;

public interface Builder {
    void reset();
    void addRAM(String brand, String model, int freq, boolean rgb);
    void addCPU(String brand, String model, int threads, int cores, int busSpeed);
    void addPSU(String brand, String model, double voltage, double current, String certification);
    void addOS(String brand, String model, String version);
    void addStorage(String marca, int capacityInGB, String type , int readSpd , int writeSpd);
}
