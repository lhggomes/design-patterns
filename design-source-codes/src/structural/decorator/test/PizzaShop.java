package structural.decorator.test;

import structural.decorator.methods.CheesePizzaDecorator;
import structural.decorator.methods.Pizza;
import structural.decorator.methods.PizzaDecorator;
import structural.decorator.methods.PlainPizza;

public class PizzaShop {

    public static void main(String[] args) {

        Pizza pizza = new CheesePizzaDecorator(new PlainPizza());
        pizza.bake();
    }
}
