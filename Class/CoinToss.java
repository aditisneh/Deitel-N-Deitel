/*Write an application that simulates coin tossing. Let the program toss a coin each time the user chooses the “Toss Coin” menu option.
Count the number of times each side of the coin appears. Display the results. The program should call a separate method flip that takes no arguments 
and returns false for tails and true for heads.
[Note: If the program realistically simulates coin tossing, each side of the coin should appear approximately half the time.]*/
import java.util.Scanner;
class toss{
    boolean flip(){
        String[] choice = {"1","2"};
        int length = choice.length;
        int random = (int)(Math.random()*length);
        String rand_res = choice[random];
        //boolean result = false;//deafult value to false
        if(rand_res=="1"){
        return true;
        }
        return false;
    }
}
public class coin_toss
{
    public static void main(String args[]){
        toss t = new toss();
        Scanner in = new Scanner(System.in);
        int num=1;
        do{
        System.out.println("Enter the number of times you want to toss / Enter -1 to quit- ");
        int n = in.nextInt();
        if(n == -1){
          System.out.println("Loop ends, Thank you");
          num = -1;
          break;
        }
        int head=0,tail=0;
        for(int i=1;i<=n;i++){
        if(t.flip()){
            head++;
        }
        else{
        tail++;
        }
        
        
        }
         System.out.println("Heads - "+head);
        System.out.println("Tails - "+tail);
        
      }while(num>0);
       
        
    }
}
