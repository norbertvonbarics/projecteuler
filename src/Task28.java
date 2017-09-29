import java.util.Arrays;

/**
 * Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5
 * spiral is formed as follows:
 * 21 22 23 24 25
 * 20  7  8  9 10
 * 19  6  1  2 11
 * 18  5  4  3 12
 * 17 16 15 14 13
 *
 * It can be verified that the sum of the numbers on the
 * diagonals is
 * 101.  What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in
 * the same way?
 */
public class Task28 {

  public int task28Solution() {
    int size = 1001;
    int[][] matrix = createMatrix(size);
    return diagonalSum(matrix);
  }

  private int diagonalSum(int[][] matrix) {
    int sum = 0;
    int size = matrix.length;
    int index = size - 1;
    for (int i = 0; i < size; i++) {
      sum += matrix[i][i + index];
      sum += matrix[i][i];
      index -= 2;
    }
    sum--;
    return sum;
  }

  private int[][] createMatrix(int size) {
    int[][] matrix = new int[size][size];

    int value = size * size;
    int minCol = 0;
    int maxCol = size - 1;
    int minRow = 0;
    int maxRow = size - 1;
    while (value >= 1) {
      for (int i = minCol; i <= maxCol; i++) {
        matrix[minRow][i] = value;
        value--;
      }

      for (int j = minRow + 1; j <= maxRow; j++) {
        matrix[j][maxCol] = value;
        value--;
      }

      for (int k = maxCol - 1; k >= minCol; k--) {
        matrix[maxRow][k] = value;
        value--;
      }

      for (int l = maxRow - 1; l >= minRow + 1; l--) {
        matrix[l][minCol] = value;
        value--;
      }
      minCol++;
      minRow++;
      maxCol--;
      maxRow--;
    }

    return matrix;
  }
}
