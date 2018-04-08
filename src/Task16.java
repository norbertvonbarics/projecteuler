import java.math.BigInteger;

public class Task16 {

  //  1366
  //  RUNTIME: 32 MILLIS
  public long task16Solution(){
    BigInteger solution = new BigInteger("2");
    for (int i = 0; i < 999; i++) {
      solution = solution.multiply(new BigInteger("2"));
    }
    return solution.toString().chars().mapToLong(Character::getNumericValue).sum();
  }
}
