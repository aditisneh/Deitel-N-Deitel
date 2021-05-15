/*Write an application that prompts the user to enter the size of the side of a square, and then displays a hollow square of that size made of asterisks. The program should work for squares of all side lengths between 1 and 20.*/
import java.util.Scanner;
public class hollow_square
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter any number (1-20) - ");
        n=in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(i==0||j==0||i==n-1||j==n-1){
            System.out.print(" * ");
            }
            else{
            System.out.print("   ");
            }
            }
            System.out.println();
        }
    }
}
