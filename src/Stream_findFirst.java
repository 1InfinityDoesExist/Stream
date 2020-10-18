import java.util.List;

public class Stream_findFirst {

    public static void main(String[] args) {
        Execute ex = new Execute();
        ex.execute();
    }
}


class Execute {
    public void execute() {
        List<Integer> l = new InputData().listOfIntegerData();
        l.stream().sorted().findFirst().ifPresent(x -> System.out.println(x));
    }
}
