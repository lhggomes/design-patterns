package creational.factory.test;

import creational.factory.methods.Country;
import creational.factory.methods.Currency;
import creational.factory.methods.CurrencyFactory;

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
