package creational.singleton.test;

import creational.singleton.methods.AircraftEager;

public class AircraftEagerTest {

    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("2A");
    }

     static void bookSeat(String seat){

        AircraftEager aircraft = AircraftEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }

}
