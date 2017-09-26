import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task22 {

  public long task22Solution() {
    List<String> names = readFile();
    List<String> list = new ArrayList<>(Arrays.asList("COLIN", "COLIN", "COLIN"));
    return getNamesSum(names);
  }

  private int getNameValue(String name) {
    int nameValueSum = 0;
    for (int i = 1; i < name.length() - 1; i++) {
      char c = name.charAt(i);
      nameValueSum += c - 64;
    }
    return nameValueSum;
  }

  private List<String> readFile() {
    Path myPath = Paths.get("./p022_names.txt");
    List<String> rawLines = new ArrayList<>();
    List<String> names = new ArrayList<>();
    StringBuilder text = new StringBuilder();
    try {
      rawLines = Files.readAllLines(myPath);
    } catch (IOException ex) {
      System.out.println("SYNTAX ERROR");
    }

    for (String rawLine : rawLines) {
      text.append(rawLine);
    }
    String[] array = text.toString().split(",");
    names.addAll(Arrays.asList(array));
    Collections.sort(names);
    return names;
  }

  private long getNamesSum(List<String> names) {
    long finalSum = 0;
    for (int i = 0; i < names.size(); i++) {
      int nameValueMultiplied = getNameValue(names.get(i)) * (i + 1);
      finalSum += nameValueMultiplied;
    }
    return finalSum;
  }
}
