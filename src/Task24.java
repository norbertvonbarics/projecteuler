import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task24 {
  static List<String> numberList = new ArrayList<>();

  public String task24Solution() {
    permutation("0123456789");
    System.out.println(numberList);
    System.out.println(numberList.size());
    Collections.sort(numberList);
    System.out.println(numberList);
    return numberList.get(999999);
  }

  public static void permutation(String str) {
    permutation("", str);
  }

  private static void permutation(String prefix, String str) {
    int textLength = str.length();
    if (textLength == 0) {
      System.out.println(prefix);
      numberList.add(prefix);
    } else {
      for (int i = 0; i < textLength; i++)
        permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, textLength));
    }
  }
}