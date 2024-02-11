package creational.singleton.methods;

import java.util.HashSet;
import java.util.Set;

public enum AircraftEnum {

    INSTANCE;
    private final Set<String> availableSeats;

    AircraftEnum() {
        this.availableSeats = new HashSet<>();
        this.availableSeats.add("1A");
        this.availableSeats.add("2b");
    }


    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
