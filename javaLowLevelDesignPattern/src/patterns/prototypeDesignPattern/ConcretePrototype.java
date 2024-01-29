package patterns.prototypeDesignPattern;

public class ConcretePrototype implements  Prototype{

    private String property;


    ConcretePrototype (String property){
        this.property = property;
    }



    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.property);
    }

    @Override
    public void setProperty(String property) {
        this.property = property;



    }

    @Override
    public String getProperty() {
        return property;
    }
}
