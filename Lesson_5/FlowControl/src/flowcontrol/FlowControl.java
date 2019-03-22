package flowcontrol;

/**
 *
 * @author nsirbu
 */
public class FlowControl {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

  }

  public static void executeLabeledBreakStatement() {
    String[] programmers = {"Outer", "Inner"};

    exit:
    for (String outerVar : programmers) {
      for (String innerVar : programmers) {
        if (innerVar.equals("Inner")) {
          break exit;
        }
        System.err.println(innerVar + ":");
      }
    }
  }

  public static void executeLabeledContinueStatement() {
    String[] programmers = {"Paul", "Shreya", "Shelvan", "Harry"};

    exit:
    for (String outerVar : programmers) {
      for (String innerVar : programmers) {
        if (innerVar.equals("Shreya")) {
          continue exit;
        }
        System.err.println(innerVar);
      }
    }
  }
}
