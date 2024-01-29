package patterns.abstractfactorypattern.genaralClass;

import patterns.abstractfactorypattern.inter.Shape;

public class Rectangular implements Shape {
    @Override
    public void draw() {

        System.out.println("Inside Rectangle::draw() method.");

    }
}
