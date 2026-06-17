import java.util.Scanner;

class pt9
{
    public void pattern9(int n)
    {
        for (int i = 1 ; i <= n ; i++)
        {
            for (int j = 1 ; j <= i-1 ; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1 ; j <= (2*n - 2*i) + 1 ; j++)
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
        pt9 p = new pt9();

        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            p.pattern9(n);
        }


    }
}
