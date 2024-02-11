package creational.singleton.methods;

import java.util.HashSet;
import java.util.Set;

public class AircraftEager {

    // Eager initialization
    private final static AircraftEager INSTANCE = new AircraftEager("A380");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftEager(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        System.out.printf("Removing seat %s from Aircraft %s%n", seat, this.name);
        return availableSeats.remove(seat);
    }

    public static AircraftEager getINSTANCE() {
        return INSTANCE;
    }


}
