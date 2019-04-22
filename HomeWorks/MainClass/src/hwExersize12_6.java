
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bax
 */
public class hwExersize12_6 {
  
  
  public static void join2ArrayLists_12_6_1(ArrayList ar1, ArrayList ar2){
   ar1.addAll(ar2);
  }
  
  public static boolean theSame_12_6_6(ArrayList<String> ar1, ArrayList<String> ar2){
    
   boolean rezult=false;
   
    if (ar1.hashCode()!=ar1.hashCode()) 
           {return rezult;}
   else
    {
      for (String elementDinAr1:ar1) {      
        rezult=rezult && ar2.contains(elementDinAr1); 
      }
    }
      return rezult;
  }
  
  
  
}
