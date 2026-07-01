/*Check if the String is Palindrome or not */
import java.util.Scanner;

public class Problem10{

    public boolean palindrome(int i , String s)
    {
        if (i >= s.length()/2)
        {
            return true;
        }

        if(s.charAt(i) != s.charAt(s.length()-i-1))
        {
            return false;
        }
        return palindrome(i+1 , s);
            
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Problem10 p = new Problem10();
        System.out.println(p.palindrome(0,s));
    }

}
    

