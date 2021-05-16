/*Create an abstract class Compartment to represent a rail coach. 
Provide an abstract function notice in this class. Derive FirstClass, Ladies, General,
Luggage classes from the compartment class. Override the notice function in each of them to print notice suitable to the type of the compartment.
Create a class TestCompartment. Write main function to do the following: Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4. Check the polymorphic behavior of the notice method.*/
import java.math.*;
abstract class Compartment

{
    public abstract void Notice();
}
class FirstClass extends Compartment

{
        @Override public void Notice() { System.out.println("First Class"); }
}
class Ladies extends Compartment

{
  @Override public void Notice() { System.out.println("Ladies"); }
}
class General extends Compartment

{
 @Override public void Notice() { System.out.println("General"); }
}
class Luggage extends Compartment

{
  @Override public void Notice() { System.out.println("Luggage"); }
}
public class TestCompartment

{
public static void main(String args[])

{
        Compartment A []= new Compartment[10];
        int randIntNum=0;
        for (int i=0; i<10; i++)
        
        {
       randIntNum=0;
        while ((randIntNum<1) || (randIntNum>4))
        
        {
        
        randIntNum = (int) (Math.random() *4 + 1);
    }
        switch (randIntNum)

        {
        
        case 1: { A[i] = new FirstClass(); break; }
        case 2: { A[i] = new Ladies(); break; }
        case 3: { A[i] = new General(); break; }
        case 4: { A[i] = new Luggage(); break; }
      } 
      System.out.print(" object created - " + (i+1) +" "); A[i].Notice();
        
     }
   }
} 
