package hotel;

import exceptions.MatrizLlenaException;
import personas.Administrador;
import personas.Client;
import personas.Persona;
import hotel.roomfactory.rooms.Room;

import java.util.Vector;

public class Hotel {
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private String website;
    private Administrador admin;
    private Vector<Client> clientes;
    private Vector<Vector<Room>> rooms;
    private int totalRooms = 0;

    private String activeUser;

    private static Hotel instance;

    private Hotel(String nombre, String direccion, String telefono, String correo, String website, Administrador admin, Vector<Client> clientes, int N) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.website = website;
        this.admin = admin;
        this.clientes = clientes;
        rooms = new Vector<Vector<Room>>();
        for (int i = 0; i < N; i++) {
            rooms.add(new Vector<Room>());
        }
        for(Vector<Room> v: rooms){
            for(int i = 0; i < N; i++){
                v.add(null);
            }
        }
    }

    public static Hotel getInstance() {
        if(instance == null) {
            Administrador a = new Administrador("Jacob","Geller",34,"jgeller","12345","101","Gerente","San Salvador","9874-5647");
            Client c = new Client("Jasmine","Goldenrod",29,"jgolden","ampharos",5000,"good",2,"none","lots of power outlets");
            Vector<Client> v = new Vector<Client>();
            v.add(c);

            instance = new Hotel("Skyloft","The sky","1-800-987-4555","skyloft@hotel.com","www.skylofthotel.com",a,v,5);
        }

        return instance;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public Vector<Client> getClientes() {
        return clientes;
    }

    public void setClientes(Vector<Client> clientes) {
        this.clientes = clientes;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public String getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(String activeUser) {
        this.activeUser = activeUser;
    }

    public Persona getPersona(String u){
        if(admin.getUsername().equals(u)) {
            return admin;
        }else{
            for(Client c : clientes) {
                if (c.getUsername().equals(u)) {
                    return c;
                }
            }
        }

        return null;
    }

    public Persona getPersona(String u, String p){
        if(admin.getUsername().equals(u) && admin.getPassword().equals(p)) {
            return admin;
        }else{
            for(Client c : clientes) {
                if (c.getUsername().equals(u) && c.getPassword().equals(p)) {
                    return c;
                }
            }
        }

        return null;
    }

    public void addRoom(Room r){
        try{
            if(getTotalRooms() == rooms.size() * rooms.get(0).size()) {
                throw new MatrizLlenaException();
            }

            setTotalRooms(getTotalRooms() + 1);

            for (Vector<Room> v : rooms) {
                for (int i = 0; i < v.size(); i++) {
                    if (v.get(i) == null) {
                        v.set(i, r);
                        System.out.println("Habitación añadida exitósamente!");
                        return;
                    }
                }
            }
        }catch(MatrizLlenaException e){
            System.out.println(e.toString());
        }
    }

    public void showRooms(){
        int N = rooms.size();
        for(int i = 0; i < N; i++){
            Vector<Room> v = rooms.get(i);
            for(int j = 0; j < N; j++){
                Room r = v.get(j);
                if(r != null) {
                    System.out.print(r.toString());
                }else{
                    System.out.print("< null >");
                }
            }
            System.out.print("\n");
        }
    }

    public Room getRoomByID(String ID){
        int N = rooms.size();

        for(int i = 0; i < N; i++){
            Vector<Room> v = rooms.get(i);
            for(int j = 0; j < N; j++){
                Room r = v.get(j);
                if(r != null && r.getID().equals(ID)){
                    return v.get(j);
                }
            }
        }

        return null;
    }

    public void moveRoom(String ID, int i, int j) {
        Room r = getRoomByID(ID);
        try {
            Room clon = (Room) r.clone();
            replaceRoom(r,null);
            replaceRoom(i,j,clon);
        }catch(CloneNotSupportedException e){
            System.out.println("No fue posible realizar la operación de movimiento de la habitación");
            e.printStackTrace();
        }
    }

    private void replaceRoom(Room old, Room neo){
        int N = rooms.size();

        for(int i = 0; i < N; i++){
            Vector<Room> v = rooms.get(i);
            if(v.contains(old)){
                v.set(v.indexOf(old), neo);
                break;
            }
        }
    }

    private void replaceRoom(int i, int j, Room neo){
        rooms.get(i).set(j,neo);
    }

    public void removeRoom(String ID){
        replaceRoom(getRoomByID(ID),null);
    }

    public void checkRooms(String newStatus){
        Vector<Reserva> v = ((Client) getPersona(getActiveUser())).getReservas();
        for(Reserva r : v){
            getRoomByID(r.getRoomID()).setStatus(newStatus);
        }

        if(newStatus.equals("F")){
            v.clear();
        }
    }
}
