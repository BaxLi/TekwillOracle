
import java.util.Scanner;

/**
 *
 * @author nsirbu
 */
public class ArithmeticOperators {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int intOne = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int intTwo = scanner.nextInt();
    System.out.println("");

    int additionResult = intOne + intTwo;
    System.out.println("addition:       " + additionResult);

    double subtractionResult = intOne - intTwo;
    System.out.println("subtraction:    " + subtractionResult);

    double multiplicationResult = intOne * intTwo;
    System.out.println("multiplication: " + multiplicationResult);

    double divisionResult = (double) intOne / intTwo;
    System.out.println("division:       " + divisionResult);

    double averageResult = (double) (intOne + intTwo) / 2;
    System.out.println("average:        " + averageResult);

    int remainderResult = intOne % intTwo;
    System.out.println("remainder:      " + remainderResult);
  }
}
