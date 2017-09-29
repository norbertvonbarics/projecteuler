import java.util.ArrayList;
import java.util.List;

/**
 Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

 1634 = 14 + 64 + 34 + 44
 8208 = 84 + 24 + 04 + 84
 9474 = 94 + 44 + 74 + 44
 As 1 = 14 is not a sum it is not included.

 The sum of these numbers is 1634 + 8208 + 9474 = 19316.

 Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class Task30 {

  public int task30Solution(){
    return sumNumber(find4number(6));
  }

  private int sumNumber(List<Integer> numbers){
    int sum = 0;
    for(int number: numbers) {
      sum += number;
    }
    return sum;
  }

  private List<Integer> find4number(int size){
    List<Integer> numberList = new ArrayList<>();
    for (int i = 2; ; i++) {
      if(isItTheNumber(i)) {
        numberList.add(i);
      }
      if (numberList.size() == size){
        return numberList;
      }
    }
  }

  private boolean isItTheNumber(int number) {
    int poweredNumber = 0;
    int tempNumber = number;
    for (int i = 0; i < Integer.toString(number).length(); i++) {
      poweredNumber += Math.pow(tempNumber % 10, 5);
      tempNumber /= 10;
    }
    return poweredNumber == number;
  }
}
