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
  private int randomNumber;

  public RandomOutTask() {
    super();
    randomNumber = new Random().nextInt(500);
  }

  @Override
  public void execute() {
    super.execute();
    System.out.println("Randomout executed = " + randomNumber);
  }

}
