# Design Patterns

Design patterns are used to speed up the development process, by providing many resources to make the dev process easier
and faster.

We can define it, as a general  repeated solution to a commonly occurring problem in software design.
Can be divided them in:

- Creational patterns
- Structural patterns
- Behavioral patterns

## Creational Pattern

### Builder

This is a design pattern that helps us to create complex objects, step by step. So we don't need to use complex
class constructors, or generate a new one for our specific needs. 

Let's see the example shown bellow:

```
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

```
It shows us, how to create a builder for the class person. It's quite simple, we create a 
static class, that's going to contain all the fields as methods, so they can be used while performing the creation of 
an object for Person class. 

To use this builder, we can do like this: 

```
public static void main(String[] args) {

        Person person = new Person.Builder()
                .firstName("Lucas")
                .lastName("Gomes")
                .birthDate(LocalDate.EPOCH)
                .build();

        System.out.println("Person: " + person.toString());

    }
```
### Factory



