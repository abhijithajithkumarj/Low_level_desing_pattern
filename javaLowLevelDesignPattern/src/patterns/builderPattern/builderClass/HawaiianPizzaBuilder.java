package patterns.builderPattern.builderClass;

import patterns.builderPattern.builder.PizzaBuilder;

public class HawaiianPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public HawaiianPizzaBuilder (){
        this.pizza=new Pizza();
    }
    @Override
    public void buildDough() {
        pizza.setDough("cross");

    }

    @Override
    public void buildSauce() {
        pizza.setSauce("mild");

    }

    @Override
    public void buildTopping() {
        pizza.setTopping("ham and pineapple");

    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
