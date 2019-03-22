/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class excersize4_14 {
  
  public excersize4_14(){
  
   Dog dog1=new Dog();
    dog1.age=1;
    Dog dog2=new Dog();
    dog2.age=2;
    int var1=10;
    int var2=11;
    
    System.out.println("Dog1="+dog1.toString()+"\nDog2 = "+dog2.toString());
    
    var2=var1;
    dog2=dog1;
    var2=12;
    dog1.age=3;
    System.out.println("Dog1="+dog1.toString()+"\nDog2 = "+dog2.toString()+"\n var1="+var1+"\n var2="+var2);
  }
}
