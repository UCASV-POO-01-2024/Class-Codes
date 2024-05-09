package Builder;

import Builder.Padres.Component;

public class CPU extends Component{
    private int threads;
    private int cores;
    private int busSpeed;

    // Getters

    // Sobrescribir metodo de la clase padre
    @Override
    public String getModel() {
        return "El modelo es: " + super.getModel();
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
        super.setModel(model);
    }
    public void setBrand(String brand){
        super.setBrand(brand);
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