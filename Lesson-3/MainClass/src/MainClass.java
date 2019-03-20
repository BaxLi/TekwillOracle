
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
    System.out.println("Home-work excersizes");  
//    new hwTask4_6();
//    new hwTask4_7();
//    new hwTask4_8();
    
    //classwork
    System.out.println(parseBoolean("tRue"));
    System.out.println(parseDouble("444"));
    System.out.println(parseFloat("444.76d"));
    System.out.println(parseInt("444"));
    
    Dog taxa=new Dog();
    taxa.age=1;
    Dog terier=new Dog();
    terier.age=2;
    
  }
}
