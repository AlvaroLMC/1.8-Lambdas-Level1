package Exercise5;

public class Main {
    public static void main(String[] args) {
        PiValueProvider pi = () -> 3.1416;

        System.out.print(pi.getPiValue());
    }
}
