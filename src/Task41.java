import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * largest pandigital prime
 */
class Task41 {

  List<Integer> numberList = new ArrayList<>();

  int task41Solution() {
    permutation("1234567");
    return getHighestPandigitalPrime();
  }


  private boolean isPandigital(int number) {
    String numberString = Integer.toString(number);
    char[] array = numberString.toCharArray();
    Arrays.sort(array);
    StringBuilder tempNumber = new StringBuilder("");
    for (char c : array) {
      tempNumber.append(c);
    }
    numberString = tempNumber.toString();
    return ((numberString.length() == 7) && numberString.equals("1234567"));
  }

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

  private void permutation(String prefix, String str) {
    int textLength = str.length();
    if (textLength == 0) {
      int number = Integer.parseInt(prefix);
      if (isPandigital(number) && isPrime(number)) {
        numberList.add(number);
      }
    } else {
      for (int i = 0; i < textLength; i++) {
        permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, textLength));
      }
    }
  }

  private int getHighestPandigitalPrime(){
    int number = 0;
    for (int num : numberList) {
      if(num > number) {
        number = num;
      }
    }
    return number;
  }
}
