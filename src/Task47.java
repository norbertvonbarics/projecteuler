import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The first two consecutive numbers to have two distinct prime factors are:
 *
 * 14 = 2 × 7 15 = 3 × 5
 *
 * The first three consecutive numbers to have three distinct prime factors are:
 *
 * 644 = 2² × 7 × 23 645 = 3 × 5 × 43 646 = 2 × 17 × 19.
 *
 * Find the first four consecutive integers to have four distinct prime factors each. What is the
 * first of these numbers?1
 */
class Task47 {

  String task47Solution() {
    List<Integer> numbers = getNumberList(150000);
    return getConsecutiveNumber(numbers);
  }

  private List<Integer> getNumberList(int size) {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 1; i < size + 1; i++) {
      if (primeFactors(i)) {
        numbers.add(i);
      }
    }
    return numbers;
  }

  private boolean primeFactors(int number) {
    int n = number;
    Set<Integer> factors = new HashSet<>();
    for (int i = 2; i <= n; i++) {
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }
    return factors.size() == 4;
  }

  private String getConsecutiveNumber(List<Integer> numbers) {
    Collections.sort(numbers);
    StringBuilder finalAnswer = new StringBuilder("ANSWER ==> ");
    for (int i = 0; i < numbers.size() - 3; ++i) {
      int num = numbers.get(i);
      if (numbers.contains(num + 1) && numbers.contains(num + 2)
          && numbers.contains(num + 3)) {
      return finalAnswer.append(num).toString();
      }
    }
    return "There is no such number";
  }
}
