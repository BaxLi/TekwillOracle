/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersize15_9;

/**
 *
 * @author Bax
 */
public interface Container<T> {
  public T pop();
  public void  push(T value);
  public boolean isEmpty();
  public int size();
  public boolean transferFrom(Container allElements);
  };
