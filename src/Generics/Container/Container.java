package Generics.Container;

public class Container<T> {
    private T variable;

    public Container() {

    }
    public Container(T x) {
        this.variable = x;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }

    public T getVariable() {
        return variable;
    }
}