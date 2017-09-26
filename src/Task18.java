import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task18 {


  List<String> rawLines = new ArrayList<>();

  public int task18Solution() {
    readFile();
    return getSolution()[0][0];
  }

  private int[][] getSolution() {
    int[][] pathList = convertTriangle();
    for (int i = convertTriangle().length - 2; i >= 0; i--) {
      for (int j = 0; j < convertTriangle()[i].length -1; j++) {
        int maxInt = pathList[i+1][j] > pathList[i+1][j+1] ? pathList[i+1][j] : pathList[i+1][j+1];
        pathList[i][j] += maxInt;
      }
    }
    return pathList;
  }

  private int[][] convertTriangle() {
    int[][] intTriangle = new int[15][15];
    for (int i = 0; i < shapeTriangle().size(); i++) {
      for (int j = 0; j < shapeTriangle().get(i).size(); j++) {
        intTriangle[i][j] = Integer.parseInt(shapeTriangle().get(i).get(j));
      }
    }
    return intTriangle;
  }

  private List<List<String>> shapeTriangle() {
    List<List<String>> stringList = new ArrayList<>();
    for (int i = 0; i < rawLines.size(); i++) {
      List<String> tempList = new ArrayList<>();
      for (int j = 0; j < rawLines.get(i).split(" ").length; j++) {
        tempList.add(rawLines.get(i).split(" ")[j]);
      }
      stringList.add(tempList);
    }
    return stringList;
  }

  private List<String> readFile() {
    Path myPath = Paths.get("./task18.csv");

    try {
      rawLines = Files.readAllLines(myPath);
    } catch (IOException ex) {
      System.out.println("READ");
    }

    return rawLines;
  }
}
