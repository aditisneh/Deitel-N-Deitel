/*Take user input for marks of 10 students and print those marks which are greater than the mean*/
import java.util.Scanner;
public class marks_array
{
    public static void main(String args[]){
     Scanner in = new Scanner(System.in);
     int mean,sum=0;
     int a[] = new int[10];
     System.out.print("Enter the marks of 10 students-");
     for(int i = 1;i<10;i++){
         a[i] = in.nextInt();
    }
    for(int i=0;i<10;i++){
        sum +=a[i];
    }
    mean = sum/10;
    System.out.println("The mean is - "+mean);
    System.out.println("Numbers greater than mean are - ");
    for(int i=0;i<10;i++){
        if(a[i]>mean){
            System.out.println(a[i]);
        }
    }
}
}
