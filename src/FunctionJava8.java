import java.util.function.Function;

public class FunctionJava8 {
    public static void main(String[] args) {

        Executer executer = new Executer();
        executer.fun1();
        executer.fun2();
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
}
