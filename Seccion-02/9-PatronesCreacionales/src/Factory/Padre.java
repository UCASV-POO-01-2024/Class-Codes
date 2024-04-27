package Factory;

public abstract class Padre {
    private String attr1;

    public Padre() {
    }

    public Padre(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public abstract String[] getAttrH();
}
