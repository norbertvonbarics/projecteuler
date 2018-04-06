import java.util.stream.IntStream;

public class Task06 {

  public int task06Solution() {
    double squareSum = IntStream.range(1, 101).mapToDouble(e -> Math.pow(e, 2)).sum();
    double squareOfTheSum = Math.pow(IntStream.range(1, 101).sum(), 2);
    return (int) (squareOfTheSum - squareSum);
  }
}
