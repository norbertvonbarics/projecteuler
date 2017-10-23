import java.math.BigInteger;

/**
 The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.

 Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */
class Task48 {

  String task48Solution() {
    return getNumbersLastTenDigit();
  }
  
  private BigInteger getPower(int number){
    BigInteger bigNumber = BigInteger.valueOf(number);
    BigInteger temp = bigNumber;
    for (int i = 1; i < number; i++) {
     temp = temp.multiply(bigNumber);
    }
    return temp;
  }

  private String getNumbersLastTenDigit() {
    BigInteger number = BigInteger.ZERO;
    for (int i = 1; i < 1001; i++) {
      number = number.add(getPower(i));
    }
    return number.mod(BigInteger.valueOf(10000000000L)).toString();
  }
}
