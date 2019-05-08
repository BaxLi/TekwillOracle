/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersize15_8;

/**
 *
 * @author Bax
 */
public class OutTask extends AbstractTask{
 private String str;
  public OutTask(String str) {
   this.str=str;
  }
  
  @Override
  public void execute() {
    System.out.println("Outtask print ="+str);
  }
  
}
