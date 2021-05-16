/*Write a method quality_Points that inputs a student’s average
and returns 4 if the student’s average is 90-100, 3 if the average is 80-89, 2 if the average is 70-79, 1 if the average is 60-69
and 0 if the average is lower than 60. Incorporate the method into an application that reads a value from the user and displays the result.*/
import java.util.Scanner;
class quality{
    int quality_points(int num){
        num = num/10;
        switch(num){
            case 9: return 4;
            case 8 : return 3;
            case 7 : return 2;
            case 6 : return 1;
            default : return 1;
        }
    }
}
public class points
{
    public static void main(String args[]){
        quality q = new quality();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks - ");
        int n = in.nextInt();
        int r = q.quality_points(n);
        System.out.println("The result is - "+r);
    }    
}
