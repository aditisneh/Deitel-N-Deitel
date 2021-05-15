/*(Fibonacci Series) The Fibonacci series

0, 1, 1, 2, 3, 5, 8, 13, 21, …

Begins with the terms 0 and 1 and has the property that each succeeding term is the sum of the two preceding terms.

a) Write a method fibonacci (n) that calculates the nth Fibonacci number. Incorporate this method into an application that enables the user to enter the value of n.

b) Determine the largest Fibonacci number that can be displayed on your system.

c) Modify the application you wrote in part (a) to use double instead of int to calculate and return Fibonacci numbers, and use this modified application to repeat part (b).*/

import java.util.Scanner;
public class infinte_series_pi
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n - ");
        double pi=0;
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            
            if(i%2==0)
            pi = pi-(4.0/(2*i-1));
            else
            pi = pi + (4.0/(2*i-1));
            System.out.println(pi);
        }
    }
}
