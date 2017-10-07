import java.util.ArrayList;
import java.util.List;

/**

 */
public class Task34 {

  int task34Solution() {
    return sumOfAllNumbers();
  }

  private int sumOfAllNumbers() {
    int sum = 0;
    List<Integer> numberList = new ArrayList<>();
    for (int i = 3; i < 100000; i++) {
      if (getDigitFactorialSum(i)) {
        numberList.add(i);
      }
    }
    for (int num : numberList) {
      sum += num;
    }
    return sum;
  }

  private int getfactorial(int number) {
    int result = 1;
    for(int i = 2; i<=number; ++i) {
      result *= i;
    }
    return result;
  }

  private boolean getDigitFactorialSum(int number){
    int length = Integer.toString(number).length();
    int sum = 0;
    int digits = number;
    for (int i = 0; i < length; i++) {
      int tempNumber = digits % 10;
      digits /= 10;
      sum += getfactorial(tempNumber);
    }
    return sum == number;
  }
}
