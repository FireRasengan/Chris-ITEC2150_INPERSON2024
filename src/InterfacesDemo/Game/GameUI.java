package InterfacesDemo.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class GameUI {
    public static void main(String[] args) {
        ISavable k1 = new King("Henry the King", 2, "one at a time in any direction", "Black");
        ISavable q1 = new Queen("Elizabeth the Queen", 6, "any direction as far", "White");

        saveObject(k1);
        saveObject(q1);

    }

    public static void saveObject(ISavable isobj) {
        for (int i = 0; i < isobj.write().size(); i++){
            System.out.println(isobj.write().get(i));
        }
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose 1 to enter a string or 0 to quit");
        int choice = scanner.nextInt();
        int index = 0;
        while (choice != 0) {
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println("Enter a string:");
                    String strInput = scanner.nextLine();
                    values.add(index, strInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void loading(ISavable isobj) {
        ArrayList<String> aList = readValues();
        isobj.read(aList);
    }
}