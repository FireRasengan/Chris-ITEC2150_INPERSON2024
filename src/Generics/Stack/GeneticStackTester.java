package Generics.Stack;

public class GeneticStackTester {
    public static void main(String[] args) {
        GenericStack<Integer> x = new GenericStack<>();

        x.push(9);
        System.out.println(x);
        System.out.println(x.pop());
        System.out.println(x);

        GenericStack<String> y = new GenericStack<>();


    }
}
