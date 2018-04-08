import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task05 {

  //232792560
  //  RUNTIME: 18954 MILLIS
  public int task05Solution() {
    for (int i = 1; ; i++) {
      if (isDividable(i)) {
        return i;
      }
    }
  }

  private boolean isDividable(int number) {
//   return  IntStream.range(1,21).filter(e-> number % e == 0).count() == 20;
    int counter = 0;
    for (int i = 1; i < 21; i++) {
      if (number % i == 0) {
        counter++;
      }
    }
    return counter == 20;
  }
}
