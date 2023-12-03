package creational.builder;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Person person = new Person.Builder()
                .firstName("Lucas")
                .lastName("Gomes")
                .birthDate(LocalDate.EPOCH)
                .build();

        System.out.println("Person: " + person.toString());

    }
}
