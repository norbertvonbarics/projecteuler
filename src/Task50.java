import java.util.ArrayList;
import java.util.List;

/**
 * The prime 41, can be written as the sum of six consecutive primes:
 *
 * 41 = 2 + 3 + 5 + 7 + 11 + 13
 * This is the longest sum of consecutive primes that adds to a prime below one-hundred.
 *
 * The longest sum of consecutive primes below one-thousand that adds to a prime,
 * contains 21 terms, and is equal to 953.
 *
 * Which prime, below one-million, can be written as the sum of the most consecutive primes?
 */
class Task50 {

  List<Integer> primes = new ArrayList<>();

  int task50Solution() {
    fillPrimeList(1000000);
    System.out.println(primeSum(953));
//    return getHighestPrimeSum();
return 1;
  }

  private int getHighestPrimeSum() {
    int maxValue = 0;
    int prime = 0;
    for (int i = 0; i < primes.size(); ++i) {
      int temp = primeSum(primes.get(i));
      if (temp > maxValue) {
        maxValue = primeSum(primes.get(i));
        prime = primes.get(i);
      }
    }
    return prime;
  }

  private int primeSum(int prime) {
    int sum = 0;
    for (int i = 0; i < primes.size(); i++) {
      sum += primes.get(i);
      if (sum == prime) {
        return i + 1;
      }
    }
    return -1;
  }

  private void fillPrimeList(int size) {
    for (int i = 0; i < size + 1; i++) {
      if (isPrime(i)) {
        primes.add(i);
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
