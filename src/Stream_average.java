import java.util.Arrays;

public class Stream_average {
    public static void main(String[] args) {

        Arrays.stream(new int[] {2, 3, 10, 20, 50}).average()
                        .ifPresent(System.out::println);
    }
}
