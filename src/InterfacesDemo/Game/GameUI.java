package InterfacesDemo.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class GameUI {
    public static void main(String[] args) {
        ISavable k1 = new King("Henry the King", 2, "one at a time in any direction", "Black");
        ISavable q1 = new Queen("Elizabeth the Queen", 6, "any direction as far", "White");

    }

    public static void saveObject(ISavable isobj) {
        for (int i = 0; i < isobj.write().size(); i++){
            System.out.println(isobj.write().get(i));
        }
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

    }

    public static void loading(ISavable isobj) {

    }
}
