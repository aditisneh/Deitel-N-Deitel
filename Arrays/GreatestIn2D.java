/*Write a program to find greatest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.*/
import java.util.Scanner;
public class greatest_3d
{
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     int array[][] = new int[3][3];
     System.out.print("Enter the elememts in 3d array = ");
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        array[i][j] = in.nextInt();
        }
     }
     int max=array[0][0];
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        if(array[i][j]>max){
            max = array[i][j];
        }
        }
     }
     System.out.print("Greatest element is = "+max);
    }
}
