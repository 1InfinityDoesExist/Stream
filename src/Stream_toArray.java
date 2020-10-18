import java.util.List;
import java.util.stream.Stream;

public class Stream_toArray {

    public static void main(String[] args) {
        ToArrayConverter toArrayConverter = new ToArrayConverter();
        Integer[] i = toArrayConverter.returnArray();
        for (Integer i1 : i) {
            System.out.println(i1);
        }
        /*
         * How to get Stream of array
         */

        Stream.of(i).forEach(System.out::println);


        Stream<Integer> streamOfInteger = Stream.of(9, 99, 999, 9999, 99999, 999999);
        streamOfInteger.forEach(System.out::println);
    }
}


/*
 * Integer[]::new Return Integer array Object
 */
class ToArrayConverter {
    public Integer[] returnArray() {
        List<Integer> listOfInteger = new InputData().listOfIntegerData();
        Integer[] arrayOfData = listOfInteger.stream().toArray(Integer[]::new);
        return arrayOfData;
    }

}

