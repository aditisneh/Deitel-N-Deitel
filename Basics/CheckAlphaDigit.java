/*Take input from user a character variable in a program and if the value is alphabet then print "Alphabet"
if it’s a number then print "Digit" and for other characters print "Special Character"*/
import java.util.Scanner;
public class check
{
    public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter any Character-");
     char c = scan.next().charAt(0);
     if((c>=65)&&(c<=90)||(c>=97)&&(c<=122))
     System.out.println("Alphabet");
     else if((c>=48)&&(c<=57))
     System.out.println("Digit");
     else
     System.out.println("Special Character");
    }
}
