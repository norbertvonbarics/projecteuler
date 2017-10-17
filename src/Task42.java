import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1);
 * so the first ten triangle numbers are:
 *
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * By converting each letter in a word to a number corresponding to its alphabetical
 * position and adding these values we form a word value. For example, the word value for
 * SKY is 19 + 11 + 25 = 55 = t10. If the word value is a triangle number then we shall call
 * the word a triangle word.
 *
 * Using words.txt (right click and 'Save Link/Target As...'), a 16K text file containing nearly
 * two-thousand common English words, how many are triangle words?
 */
public class Task42 {

  int task42Solution() {
    return getSolution(getWordList(readFile()));
  }

  int getTextValue(String text) {
    int number = 0;
    char[] textArray = text.toCharArray();

    for (char c : textArray) {
      number += (c - 64);
    }
    return number;
  }

  int triangleNumber(int number) {
    return (int) (((double) number / 2) * (number + 1));
  }

  private List<String> readFile() {
    Path myPath = Paths.get("./p042_words.txt");
    List<String> rawLines = new ArrayList<>();
    try {
      rawLines = Files.readAllLines(myPath);
    } catch (IOException ex) {
      System.out.println("READ");
    }

    return rawLines;
  }

  private List<String> getWordList(List<String> rawlines) {
    List<String> words = new ArrayList<>();
    for (String tempString : rawlines) {
      String[] array = tempString.split(",");
      for (int i = 0; i < array.length; i++) {
        array[i] = array[i].substring(1, array[i].length()-1);
      }
      words.addAll(Arrays.asList(array));
    }
    return words;
  }

  private int getSolution(List<String> words) {
    int counter = 0;
    for (String text : words) {
      if (isTriangleNumber(text)) {
        counter++;
      }
    }
    return counter;
  }

  private boolean isTriangleNumber(String text) {
    int textValue = getTextValue(text);
    for (int i = 0; i < 500; i++) {
      if (textValue == triangleNumber(i)) {
        return true;
      }
    }
    return false;
  }
}