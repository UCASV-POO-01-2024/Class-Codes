public class Proveedor implements Subscriber{
    private String nombre;
    private String owner;
    private String rubro;
    private String[] productos;

    public Proveedor(String nombre, String owner, String rubro) {
        this.nombre = nombre;
        this.owner = owner;
        this.rubro = rubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    public String proveer(){
        return "Soy un producto :^)";
    }

    @Override
    public void update(String msg) {
        System.out.println("te haré una propuesta que no podrás rechazar mwa ha ha ha");
    }
}
