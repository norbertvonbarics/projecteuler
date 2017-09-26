import java.util.ArrayList;
import java.util.List;

public class Task14 {

  public long task14Solution() {
    return getSolution();
  }

  private long getSolution() {
    long solution = 0;
    long counter = 0;
    for (int i = 2; i < 1000001; i++) {
      long tempCounter = collatzSequencer(i);
      if (tempCounter > counter) {
        counter = tempCounter;
        solution = i;
      }
    }
    return solution;
  }

  private long collatzSequencer(long number) {
    long counter = 1;
    while (number > 1) {
      if (number % 2 == 0) {
        number /= 2;
      } else {
        number = number * 3 + 1;
      }
      counter++;
    }
    return counter;
  }
}
