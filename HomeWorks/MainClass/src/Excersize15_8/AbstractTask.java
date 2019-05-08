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
  private String id;
  private LocalDateTime createdAt;
  private LocalDateTime executedAt;
  public String toString(){
    return "should be overrited !!! comes from abstract ...";
  } 
}
