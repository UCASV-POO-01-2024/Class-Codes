package hotel.roomfactory.rooms;

import observer.Subscriber;

import java.util.Vector;

public abstract class Room {
    private int capacidad;
    private String roomID;
    private String status;

    private Vector<Subscriber> subscribers;

    public Room(int capacidad, String roomID, String status) {
        this.capacidad = capacidad;
        this.roomID = roomID;
        this.status = status;
        subscribers = new Vector<>();
    }

    public void subscribe(Subscriber s){
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s){
        subscribers.remove(s);
    }

    public void notifySubscribers(){
        for(Subscriber s: subscribers){
            s.update("Soy el cuarto "+roomID+" y ya estoy libre!! dattebayo!");
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        if(status.equals("F")){
            notifySubscribers();
        }
    }

    public abstract void descripcion();
    public abstract void funcionalidad();
}
