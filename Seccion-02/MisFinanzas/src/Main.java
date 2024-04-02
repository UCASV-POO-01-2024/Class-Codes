import banca.Banco;

public class Main {
    public static void main(String[] args){
        Banco[] bancos = new Banco[3];
        bancos[0] = new Banco(1,"Banco Cuscatlán");
        bancos[1] = new Banco(2,"Banco Agrícola");
        bancos[2] = new Banco(3,"Banco Davivienda");

        System.out.println(bancos[0].getNombre());
    }
}
