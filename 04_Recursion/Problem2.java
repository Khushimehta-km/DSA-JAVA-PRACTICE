/*Print linearly from 1-N using recursion */
import java.util.Scanner;
public class Problem2 {
    public void print(int i , int n)
    {
        if (i > n)
        {
            return;
        }
        else
        {
            System.out.println(i);
            print(i+1 , n);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem2 p = new Problem2();
        p.print(1 , n);

    }
    
}
