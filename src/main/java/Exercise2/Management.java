package Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Management {

    public static List<String> stringsList = new ArrayList<>();

    public Management(List<String> stringsList) {
        Management.stringsList = stringsList;
    }


    public static void loadStrings() {
        stringsList.addAll(Arrays.asList("Monday", "Tuesday", "january", "October", "Oct"));
    }
}
