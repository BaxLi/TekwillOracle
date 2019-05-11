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
//Checking Stack
    Stack st = new Stack();
    fillList(st, 6, true);
    System.out.println(" ----------  1 Stack --------------");
    printList(st);

    Stack str = new Stack();
    fillList(str, 5, true);

    st = (Stack) Stack.transferFrom(str);
    System.out.println(" ---------- stack 2 transferred to stack 1 & print stack 1--------------");
    printList(st);

//Checking Queue
    System.out.println("QUEUE PART");
    Queue q1 = new Queue();
    fillList(q1, 6, true);
    System.out.println(" ---------- print first Queue--------------");
    printList(q1);

    Queue q2 = new Queue();
    fillList(q2, 5, true);

    q1 = (Queue) Queue.transferFrom(q2);
    System.out.println(" ---------- print q1 after transfer from q2 --------------");
    printList(q1);

  }

  private static void fillList(Container ls, int listSize, boolean toPrint) {
    Random rnd = new Random();
    int val = 0;
    System.out.println("FILL LIST execution ");
    for (int i = 0; i < listSize; i++) {
      val = rnd.nextInt(30);
      if (toPrint) {
        System.out.println("index(" + i + ") = " + val);
      }
      ls.push(val);
    }
  }

  private static void printList(Container ls) {
    while (!ls.isEmpty()) {
      System.out.println("  " + ls.pop());
    }
  }

}
