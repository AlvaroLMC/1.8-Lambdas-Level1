package Exercise6;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Management.loadStrings();

        List<String> sortedList = Management.list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        sortedList.forEach(System.out::println);
    }
}

