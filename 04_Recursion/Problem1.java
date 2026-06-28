/*Print name n times using recursion */
import java.util.Scanner;
public class Problem1 {
    public void print(int i , int n)
    {
        if (i > n)
        {
            return;
        }

        else
        {
            System.out.println("Khushi");
            print(i+1 , n);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem1 p = new Problem1();
        p.print(1 , n);
    }

    
}
