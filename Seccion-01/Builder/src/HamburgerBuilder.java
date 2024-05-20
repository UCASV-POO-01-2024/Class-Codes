public class HamburgerBuilder implements SandwichBuilder{
    private Hamburger product;

    public HamburgerBuilder(){
        product = new Hamburger();
    }

    @Override
    public void reset() {
        product = new Hamburger();
    }

    @Override
    public void buildBread() {
        String[] options = new String[]{"normal","kaiser","integral"};
        int opt = InputReceiver.getData(3,options);
        product.setBread( options[ opt ] );
    }

    @Override
    public void buildVeggies() {
        String[] options = new String[]{"con todo","sin pepinillos","solo lechuga","sin tomate"};
        int opt = InputReceiver.getData(4,options);
        product.setVeggies(options[opt]);
    }

    @Override
    public void buildCheese() {
        String[] options = new String[]{"blanco","cheddar","provolone","mozarella"};
        int opt = InputReceiver.getData(4,options);
        product.setCheese(options[opt]);
    }

    @Override
    public void buildMeat() {
        String[] options = new String[]{"res","pollo empanizado","pollo a la parrilla","soya"};
        int opt = InputReceiver.getData(4,options);
        product.setMeat(options[opt]);
    }

    @Override
    public void buildSauces() {
        String[] options = new String[]{"todo","solo ketchup","solo mostaza","ketchup y mostaza","ketchup y mayonesa"};
        int opt = InputReceiver.getData(5,options);
        product.setSauces(options[opt]);
    }

    public Hamburger getProduct(){
        return product;
    }
}
