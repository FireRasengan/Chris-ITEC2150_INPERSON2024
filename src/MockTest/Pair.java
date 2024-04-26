package MockTest;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }


    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(10, 20);
        System.out.println("First: " + pair.getFirst());  // Output: First: 10
        System.out.println("Second: " + pair.getSecond()); // Output: Second: 20

        pair.setFirst(30);
        pair.setSecond(40);
        System.out.println("Updated First: " + pair.getFirst());  // Output: Updated First: 30
        System.out.println("Updated Second: " + pair.getSecond()); // Output: Updated Second: 40
    }
}