/*sum from 1-N using Parameterized Recursion */
import java.util.Scanner;
public class Problem6 {
    public void print(int i , int sum)
    {
        if (i < 1)
        {
            System.out.println("sum:" + sum);
            return;
        }

        else
        {
            print(i - 1 , sum + i);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem6 p = new Problem6();
        p.print(n , 0);
    }
    
}
