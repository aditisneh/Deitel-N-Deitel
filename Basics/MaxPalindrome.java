/*Find out and print the maximum possible palindrome in a given string. Eg:

I/P: nononsene O/P: nonon*/
class largest_palindrome
{
    
    public static String check(String str, int low, int high)
    {
        int len = str.length();
 
        while (low >= 0 && high < len &&
                (str.charAt(low) == str.charAt(high))) {
            low--;
            high++;
        }

        return str.substring(low + 1, high);
    }

    public static String find(String str, int len)
    {
  
        String max_str = "", curr_str;

 
        int max_length = 0, curr_length;

        for (int i = 0; i < len; i++)
        {
 
            curr_str = check(str, i, i);
            curr_length = curr_str.length();

 
            if (curr_length > max_length)
            {
                max_length = curr_length;
                max_str = curr_str;
            }

 
            curr_str = check(str, i, i + 1);
            curr_length = curr_str.length();

            if (curr_length > max_length)
            {
                max_length = curr_length;
                max_str = curr_str;
            }
        }
 
        return max_str;
    }
 
    public static void main(String[] args)
    {
        String str = "nononsense";
 
        System.out.println("The longest palindromic substring of " + str + " is "
                + find(str, str.length() - 1));
    }
}
