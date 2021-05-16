/*4. Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square. 
Use Quadrilateral as the super class of the hierarchy. Make the hierarchy as deep (i.e., many levels) as possible. 
Specify the instance variables and methods for each class. The private instance variables of Quadrilateral should be the x-y coordinate pairs for the four 
end-points of the Quadrilateral. 
Write a program that instantiates objects of your classes and outputs each object’s area (except Quadrilateral).*/
import java.util.Scanner;
class Quadrilateral{
    protected int x1,x2,x3,x4,y1,y2,y3,y4;
    protected void getCoordinate(){
    
    }
    public void setCoordinate(int a,int b,int c, int d, int e, int f, int g, int h){
    x1 = a;
    x2 = b;
    x3 = c;
    x4 = d;
    y1 = e;
    y2 = f;
    y3 = g;
    y4 = h;
    }
}
class Trapezoid extends Quadrilateral{
    private int height;
    Trapezoid(int a,int b,int c, int d, int e, int f, int g, int h,int height){
    setCoordinate(a,b,c,d,e,f,g,h);
    this.height = height;
    }
    int area(){
    int d1 = (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    int d2 = (int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
    return (int)((d1+d2)*height)/2;
    }
}
class Paralellogram extends Quadrilateral{
    private int height;
    Paralellogram(int a,int b,int c, int d, int e, int f, int g, int h,int height){
    setCoordinate(a,b,c,d,e,f,g,h);
    this.height = height;
    }
    int area(){
    int d1 = (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    return (int)(d1*height)/2;
    }
}
class Rectangle_1 extends Quadrilateral{
    Rectangle_1(int a,int b,int c, int d, int e, int f, int g, int h){
    setCoordinate(a,b,c,d,e,f,g,h);
    }
    int area(){
    int d1 = (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    int d2 = (int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
    return d1*d2;
    }
}
class Square extends Quadrilateral{
    Square(int a,int b,int c, int d, int e, int f, int g, int h){
    setCoordinate(a,b,c,d,e,f,g,h);
    }
    int area(){
    int d1 = (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    return d1*d1;
    }
}
public class test_quad
{
     public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the co-ordinates x and y -");
         int a = in.nextInt();
         int b = in.nextInt();
         int c = in.nextInt();
         int d = in.nextInt();
         int e = in.nextInt();
         int f = in.nextInt();
         int g = in.nextInt();
         int h = in.nextInt();
         System.out.println("Enter height - ");
         int height = in.nextInt();
        Trapezoid t = new Trapezoid(a,b,c,d,e,f,g,h,height);
        System.out.println("The area of the trapezoid is - " + t.area());
        Paralellogram p = new Paralellogram(a,b,c,d,e,f,g,h,height);
        System.out.println("The area of the paralellogram is - " + p.area());
        Rectangle_1 r = new Rectangle_1(a,b,c,d,e,f,g,h);
        System.out.println("The area of the rectangle is - " + r.area());
        Square s = new Square(a,b,c,d,e,f,g,h);
        System.out.println("The area of the square is - " + s.area());
        }
}
