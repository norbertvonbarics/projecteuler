
public class Task01 {
  public int task01Solution(){
    int solutionInt = 0;
    for (int i = 0; i < 1000; ++i) {
      if((i % 5 == 0) || (i % 3 == 0)) {
        solutionInt += i;
      }
    }
    return solutionInt;
  }
}
