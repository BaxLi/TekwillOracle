
import java.util.Scanner;

/**
 *
 * @author nsirbu
 */
public class TimeConvertor {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the amount of minutes to be converted to days and years: ");
    long minutes = scanner.nextLong();

    double years = minutes / 526600;
    double days = minutes / 1440;

    System.out.println(minutes + " minutes converted into years: " + years);
    System.out.println(minutes + " minutes converted into days: " + days);
  }
}
