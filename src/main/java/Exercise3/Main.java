package Exercise3;
import static Exercise3.Management.stringsList;

public class Main {

    public static void main(String[] args) {

        Management.loadStrings();
        stringsList.forEach(s -> System.out.println(s));
    }
}
