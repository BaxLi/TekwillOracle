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
 * @author User
 */
public abstract class ContainerAbstractClass implements Container {

  protected List<Object> ls = null;

  public ContainerAbstractClass() {
    if (this.getClass().getSimpleName().equals("Stack")) {
      ls = new LinkedList();
    } else {
      ls = new ArrayList();
    }
  }

  public boolean isEmpty() {
    return ls.size() == 0 ? true : false;
  }

  public int size() {
    return ls.size();
  }

  public List<Object> getLs() {
    return ls;
  }

  public void push(Object value) {
    ls.add(value);
  }

  public static Stack transferFrom(Container allElements) {
    Stack newStack = new Stack();
    while (!allElements.isEmpty()) {
      newStack.push(allElements.pop());
    }
    return newStack;
  }
}
