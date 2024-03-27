package ExceptionHandlingBasic;

public class ExceptionHandlingMethods {
    public static void main(String[] args) {
        ExceptionHandlingMethods em = new ExceptionHandlingMethods();
        String x = "";
        String y = "abcd";
        System.out.println("foo() null");
        em.foo(null);
        System.out.println("bar() null");
        em.bar(null);
        System.out.println("empty string");
        em.foo(x);
        System.out.println("abcd");
        em.foo(y);
    }
    public void foo(String x) {
        System.out.println("First Character of String value from foo() method: " + x.charAt(0));
    }
    public void bar(String x) {
        if (x == null) {
            System.out.println(" 2- ");
        }
        System.out.println("First Character - bat() method " + x.charAt(0));
    }
}
