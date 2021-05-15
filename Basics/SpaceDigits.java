/*Write an application that inputs one number consisting of five digits from the user separates the number into its individual digits and prints
the digits separated from one another by three spaces each. For example if the user types in the number 42339, the program should print

4 2 3 3 9

Assume the user enters the correct number of digits. What happens when user execute the program and type a
number with more than five digits? What happens when user execute the program and type a number with fewer than five digits?*/
import java.util.Scanner;
public class space_digits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,n, reversed = 0;
        int digit1;
        System.out.println("Enter Number - " );
        n= in.nextInt();
        num= n;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        while(reversed > 0) {
            int digit = reversed % 10;
            System.out.print(digit+"   ");
            reversed /= 10;
        }
    }
}
