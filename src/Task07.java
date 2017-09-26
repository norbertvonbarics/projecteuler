import java.util.ArrayList;
import java.util.List;

public class Task07 {

  public int task07Solution(){
    List<Integer> primes = new ArrayList<>();
    for (int i = 2; i < 150000; i++) {
      if(isPrime(i)) {
        primes.add(i);
      }
    }
    return primes.get(10000);
  }

  boolean isPrime(int n) {
    for(int i=2;i<n;i++) {
      if(n%i==0)
        return false;
    }
    return true;
  }
}
