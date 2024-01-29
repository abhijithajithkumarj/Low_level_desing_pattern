package patterns.abstractfactorypattern.genaralClass;

import patterns.abstractfactorypattern.inter.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");

    }
}
