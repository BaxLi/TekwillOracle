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
 */
public class Stack extends ContainerAbstractClass {

  public Stack() {
    super();
  }

  @Override
  public Object pop() {
    LinkedList myList = (LinkedList) super.getLs();
    if (myList.size() > 0) {
      Object topElement = myList.get(myList.size()-1);
      myList.remove(myList.size()-1);
      return topElement;
    }
    // if tried to extract element from nothing - return nothing :)
    return null;
  }


}
