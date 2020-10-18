import java.util.stream.IntStream;

public class Stream_sum {

    public static void main(String[] args) {

        int add = IntStream.range(1, 20).sum();
        System.out.println(add);
    }
}

