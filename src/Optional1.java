import java.util.Optional;

public class Optional1 {
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("Patel");

		// Imp methods
		optional.get();
		optional.isPresent();
		System.out.println(optional.orElse("Avinash"));

		optional.ifPresent(p -> System.out.println(p.charAt(0)));
	}
}
