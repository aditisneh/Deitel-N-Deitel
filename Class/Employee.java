/*Create a class called Employee that includes three pieces of information as instance variables-a first name (type String),
a last name (type String) and a monthly salary (double). The class should have a constructor that initializes the three instance variables.
Provide a set and a get method for each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test application named EmployeeTest 
that demonstrates class Employee’s capabilities. Create two Employee objects
and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class emp{
   double salary;
   String first_name, last_name;
   Scanner in = new Scanner(System.in);
   emp()
    {
     first_name = "Aditi";
     last_name = "Sneh";
     salary = 100;
    }
   void get_fs(){
       System.out.println("Enter the first name - ");
       
    }
    void get_ls(){
       System.out.println("Enter the last name - ");
       
    }
    void get_s(){
       System.out.println("Enter the salary - ");
       
    }
   void set_ls(){
      last_name = in.nextLine();
    }
   void set_fs(){
       first_name = in.nextLine();
    }
   void set_s(){
      salary = in.nextDouble();
      if(salary<0){
        salary = 0;
        }
    }
   double inc_sal(){
     return salary*0.1+salary;
    }
    
}
public class test_emp
{
   public static void main(String args[]){
    emp e1 = new emp();
    emp e2 = new emp();
    e1.get_fs();
    e1.set_fs();
    e1.get_ls();
    e1.set_ls();
    e1.get_s();
    e1.set_s();
    e2.get_fs();
    e2.set_fs();
    e2.get_ls();
    e2.set_ls();
    e2.get_s();
    e2.set_s();
    System.out.println("Initial salary of "+e1.first_name+" is - "+e1.salary);
    System.out.println("Initial salary of "+e2.first_name+" is - "+e2.salary);
    System.out.println("Increased salary of "+e1.first_name+" is - "+e1.inc_sal());
    System.out.println("Increased salary of "+e2.first_name+" is - "+e2.inc_sal());
    }
}
