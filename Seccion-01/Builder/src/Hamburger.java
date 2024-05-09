public class Hamburger {
    private String bread;
    private String meat;
    private String veggies;
    private String sauces;
    private String cheese;

    public Hamburger(){

    }
    public Hamburger(String bread, String meat, String veggies, String sauces, String cheese) {
        this.bread = bread;
        this.meat = meat;
        this.veggies = veggies;
        this.sauces = sauces;
        this.cheese = cheese;
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

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString(){
        String s = "Soy una hamburguesa con ";
        s += bread+", "+veggies+", "+cheese+", "+sauces+" and "+meat;
        return s;
    }
}
