import java.text.ParseException;

public class Main {

  public static void main(String[] args) throws ParseException {
    long timeAtStart = System.currentTimeMillis();

    Task16 task16 = new Task16();
    System.out.println(task16.task16Solution());

    long runtime = System.currentTimeMillis() - timeAtStart;
    String oneMinuteRule = runtime <= 60000 ? "RUNTIME: " + runtime + " MILLIS": "ONE MINUTE PASSED, NEED TO REFACTOR";

    System.out.println(oneMinuteRule);
  }
}
