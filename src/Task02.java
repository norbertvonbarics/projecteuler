import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02 {

  public int task02Solution() {
    List<Integer> fibonacciArray = new ArrayList<>(Arrays.asList(1, 2));
    int task02Solution = 0;
    for (int i = fibonacciArray.get(fibonacciArray.size() - 1); i < 4000000;
        i += fibonacciArray.get(fibonacciArray.size() - 2)) {
      fibonacciArray.add(fibonacciArray.get(fibonacciArray.size() - 2) + fibonacciArray
          .get(fibonacciArray.size() - 1));
    }

    for (int i = 0; i < fibonacciArray.size(); i++) {
      if (fibonacciArray.get(i) % 2 == 0) {
        task02Solution += fibonacciArray.get(i);
      }
    }

    System.out.println(fibonacciArray);
    return task02Solution;
  }
}
