package AbstractDemo;

public abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("This is an Abstract class");
    }

    abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {
    ConcreteClass() {
        super();
        System.out.println("This is from ConcreteClass");
    }

    public void abstractMethod() {
        System.out.println("this is overridden abstractMethod");
    }
}

class AbstractTester {
    public static void main(String[] args) {
        AbstractClass abc = new ConcreteClass();
        ConcreteClass cc = new ConcreteClass();


    }
}