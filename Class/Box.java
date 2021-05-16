/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.(dimensions are width, 
height, depth of double type).
The class should have a method that calculates and returns the volume of the box . 
Obtain an object and print the corresponding volume in main() function.*/
 class box{
 double length, width, height;
 box(double x, double y, double z){
    length = x;
    width = y;
    height = z;
    }
 double vol(){
    double vol;
    vol = length*width*height;
    return vol;
    }
}
public class test_box
{
    public static void main(String[] args){
    box b = new box(10.2, 12.2, 23.5);
    double volume = b.vol();
    System.out.println("The volume is - " + volume);
}
}
