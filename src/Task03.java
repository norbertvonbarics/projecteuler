import java.math.BigInteger;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task03 {

  public int task03Solution() {
    final long number = 600851475143L;
    final long[] numberArray = {number};
    return IntStream.range(2, 1847)
        .filter(e -> new BigInteger(Integer.toString(e)).isProbablePrime(100))
        .filter(e -> number % e == 0)
        .peek(e -> numberArray[0] /= e)
        .max()
        .orElse(-1);
  }
}
