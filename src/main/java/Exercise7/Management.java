package Exercise7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Management {

    public static List<String> list = new ArrayList<>();

    public Management(List<String> list) {

        Management.list = list;
    }

    public static void loadStrings() {
        list.addAll(Arrays.asList("123", "TTTT", "1", "AA", "12345"));
    }
}
