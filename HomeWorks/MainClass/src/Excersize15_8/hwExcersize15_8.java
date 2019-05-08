package Excersize15_8;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bax
 */
public class hwExcersize15_8 {
  public static int counter;
  private static void addToList(AbstractTask cl, List ls) {
    ls.add(cl);
  }
  public static void main(String[] str) {
    AbstractTask cls;
    List<AbstractTask> ls = new LinkedList();
    Random rnd = new Random();
    for (int i = 0; i < 10; i++) {
      switch (rnd.nextInt(3)+1) {
        case 1:
          cls = new OutTask(rnd.nextDouble() + " passed");
          break;
        case 2:
          cls = new RandomOutTask();
          break;
        case 3:
          cls = new CounterOutTask();
          break;
        default:
          cls = new OutTask("added by default");
      }
      addToList(cls, ls);
    }
    System.out.println("Start to execute / Counter="+counter);
    for (AbstractTask z : ls) {
      z.execute();
    }
    System.out.println("Finish to execute / Counter="+counter);
    
  }
}
