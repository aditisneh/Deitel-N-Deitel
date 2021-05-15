/*Develop a Java application that will determine whether any of several department–store customers has exceeded the credit limit on a charge account. For each customer, the following facts are available:

i. Account number

ii. Balance at the beginning of the month

iii. Total of all items charged by the customer this month

iv. Total of all credits applied to the customer’s account this month

v. Allowed credit limit.

The program should input all these facts as integers, calculate the new balance (=beginning balance+charges-credits), display the new balance and determine whether the new balance exceeds the customer’s credit limit.
For those customers whose credit limit is exceeded, the program should display the message “credit limit exceeded”.*/
import java.util.Scanner;
class calculate{
    double total=0;
   double cal(double balance, double charge, double credit){
    total = balance + charge - credit;
    return total;
    } 
}
public class credit_limit
{
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    calculate e1 = new calculate(); 
    int acc_n;
    double bal=0, chr=0,t_cred=0, all_cred=0;
    System.out.println("Enter");
    System.out.println(" (i) Account number");
    acc_n = in.nextInt();
    System.out.println("ii. Balance at the beginning of the month");
    bal = in.nextDouble();
    System.out.println("iii. Total of all items charged by the customer this month");
    chr = in.nextDouble();
    System.out.println("iv. Total of all credits applied to the customer’s account this month");
    t_cred = in.nextDouble();
    System.out.println("v. Allowed credit limit ");
    all_cred = in.nextDouble();
    double new_balance = e1.cal(bal,chr,t_cred);
    System.out.println("The new balance of customer id "+ acc_n + " is -"+new_balance);
    if(new_balance>all_cred){
    System.out.println("Credit limit exceed!");
    }
    }
}
