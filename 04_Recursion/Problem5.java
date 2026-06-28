/*Print from N-1 by using backtracking */
import java.util.Scanner;
public class Problem5 {
    public void print(int i , int n)
    {
        if (i > n)
        {
            return;
        }
        else
        {
            print(i + 1 , n);
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem5 p = new Problem5();
        p.print(1 , n);

    }
    
}
