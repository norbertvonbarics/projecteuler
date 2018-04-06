import java.util.stream.IntStream;

public class Task01 {

    public int task01Solution() {
      return IntStream.range(0, 1000).filter(e -> e % 5 == 0|| e % 3 == 0).sum();
    }
}
