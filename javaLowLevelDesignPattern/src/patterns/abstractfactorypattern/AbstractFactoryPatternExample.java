package patterns.abstractfactorypattern;

import patterns.abstractfactorypattern.absClass.ColourFactory;
import patterns.abstractfactorypattern.absClass.ShapeFactory;
import patterns.abstractfactorypattern.inter.AbstractFactory;
import patterns.abstractfactorypattern.inter.Color;
import patterns.abstractfactorypattern.inter.Shape;

public class AbstractFactoryPatternExample {

    public static void main(String[] args) {


        AbstractFactory shapeFactory=new ShapeFactory();
        Shape shape= shapeFactory.createShape();
        shape.draw();


        AbstractFactory colorFactory=new ColourFactory();
        Color colour= colorFactory.createColor();
        colour.fill();
    }
}
