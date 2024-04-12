package Generics.GenericPairs;

public class GenericPairTester {
    public static void main(String[] args) {
        GenericPair<Integer> gp = new GenericPair<Integer>(10, 20);
        Integer x = gp.getFirst();
        Integer y = gp.getSecond();

        int xInt = x.intValue();
        int yInt = y.intValue();

        Integer newX = Integer.valueOf(xInt);


    }
}
