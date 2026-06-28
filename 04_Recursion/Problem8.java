import java.util.Scanner;

public class Problem8 {
    public int print(int n)
    {
        if (n == 0)
        {
            return 1;
        }

        else
        {
            return n * print(n - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem8 p = new Problem8();
        System.out.println(p.print(n));
    }
    
}
