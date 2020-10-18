import java.util.List;
import java.util.stream.IntStream;

public class Stream_skip {

    public static void main(String[] args) {
        SkipMethod method = new SkipMethod();
        method.skipSomeValues();

        /*
         * Second way of doing this...
         * 
         */

        System.out.println();
        IntStream.range(1, 20).skip(5).forEach(x -> System.out.println(x));
        System.out.println();
    }
}


/*
 * 
 * It skips first n integers
 */
class SkipMethod {
    public void skipSomeValues() {
        List<Integer> l = new InputData().listOfIntegerData();
        l.stream().skip(2).forEach(i -> System.out.println(i));
    }
}
