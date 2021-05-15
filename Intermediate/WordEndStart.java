/*Find out and print the maximum possible palindrome in a given string. Eg:

I/P: nononsene O/P: nonon

3. Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

If inputs are "abcXY123XYijk" and "XY", output should be "c13i".

If inputs are "XY123XY" and "XY", output should be "13".*/
import java.util.Scanner;
public class WordEnds {


        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string - ");
        String st =in.nextLine();
        System.out.print("Enter word - ");
        String word = in.nextLine();
        int sLen = st.length();
        int wLen = word.length();
        
        String fin = "";
        
        for(int i=0; i<sLen-wLen+1; i++){
            String tmp = st.substring(i,i+wLen);
            if(i>0 && tmp.equals(word)){
                fin+=st.substring(i-1,i);
            }
            if(i<sLen-wLen && tmp.equals(word)){
                fin+=st.substring(i+wLen, i+wLen+1);
            }   
        }
        
        System.out.println(fin);
    }
}
