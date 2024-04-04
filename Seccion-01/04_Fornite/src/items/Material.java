package items;

public class Material extends Item{
    private String type;
    private String benefits;
    private String drawbacks;

    public Material(int ID, String name, String type, String benefits, String drawbacks) {
        super(ID, name);
        this.type = type;
        this.benefits = benefits;
        this.drawbacks = drawbacks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getDrawbacks() {
        return drawbacks;
    }

    public void setDrawbacks(String drawbacks) {
        this.drawbacks = drawbacks;
    }
}
