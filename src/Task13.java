import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task13 {

  public BigInteger task13Solution() {
    return getSolution();
  }

  private BigInteger getSolution() {
   BigInteger solution = BigInteger.ZERO;
    for (int i = 0; i < convertStringListToLongList().size(); i++) {
     solution = solution.add(convertStringListToLongList().get(i));
    }
    return solution;
  }

  private List<BigInteger> convertStringListToLongList(){
    List<BigInteger> numberList = new ArrayList<>();
    for (int i = 0; i < getBlock().size(); i++) {
      BigInteger tempNumber;
      if (i < getBlock().size() -1) {
        tempNumber = new BigInteger((getBlock().get(i)
            .substring(0, getBlock().get(i).length() - 1)));
      } else {
        tempNumber = new BigInteger(getBlock().get(i)
            .substring(0, getBlock().get(i).length()));
      }
      numberList.add(tempNumber);
    }
    return numberList;
  }

  private List<String> getBlock() {
    List<String> rawLines = new ArrayList<>();
    Path myPath = Paths.get("./block.csv");

    try {
      rawLines = Files.readAllLines(myPath);
    } catch (IOException ex) {
      System.out.println("READ");
    }

    return rawLines;
  }
}
