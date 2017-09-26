import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task21 {

  public int task21Solution() {
    Set<Integer> integerSet = isAmicable(10000);
    return amicablesSum(integerSet);
  }

  private int getDividers(int number) {
    List<Integer> dividerList = new ArrayList<>();
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        dividerList.add(i);
      }
    }
    return dSum(dividerList);
  }

  private int dSum(List<Integer> dividerList) {
    int sum = 0;
    for (Integer aDividerList : dividerList) {
      sum += aDividerList;
    }
    return sum;
  }

  private Set<Integer> isAmicable(int number) {
    Set<Integer> amicables = new HashSet<>();
    for (int i = 0; i < number; i++) {
      if ((getDividers(getDividers(i)) == i) && (i != getDividers(i))) {
        amicables.add(i);
      }
    }
    return amicables;
  }

  private int amicablesSum(Set<Integer> amicables) {
    int sum = 0;
    List<Integer> list = new ArrayList<>(amicables);
    for (int i = 0; i < amicables.size(); i++) {
      sum += list.get(i);
    }
    return sum;
  }
}
