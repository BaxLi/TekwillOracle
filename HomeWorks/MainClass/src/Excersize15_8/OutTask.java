/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersize15_8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Bax
 */
public class OutTask extends AbstractTask{
 private String str;
 private static int items;
 private int cloneNr;
 
  public OutTask(String str) {
   this.str=str;
   this.createdAt=LocalDateTime.now();
   cloneNr=items++;
  }
  
  @Override
  public void execute() {
    System.out.println("Outtask print ="+str);
    this.executedAt=LocalDateTime.now();
  }

  @Override
  public String toString() {
    return "OutTask{"+cloneNr + "} created = " +this.createdAt.format(DateTimeFormatter.ISO_DATE_TIME) + "}  Executed ->"+this.executedAt.format(DateTimeFormatter.ISO_DATE_TIME);
  }
  
  
  
}
