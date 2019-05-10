/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersize15_9;

import java.util.Random;

/**
 *
 * @author User
 */
public class Execute15_9 {

  public static void main(String[] args) {

    Stack st = new Stack();
    fillList(st, 6, false);
    System.out.println(" ---------- new print --------------");
    printList(st);

    Stack str = new Stack();
    fillList(str, 4,false);
    System.out.println(" ---------- new print --------------");
    printList(str);

    fillList(str, 5, true);

    st = Stack.transferFrom(str);
    System.out.println(" ---------- new print --------------");
    printList(st);

  }

  private static void fillList(Stack ls, int listSize, boolean toPrint) {
    Random rnd = new Random();
    int val = 0;

    for (int i = 0; i < listSize; i++) {
      val = rnd.nextInt(30);
      if (toPrint) {
        System.out.println("int " + i + "=" + val);
      }
      ls.push(val);
    }
  }

  private static void printList(Stack ls) {
    while (!ls.isEmpty()) {
      System.out.println("  " + ls.pop() + "  size=" + ls.size());
    }
  }

}
