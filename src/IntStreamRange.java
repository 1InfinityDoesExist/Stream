import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public class IntStreamRange {
	public static void main(String[] args) {
		List<String> uuids = new ArrayList<>();
		IntStream.range(0, 1000).forEach(u -> uuids.add(UUID.randomUUID().toString()));

		uuids.stream().forEach(System.out::println);
	}
}
