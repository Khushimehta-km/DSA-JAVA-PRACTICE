import java.util.Scanner;

public class pt13
{
    void pattern13(int n)
    {
        int num = 1;
        for (int i = 1 ; i <= n ; i++)
        {
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print(num);
                num += 1;
            
                
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        pt13 p = new pt13();

        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            p.pattern13(n);

        }
    }
}