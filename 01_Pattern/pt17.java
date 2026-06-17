import java.util.Scanner;

class pt17
{
    public void pattern17(int n)
    {
        for (int i = 1 ; i <= n ; i++)
        {
            char ch = 'A';
            for (int j = 1 ; j <= n-i ; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1 ; j <=2*i - 1 ; j++)
            {
                System.out.print(ch);
                ch += 1;
                if (j >= i)
                {
                    ch -= 2;
                }
            }

            for (int j = 1 ; j <= n-i ; j++)
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
        pt17 p = new pt17();

        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            p.pattern17(n);
        }


    }
}
