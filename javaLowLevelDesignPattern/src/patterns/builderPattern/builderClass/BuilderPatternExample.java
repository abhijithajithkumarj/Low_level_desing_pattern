package patterns.builderPattern.builderClass;

import patterns.builderPattern.builder.PizzaBuilder;

public class BuilderPatternExample {

    public static void main(String[] args) {
        PizzaBuilder hawaiianPizzaBuilder=new HawaiianPizzaBuilder();
        PizzaDirector pizzaDirector=new PizzaDirector();


        pizzaDirector.makePizza(hawaiianPizzaBuilder);
        Pizza pizza= hawaiianPizzaBuilder.getPizza();
        pizza.describePizza();
    }
}
