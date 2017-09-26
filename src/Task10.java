
public class Task10 {
  public long task10Solution(){
    long sumOfPrimes = 0;
    for (int i = 2; i < 2000001; i++) {
      if(isPrime(i)) {
        sumOfPrimes += i;
      }
      System.out.println(sumOfPrimes);
    }
    return sumOfPrimes + 2;
  }

  boolean isPrime(int number) {
    if (number%2==0) return false;
    for(int i=3;i*i<=number;i+=2) {
      if(number%i==0)
        return false;
    }
    return true;
  }
}
