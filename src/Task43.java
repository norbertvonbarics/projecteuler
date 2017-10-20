import java.lang.reflect.Array;
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
class Task43 {

  private List<Long> numberList = new ArrayList<>();
  private List<Integer> primeList = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));

  long task43Solution() {
    permutation("0123456789");
    long sum = 0;
    for (long num : numberList) {
      if(isDividableByPrimes(num)) {
        sum += num;
      }
    }
    return sum;
  }

  private boolean isDividableByPrimes(long number) {
    int counter = 1;
    char[] digitArray = Long.toString(number).toCharArray();
    for (int i = 1; i < 8; i++) {
      StringBuilder tempNum = new StringBuilder();
      for (int j = 0; j < 3; j++) {
        tempNum.append(digitArray[counter + j]);
      }
      int num = Integer.parseInt(tempNum.toString());
      if (num % primeList.get(i - 1) != 0) {
        return false;
      }
      counter++;
    }
    return true;
  }

  @SuppressWarnings("Duplicates")
  private boolean isPandigital(long number) {
    String numberString = Long.toString(number);
    char[] array = numberString.toCharArray();
    Arrays.sort(array);
    StringBuilder tempNumber = new StringBuilder("");
    for (char c : array) {
      tempNumber.append(c);
    }
    numberString = tempNumber.toString();
    return ((numberString.length() == 10) && numberString.equals("0123456789"));
  }

  private void permutation(String str) {
    permutation("", str);
  }

  @SuppressWarnings("Duplicates")
  private void permutation(String prefix, String str) {
    int textLength = str.length();
    if (textLength == 0) {
      long number = Long.parseLong(prefix);
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

