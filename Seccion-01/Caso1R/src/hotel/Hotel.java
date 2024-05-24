package hotel;

import hotel.roomfactory.rooms.Room;
import personas.Administrador;
import personas.Cliente;

import java.util.Vector;

public class Hotel {
    private String nombre;
    private Administrador admin;
    private Vector<Cliente> clientes;
    private Vector<Vector<Room>> rooms;

    private static Hotel instance;

    private Hotel(String nombre, Administrador admin, Vector<Cliente> clientes, int N) {
        this.nombre = nombre;
        this.admin = admin;
        this.clientes = clientes;
        rooms = new Vector<>();
        for(int i = 0; i < N; i++){
            rooms.add(new Vector<Room>());
        }
        for(Vector<Room> v: rooms){
            for(int i = 0; i < N; i++){
                v.add(null);
            }
        }
    }

    public static Hotel getInstance(){
        if(instance == null){
            Administrador a = new Administrador("Juan Perese",34,"Montreal","jperese","12345",101,"Gerente");
            Vector<Cliente> v = new Vector<>();
            v.add(new Cliente("Diego Monterrosa",22,"San Vicente","dmonterrosa","password",3000,"good",2,"none","3 TVs en la habitación"));
            instance = new Hotel("Skyloft",a,v,5);
        }

        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public Vector<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Vector<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Vector<Vector<Room>> getRooms() {
        return rooms;
    }

    public void setRooms(Vector<Vector<Room>> rooms) {
        this.rooms = rooms;
    }
}
