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
public class CounterOutTask extends AbstractTask{

  @Override
  public void execute() {
    System.out.println("CounterOutTask=" + (hwExcersize15_8.counter++));
  }
}
