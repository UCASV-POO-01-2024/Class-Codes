package Factory;

public class Hijo2 extends Padre{
    private String attrH2;
    private String otherAttrH2;

    public Hijo2() { }

    public String[] getAttrH() {
        String [] result = {attrH2, otherAttrH2};
        return result;
    }

    public Hijo2(String attrH2, String otherAttrH2) {
        this.attrH2 = attrH2;
        this.otherAttrH2 = otherAttrH2;
    }

    public Hijo2(String attr1, String attrH2, String otherAttrH2) {
        super(attr1);
        this.attrH2 = attrH2;
        this.otherAttrH2 = otherAttrH2;
    }

    public String getAttrH1() {
        return attrH2;
    }

    public void setAttrH1(String attrH2) {
        this.attrH2 = attrH2;
    }

    public String getOtherAttrH2() {
        return otherAttrH2;
    }

    public void setOtherAttrH2(String otherAttrH2) {
        this.otherAttrH2 = otherAttrH2;
    }
}
