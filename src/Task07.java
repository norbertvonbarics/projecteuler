import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task07 {



  //  104743
  //  RUNTIME: 5116 MILLIS
  public int task07Solution(){
    return IntStream.range(1, 150000)
        .filter(e -> new BigInteger(Integer.toString(e)).isProbablePrime(100))
        .boxed()
        .collect(Collectors.toList())
        .get(10000);
  }
}
