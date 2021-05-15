/*Write a program that inputs five numbers and determines and prints the number of negative numbers input, the number of positive numbers input and the number of zeros input.*/
import java.util.Scanner;
public class positive_negative
{
    public static void main(String[] args){
        int n[] = new int[5];
        int neg=0;
        int p=0;
        int z=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter five numbers - ");
        for(int i=0;i<5;i++){
           n[i] = in.nextInt(); 
        }
        for(int i=0;i<5;i++){
            if(n[i]<0)
            neg++;
            if(n[i]>0)
            p++;
            if(n[i]==0)
            z++;
        }
        System.out.println("Negative - "+neg);
        System.out.println("Positive - "+p);
        System.out.print("Zero - "+z);
    }
    
}
