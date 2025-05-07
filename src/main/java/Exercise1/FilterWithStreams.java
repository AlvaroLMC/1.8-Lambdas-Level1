package Exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class FilterWithStreams {


    public static List<String> filterLetterO(List<String> characterStrings) {
        return characterStrings.stream()
                .filter(characterString -> characterString.contains("o"))
                .collect(Collectors.toList());
    }
}