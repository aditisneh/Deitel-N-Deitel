/*.Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments

Eg: C:\>java Sample 1 2 3 4

O/P Expected :
The given array is : 1 2
3 4
The reverse of the array is : 4 3
2 1*/
import java.util.Scanner;
public class rev_2d
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements in the 2-D array - ");
        int array[][]=new int[2][2];
        int rev[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            array[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            rev[i][j] = array[1-i][1-j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            System.out.print(rev[i][j]);
            }
            System.out.println();
        }
    }
}
