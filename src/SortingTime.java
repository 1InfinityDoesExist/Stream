import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class SortingTime {
	public static void main(String[] args) {
		List<String> uuids = new ArrayList<String>();
		for (int iter = 0; iter < 1000000; iter++) {
			uuids.add(UUID.randomUUID().toString());
		}
		long start = System.nanoTime();
		uuids.parallelStream().sorted();
		long end = System.nanoTime();

		System.out.println(TimeUnit.NANOSECONDS.toMillis(end - start));
	}

}
