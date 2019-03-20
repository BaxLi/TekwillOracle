
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
    System.out.println("Home-work excersizes");  
    new hwTask4_6();
    new hwTask4_7();
    new hwTask4_8();
    
    
  }
}
