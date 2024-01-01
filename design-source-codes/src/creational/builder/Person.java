package creational.builder;

import java.time.LocalDate;

public class Person {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private LocalDate birthDate;


        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder birthDate(LocalDate birthDate){
            this.birthDate = birthDate;
            return this;
        }

        public Person build(){
            return new Person(this.firstName, this.lastName, this.birthDate);
        }


    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }


}
