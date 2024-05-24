public class Main {
    public static void main(String[] args){
        Hamburger hb;
        HotDog hd;
        HamburgerBuilder hbbuilder = new HamburgerBuilder();
        HotDogBuilder hdbuilder = new HotDogBuilder();

        Director d = new Director(hbbuilder);

        d.make("hamburger");
        hb = hbbuilder.getProduct();

        d.changeBuilder(hdbuilder);
        d.make("hotdog");
        hd = hdbuilder.getProduct();

        System.out.println(hb.toString());
        System.out.println(hd.toString());
    }
}
