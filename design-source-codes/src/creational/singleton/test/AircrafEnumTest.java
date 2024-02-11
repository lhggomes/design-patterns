    package creational.singleton.test;

    import creational.singleton.methods.AircraftEnum;

    public class AircrafEnumTest {

        public static void main(String[] args) {
            bookSeat("1A");
            bookSeat("1A");
        }

        static void bookSeat(String seat) {

            System.out.println(AircraftEnum.INSTANCE);
            AircraftEnum instance = AircraftEnum.INSTANCE;
            System.out.println(instance.bookSeat(seat));

        }

    }
