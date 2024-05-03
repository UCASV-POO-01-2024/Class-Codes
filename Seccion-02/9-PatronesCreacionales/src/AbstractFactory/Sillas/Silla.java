package AbstractFactory.Sillas;

public class Silla {
    private String material;

    public Silla() {
    }

    public Silla(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
