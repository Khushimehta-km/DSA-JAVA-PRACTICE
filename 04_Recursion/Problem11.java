/*Fibonacci number by MULTIPLE RECURSION */

import java.util.Scanner;
public class Problem11
{
    public int fibonacci(int n)
    {
        if (n <= 1)
        {
            return n;
        }
        else
            return fibonacci(n - 1)+fibonacci(n - 2);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n for which fibonacci number is to be calculated : ");
        int n = sc.nextInt();
        Problem11 p = new Problem11();
        System.out.println(p.fibonacci(n));
    }
}