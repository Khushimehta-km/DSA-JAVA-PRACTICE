import java.util.Scanner;
public class pt19
{
    public void pattern19(int n)
    {
        for (int i = 1 ; i <= n ; i++)
        {
            for (int j = 1 ; j <= (n - i) + 1 ; j++)
            {
                System.out.print("*");
            }

            for (int j = 1 ; j <= 2*i - 2 ; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1 ; j <= (n - i) + 1 ; j++)
            {
                System.out.print("*");
            }

            System.out.println();

            
            
        }

        for (int i = 1 ; i <= n ; i++)
        {
            for (int j = 1 ; j <= i  ; j++)
            {
                System.out.print("*");
            }

            for (int j = 1 ; j <= 2*n - 2*i ; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print("*");
            }

            System.out.println();

            
            
        }

        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        pt19 p = new pt19();
        int t = sc.nextInt();
        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            p.pattern19(n);
        }
    }
}
