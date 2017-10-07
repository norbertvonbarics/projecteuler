import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 We shall say that an n-digit number is pandigital if it makes use of all the digits
 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

 The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand,
 multiplier, and product is 1 through 9 pandigital.

 Find the sum of all products whose multiplicand/multiplier/product
 identity can be written as a 1 through 9 pandigital.

 HINT: Some products can be obtained in more than one way
 so be sure to only include it once in your sum.
 */

public class Task32 {
  public int task32Solution(){
    System.out.println(getPandigitalSet());
    return getPandigitalSum(getPandigitalSet());
  }

  private boolean isPandigital(int multiplicand, int multiplier) {
    int product = multiplicand * multiplier;
    String digits = "" + multiplicand + multiplier + product;
    StringBuilder sortedDigits = new StringBuilder();
    char[] digitArray = digits.toCharArray();
    Arrays.sort(digitArray);
    for (char c : digitArray) {
      sortedDigits.append(c);
    }
    return sortedDigits.toString().equals("123456789");
  }
  
  private Set<Integer> getPandigitalSet() {
    Set<Integer> pandigitalSet = new HashSet<>();
    int multiplier = 1;
    int multiplicand = 1;
    for (int i = 1; i < 2000; i++) {
      for (int j = 1; j < 2000; j++) {
        multiplicand = i;
        multiplier = j;
        if (isPandigital(multiplicand, multiplier)) {
          pandigitalSet.add(multiplicand * multiplier);
        }
      }
    }

    return pandigitalSet;
  }

  private int getPandigitalSum(Set<Integer> pandigitalSet){
    int pandigitalSum = 0;
    for(int number : pandigitalSet) {
      pandigitalSum += number;
    }
    return pandigitalSum;
  }
}
