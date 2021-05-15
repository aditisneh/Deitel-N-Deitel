/*. Reverse the string but not the words. Eg. I/P: Birla institute of technology

O/P: technology of institute birla.*/
import java.util.Scanner;
class rev_string
{
   
    private static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void reverse(char[] chars, int begin, int end)
    {
        while (begin < end) {
            swap(chars, begin++, end--);
        }
    }
 
    public static void reverse(char[] chars)
    {
        
        int low = 0, high = 0;
 
        for (int i = 0; i < chars.length; i++)
        {
            
            if (chars[i] == ' ')
            {
                
                reverse(chars, low, high);
 
                
                low = high = i + 1;
            }
            else {
                high = i;
            }
        }
 
        
        reverse(chars, low, high);
        reverse(chars, 0, chars.length - 1);
    }
 
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string - ");
        String string = in.nextLine();
        char[] chars = string.toCharArray();
        reverse(chars);
 
        System.out.println(chars);
    }
}
