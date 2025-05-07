package Exercise2;

import java.util.List;

import static Exercise2.FilterWithStreams.filter;

public class Main {

    public static void main(String[] args) {
        Management.loadStrings();
        List<String> result = filter(Management.stringsList);
        result.forEach(s -> System.out.println(s));
    }
}
