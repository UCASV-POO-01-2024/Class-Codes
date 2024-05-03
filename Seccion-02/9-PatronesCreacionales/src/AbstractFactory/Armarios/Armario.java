package AbstractFactory.Armarios;

public class Armario {
    private String material;

    public Armario() {
    }

    public Armario(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
