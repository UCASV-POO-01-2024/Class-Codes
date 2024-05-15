package D;

public class Cliente {
    public static void main(String[] args) {
        ReparadorLaptop rl = new ReparadorLaptop();
        ReparadorSmartphone rs = new ReparadorSmartphone();

        enviarAReparacion(rl);
        enviarAReparacion(rs);
    }

    private static void enviarAReparacion(ReparadorLaptop rl){
        rl.reparar();
    }

    private static void enviarAReparacion(ReparadorSmartphone rs) {
        rs.reparar();
    }
}
