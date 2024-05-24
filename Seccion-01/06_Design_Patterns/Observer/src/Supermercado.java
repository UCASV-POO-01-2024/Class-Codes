import java.util.ArrayList;
import java.util.Iterator;

public class Supermercado {
    private String nombre;
    private String direccion;
    private String fechaFundacion;
    private String owner;
    private String[] productos;
    private String[] empleados;
    private String horarios;
    private Cliente[] clientes;

    public Supermercado(String nombre, String direccion, String fechaFundacion, String owner, String horarios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaFundacion = fechaFundacion;
        this.owner = owner;
        this.horarios = horarios;
        subscribers = new ArrayList<Subscriber>();
    }

    private ArrayList<Subscriber> subscribers;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    public String[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(String[] empleados) {
        this.empleados = empleados;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public void vender(){
        System.out.println("I'm selling");
    }

    public void comprar(){
        System.out.println("I'm buying");
    }

    public void hacerInventario(){
        System.out.println("I'm counting");
    }

    public void subscribe(Subscriber s){
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s){
        subscribers.remove(s);
    }

    public void notifySubscribers(String msg){
        Iterator<Subscriber> iter = subscribers.iterator();
        while(iter.hasNext()){
            iter.next().update(msg);
        }
    }
}
