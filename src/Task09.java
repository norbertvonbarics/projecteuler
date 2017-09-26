
public class Task09 {

  public int task09Solution() {
    int sum = 1000;
    int a;
    int product = 0;
    for (a = 1; a <= sum / 3; a++) {
      int b;
      for (b = a + 1; b <= sum / 2; b++) {
        int c = sum - a - b;
        if (c > 0 && (a * a + b * b == c * c)) {
          product = a * b * c;
        }
      }
    }
    System.out.println(product);
    return 1;
  }
}
