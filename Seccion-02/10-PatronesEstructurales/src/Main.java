import Adapter.AdaptadorCircular;
import Adapter.AgujeroCircular;
import Adapter.PiezaCircular;
import Adapter.PiezaCuadrada;

public class Main {
    public static void main(String[] args) {
        //------------------Adapter-------------------------
        PiezaCircular pieza1 = new PiezaCircular(15);

        AgujeroCircular agujeroGrande = new AgujeroCircular(20);
        AgujeroCircular agujeroSmall = new AgujeroCircular(10);

        System.out.println("Probando con pieza circular");
        System.out.println(agujeroGrande.encaja(pieza1));
        System.out.println(agujeroSmall.encaja(pieza1));

        PiezaCuadrada pieza2 = new PiezaCuadrada(15);
        AdaptadorCircular piezaAdaptada = new AdaptadorCircular(pieza2);

        System.out.println("Probando con pieza cuadrada");
        System.out.println(agujeroGrande.encaja(piezaAdaptada));
        System.out.println(agujeroSmall.encaja(piezaAdaptada));

        //------------------Composite-------------------------
    }
}