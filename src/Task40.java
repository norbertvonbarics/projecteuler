import java.util.ArrayList;
import java.util.List;

/**
 * An irrational decimal fraction is created by concatenating the positive integers:
 * 0.123456789101112131415161718192021...  It can be seen that the 12th digit of the
 * fractional part is 1.  If dn represents the nth digit of the fractional part, find the
 * value of the following expression.  d1 × d10 × d100 × d1000 × d10000 × d100000 ×
 * d1000000
 */
class Task40 {

  int task40Solution() {
    List<Integer> numberList = fillList();
    int number = 1;
    for (int num : numberList) {
      number *= num;
    }
    return number;
  }

  private List<Integer> fillList() {
    List<Integer> numbers = new ArrayList<>();
    StringBuilder fraction = new StringBuilder("");
    for (int i = 0; ; i++) {
      fraction.append(Integer.toString(i));
      int size = fraction.length();
      if (size > 1000000) {
        char[] fractionArray = fraction.toString().toCharArray();
        numbers.add(Integer.parseInt(Character.toString(fractionArray[1000000])));
        numbers.add(Integer.parseInt(Character.toString(fractionArray[100000])));
        numbers.add(Integer.parseInt(Character.toString(fractionArray[10000])));
        numbers.add(Integer.parseInt(Character.toString(fractionArray[1000])));
        numbers.add(Integer.parseInt(Character.toString(fractionArray[100])));
        numbers.add(Integer.parseInt(Character.toString(fractionArray[10])));
        numbers.add(Integer.parseInt(Character.toString(fractionArray[1])));
        return numbers;
      }
    }
  }
}
