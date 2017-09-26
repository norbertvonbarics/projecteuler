import java.math.BigInteger;
import java.util.Objects;

public class Task20 {

  BigInteger task20Solution() {
    return sumDigits(fact(BigInteger.valueOf(100)));
  }

  BigInteger fact(BigInteger n) {
    BigInteger result;
    if (Objects.equals(n, BigInteger.ONE)) {
      return BigInteger.ONE;
    }
    result = fact(n.subtract(BigInteger.ONE)).multiply(n);
    System.out.println(result);
    return result;
  }

  BigInteger sumDigits(BigInteger fact) {
    BigInteger sum = BigInteger.ZERO;
    int digitsLength = String.valueOf(fact).length();
    for (int i = 0; i < digitsLength; i++) {
      sum = sum.add(fact.remainder(BigInteger.TEN));
      fact = fact.divide(BigInteger.TEN);
    }
    return sum;
  }
}