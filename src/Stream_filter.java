import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_filter {
    public static void main(String[] args) {
        Filteration filteration = new Filteration();
        filteration.filter();
    }
}


class Filteration {
    public void filter() {
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika",
                    "Sarah"};

        /*
         * 1st Method
         */
        Predicate<String> predicate = p -> p.startsWith("S");
        List<String> output =
                        Stream.of(names).filter(predicate).sorted().collect(Collectors.toList());
        output.stream().forEach(System.out::println);

        /*
         * 2nd Method
         */

        Arrays.stream(names).filter(p -> p.length() > 5).findFirst().ifPresent(System.out::println);

    }
}
