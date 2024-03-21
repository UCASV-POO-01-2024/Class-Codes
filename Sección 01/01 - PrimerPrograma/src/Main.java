class Pokemon {
    String nombre = new String();
    String[] tipos = new String[2];
    String[] abilities = new String[2];
    int[] stats;

    void atacar() {
        System.out.println("Estoy atacando :3");
    }
}

class Main{
    public static void main(String[] args){
        Pokemon magnemite = new Pokemon();
        Pokemon applin = new Pokemon();

        magnemite.atacar();
        applin.atacar();
    }
}
