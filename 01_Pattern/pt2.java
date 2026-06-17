import java.util.Scanner;

class pt2
{
    public void pattern2(int n)
    {
        for (int i = 1 ; i <= n ; i++)
        {
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print("*");
                System.out.print("");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        pt2 p = new pt2();

        for (int i = 1 ; i <= t ;   i++)
        {
            int n = sc.nextInt();
            System.out.println("Value of n is :" + n);

            p.pattern2(n);
        }
    }
}
