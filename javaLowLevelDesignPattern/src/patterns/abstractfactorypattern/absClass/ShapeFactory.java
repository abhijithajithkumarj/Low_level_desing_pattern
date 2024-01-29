package patterns.abstractfactorypattern.absClass;

import patterns.abstractfactorypattern.genaralClass.Rectangular;
import patterns.abstractfactorypattern.inter.AbstractFactory;
import patterns.abstractfactorypattern.inter.Color;
import patterns.abstractfactorypattern.inter.Shape;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Rectangular();
    }

    @Override
    public Color createColor() {
        return null;
    }
}
