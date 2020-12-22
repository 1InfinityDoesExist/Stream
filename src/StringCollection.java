import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StringCollection {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("patel");
		names.add("sinchan");
		names.add("sujal");
		names.add("daniel");

		boolean bol1 = names.stream().anyMatch(n -> n.startsWith("pat"));
		System.out.println(bol1);

		boolean bol2 = names.stream().allMatch(n -> n.startsWith("p"));
		System.out.println(bol2);

		boolean bol3 = names.stream().noneMatch(n -> n.startsWith("z"));
		System.out.println(bol3);

		Optional<String> reduce = names.stream().reduce((n, m) -> n + "->" + m);
		reduce.ifPresent(System.out::println);
	}
}
