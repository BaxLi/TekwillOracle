/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersize15_8;

import java.time.LocalDateTime;

/**
 *
 * @author Bax
 */
public class CounterOutTask extends AbstractTask{

  public CounterOutTask() {
    this.createdAt=LocalDateTime.now();
  }

  @Override
  public void execute() {
    System.out.println("CounterOutTask=" + (hwExcersize15_8.counter++));
    this.executedAt=LocalDateTime.now();
  }
}
