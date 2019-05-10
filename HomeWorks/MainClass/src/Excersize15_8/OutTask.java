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
public class OutTask extends AbstractTask {

  private String str;

  public OutTask(String str) {
    this.str = str;
  }

  @Override
  public void execute() {
    super.execute();
    System.out.println("Outtask print executed = " + str);
  }
}
