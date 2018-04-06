import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task02 {

  //4613732
  public int task02Solution() {

    List<Integer> fibonacciArray = new ArrayList<>(Arrays.asList(1, 2));
    int task02Solution = 0;
    for (int i = fibonacciArray.get(fibonacciArray.size() - 1); i < 4000000;
        i += fibonacciArray.get(fibonacciArray.size() - 2)) {
      fibonacciArray.add(fibonacciArray.get(fibonacciArray.size() - 2) + fibonacciArray
          .get(fibonacciArray.size() - 1));
    }


    for (Integer aFibonacciArray : fibonacciArray) {
      if (aFibonacciArray % 2 == 0) {
        task02Solution += aFibonacciArray;
      }
    }
//smaller but slower solution
//    return fibonacciArray.stream().filter(e -> e % 2 == 0).mapToInt(Integer::intValue).sum();
    return task02Solution;
  }
}
