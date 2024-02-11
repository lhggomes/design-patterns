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
### Factory Method

Factory is a design pattern that provide us an interface for creating objects in a superclass, but at the sametime, allow
subclasses to alter the type of objects that will be created.

Let's see the example shown bellow:

Create a currency interface
```
public interface Currency {
    String getSymbol();
}

```

Now, create one class for each currency
```
public class Real implements Currency {
    
    @Override
    public String getSymbol() {
        return "R$";
    }
}
public class UsaDollar implements Currency {
    @Override
    public String getSymbol() {
        return "USD";
    }
}
```
To implement the factory method, we must create a Factory class, that will receive the needed parameter, and generates
the specific class with the needed methods. 

```
public class CurrencyFactory {

    public static Currency newCurrency(Country country) throws IllegalArgumentException{
        switch (country){
            case USA -> {
                return new UsaDollar();
            }
            case BRAZIL -> {
                return new Real();
            }
            default -> throw new IllegalArgumentException("No Currency found for this country " + country);
        }
    }
}
```
So, to use, we can procedded like this: 

```
public class Main {

    public static void main(String[] args){

        System.out.println("Performing the creation of USA Currency");
        Currency usdDollar = CurrencyFactory.newCurrency(Country.USA);
        System.out.println(usdDollar.getSymbol());
        assert usdDollar.getSymbol().equalsIgnoreCase("USD");

        System.out.println("Performing the creation of Real Currency");
        Currency brazilianReal = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(brazilianReal.getSymbol());
        assert brazilianReal.getSymbol().equalsIgnoreCase("R$");
    }
}

```
### Singleton

This pattern lets you ensure that a class has only one instance. So it provides a global access point 
to this instance created. We generally use this pattern while working with Databases, or log classes. 

We can create a singleton class, by two ways:
    
1. Eager Initialization
2. Lazy Initialization


#### Eager Initialization

First of all, we must create our class, that we want to make it singleton. 


### References
[Refactoring Guru](https://refactoring.guru/)



