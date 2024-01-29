package patterns.prototypeDesignPattern;

public class PrototypePatternExample {

    public static void main(String[] args) {

        ConcretePrototype concretePrototype =new ConcretePrototype("Initial Property");

        ConcretePrototype clone=(ConcretePrototype) concretePrototype.clone();


        clone.setProperty("Modified Property");

        System.out.println("original : " + concretePrototype.getProperty());
        System.out.println("clone : " + clone.getProperty());



    }



}
