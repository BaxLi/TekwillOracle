/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersize15_9;

import java.util.LinkedList;

/**
 *
 * @author Bax
 */
public class Stack <T extends Object> implements Container {
  
private LinkedList<Object> ls=null;
private int size;

  @Override
  public Object pop() {
    Object topElement=ls.getFirst();
    ls.removeFirst();
    size--;
    return topElement ;
  }

  @Override
  public void push(Object value) {
    ls.add(value);
    size++;
  }

  @Override
  public boolean isEmpty() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public int size() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean transferFrom(Container allElements) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  
}
