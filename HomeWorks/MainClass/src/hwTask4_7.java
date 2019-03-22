
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
public class hwTask4_7 {
  public hwTask4_7(){
    System.out.println("Homework. Task 4.7");
    System.out.print("Please enter the nr of minutes:");
      long fValue=new Scanner(System.in).nextLong();
      short nrDays=(short)((fValue/60)/24);  
    System.out.println("Number of years="+(nrDays/365)+"\n Number of Days ="+nrDays);
    
  }
  
}
