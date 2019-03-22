
import java.util.Scanner;

/**
 *
 * @author nsirbu
 */
public class TemperatureConverter {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the temperture in Fahrenheit: ");
    double userInput = scanner.nextDouble();

    double tempertureInCelsius = ((5 * (userInput - 32)) / 9);
    System.out.println(userInput + "°F to °C: " + tempertureInCelsius);

    System.out.print("Enter the temperture in Celsius: ");
    userInput = scanner.nextDouble();

    double temperatureInFahrenheit = ((9 * userInput + (32 * 5)) / 5);
    System.out.println(userInput + " °C to °F: " + temperatureInFahrenheit);
  }
}
