import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCusotmizedSorting {
    public static void main(String[] args) {
        CustomizedSorting customizedSorting = new CustomizedSorting();
        customizedSorting.descendingOrderSorting1();
    }
}


class CustomizedSorting {
    public void descendingOrderSorting1() {
        List<Integer> data = new InputData().listOfIntegerData(); // input data.
        /*
         * Processing starts here.
         */
        System.out.println(data);
        List<Integer> sortedData =
                        data.stream().sorted(new Comparator<Integer>() {
                            @Override
                            public int compare(Integer obj1, Integer obj2) {
                                // TODO Auto-generated method stub
                                return (obj1 < obj2) ? 1 : (obj1 > obj2) ? -1 : 0;
                            }
                        }).collect(Collectors.toList());
        System.out.println(sortedData);
    }
}
