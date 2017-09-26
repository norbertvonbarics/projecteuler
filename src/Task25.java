import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task25 {

  List<BigInteger> fibonacciList = new ArrayList<>(Arrays.asList(BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE));
  List<BigInteger> list1000 = new ArrayList<>();
  BigInteger fibonacci1000 = BigInteger.ZERO;

  public BigInteger task25Solution() {
    for (int i = 1; i < 5000; i++) {
      fibonacci();
    }

    fibonacci1000 = BigInteger.valueOf(fibonacciList.indexOf(list1000.get(0)));
    return fibonacci1000;
  }

  public void fibonacci() {
    BigInteger lastItem = fibonacciList.get(fibonacciList.size() - 1);
    BigInteger lastMinusOne = fibonacciList.get(fibonacciList.size() - 2);
    if(("" + lastItem).length() == 1000) {
      list1000.add(lastItem);
    }
    fibonacciList.add(lastItem.add(lastMinusOne));
  }
}