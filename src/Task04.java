import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task04 {

  //296 millis
  public int task04Solution() {
    int highestPalindrome = 0;
    for (int i = 100; i < 1000; i++) {
      for (int j = 100; j < 1000; j++) {
        int number = i * j;
        if (isPalindrome(number)) {
          if(number > highestPalindrome){
            highestPalindrome = number;
          }
        }
      }
    }
    return highestPalindrome;
  }

  private boolean isPalindrome(int number) {
    String numberAsString = Integer.toString(number);
    StringBuilder stringBuilder = new StringBuilder(numberAsString);
    String reversed = stringBuilder.reverse().toString();
    return numberAsString.equals(reversed);
  }
}
