/*Write a program segments that accomplish each of the following tasks:

a. Calculate the integer part of the quotient when integer a is divided by integer b.

b. Calculate the integer remainder when integer a is divided by integer b.

c. Use the program pieces developed in parts (a) and (b) to write a method displayDigits that receives an integer between 1 and 99999 and displays it as a sequence of digits, separating each pair of digits by two spaces. For example the integer 4562 should appear as

4 5 6 2

d. Incorporate the method developed in part (c) into an application that inputs an integer and calls display Digits by passing the method the integer entered. Display the results.*/
import java.util.Scanner;
class quotient{
    int a,b;
    void q(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter divisor and dividend - ");
    a = in.nextInt();
    b = in.nextInt();
    int q=0;
    q = b/a;
    System.out.println("The integer quotient is - "+q);
     }
}
class remainder{
    int a,b;
    void r(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter divisor and dividend - ");
    a = in.nextInt();
    b = in.nextInt();
    int r=0;
    r = b%a;
    System.out.println("The integer remainder is - "+r);
     }
}
class space_digit{
    int a,b;
    void sd(int n){
        int num, reversed = 0;
        int digit1;
        
        num= n;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        while(reversed > 0) {
            int digit = reversed % 10;
            System.out.print(digit+"  ");
            reversed /= 10;
        }
     }
}

public class quotient_remainer
{
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    quotient q = new quotient();
    remainder r = new remainder();
    space_digit s= new space_digit();
    q.q();
    r.r();
    System.out.println("Enter Number - " );
    int n= in.nextInt();
    s.sd(n);
}
}
