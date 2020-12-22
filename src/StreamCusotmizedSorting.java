import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCusotmizedSorting {
    public static void main(String[] args) {
        CustomizedSorting customizedSorting = new CustomizedSorting();
        customizedSorting.descendingOrderSorting1();
        customizedSorting.descendingOrderSorting2();
        customizedSorting.descendingOrderSorting3();
        customizedSorting.descendingOrderSorting4();
    }
}


class CustomizedSorting {
    /*
     * sorted() is natural order sorting i.e ascending order so in-order to sort decreasing order
     * you need customized sorting for that we need to use Comparator interface which overrides
     * compare() method.
     */
    public void descendingOrderSorting1() {
        List<Integer> data = new InputData().listOfIntegerData(); // input data.
        /*
         * Processing starts here.
         */
        System.out.println("Before Sorting : " + data);
        List<Integer> sortedData =
                        data.stream().sorted(new Comparator<Integer>() {
                            @Override
                            public int compare(Integer obj1, Integer obj2) {
                                // TODO Auto-generated method stub
                                return (obj1 < obj2) ? 1 : (obj1 > obj2) ? -1 : 0;
                            }
                        }).collect(Collectors.toList());
        System.out.println("After Sorting : " + sortedData);
        data.clear();
        sortedData.clear();
    }

    /*
     * new Comparator<Integer>(){} comparator interface implemented with lambda expression.
     */
    public void descendingOrderSorting2() {
        List<Integer> data = new InputData().listOfIntegerData(); // input data.
        /*
         * Processing starts here.
         */
        System.out.println("Before Sorting : " + data);
        List<Integer> sortedData =
                        data.stream().sorted(
                                        (obj1, obj2) -> (obj1 < obj2) ? -1 : (obj1 > obj2) ? 1 : 0)
                                        .collect(Collectors.toList());
        System.out.println("After Sorting :::::: " + sortedData);
        data.clear();
        sortedData.clear();
    }

    /*
     * .sorted() internally implements Comparable<?> interface which overrides compareTo method so
     * by adding - to the obj1 i.e -obj1 compareTo(obj2)
     */
    public void descendingOrderSorting3() {
        List<Integer> data = new InputData().listOfIntegerData(); // input data.
        /*
         * Processing starts here.
         */
        System.out.println("Before Sorting : " + data);
        List<Integer> sortedData =
                        data.stream().sorted((obj1, obj2) -> -obj1.compareTo(obj2))
                                        .collect(Collectors.toList());
        System.out.println("After Sorting : " + sortedData);
        data.clear();
        sortedData.clear();
    }

    /*
     * .sorted() internally implements Comparable<?> interface which overrides compareTo method so
     * just change the parameters
     */
    public void descendingOrderSorting4() {
        List<Integer> data = new InputData().listOfIntegerData(); // input data.
        /*
         * Processing starts here.
         */
        System.out.println("Before Sorting : " + data);
        List<Integer> sortedData =
                        data.stream().sorted((obj1, obj2) -> obj2.compareTo(obj1))
                                        .collect(Collectors.toList());
        System.out.println("After Sorting : " + sortedData);
        data.clear();
        sortedData.clear();
    }
}
