import java.util.Arrays;

/**
 * The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330,
 * is unusual in two ways: (i) each of the three terms are prime, and, (ii) each of the
 * 4-digit numbers are permutations of one another.
 *
 * There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes,
 * exhibiting this property, but there is one other 4-digit increasing sequence.
 *
 * What 12-digit number do you form by concatenating the three terms in this sequence?
 */
class Task49 {


  String task49Solution() {
    return getPrimeList();
  }

  private String getPrimeList() {
    for (int i = 1001; ; i += 2) {
      int prime1 = i + 3330;
      int prime2 = i + 6660;
      if (isPrime(i) && isPrime(prime1) && isPrime(prime2) && isPermutaion(i, prime1, prime2)
          && i != 1487) {
        return String.valueOf(i) + (i + 3330) + (i + 6660);
      }
    }
  }

  private boolean isPermutaion(int a, int b, int c) {
    char[] arrayA = Integer.toString(a).toCharArray();
    char[] arrayB = Integer.toString(b).toCharArray();
    char[] arrayC = Integer.toString(c).toCharArray();
    Arrays.sort(arrayA);
    Arrays.sort(arrayB);
    Arrays.sort(arrayC);
    return Arrays.toString(arrayA).equals(Arrays.toString(arrayB)) && Arrays.toString(arrayB)
        .equals(
            Arrays.toString(arrayC));
  }

  @SuppressWarnings("Duplicates")
  private boolean isPrime(int number) {
    if (number == 2) {
      return true;
    }
    if (number == 1) {
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
}
