
import java.io.IOException;
import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BaxLi
 */
public class MainClass {

  /**
   * @param args the command line arguments
   */
  @SuppressWarnings("ResultOfObjectAllocationIgnored")
  public static void main(String[] args) throws IOException {
    // TODO code application logic here
    FileHandler logHandler = new FileHandler("mytestlog.log");
    Logger logger = Logger.getLogger("log.Mylogger");
    logger.addHandler(logHandler);

    logger.log(Level.INFO, "Start to read command vars");
    if (args != null) {
      for (String as : args) {
        System.out.println(as);
      }
    }
    logger.log(Level.INFO, "FInish to read.. successfuly?");
    System.out.println("Home-work excersizes");
//    logger.log(Level.INFO, "Start to execute task 4-6");
//    new hwTask4_6();
//    logger.log(Level.INFO, "Finis to execute task 4-6");
//    logger.log(Level.INFO, "Start to execute task 4-7");
////    new hwTask4_7();
//    logger.log(Level.INFO, "Finis to execute task 4-7");
    logger.log(Level.INFO, "Start to execute task 4-8");
//    new hwTask4_8();
    logger.log(Level.INFO, "Finis to execute task 4-8");
    //classwork
//    System.out.println(parseBoolean("tRue"));
//    System.out.println(parseDouble("444"));
//    System.out.println(parseFloat("444.76d"));
//    System.out.println(parseInt("444"));
//    new excersize4_14();
//    try {
//      String currentDirectory = System.getProperty("user.dir");
//      System.out.println("Current directory =" + currentDirectory);
//      Files.list(Paths.get(".")).forEach(System.out::println);
//    } catch (IOException e) {
//      System.out.println("File processing error!");
//    }

  }
}
