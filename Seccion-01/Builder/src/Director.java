public class Director {
    private SandwichBuilder builder;

    public Director(SandwichBuilder builder){
        this.builder = builder;
    }

    public void changeBuilder(SandwichBuilder builder){
        this.builder = builder;
    }

    public void make(String type){
        switch (type){
            case "hamburger":
                builder.buildBread();
                builder.buildSauces();
                builder.buildMeat();
                builder.buildCheese();
                builder.buildVeggies();
                break;
            case "hotdog":
                builder.buildBread();
                builder.buildSauces();
                builder.buildMeat();
                builder.buildVeggies();
                break;
        }
    }
}
