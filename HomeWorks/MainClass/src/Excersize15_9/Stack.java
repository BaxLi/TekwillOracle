/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersize15_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Bax
 * Stack - realize LIFO principles, so this is realised based on ArrayList, where the head is FIRST element and LAST enetered is obj.last
 */
public class Stack extends ContainerAbstractClass {

  public Stack() {
    super();
  }

  @Override
  public Object pop() {
    // LIFO approach
    LinkedList myList = (LinkedList) super.getLs();
    if (myList.size() > 0) {
      Object topElement = myList.getLast();
      myList.removeLast();
      return topElement;
    }
    // if tried to extract element from nothing - return nothing :)
    return null;
  }
}
