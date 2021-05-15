/*To take input from user as n and print the sum of series 1 + (1+2) + (1+2+3)....+(1+2+3+..n) */
import java.util.Scanner;
public class series_sum{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int sum=0;
      System.out.print("Enter 'n' for the series 1 + (1+2) + (1+2+3)....+(1+2+3+..n) - ");
      int n = in.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        sum +=j;
        }
        }
       System.out.println("The sum of the series is - "+sum);
}
}
