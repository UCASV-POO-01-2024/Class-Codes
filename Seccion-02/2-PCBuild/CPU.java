public class CPU{
    private String model;
    private String brand;
    private int threads;
    private int cores;
    private int busSpeed;

    // Getters
    public String getModel(){
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public int getThreads(){
        return threads;
    }
    public int getCores(){
        return cores;
    }
    public int getBusSpeed(){
        return busSpeed;
    }

    //Setters
    public void setModel(String model) {
        this.model = model;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setTreads(int threads){
        this.threads = threads;
    }
    public void setCores(int cores){
        this.cores = cores;
    }

    public void setBusSpeed(int busSpeed) {
        this.busSpeed = busSpeed;
    }
}