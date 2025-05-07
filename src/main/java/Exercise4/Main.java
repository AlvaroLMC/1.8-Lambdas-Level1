package Exercise4;

import static Exercise3.Management.stringsList;

public class Main {

    public static void main(String[] args) {

        Management.loadStrings();
        stringsList.forEach(System.out::println);
    }
}
