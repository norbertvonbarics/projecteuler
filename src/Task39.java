import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * If p is the perimeter of a right angle triangle with integral length sides,
 * {a,b,c}, there are exactly three solutions for p = 120.
 *
 * {20,48,52}, {24,45,51}, {30,40,50}
 *
 * For which value of p ≤ 1000, is the number of solutions maximised?
 */
class Task39 {

  List<Integer> nonDuplicateList = new ArrayList<>();

  int task39Solution() {
    return getMaxValues();
  }

  private boolean isRightAngled(int a, int b, int c) {
    return a * a + b * b == c * c;
  }

  private boolean isBelow1000(int a, int b, int c) {
    return a + b + c < 1000;
  }


  private int getMaxValues() {
    int counter = 0;
    for (int i = 0; i < 500; i++) {
      System.out.println(i);
      for (int j = 0; j < 500; j++) {
        for (int k = 0; k < 500; k++) {
          if (isBelow1000(i, j, k) && isRightAngled(i, j, k) && isNonDuplicate(i, j, k)) {
            counter++;
          }
        }
      }
    }
    return counter;
  }

  private boolean isNonDuplicate(int a, int b, int c) {
    List<Integer> tempList = new ArrayList<>(Arrays.asList(a, b, c));
    Collections.sort(tempList);
    StringBuilder tempString = new StringBuilder();
    for (int x : tempList) {
      tempString.append(x);
    }
    int tempInt = Integer.valueOf(tempString.toString());
    if (nonDuplicateList.contains(tempInt)) {
      return false;
    }
    nonDuplicateList.add(tempInt);
    return true;
  }
}
