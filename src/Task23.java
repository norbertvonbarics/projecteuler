import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task23 {

  private final int SIZE = 28124;

  public int task23Solution() {
    Set<Integer> abundantSet = abundantSet(abundantNumbers());
    return unAbundantNumberSum(abundantSet);
  }

  private List<Integer> abundantNumbers() {
    List<Integer> abundantList = new ArrayList<>();
    for (int i = 0; i < SIZE; i++) {
      if (isAbundant(i)) {
        abundantList.add(i);
      }
    }
    return abundantList;
  }

  private boolean isAbundant(int number) {
    int dividerSum = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        dividerSum += i;
      }
    }
    return number < dividerSum;
  }

  private Set<Integer> abundantSet(List<Integer> list) {
    Set<Integer> numberSet = new HashSet<>();
    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size(); j++) {
        numberSet.add(list.get(i) + list.get(j));
      }
    }
    return numberSet;

  }

  private int unAbundantNumberSum(Set<Integer> numberSet) {
    int number = 0;
    for (int i = 1; i < SIZE; i++) {
      if (!numberSet.contains(i)) {
        number += i;
      }
    }
    return number;
  }
}
