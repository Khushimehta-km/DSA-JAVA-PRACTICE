/*Print linearly from N to 1 using recursion */

import java.util.Scanner;

public class Problem3 {
    public void print(int i , int n)
    {
        if (i < 1)
        {
            return;
        }
        else
        {
            System.out.println(i);
            print(i-1 , n);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem3 p = new Problem3();
        p.print(n , n);

    }

    
}
