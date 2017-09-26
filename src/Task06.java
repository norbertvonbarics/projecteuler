
public class Task06 {

  public int task06Solution() {
    return squareOfTheSum() - sumOfTheSquare();
  }

  private int sumOfTheSquare() {
    int sumOfTheSquare = 0;
    for (int i = 1; i < 101; i++) {
      sumOfTheSquare += i * i;
    }
    return sumOfTheSquare;
  }

  private int squareOfTheSum() {
    int sum = 0;
    for (int i = 1; i < 101; i++) {
      sum += i;
    }
    return sum * sum;
  }
}
