package Generics;
import java.util.ArrayList;

public class BeforeGenetics {
    public static void main(String[] args) {
        ArrayList objectitems= new ArrayList();
        objectitems.add(1);
        objectitems.add("Banana");
        objectitems.add(4.5);
        objectitems.add('t');
        objectitems.add(true);
        printlist(objectitems);
    }

    public static void printlist(ArrayList x) {
        for(Object i: x) {
            System.out.println(i);
        }
    }

    public static void printIntegerList(ArrayList<Integer> x) {
        for (Integer y: x) {
            System.out.println(y);
        }
    }
}