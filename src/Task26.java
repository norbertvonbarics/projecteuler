public class Task26 {

  public int task26Solution() {
    return recurringCycle();
  }

  private int recurringCycle() {
    int number = 0;
    int length = 0;
    int sequenceLength = 0;
    for (int i = 1000; i > 1; i--) {
      if (sequenceLength >= i) {
        break;
      }
      int[] foundRemainders = new int[i];
      int value = 1;
      int position = 0;
      while (foundRemainders[value] == 0 && value != 0) {
        foundRemainders[value] = position;
        value *= 10;
        value %= i;
        position++;
      }
      if (position - foundRemainders[value] > sequenceLength) {
        sequenceLength = position - foundRemainders[value];
        if(sequenceLength > length) {
          number = position;
        }
      }
    }
    return number;
  }

//  private List<String> createNumberStringList() {
//    List<String> numberList = new ArrayList<>();
//    for (int i = 3; i < 1001; i++) {
//      BigDecimal bigValueI = BigDecimal.valueOf(i);
//      BigDecimal number = (BigDecimal.ONE
//          .divide(bigValueI, new MathContext(100, RoundingMode.HALF_UP)));
//      String stringNumber = "" + number;
//      numberList.add(stringNumber.substring(2, stringNumber.length()));
//    }
//    return numberList;
//  }
//
//  private List<String> sortList(List<String> numberList) {
//    List<String> stringNumberList = new ArrayList<>();
//
//
//    return stringNumberList;
//  }
}
