import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The number, 197, is called a circular prime because all rotations of the digits:
 * 197, 971, and 719, are themselves prime.
 *
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 *
 * How many circular primes are there below one million?
 */
class Task35 {


  int task35Solution() {
    return getAnswer();
  }

  private boolean isPrime(int number) {
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

  private boolean isCircularPrime(int n) {
    String s = Integer.toString(n);
    for (int i = 0; i < s.length(); i++) {
      if (!isPrime(Integer.parseInt(s.substring(i) + s.substring(0, i)))) {
        return false;
      }
    }
    return true;
  }

  private int getAnswer() {
    List<Integer> circularPrimes = new ArrayList<>();
    for (int i = 0; i < 1000000; i++) {
      if (isCircularPrime(i)) {
        circularPrimes.add(i);
      }
    }
    return circularPrimes.size();
  }
}