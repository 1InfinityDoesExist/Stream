import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionJava8 {
    public static void main(String[] args) {

        Executer executer = new Executer();
        executer.fun1();
        executer.fun2();
        executer.fun3();
        executer.fun4();
    }
}


class Executer {

    public void fun1() {
        Function<String, Integer> func = x -> x.length();
        Integer len = func.apply("Avinash Patel");
        System.out.println(len);
    }

    public void fun2() {
        Function<String, Integer> func = x -> x.length();
        Function<Integer, Integer> func1 = i -> i * i;
        Integer finalOutput = func.andThen(func1).apply("Avinash Patel");
        System.out.println(finalOutput);
    }

    public void fun3() {
        List<String> names = Arrays.asList("Avinsh Patel", "Bebo Shah", "Babu K");
        Map<String, Integer> mapOutput = convertNamesToMap(names, x -> x.length());
        System.out.println();
        System.out.println(mapOutput);
        System.out.println();
    }

    private <T, R> Map<T, R> convertNamesToMap(List<T> names, Function<T, R> func) {
        Map<T, R> result = new HashMap<>();
        for (T t : names) {
            result.put(t, func.apply(t));
        }
        return result;
    }

    public void fun4() {
        List<String> names = Arrays.asList("Avinsh Patel", "Bebo Shah", "Babu K");
        Map<String, Integer> mapOutput = convertNamesToMap(names, new Executer()::getNameLength);
        long count = mapOutput.entrySet().stream().filter(x -> x.getValue() > 5).count();
        System.out.println(count);
    }

    private int getNameLength(String name) {
        return name.length();
    }

}
