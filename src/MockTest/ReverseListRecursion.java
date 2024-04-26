package MockTest;

import java.util.List;

public class ReverseListRecursion {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Start reading in reverse order using recursion
        readListInReverse(numbers, numbers.size() - 1);
    }

    private static void readListInReverse(List<Integer> list, int index) {
        if (index >= 0) {
            int temp = list.get(index);
            System.out.println(temp);
            readListInReverse(list, index - 1);
        }
    }
}