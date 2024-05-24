public class HotDog {
    private String bread;
    private String meat;
    private String veggies;
    private String sauces;

    public HotDog(){

    }
    public HotDog(String bread, String meat, String veggies, String sauces) {
        this.bread = bread;
        this.meat = meat;
        this.veggies = veggies;
        this.sauces = sauces;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getVeggies() {
        return veggies;
    }

    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    @Override
    public String toString(){
        String s = "Soy un hotdog con ";
        s += bread+", "+veggies+", "+sauces+" and "+meat;
        return s;
    }
}
