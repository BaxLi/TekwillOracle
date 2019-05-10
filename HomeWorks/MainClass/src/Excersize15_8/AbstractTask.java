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
 abstract class AbstractTask implements Task {
  public String id;
  public static int nr;
  
  protected LocalDateTime createdAt=null;
  protected LocalDateTime executedAt=null;

  public AbstractTask() {
    this.createdAt=LocalDateTime.now();
    id=this.getClass().getSimpleName()+"->"+nr;
    nr++;
    System.out.println("CONSTRUCTOR ID"+id);
  }
  
  @Override
  public String toString(){
     return "ID: " + this.id + " -> " + "Created at: " + this.createdAt.format(DateTimeFormatter.ISO_DATE_TIME) + "  ||  " + "Executed at: " + this.executedAt.format(DateTimeFormatter.ISO_DATE_TIME);
  } 

  @Override
  public void execute(){
     this.executedAt = LocalDateTime.now();
  };
}
