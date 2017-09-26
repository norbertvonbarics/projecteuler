import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task05 {

  public int task05Solution() {
    List<Integer> divides = new ArrayList<>();
    for (int i = 1; i < 2000000000; i++) {
      if (isDividable(i)) {
        divides.add(i);
      }
    }
    Collections.sort(divides);
    System.out.println(divides);
    return divides.get(0);
  }

  private boolean isDividable(int number) {
    int counter = 0;
    for (int i = 1; i < 21; i++) {
      if (number % i == 0) {
        counter++;
      }
    }
    return counter == 20;
  }
}
