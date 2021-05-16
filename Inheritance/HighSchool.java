/*A HighSchool application has two classes: the Person superclass and the Student subclass. 
Using inheritance, in this lab you will create two new classes, Teacher and CollegeStudent.
A Teacher will be like Person but will have additional properties such as salary (the amount the teacher earns) 
and subject (e.g. “Computer Science”, “Chemistry”, “English”, “Other”). 
The CollegeStudent class will extend the Student class by adding a year (current level in college) and major (e.g. “Electrical Engineering”, 
“Communications”, “Undeclared”)*/
import java.util.*;
class Person{
    Scanner in = new Scanner(System.in);
    String gender;
    void gender_get(){
    System.out.println("Enter your gender- ");
    }
    void gender_set(){
    gender = in.nextLine();
    }
    void show_gender(){
    System.out.println("Here are the following person details      -      "); 
    System.out.println("Gender                                     -       "+gender);  
        }
}
class Student extends Person{
    Scanner in = new Scanner(System.in);
    String schl;
    void schl_get(){
        System.out.println("Enter your high school name - ");
    }
    void schl_set(){
    schl = in.nextLine();
    }
    void show_schl(){
    System.out.println("Here are the following student details      -       ");
    System.out.println("School name                                 -       "+schl);    
        }
}
class Teacher extends Person{
    Scanner in = new Scanner(System.in);
    float sal=0;
    String subject;
    void sal_get(){
    System.out.println("Enter your salary as teacher - ");
        }
    void sal_set(){
        sal = in.nextFloat();
        }
    void sub_get(){
    System.out.println("Which subject teacher are you? - ");
    }
    void subject_set(){
        in.nextLine();
    subject = in.nextLine();
      }
    void show_sal_sub(){
    System.out.println("Here are the following teacher details         -        ");
    System.out.println("Salary                                         -        "+sal);  
    System.out.println("Subject                                        -        "+subject);  
        }
}
class CollegeStudent extends Student{
    Scanner in = new Scanner(System.in);
    int level;
    String major;
    void level_get(){
    System.out.println("Enter your current level in college - ");
    }
    void level_set(){
    level = in.nextInt();
    }
    void major_get(){
        System.out.println("Which subject is your major? - ");
    }
    void major_set(){
    in.nextLine();
    major = in.nextLine();
      }
    void show_level_major(){
    System.out.println("Here are the following College Student details    -     ");
    System.out.println("Level                                             -     "+level);  
    System.out.println("Subject                                           -     "+major);  
        }
}
public class HighSchool
{   public static void main(String args[]){
    Teacher t =new Teacher();
    CollegeStudent cs = new CollegeStudent();
    t.gender_get();
    t.gender_set();
    t.sal_get();
    t.sal_set();
    t.sub_get();
    t.subject_set();
    t.show_gender();
    t.show_sal_sub();
    
    System.out.println();
    System.out.println("Input student details - ");
    cs.schl_get();
    cs.schl_set();
    cs.level_get();
    cs.level_set();
    cs.major_get();
    cs.major_set();
    cs.show_schl();
    cs.show_level_major();
}   
}
