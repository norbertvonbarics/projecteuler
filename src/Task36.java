import java.util.ArrayList;
import java.util.List;

/**
 * The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
 *
 * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
 *
 * (Please note that the palindromic number, in either base, may not include leading zeros.)
 */
class Task36 {

  int task36Solution() {
    return getAnswer(1000000);
  }

  private boolean isPalindrom(int number) {
    String numberString = Integer.toString(number);
    String binaryString = Integer.toBinaryString(number);
    String reversedBinary = reverseString(binaryString);
    String reversedNumber = reverseString(Integer.toString(number));
    return numberString.equals(reversedNumber) && binaryString.equals(reversedBinary);
  }

  private String reverseString(String numberString) {
    StringBuilder reversed = new StringBuilder();
    for (int i = numberString.length() - 1; i >= 0; i--) {
      reversed.append(numberString.charAt(i));
    }
    return reversed.toString();
  }

  private int getAnswer(int size) {
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (isPalindrom(i)) {
        count += i;
      }
    }
    return count;
  }
}
