package creational.singleton.test;

import creational.singleton.methods.AircraftLazy;

public class AircraftLazyTest {

    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("2A");
    }

     static void bookSeat(String seat){

        AircraftLazy aircraft = AircraftLazy.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }

}
