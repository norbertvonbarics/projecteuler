import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Task19 {

  int task19Solution() throws ParseException {
    int dayCounter = 1;
    int sumFirstSundays = 0;
    String untildate = "1900-01-01";
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(dateFormat.parse(untildate));

    for (int i = 0; i < 36889; i++) {
      calendar.add(Calendar.DATE, 1);
      dayCounter++;
      String day = dateFormat.format(calendar.getTime()).substring(untildate.length() - 2, untildate.length());
      if ((Integer.parseInt(day) == 1) && (dayCounter % 7 == 0)) {
        sumFirstSundays++;
      }
    }
    return sumFirstSundays - firstYearsSundays();
  }

  private int firstYearsSundays() throws ParseException {

    int dayCounter = 1;
    int sumFirstSundays = 0;
    String untildate = "1900-01-01";
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(dateFormat.parse(untildate));

    for (int i = 0; i < 365; i++) {
      calendar.add(Calendar.DATE, 1);
      dayCounter++;
      String day = dateFormat.format(calendar.getTime()).substring(untildate.length() - 2, untildate.length());
      if ((Integer.parseInt(day) == 1) && (dayCounter % 7 == 0)) {
        sumFirstSundays++;
      }
    }
    return sumFirstSundays;
  }
}
