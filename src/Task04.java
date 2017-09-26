import java.util.ArrayList;
import java.util.List;

public class Task04 {

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
    String reversed = "";
    for (int i = numberAsString.length(); i > 0; i--) {
      reversed += numberAsString.charAt(i-1);
    }
    return numberAsString.equals(reversed);
  }
}
