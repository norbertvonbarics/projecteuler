import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The fraction 49/98 is a curious fraction, as an inexperienced mathematician
 * in attempting to simplify it may incorrectly believe that 49/98 = 4/8,
 * which is correct, is obtained by cancelling the 9s.
 *
 * We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
 *
 * There are exactly four non-trivial examples of this type of fraction,
 * less than one in value, and containing two digits in the numerator and denominator.
 *
 * If the product of these four fractions is given in its lowest common terms,
 * find the value of the denominator.
 */

public class Task33 {

  int task33Solution() {
    return getNumber(getNumbers());
  }

  private boolean isNonTrivial(int numerator, int denominator) {
    double tempNumerator = 0;
    double tempDenominator = 0;
    if (numerator % 10 != 0 && denominator % 10 != 0) {
      if (numerator / 10 == denominator / 10) {
        tempNumerator = numerator % 10;
        tempDenominator = denominator % 10;
      } else if (numerator % 10 == denominator % 10) {
        tempNumerator = numerator / 10;
        tempDenominator = denominator / 10;
      } else if (numerator % 10 == denominator / 10) {
        tempNumerator = numerator / 10;
        tempDenominator = denominator % 10;
      } else if (numerator / 10 == denominator % 10) {
        tempNumerator = numerator % 10;
        tempDenominator = denominator / 10;
      }
    }
    return tempDenominator != 0 && tempNumerator != 0 && ((double) numerator / denominator
        == tempNumerator / tempDenominator);
  }

  private Map<Integer, Integer> getNumbers() {
    Map<Integer, Integer> fractionMap = new HashMap<>();
    for (int i = 11; i < 100; i++) {
      for (int j = 11; j < 100; j++) {
        if (i / j < 1) {
          if (isNonTrivial(i, j)) {
            fractionMap.put(i, j);
          }
        }
      }
    }
    return fractionMap;
  }

  private int getNumber(Map<Integer, Integer> fractionMap) {
    int denominator = 1;
    int numerator = 1;
    for (Map.Entry<Integer, Integer> entry : fractionMap.entrySet()) {
      denominator *= entry.getKey();
      numerator *= entry.getValue();
    }
    return numerator / denominator;
  }
}
