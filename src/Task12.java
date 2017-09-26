import java.util.ArrayList;
import java.util.List;

public class Task12 {

  public int task12Solution() {
    return getDivider(getTriangleNumberList());
  }

  private List<Integer> getTriangleNumberList() {
    List<Integer> triangleNumberList = new ArrayList<>();
    int counter = 1;
    for (int i = 1; i < 13000; i++) {
      int triangleNumber = 1;
      for (int j = 2; j < counter; j++) {
        triangleNumber += j;
      }
      counter++;
      triangleNumberList.add(triangleNumber);
    }
    return triangleNumberList;
  }

  private int getDivider(List<Integer> triangelNumberList) {
    int solution = 0;
    for (int i = 12000; i < triangelNumberList.size(); i++) {
      int counter = 0;
        for (int j = 1; j < triangelNumberList.get(i) + 1; j++) {
          if (triangelNumberList.get(i) % j == 0) {
            counter++;
          }
        }

      if (counter > 500) {
        solution = triangelNumberList.get(i);
      }
      if (counter > 400) {
        System.out.println(counter);
      }
      System.out.println("number: " + triangelNumberList.get(i));
      System.out.println("count: " + counter);
      System.out.println("solution: " + solution);
    }
    return solution;
  }
}
