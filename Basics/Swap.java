/*Swap two numbers with and without using temp variable*/
import java.util.Scanner;
public class Swap{
public static void main(String args[]){
    //with temp variable
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two numbers-");
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println("before swapping numbers: "+a +"  "+ b);  
    int temp;
    temp=a;
    a=b;
    b=temp;
   System.out.println("After swapping: "+a +"   " + b); 
   //without temp variable
   System.out.println("Enter two numbers-");
    int x = in.nextInt();
    int y = in.nextInt();
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("After swapping: "+x +"   " + y); 
}
}
