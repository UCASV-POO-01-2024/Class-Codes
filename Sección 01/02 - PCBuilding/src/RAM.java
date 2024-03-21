public class RAM {
    private String model;
    private String brand;
    private int capacity;
    private int freq;
    private boolean rgb;

    public RAM(String model, String brand, int capacity, int freq, boolean rgb) {
        this.model = model;
        this.brand = brand;
        this.capacity = capacity;
        this.freq = freq;
        this.rgb = rgb;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public int getFreq() {
        return freq;
    }
    
    public void setFreq(int freq) {
        this.freq = freq;
    }
    
    public boolean isRgb() {
        return rgb;
    }
    
    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }  
}
