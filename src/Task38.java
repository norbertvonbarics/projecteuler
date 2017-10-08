import java.util.Arrays;

/**
 * Take the number 192 and multiply it by each of 1, 2, and 3:
 *
 * 192 × 1 = 192
 * 192 × 2 = 384
 * 192 × 3 = 576
 * By concatenating each product we get the 1 to 9 pandigital,
 * 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)
 *
 * The same can be achieved by starting with 9 and multiplying by
 * 1, 2, 3, 4, and 5, giving the pandigital, 918273645,
 * which is the concatenated product of 9 and (1,2,3,4,5).
 *
 * What is the largest 1 to 9 pandigital 9-digit number that can be formed
 * as the concatenated product of an integer with (1,2, ... , n) where n > 1?
 */
class Task38 {

  int task38Solution() {
    return getAnswer();
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
    return ((numberString.length() == 9) && numberString.equals("123456789"));
  }

  private int getNumber(int number) {
    StringBuilder tempNumber = new StringBuilder("");
    for (int i = 1; ; i++) {
      tempNumber.append(number * i);
      if (tempNumber.toString().length() == 9) {
        int tempInt = Integer.parseInt(tempNumber.toString());
        return tempInt;
      }
      if(tempNumber.toString().length() > 9) {
        return 0;
      }
    }
  }
  
  private int getAnswer(){
    int number = 0;
    for (int i = 0; i < 10000; i++) {
      int tempNum = getNumber(i);
      if(isPandigital(tempNum)) {
        number = tempNum;
      }
    }
    return number;
  }
}
