/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersize15_8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 *
 * @author Bax
 */
public class RandomOutTask extends AbstractTask {
  private int r;
  private static int items;
  private int cloneNr;
  public RandomOutTask() {
    this.createdAt=LocalDateTime.now();
    r = new Random().nextInt(500);
    cloneNr=items++;
  }

  @Override
  public void execute() {
    System.out.println("Randomout = " + r);
    this.executedAt=LocalDateTime.now();
  }
   @Override
  public String toString() {
    return "RandomoutTask{" +cloneNr + "} created = " +this.createdAt.format(DateTimeFormatter.ISO_DATE_TIME) + "} Executed ->"+this.executedAt.format(DateTimeFormatter.ISO_DATE_TIME);
  }

}
