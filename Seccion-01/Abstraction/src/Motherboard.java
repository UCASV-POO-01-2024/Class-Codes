public class Motherboard implements Brandable, Modellable {
    private String brand;
    private String model;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }
}
