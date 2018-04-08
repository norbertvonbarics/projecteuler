import java.math.BigInteger;
import java.util.stream.LongStream;

public class Task10 {

  //  142913828922
  //  RUNTIME: 45235 MILLIS
  public long task10Solution(){
    return LongStream.range(1, 2000001)
        .filter(e -> new BigInteger(Long.toString(e)).isProbablePrime(100))
        .sum();
  }
}
