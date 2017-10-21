import java.util.ArrayList;
import java.util.List;

/**
 * It was proposed by Christian Goldbach that every odd composite number can be written as the sum
 * of a prime and twice a square.
 *
 * 9 = 7 + 2×1^2
 * 15 = 7 + 2×2^2
 * 21 = 3 + 2×3^2
 * 25 = 7 + 2×3^2
 * 27 = 19 + 2×2^2
 * 33 = 31 + 2×1^2
 *
 * It turns out that the conjecture was false.
 *
 * What is the smallest odd composite that cannot be written as the sum of a prime and twice a
 * square?
 */

class Task46 {

  List<Integer> primes = new ArrayList<>();
  List<Integer> composites = new ArrayList<>();

  String task46Solution() {
    fillLists(10000);
    return iterate4Solution();
  }

  private String iterate4Solution() {
    for (int composite : composites) {
      if (checkCompositePower(composite)) {
        return Integer.toString(composite);
      }
    }
    return "There is no such number!";
  }


  private boolean checkCompositePower(int composite) {
    for (int i = 1; i < primes.size(); i++) {
      for (double j = 1; j < 50; j++) {
        if (composite == primes.get(i) + 2 * Math.pow(j, 2)) {
          return false;
        }
      }
    }
    return true;
  }

  private void fillLists(int size) {
    for (int i = 1; i < size + 1; i++) {
      if (isPrime(i)) {
        primes.add(i);
      } else if(i % 2 != 0) {
        composites.add(i);
      }
    }
  }

  @SuppressWarnings("Duplicates")
  private boolean isPrime(int number) {
    if (number == 2) {
      return true;
    }
    if (number == 1) {
      return true;
    }
    if (number % 2 == 0) {
      return false;
    }
    for (int i = 3; i * i <= number; i += 2) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
