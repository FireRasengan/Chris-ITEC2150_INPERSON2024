package Generics.Container;

public class ContainerTester {
    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<Integer>();
        intContainer.setVariable(5);

        Container<String> stringContainer = new Container<String>();

        Container<House> houseContainer = new Container<House>();
    }
}