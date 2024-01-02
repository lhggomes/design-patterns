package creational.factory.methods;

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
