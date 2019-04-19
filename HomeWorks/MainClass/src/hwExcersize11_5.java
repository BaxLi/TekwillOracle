/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class hwExcersize11_5 {
  
  hwExcersize11_5(String s11_5_1, String s11_5_2, String s11_5_3){
  startExecution_11_5_1(s11_5_1);
  startExecution_11_5_2(s11_5_2);
  startExecution_11_5_3(s11_5_3);
  }
  private static boolean checkNext(String inStr, int nextPosition){
    return (inStr.charAt(nextPosition)==inStr.charAt(nextPosition+1));
  } 
  static boolean checkTriple(String inStr, int index){
   if (inStr.length()<(index+2)) 
           {return false;}
   else
        {
          return (checkNext(inStr,index)!=false)&& (checkNext(inStr,index)==checkNext(inStr,index+1));
        }
  }

  void startExecution_11_5_1(String s){
    int rezult=0;
        System.out.println("Exersize 11-5-1");
    for(int i=0;i<s.length()-2;i++){
      if (checkTriple(s,i))
         rezult++;
    }
    System.out.println("Rezultatul = "+rezult);
  }
 
   void startExecution_11_5_2(String s){

    StringBuilder str=new StringBuilder(s);
    System.out.println("Exersize 11-5-2");
    
    for(int i=0;i<str.length()-1;i++){
      if ((str.charAt(i+1)=='s')&&(str.charAt(i)=='i')) {
            str.insert((i+2)," not".toCharArray(),0,4);
            i+=4;
        }
      }
      System.out.println("Replased version of (is) for->"+s+" => "+str);
    }
  
  void startExecution_11_5_3(String s){
    int sum=0;
    System.out.println("Exersize 11-5-3");
    for(char z:s.toCharArray()){
      if (Character.isDigit(z)) sum+=Character.getNumericValue(z);              
      }
        System.out.println("Sum of the digits within string "+s+" is = "+sum);
    }
  
  }
 
 

