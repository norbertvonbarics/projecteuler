import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task21 {

  //  31626
  //  RUNTIME: 2853 MILLIS
  public int task21Solution() {
    return isAmicable(10000).stream().mapToInt(Integer::intValue).sum();
  }

  private int getDividers(int number) {
    return IntStream
        .range(1, number)
        .filter(e -> number % e == 0)
        .sum();
  }

  private Set<Integer> isAmicable(int number) {
    return IntStream
        .range(0, number)
        .filter(e -> e != getDividers(e) && getDividers(getDividers(e)) == e)
        .boxed()
        .collect(Collectors.toSet());
  }
}
