abstract class Animal {
    private String especie;
    private String color;
    private double tamanioEnCM;

    public Animal(String especie, String color, double tamanioEnCM) {
        this.especie = especie;
        this.color = color;
        this.tamanioEnCM = tamanioEnCM;
    }

    public Animal() {}

    public abstract void sonido();

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamanioEnCM() {
        return tamanioEnCM;
    }

    public void setTamanioEnCM(double tamanioEnCM) {
        this.tamanioEnCM = tamanioEnCM;
    }

    
}