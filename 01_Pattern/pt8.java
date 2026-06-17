import java.util.Scanner;

class pt8
{
    public void pattern8(int n)
    {
        for (int i = 1 ; i <= n ; i++)
        {
            for (int j = 1 ; j <= i-1 ; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1 ; j <= 2*n - (2*i - 1) ; j++)
            {
                System.out.print("*");
            }

            for (int j = 1 ; j <= i-1 ; j++)
            {
                System.out.print(" ");
            }
        
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        pt8 p = new pt8();

        for (int i = 1 ; i <= t ;   i++)
        {
            int n = sc.nextInt();
            System.out.println("Value of n is :" + n);

            p.pattern8(n);
        }
    }
}