package Exercise7;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Management.loadStrings();

        Management.list.sort(Comparator.comparingInt(String::length).reversed());

        Management.list.forEach(System.out::println);
    }
}
