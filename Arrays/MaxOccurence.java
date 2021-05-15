/*Write a program to print the element of an array that has occurred the highest number of times Eg) Array -> 10,20,10,30,40,100,99 O/P:10*/
import java.util.Scanner;
public class max_occurence
{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int max = 0 ; int chh = 0,i;
      System.out.println("Enter the length of the array-");
      int n = in.nextInt();
      int a[] = new int[n];
      int count[] = new int[n];
      System.out.println("Enter the elements-");
    for(i=0;i<a.length;i++){
     a[i] = in.nextInt();
    }
    for(i = 0 ; i <a.length ; i++) {
        int ch = a[i];
        count[ch] = count[ch]+1 ;
    }
    
    for(i = 0 ; i <a.length ;i++)  {
        int ch = a[i];
        if(count[ch] > max) {
            max = count[ch] ; chh = ch ;
        }
    }
         System.out.println("ans"+chh); 
    }
    
    }
