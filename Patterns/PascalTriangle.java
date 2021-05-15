/*Write a program to print the PASCALS’s Triangle of n rows taking n as input from the user.*/
import java.util.Scanner;
public class pascal
{
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter the number of lines - ");
        int n = in.nextInt();
        int space = n;
        int num = 1;
        for(int i=0;i<n;i++){
            for(int s=1; s<=space;s++){
                System.out.print(" ");
            }
            num = 1;
            for(int j=0;j<=i;j++){
                System.out.print(num + " ");
                num = num*(i-j)/(j+1);
            }
            space--;
            System.out.println();
        }
    }
}
