package creational.singleton.methods;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AircraftLazy {

    // Lazy initialization
    private static AircraftLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftLazy(String name) {
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

    public static AircraftLazy getINSTANCE() {

        if (Objects.isNull(INSTANCE)){
            synchronized (AircraftLazy.class) {
                if (Objects.isNull(INSTANCE)){
                    INSTANCE = new AircraftLazy("A380");
                }
            }

        }
        return INSTANCE;
    }


}
