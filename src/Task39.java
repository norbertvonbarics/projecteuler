/**
 * If p is the perimeter of a right angle triangle with integral length sides,
 * {a,b,c}, there are exactly three solutions for p = 120.
 *
 * {20,48,52}, {24,45,51}, {30,40,50}
 *
 * For which value of p ≤ 1000, is the number of solutions maximised?
 */
class Task39 {

  private int[] p = new int[1001];


  int task39Solution() {
    return fillArrayWithInts();
  }

  private boolean isRightAngled(int a, int b, int c) {
    return a * a + b * b == c * c;
  }

  private int fillArrayWithInts() {
    for (int i = 1; i < 1000; i++) {
      System.out.println(i);
      for (int j = 1; i + j < 1000; j++) {
        for (int k = 1; i + j + k < 1000; k++) {
          if (isRightAngled(i, j, k)) {
            p[j + i + k]++;
          }
        }
      }
    }
    return iterateForResult();
  }

  private int iterateForResult() {
  int result = 0;
    for (int y = 1; y < p.length; y++) {
      if (p[y] > p[result]) {
        result = y;
      }
    }
    return result;
  }
}
