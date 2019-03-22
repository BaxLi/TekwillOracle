
import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;




/**
 *
 * @author nsirbu
 */
public class MainClass {

  /**
   * @param args the command line arguments
   */
  @SuppressWarnings("ResultOfObjectAllocationIgnored")
  public static void main(String[] args) {
    // TODO code application logic here
      if (args!=null){
        for (String as: args) {
              System.out.println(as);
        }
      }
      
    //classwork
    System.out.println(parseBoolean("tRue"));
    System.out.println(parseDouble("444"));
    System.out.println(parseFloat("444.76d"));
    System.out.println(parseInt("444"));
    
  }
}
