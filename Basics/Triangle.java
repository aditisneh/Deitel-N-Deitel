/*Write an application that reads three nonzero values entered by the user and determines and prints whether they could represent the sides of a right angled triangle.*/
import java.util.Scanner;
public class side_of_traingle
{
    public static void main(String args[]){
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three sides of triangle - ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if(a+b>=c||b+c>=a||a+c>=b){
            System.out.print("The triangle is possible");
        }
        else
        System.out.print("The triangle is not possible");
    }
}
