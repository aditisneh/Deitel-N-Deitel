/*Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) take one parameter-the duration of the light. Write a program to test the TrafficLight enum so that it displays the enum constants and their durations.*/
enum TrafficLight {

 RED(1),
 GREEN(3),
 YELLOW(50);
 private final int time;
 TrafficLight(int r){
  this.time=r;
  
 }
 public int getTime(){
  
  return time;
 }
}
public class Traffic_light{

 public static void main(String[] args) {
  TrafficLight lights = null;
  System.out.println("RED LIGHT : "+lights.RED.getTime()+" MINUTES");
  System.out.println("YELLOW LIGHT : "+lights.YELLOW.getTime()+" SECONDS ");
  System.out.println("GREEN LIGHT : "+lights.GREEN.getTime()+" MINUTES");
 }

}
