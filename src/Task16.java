import java.math.BigInteger;

public class Task16 {
  public BigInteger task16Solution(){
    System.out.println(getBigInteger());
    return sumDigits();
  }

  private BigInteger sumDigits(){
    BigInteger number = getBigInteger();
    BigInteger sum = BigInteger.ZERO;
    BigInteger ten = new BigInteger("10");
    while (number.compareTo(BigInteger.ZERO) > 0) {
      sum = sum.add(number.mod(ten));
      number = number.divide(ten);
    }
    return sum;
  }

  private BigInteger getBigInteger() {
    BigInteger multiplier = new BigInteger("2");
    BigInteger solution = new BigInteger("2");
    for (int i = 0; i < 999; i++) {
      solution = solution.multiply(multiplier);
    }
    return solution;
  }
}
