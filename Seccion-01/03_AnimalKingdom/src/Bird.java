public class Bird extends Animal{
    private boolean flying;
    private String tipoPico;
    private String tipoPlumaje;

    public Bird(String nombre, String nombreCientifico, String habitat, String tipoDieta, int longevidad, boolean flying, String tipoPico, String tipoPlumaje) {
        super(nombre, nombreCientifico, habitat, tipoDieta, longevidad);
        this.flying = flying;
        this.tipoPico = tipoPico;
        this.tipoPlumaje = tipoPlumaje;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public String getTipoPlumaje() {
        return tipoPlumaje;
    }

    public void setTipoPlumaje(String tipoPlumaje) {
        this.tipoPlumaje = tipoPlumaje;
    }

    public void volar(){
        System.out.println("I believe I can fly, I believe I can touch the sky!");
    }

    @Override
    public void atacar(){
        System.out.println("I'm pecking!!!!");
    }
}
