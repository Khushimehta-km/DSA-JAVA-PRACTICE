import java.util.Scanner;
class Pt21
{
    void pattern21(int n)
    {
        for (int i = 1 ; i <= n ; i++)
        {
            for (int j = 1 ; j <= n ; j++)
            {
                if (i == 1 || i == n) 
                {
                    System.out.print("*");
                }

                else if (j == 1 || j == n)
                {
                    System.out.print("*");
                }

                else 
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Pt21 p = new Pt21();
        int t = sc.nextInt();
        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            p.pattern21(n);
        }
    }
}
