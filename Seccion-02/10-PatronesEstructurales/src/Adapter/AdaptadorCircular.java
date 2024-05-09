package Adapter;

import static java.lang.Math.sqrt;

public class AdaptadorCircular extends PiezaCircular{
    private PiezaCuadrada pieza;

    public AdaptadorCircular(PiezaCuadrada pieza) {
        this.pieza = pieza;
    }

    @Override
    public double getRadio() {
        return pieza.getLado()*sqrt(2)/2;
    }
}
