import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task15 {

  //  137846528820
  //  RUNTIME: 0 MILLIS
  public long task15Solution() {

    int gridSize = 20;
    long paths = 1;

    for (int i = 0; i < gridSize; i++) {
      paths *= (2 * gridSize) - i;
      paths /= i + 1;
    }
    return paths;
  }
}

