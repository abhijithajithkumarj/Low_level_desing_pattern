package patterns.abstractfactorypattern.genaralClass;

import patterns.abstractfactorypattern.inter.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");

    }
}
