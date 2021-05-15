/*Write an application that inputs an integer containing only 0s and 1s (i.e., a binary digit) and prints its decimal equivalent. As an example decimal equivalent of binary 1101 is 13.*/
import java.util.Scanner;
public class binary_to_decimal
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary number - ");
        int n = in.nextInt();
        int dec=0;
        int base =1;
        int temp = n;
        while(temp>0){
            int last_digit = temp%10;
            temp = temp/10;
            dec += last_digit*base; 
            base = base*2;
        }
        System.out.print("The respective decimal value is - "+ dec);
    }
}
