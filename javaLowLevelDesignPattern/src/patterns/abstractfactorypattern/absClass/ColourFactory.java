package patterns.abstractfactorypattern.absClass;

import patterns.abstractfactorypattern.genaralClass.Blue;
import patterns.abstractfactorypattern.inter.AbstractFactory;
import patterns.abstractfactorypattern.inter.Color;
import patterns.abstractfactorypattern.inter.Shape;

public class ColourFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return null;
    }

    @Override
    public Color createColor() {
        return new Blue();
    }
}
