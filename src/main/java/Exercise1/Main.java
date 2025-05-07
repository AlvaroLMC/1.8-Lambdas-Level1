package Exercise1;

import java.util.List;

import static Exercise1.FilterWithStreams.filterLetterO;
import static Exercise3.Management.stringsList;

public class Main {

    public static void main(String[] args) {
        Management.loadStrings();
        List<String> result = filterLetterO(Management.stringsList);
        result.forEach(s -> System.out.println(s));

    }
}
