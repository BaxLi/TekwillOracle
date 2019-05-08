/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excersize15_8;

import java.time.LocalDateTime;

/**
 *
 * @author Bax
 */
 abstract class AbstractTask implements Task {
  protected String id;
  protected LocalDateTime createdAt=null;
  protected LocalDateTime executedAt=null;
  @Override
  public String toString(){
    return "should be overrited !!! comes from abstract ...";
  } 
}
