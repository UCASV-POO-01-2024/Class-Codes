package Classes;

import Interfaces.Brandeable;
import Interfaces.Modelizable;

public class Component implements Brandeable, Modelizable {
    private String brand;
    private String model;
    
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
