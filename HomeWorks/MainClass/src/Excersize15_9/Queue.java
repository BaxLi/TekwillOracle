/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersize15_9;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Bax
 */
public class Queue extends ContainerAbstractClass {

  public Object pop() {
    // FIFO approach
    ArrayList myList = (ArrayList) super.getLs();
    if (myList.size() > 0) {
      Object topElement = myList.get(0);
      myList.remove(0);
      return topElement;
    }
    // if tried to extract element from nothing - return nothing :)
    return null;
  }
  
}
