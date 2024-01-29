package patterns.abstractfactorypattern.genaralClass;

import patterns.abstractfactorypattern.inter.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");


    }
}
