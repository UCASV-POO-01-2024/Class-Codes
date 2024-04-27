package Factory;

public class Hijo1 extends Padre{
    private String attrH1;

    public Hijo1() { }

    public Hijo1(String attrH1) {
        this.attrH1 = attrH1;
    }

    public String[] getAttrH() {
        String [] result = {attrH1};
        return result;
    }

    public Hijo1(String attr1, String attrH1) {
        super(attr1);
        this.attrH1 = attrH1;
    }

    public String getAttrH1() {
        return attrH1;
    }

    public void setAttrH1(String attrH1) {
        this.attrH1 = attrH1;
    }
}
