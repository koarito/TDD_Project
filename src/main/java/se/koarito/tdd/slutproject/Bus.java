package se.koarito.tdd.slutproject;

import java.util.ArrayList;

public class Bus {

    private ArrayList<Passenger> passengers;

    public Bus() {
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < 20)
            passengers.add(passenger);
        else {
            System.out.println("Tyvärr så är bussen full :(");
            System.out.println("Bussföraren: Fyfan va många personer som åker buss");
        }
    }

    public void removePassenger(Passenger passenger){
        passengers.remove(passenger);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

}
