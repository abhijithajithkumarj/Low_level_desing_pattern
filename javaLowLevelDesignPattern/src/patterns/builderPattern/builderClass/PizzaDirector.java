package patterns.builderPattern.builderClass;

import patterns.builderPattern.builder.PizzaBuilder;

public class PizzaDirector {
    public  void makePizza(PizzaBuilder builder){
        builder.buildDough();
        builder.buildSauce();
        builder.buildTopping();

    }
}
