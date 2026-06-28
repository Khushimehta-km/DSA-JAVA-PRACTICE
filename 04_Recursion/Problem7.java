/*Sum from 1-N using Functional Recursion */
import java.util.Scanner;
public class Problem7 {
    public int print(int n)
    {
        if (n == 0)
        {
            return 0;
        }

        else
        {
            return n + print(n - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem7 p = new Problem7();
        System.out.println(p.print(n));
    }
    
}
