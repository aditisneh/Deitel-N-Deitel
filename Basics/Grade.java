/*Write an application that input marks of a student and using switch statements print the grade of the student as follows:

Marks 90-100: Grade A

80-89: Grade B

70-79: Grade C

60-69: Grade D

50-59: Grade F*/
import java.util.Scanner;
public class grade
{
  public static void main(String args[]){
    int m;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the marks - ");
    m = in.nextInt();
    m =m/10;
    switch(m){
        case 9:
        System.out.println("Grade A");
        break;
        case 8:
        System.out.println("Grade B ");
        break;
        case 7:
        System.out.println("Grade C");
        break;
        case 6:
        System.out.println("Grade D");
        break;
        case 5:
        System.out.println("Grade E");
        break;
        default:
        System.out.println("Grade F");
    }
    }
}
