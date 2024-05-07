package Adapter;

public class PiezaCircular {
    private double radio;

    public PiezaCircular(double radio) {
        this.radio = radio;
    }

    protected PiezaCircular() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
