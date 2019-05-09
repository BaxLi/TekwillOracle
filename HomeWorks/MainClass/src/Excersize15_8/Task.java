/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersize15_8;

/**
 *
 * @author Bax
 */
public interface Task {
  void execute();
    public default int getID(){
      return 0;
  }
}
