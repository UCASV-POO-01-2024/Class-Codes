public class RAM {
    private String brand;
    private String model;
    private int freq;
    private boolean rgb;

    public RAM() {

    }
    
    public RAM(String brand, String model, int freq, boolean rgb) {
        
        this.brand = brand;
        this.model = model;
        this.freq = freq;
        this.rgb = rgb;

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
