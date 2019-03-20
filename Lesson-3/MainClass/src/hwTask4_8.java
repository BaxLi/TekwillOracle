
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
public class hwTask4_8 {
  public hwTask4_8(){
    System.out.println("Homework. Task 4.8");

    System.out.print("Please enter the nr1:");
        int nr1=new Scanner(System.in).nextInt();
    System.out.print("\n Please enter the nr2:");
        int nr2=new Scanner(System.in).nextInt();
    System.out.println("\n Suma numerilor = "+(nr1+nr2)+" \n Diferetnta ="+
            (nr1-nr2)+"\n Produsul="+(nr1*nr2)+"\n Media="+((float) (nr1+nr2)/2)+"\n ModulOS="+((double)nr1%nr2));
  }
}
