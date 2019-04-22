
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class hwExcersize_12 {

 
 hwExcersize_12(){
   this.excersize_12_11_1234();
 } 
  public void excersize_12_11_1234(){
    /** 
     * generam ceva oameni in array, partial randomized
     **/
    ArrayList<Employee> employees=new ArrayList();
     
    employees.add(new Employee(employees.size(),"Vologhea",55));
    employees.add(new Employee(employees.size(),"LEx",15));
    employees.add(new Employee(employees.size(),"Lenuta :)",906090));
    employees.add(new Employee(employees.size(),"Mariuta",609060));
    
        Random rnd=new Random();
          for (int i=1;i<5;i++){
            employees.add(new Employee(employees.size(),"RandomName->"+(rnd.nextInt(100*i)),rnd.nextInt(906090)));
          }
    /** Tiparim lista obtunita  
     */
   ListIterator<Employee> listEmployees=employees.listIterator();
   Employee personInfo;
   while(listEmployees.hasNext()){
     personInfo=listEmployees.next();
     //System.out.println("Tiparim lista: " + personInfo.getName()+" Salary="+personInfo.getSalary()+" person ID="+personInfo.getId()); 
     System.out.println(personInfo);
   }
    /** tiparim o persoana concreta = Random(max 8)  
    */
    int i=rnd.nextInt(8);
    System.out.println("Look for the person with ID="+i);
    System.out.println(employees.get(i));

    /** comparam 2 listuri  
    */  
    ArrayList employees2=new ArrayList();
    for (i=1;i<9;i++){
            employees2.add(new Employee(employees.size(),"RandomName->"+(rnd.nextInt(100*i)),rnd.nextInt(350)));
          }
    
    /* acuma cream dublicate in array 2 */
    
    employees2.add(employees.get(4));
    employees2.add(employees.get(6));
    employees2.add(employees.get(2));
    
    /* this change is for testing purposes */
    employees.get(2).setSalary(222);
    
    /** comparam */
    System.out.println("Comparing 2 arrays ");
        
    for (Employee z: employees){
      
      /** metoda equals a fost redefinita pentru clasa-obiectul Employee!!!
       */
      
    if (employees2.contains(z)) {
        System.out.println("Dublicate founds (!) => "+z);
        }
      }
    }
  }
 
class Employee extends Object{
  private static int idQty;
  private int id;
  private String name="";
  private int salary;
  
  static int getIdQty(){
  return idQty;
  }
  public int getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getSalary() {
    return salary;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }

  Employee(){
  idQty++; 
  this.name="Test";
  this.salary=33;
  }
  Employee(int a, String b, int c){
  idQty++;
  id=a;
  this.name=b;
  this.salary=c;
  }
  
  @Override
  public boolean equals(Object o){
    Employee name1=(Employee) o;
  return (name1.getName().equals(this.getName()) && (name1.getSalary()==this.getSalary()))? true:false;
  }
  
  @Override
   public String toString(){
     return  ("Tiparim lista: " + this.getName()+" Salary="+this.getSalary()+" person ID="+this.getId()); 
  }
   
}
