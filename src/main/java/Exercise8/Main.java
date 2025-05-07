package Exercise8;

public class Main {
    public static void main(String[] args) {
        StringReverses reverses = s -> new StringBuilder(s).reverse().toString();

        String original = "lambdas";
        String reverse = reverses.reverse(original);

        System.out.println(original);
        System.out.println(reverse);
    }
}
