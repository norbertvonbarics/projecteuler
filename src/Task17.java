import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//    21124
//    RUNTIME: 23518 MILLIS
public class Task17 {
  List<String> numberList = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five",
      "six", "seven", "eight", "nine"));

  List<String> numberListBetweenTenAndTwenty = new ArrayList<>(Arrays.asList( "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
      "sixteen", "seventeen", "eighteen", "nineteen"));

  List<String> numberListAboveTwenty = new ArrayList<>(Arrays.asList("twenty",
      "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"));

  public int task17Solution(){
    return getSolution();
  }

  private List<String> getNumbers() {
    List<String> numbers = new ArrayList<>();
    numbers.addAll(numberList);
    numbers.addAll(numberListBetweenTenAndTwenty);
    numbers.addAll(getOneHundred());
    return numbers;
  }

  private List<String> getOneHundred() {
    List<String> oneHundred = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
      oneHundred.add(numberListAboveTwenty.get(i));
      for (int j = 0; j < 9; j++) {
        oneHundred.add(numberListAboveTwenty.get(i) + numberList.get(j));
      }
    }
    return oneHundred;
  }

  private List<String> getToOneThousand() {
    List<String> thousand = new ArrayList<>();
    thousand.addAll(getNumbers());
    for (int i = 0; i < 9; i++) {
      thousand.add(numberList.get(i) + "hundred");
      for (int j = 0; j < 99; j++) {
        thousand.add(numberList.get(i) + "hundredand" + getNumbers().get(j));
      }
    }
    thousand.add("onethousand");
    return thousand;
  }

  private int getSolution(){
    int counter = 0;
    for (int i = 0; i < getToOneThousand().size(); i++) {
      counter += getToOneThousand().get(i).length();
    }
    return counter;
  }
}
