public class HotDogBuilder implements SandwichBuilder{
    private HotDog product;

    public HotDogBuilder(){
        product = new HotDog();
    }

    @Override
    public void reset() {
        product = new HotDog();
    }

    @Override
    public void buildBread() {
        product.setBread("normal");
    }

    @Override
    public void buildVeggies() {
        String[] options = new String[]{"con todo", "sin cebolla", "sin chile", "sin vegetales"};
        int opt = InputReceiver.getData(4, options);
        product.setVeggies(options[opt]);
    }

    @Override
    public void buildMeat() {
        String[] options = new String[]{"res","pollo","pavo"};
        int opt = InputReceiver.getData(3,options);
        product.setMeat("salchicha de "+options[opt]);
    }

    @Override
    public void buildSauces() {
        String[] options = new String[]{"todo","solo ketchup","solo mostaza","ketchup y mostaza","ketchup y mayonesa"};
        int opt = InputReceiver.getData(5,options);
        product.setSauces(options[opt]);
    }

    @Override
    public void buildCheese() {
        System.out.println("Esta opción no se usa acá, pero debe estar implementada porque es parte de la Interface.");
    }

    public HotDog getProduct(){
        return product;
    }
}
