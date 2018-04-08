import java.text.ParseException;

public class Main {

  public static void main(String[] args) throws ParseException {
    long timeAtStart = System.currentTimeMillis();

    Task21 task = new Task21();
    System.out.println(task.task21Solution());

    long runtime = System.currentTimeMillis() - timeAtStart;
    String oneMinuteRule = runtime <= 60000 ? "RUNTIME: " + runtime + " MILLIS": "ONE MINUTE PASSED, NEED TO REFACTOR";

    System.out.println(oneMinuteRule);
  }
}
