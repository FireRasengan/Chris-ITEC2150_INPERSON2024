package Generics.GenericPairs.Calculator;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator<Integer> intCalculator = new Calculator<Integer>();
        int x = 5;
        int y = 10;
        intCalculator.add(x, y);

    }
}
