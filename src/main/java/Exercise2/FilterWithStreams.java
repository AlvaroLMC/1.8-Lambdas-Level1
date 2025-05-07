package Exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class FilterWithStreams {


    public static List<String> filter(List<String> characterStrings) {
        return characterStrings.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }
}