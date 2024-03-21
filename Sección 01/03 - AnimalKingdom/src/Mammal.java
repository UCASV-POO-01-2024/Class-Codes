public class Mammal extends Animal{
    private int tiempoGestacion;
    private String tipoPelaje;
    private int tasaNatalidad;

    public Mammal(String nombre, String nombreCientifico, String habitat, String tipoDieta, int longevidad, int tiempoGestacion, String tipoPelaje, int tasaNatalidad){
        super(nombre,nombreCientifico,habitat,tipoDieta,longevidad);
        this.tiempoGestacion = tiempoGestacion;
        this.tipoPelaje = tipoPelaje;
        this.tasaNatalidad = tasaNatalidad;
    }

    public int getTiempoGestacion() {
        return tiempoGestacion;
    }

    public void setTiempoGestacion(int tiempoGestacion) {
        this.tiempoGestacion = tiempoGestacion;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public int getTasaNatalidad() {
        return tasaNatalidad;
    }

    public void setTasaNatalidad(int tasaNatalidad) {
        this.tasaNatalidad = tasaNatalidad;
    }

    public void lactar(){
        System.out.println("Estoy lactando!!");
    }

    @Override
    public void atacar(){
        System.out.println("I'm biting!!!");
    }
}
