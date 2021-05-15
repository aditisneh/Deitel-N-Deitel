public class fibonacci
{
    public static void main(String args[]){
     int i;
     int a=0,b=1,c;
     while(a<=89){
        System.out.print(a +",");
        c=a+b;
        a=b;
        b=c;
        }
    }
}
