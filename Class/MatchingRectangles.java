/*Write a program in Java with class Rectangle with the data fields width, length, area and color. 
The length, width and area are of double type and color is of string type. The methods are set_length() , set_width() ,
set_color(), and find_area(). Create two object of Rectangle and compare their area and color. 
If area and color same for the objects then display “Matching Rectangles” otherwise display “Non Matching Rectangle”.*/
import java.util.Scanner;
import java.lang.*;
import java.io.*;
class rectangle{
    double width, length, area=0;
    String color;
    void set_length(double y){
     length = y;
    }
    void set_width(double x){
      width = x;
    }
     String set_color(String c){
     color = c;
     return color;
    }
    double find_area(double x, double y){
     area = length*width;
     return area;
    }
    
}
public class rect_class
{
   public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    double area1,area2;
    String c1,c2;
    rectangle r1 = new rectangle();
    rectangle r2 = new rectangle();
    r1.set_length(10.1);
    r1.set_width(12.2);
    c1 = r1.set_color("yellow");
    c2 = r2.set_color("yellow");
    r2.set_width(10.1);
    r2.set_length(12.2);
    area1 = r1.find_area(10.1,12.2);
    area2 = r2.find_area(12.2,10.1);
    if(area1==area2 && c1==c2){
     System.out.println("Matching Rectangles");
    }
    else{
     System.out.println("Not Matching Rectangles");
    }
    }
}
