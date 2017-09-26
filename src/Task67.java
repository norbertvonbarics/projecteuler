import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task67 {

  List<String> rawLines = new ArrayList<>();

  public int task67Solution() {
    readFile();
    return getSolution()[0][0];
  }

  private int[][] getSolution() {
    int[][] pathList = shapeTriangle();
    for (int i = pathList.length - 2; i >= 0; i--) {
      for (int j = 0; j < pathList[i].length - 1; j++) {
        int maxInt = pathList[i + 1][j] > pathList[i + 1][j + 1] ? pathList[i + 1][j]
            : pathList[i + 1][j + 1];
        pathList[i][j] += maxInt;
      }
    }
    return pathList;
  }

  private int[][] shapeTriangle() {
    int[][] intList = new int[100][100];
    for (int i = 0; i < rawLines.size(); i++) {
      for (int j = 0; j < rawLines.get(i).split(" ").length; j++) {
        intList[i][j] = Integer.parseInt(rawLines.get(i).split(" ")[j]);
      }
    }
    return intList;
  }

  private List<String> readFile() {
    Path myPath = Paths.get("./task67.csv");

    try {
      rawLines = Files.readAllLines(myPath);
    } catch (IOException ex) {
      System.out.println("READ");
    }

    return rawLines;
  }
}
