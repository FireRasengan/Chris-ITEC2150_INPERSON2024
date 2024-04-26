package MockTest;

public class ReversePrintExample {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reversePrint(array);
    }

    public static void reversePrint(int[] array) {
        if (array.length > 0) {
            int[] tempArray = new int[array.length - 1];
            int temp = array.length - 1;
            System.out.println(array[temp]);
            for (int i = 0; i < array.length - 1; i++) {
                tempArray[i] = array[i];
            }
            reversePrint(tempArray);
        }
    }
}