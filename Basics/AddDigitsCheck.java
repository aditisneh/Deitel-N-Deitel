/*Write a program to add all the values in a given number and check if the sum is prime number or not. Ex: 1234->10, not prime.*/
import java.util.Scanner;
public class sum_prime
{
  public static void main(String args[]){
    int sum=0,i,c=0;
    System.out.println("Enter a number-");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    while(n!=0){
     sum = sum+ n%10;
     n=n/10;
    }
    for(i=1;i<=sum;i++){
        if(sum%i==0)
        c++;
        if(c>2)
        break;
    }
     if(c>2)
        System.out.println("The Sum of digits = "+sum+" is not prime");
    else
        System.out.println("The Sum of digits = "+sum+" is prime");
    
    }
}
