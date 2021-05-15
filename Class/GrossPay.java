/*Develop a Java application that will determine the gross pay for each of three employees. The company pays straight time for the first 40 hours worked by each employee and time and a half for all hours worked in excess of 40 hours in a week. You are given a list of the

employees of the company, the number of hours each employee worked last week and the hourly rate of each employee. The program should input this information for each employee and should determine and display the employee’s gross pay. Use class scanner to input the data.*/
import java.util.Scanner;
 class calculate{
     double pay=0;
    void cal(double hour,double hourly_rate){ 
     if(hour<=40){
        System.out.println("The gross pay is - "+hour*hourly_rate);
        }
     else{
         pay = (hour-40)*1.5*hourly_rate + 40*hourly_rate;
        System.out.println("The gross pay is - "+pay);
        }
    }
  }
public class gross_pay
{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    calculate e1 = new calculate();
    calculate e2 = new calculate();
    calculate e3 = new calculate();
    double h,hr;
    System.out.print("Enter the no. of hours & hourly rate for employee 1- ");
    h = in.nextDouble();
    hr = in.nextDouble();
    e1.cal(h,hr);
    System.out.println("Enter the no. of hours & hourly rate for employee 2- ");
    h = in.nextDouble();
    hr = in.nextDouble();
    e2.cal(h,hr);
    System.out.println("Enter the no. of hours & hourly rate for employee 3- ");
    h = in.nextDouble();
    hr = in.nextDouble();
    e3.cal(h,hr);
    
}
}
