package Adapter;

public class AgujeroCircular {
    private double radio;

    public AgujeroCircular(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public boolean encaja(PiezaCircular pieza){
        return this.radio >= pieza.getRadio();
    }
}
