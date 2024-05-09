package AbstractFactory.Mesas;

public class Mesa {
    private String material;

    public Mesa() {
    }

    public Mesa(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
