/*Create a class named ‘Animal’ which includes methods like eat() and sleep(). Create a child class of Animal named ‘Bird’ and override the parent class methods.
Add a new method named fly(). Create an instance of Animal class and invoke the eat and sleep methods using this object.
Create an instance of Bird class and invoke the eat, sleep and fly methods using this object*/
class Animal{
    void eat(){
    System.out.println("Eat");
    }
    void sleep(){
    System.out.println("Sleep");
    }
}
class Bird extends Animal{
    void eat(){
    System.out.println("Bird eats");
    }
    void sleep(){
    System.out.println("Bird sleeps");
    }
    void fly(){
    System.out.println("Bird Flies");
    }
}
public class Amimal_Bird
{   public static void main(String args[]){
    Animal a = new Animal();
    Bird b = new Bird();
    System.out.println("Animal - ");
    a.eat();
    a.sleep();
    System.out.println("Bird - ");
    b.eat();
    b.sleep();
    b.fly();
    
}
}
