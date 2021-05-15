/*Write a program to find the largest 2 numbers and the smallest 2 numbers in the array initialized by the user*/
import java.util.Scanner;
public class largest_smallest_2
{
  public static void main(String args[]){
    int large1,large2,small1, small2,i;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the length of the array");
    int n = in.nextInt();
    int array[]=new int[n];
    System.out.println("Enter the elements-");
    for(i=0;i<array.length;i++){
     array[i] = in.nextInt();
    }
    large1=small1=array[0];
    large2=small2=array[1];
    int temp1,temp2;
    if(large2>large1){
     temp1 = large1;
     large1 = large2;
     large2 = temp1;
    }
    if(small1>small2){
     temp1 = small1;
     small1 = small2;
     small2 = temp1;
    }
    for(i=2;i<array.length;i++){
     if(array[i]>large1){
        large2 = large1;
        large1=array[i];
        }
     else if(large2<array[i]&& array[i]!=large1)
        {
           large2= array[i];
        }
    }
    for(i=2;i<array.length;i++){
     if(array[i]<small1){
        small2 = small1;
        small1=array[i];
        }
     else if(small2>array[i]&& array[i]!=small1)
        {
           small2= array[i];
        }
    }
 
 System.out.println("The first largest number is - "+large1);
  System.out.println("The second largest number is - "+large2);
  System.out.println("The first smallest number is - "+small1);
  System.out.println("The second smallest number is - "+small2);
}
}
