/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersize15_8;

import java.util.Random;

/**
 *
 * @author Bax
 */
public class RandomOutTask extends AbstractTask implements Task{

  public RandomOutTask() {
    System.out.println("Randomout = "+(new Random().ints()));
  }

 
  @Override
  public void execute() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
