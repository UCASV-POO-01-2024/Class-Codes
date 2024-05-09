public class Gobierno {
    private Gobierno instancia;

    private String lider;
    private String pais;
    private String sistemaPolitico;

    private Gobierno(String lider, String pais, String sistemaPolitico) {
        this.lider = lider;
        this.pais = pais;
        this.sistemaPolitico = sistemaPolitico;
    }

    public Gobierno getInstancia(){
        if(instancia == null){
            instancia = new Gobierno("Bukele","El Salvador","Bukele");
        }

        return instancia;
    }

    public void crearLeyes(){

    }

    public void somethingSomethingMoney(){

    }
}
