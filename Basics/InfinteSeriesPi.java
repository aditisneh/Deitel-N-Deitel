/*1. Calculate the value of 𝜋 from the infinite series

𝜋=4−43+45−47+49−411+⋯

Print a table that shows the value of 𝜋 approximated by computing one term of this series, by two terms, by three terms and so on. How many terms of this series do you have to use before you first get 3.14? 3.141? 3.1415? 3.14159?*/
import java.util.Scanner;
public class infinte_series_pi
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n - ");
        double pi=0;
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            
            if(i%2==0)
            pi = pi-(4.0/(2*i-1));
            else
            pi = pi + (4.0/(2*i-1));
            System.out.println(pi);
        }
    }
}
