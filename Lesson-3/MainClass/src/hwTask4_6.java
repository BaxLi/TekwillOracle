
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class hwTask4_6 {
  public hwTask4_6(){
    System.out.println("Please enter the F degree:");
    Scanner fValue=new Scanner(System.in);
    System.out.println("The Celsius degree is "+(((fValue.nextInt())-32)*5/9));
    
  }
}
