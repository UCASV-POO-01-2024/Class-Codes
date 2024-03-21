public class OS {
    private String brand;
    private String model;
    private String version;

    public OS(String brand, String model, String version) {
        this.brand = brand;
        this.model = model;
        this.version = version;
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
    
    public String getVersion() {
        return version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
}
