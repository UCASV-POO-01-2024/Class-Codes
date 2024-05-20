package Observer;

public class Estacion implements Suscriptor{
    private String codigo;
    private double[] coordenadas;

    public Estacion(String codigo, double[] coordenadas) {
        this.codigo = codigo;
        this.coordenadas = coordenadas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(double[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    public void notificar(double magnitud) {
        System.out.println("Estacion "+codigo+": Recibida magnitud de "+magnitud+" grados en la escala Richter.");
    }
}
