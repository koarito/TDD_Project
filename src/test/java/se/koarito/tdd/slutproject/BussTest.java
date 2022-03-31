package se.koarito.tdd.slutproject;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class BussTest {

    private Bus bus;
    private Passenger passenger1;

    @BeforeEach
    void setup(){
        bus = new Bus();
        passenger1 = new Passenger("Kalle", 45);
    }

    @DisplayName("En passagerare kliver på")
    @Test
    public void testAdd(){
        bus.addPassenger(passenger1);
        Assertions.assertTrue(bus.getPassengers().contains(passenger1));
    }

    @DisplayName("En passagerare kliver av")
    @Test
    public void removePassenger(){
        bus.addPassenger(passenger1);
        bus.removePassenger(passenger1);
        Assertions.assertFalse(bus.getPassengers().contains(passenger1));
    }

    @DisplayName("Test för att se ifall maxkapaciteten inte kan överskridas")
    @Test
    public void testMax(){
    for(int i = 0; i < 21; i++)
        bus.addPassenger(passenger1);
    Assertions.assertEquals(bus.getPassengers().size(), 20);
    }
}
