import java.util.ArrayList;

public class PCBuilder {
    public static void main(String[] args){
        CPU procesador = new CPU("AMDx","Ryzen 7",7,4,16);
        RAM memoria = new RAM("Kingston","Kingston 7",1024,256,true);
        PSU fuente = new PSU("Niidea","Thunderbolt",10.45,20.1,"WTF");
        Storage disco = new Storage("Kingston","Generyc",3000.64,500,100,"SSD");
        Motherboard mommy = new Motherboard("Streamex","3.2.0.1");

        mommy.setCpu(procesador);
        mommy.setRam(memoria);
        mommy.setPsu(fuente);

        ArrayList<Storage> discos = new ArrayList<Storage>();
        discos.add(disco);
        mommy.setStorage(discos);

        OS sistema = new OS("Windows","XP","1.3");

        mommy.getStorage().get(0).setSystem(sistema);

        System.out.println("Booting...");
    }
}
