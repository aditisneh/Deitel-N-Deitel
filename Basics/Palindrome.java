import java.util.Scanner;
public class palindrome
{
    public static void main(String args[]){
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the number = ");
     int n = in.nextInt();
     int orgi_n,a, reversed=0;
     orgi_n = n;
     while(n!=0){
         int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
    }
    if(reversed==orgi_n){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }
}
}
