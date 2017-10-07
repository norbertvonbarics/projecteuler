import java.util.ArrayList;
import java.util.List;

/**
 * Truncatable primes Problem 37 The number 3797 has an interesting property. Being prime itself, it
 * is possible to continuously remove digits from left to right, and remain prime at each stage:
 * 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.
 *
 * Find the sum of the only eleven primes that are both truncatable from left to right and right to
 * left.
 *
 * NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 */
class Task37 {


  int task37Solution() {
    return getAnswer();
  }

  private boolean isPrime(int number) {
    if(number == 2) {
      return true;
    }
    if(number == 1) {
    return false;
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

  private boolean isAllDigitsPalindrome(int number) {
    String numberAsString = Integer.toString(number);
    int tempNumber = number;
    for (int i = 0; i < numberAsString.length(); i++) {
      tempNumber = Integer.parseInt(numberAsString.substring(i, numberAsString.length()));
      if (!isPrime(tempNumber)) {
        return false;
      }
    }

    tempNumber = number;
    for (int j = numberAsString.length() - 1; j > 0; j--) {
      tempNumber = Integer.parseInt(numberAsString.substring(0, j));
      if (!isPrime(tempNumber)) {
        return false;
      }
    }
    return true;
  }

  private int getAnswer() {
    List<Integer> truncatablePrimes = new ArrayList<>();
    for (int i = 12; ; i++) {
      if (isAllDigitsPalindrome(i)) {
        truncatablePrimes.add(i);
      }
      if (truncatablePrimes.size() > 10) {
        System.out.println(truncatablePrimes);
        int counter = 0;
        for (int prime : truncatablePrimes) {
          counter += prime;
        }
        return counter;
      }
    }
  }
}
