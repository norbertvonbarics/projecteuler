import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits
 * 0 to 9 in some order, but it also has a rather interesting sub-string divisibility property.
 *
 * Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:
 *
 * d2d3d4=406 is divisible by 2
 * d3d4d5=063 is divisible by 3
 * d4d5d6=635 is divisible by 5
 * d5d6d7=357 is divisible by 7
 * d6d7d8=572 is divisible by 11
 * d7d8d9=728 is divisible by 13
 * d8d9d10=289 is divisible by 17
 * Find the sum of all 0 to 9 pandigital numbers with this property.
 */
public class Task43 {

  List<Integer> numberList = new ArrayList<>();

  public boolean task43Solution() {
    permutation("0123456789");
    return false;
  }


  @SuppressWarnings("Duplicates")
  private boolean isPandigital(int number) {
    String numberString = Integer.toString(number);
    char[] array = numberString.toCharArray();
    Arrays.sort(array);
    StringBuilder tempNumber = new StringBuilder("");
    for (char c : array) {
      tempNumber.append(c);
    }
    numberString = tempNumber.toString();
    return ((numberString.length() == 10) && numberString.equals("0123456789"));
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


  private void permutation(String str) {
    permutation("", str);
  }

  @SuppressWarnings("Duplicates")
  private void permutation(String prefix, String str) {
    int textLength = str.length();
    if (textLength == 0) {
      int number = Integer.parseInt(prefix);
      if (isPandigital(number)) {
        numberList.add(number);
      }
    } else {
      for (int i = 0; i < textLength; i++) {
        permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, textLength));
      }
    }
  }
}

