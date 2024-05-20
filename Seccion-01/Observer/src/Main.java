public class Main {
    public static void main(String[] args){
        Cliente c1 = new Cliente("101","Michael Wang","M","263826382","cojute");
        Cliente c2 = new Cliente("102","Juan Wang","M","8787687","cojute");
        Proveedor p = new Proveedor("Happy Meals","Ronald Gaucho","alimentacion");

        Supermercado s = new Supermercado("Walmart","Sta Elena","04-07-2001","Lyla Bukele","L-V 8-18, S-D 9-17");

        s.subscribe(c1);
        s.subscribe(p);
        s.subscribe(c2);

        s.notifySubscribers("Hoy la libra de jengibre está a 1 varo");

        System.out.println("------------");
        s.unsubscribe(c2);
        s.notifySubscribers("Hoy los cuadernos a 3x1");
    }
}
