/*Write a program in Java to display name and roll number of students. 
Initialize respective array variables for 10 students. Handle ArrayIndexOutOfBoundsException, 
so that any such problem does not cause illegal termination of program.*/
import java.util.Scanner;
public class ExceptionHandled
{
  public static void main(String args[])
  {Scanner in = new Scanner(System.in);
     String names[] = {"Aman","Ram","Arjun","Abhimanyu","Karan","Simran","Cortona","Alexa","sunil","Sweety"};

    int roll[] = new int[10];int j=1;
    for(int i=0;i<10;i++){
        roll[i] = j;j++;
    }
  
     try
    {  System.out.println("Enter roll(between 1-10)to know name - ");
    int m = in.nextInt();
    
      String m1 = names[m];                          
      System.out.println("Name is - " + m1);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Do not cross size of array sir."  + e );
    }
    
  }
}
