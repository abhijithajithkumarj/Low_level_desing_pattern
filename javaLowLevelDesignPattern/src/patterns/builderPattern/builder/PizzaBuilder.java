package patterns.builderPattern.builder;

import patterns.builderPattern.builderClass.Pizza;

public interface PizzaBuilder {
    void buildDough();
    void buildSauce();
    void buildTopping();
    Pizza getPizza();
}
