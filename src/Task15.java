import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task15 {

  public long task15Solution() {
//    List<Long> pascalsTriangleList = new ArrayList<>();
//    int gridSize = 41;
//    for (int i = 0; i < gridSize; i++) {
//      for (int j = gridSize; j > i; j--) {
//        System.out.print(" ");
//      }
//      long number = 1;
//      for (int k = 0; k <= i; k++) {
//        System.out.print(number + " ");
//        number = number * (i - k) / (k + 1);
//        pascalsTriangleList.add(number);
//      }
//      System.out.println();
//    }
//    Collections.sort(pascalsTriangleList);
//    long solution = 0;
//    for (int i = 0; i < pascalsTriangleList.size(); i++) {
//      solution += pascalsTriangleList.get(i);
//    }
//    return solution;
//  }

    int gridSize = 20;
    long paths = 1;

    for (int i = 0; i < gridSize; i++) {
      paths *= (2 * gridSize) - i;
      paths /= i + 1;
    }
    return paths;
  }
}

