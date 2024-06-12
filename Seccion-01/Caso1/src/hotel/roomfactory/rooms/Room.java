package hotel.roomfactory.rooms;

import observer.Subscriber;

import java.util.Vector;

public abstract class Room implements Cloneable {
    private String ID;
    private int number;
    private int capacity;
    private double area;
    private String status;

    private Vector<Subscriber> subscribers;

    public Room(String ID, int number, int capacity, double area) {
        this.ID = ID;
        this.number = number;
        this.capacity = capacity;
        this.area = area;
        status = "F";
        subscribers = new Vector<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update("Soy el Room "+getID()+" y ya estoy libre!!");
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        if(status.equals("F")) {
            notifySubscribers();
        }
    }

    @Override
    public String toString() {
        return "< "+ID+", "+status+" >";
    }

    public abstract String description();
    public abstract String functionality();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
