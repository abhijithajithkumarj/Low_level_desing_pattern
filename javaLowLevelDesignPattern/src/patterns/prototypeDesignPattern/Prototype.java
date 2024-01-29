package patterns.prototypeDesignPattern;

public interface Prototype {

    Prototype clone();
    void setProperty(String property);
    String getProperty();
}
