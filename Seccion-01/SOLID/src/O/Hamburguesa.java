package O;

public class Hamburguesa {
    private String nombre;
    private String descripcion;
    private double precio;

    public Hamburguesa(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void hacerHamburguesa() {
        System.out.println("Primero el pan de abajo, después la carne, después el queso, después los vegetales y después el pan de arriba.");
    }
}
