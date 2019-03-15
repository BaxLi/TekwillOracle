
/**
 *
 * @author nsirbu
 */
public class MainClass {

  /**
   * @param args the command line arguments
   */
  
  public static void main(String[] args) {
    // TODO code application logic here
    System.out.println("Hello");
    
    for (String as: args) {
          System.out.println(as);
    }
   
    System.out.println(args[1]);
  
  }
}
