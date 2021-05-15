/*Write a program to sort an array of integers and then search for a particular key taken as input from the user.*/
import java.util.Scanner;
public class sort
{
   public static void main(String[] args){
       int n,temp;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the length of the array - ");
       n = in.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = in.nextInt();
        }
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
             temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
            }
         
        }
       
        System.out.println("Enter the number to be searched - ");
        int x = in.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]!=x){
            continue;
            }
            else{
                System.out.println("Element found");
                
            }
        }
    }
}
