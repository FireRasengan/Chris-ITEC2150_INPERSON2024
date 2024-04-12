package Generics.Maximum;

import java.util.Comparator;

public class MaxDemo {
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        T max = arr[0];

        for(T value: arr) {
            if(value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }

    /*public static <T> T findMax(T[] arr, Comparator<T> comparator) {

    }*/
}
