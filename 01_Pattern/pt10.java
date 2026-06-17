import java.util.Scanner;
public class pt10
{
    public void pattern10(int n)
    {
        for (int i = 1 ; i <= 2*n-1 ; i++)
        {
            int stars = i;
            if (i > n)
            {
                stars = 2*n-i;
            }
            for (int j = 1 ; j <= stars ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }

    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            pt10 p = new pt10();

            for (int i = 1 ; i <= t ; i++)
            {
                int n = sc.nextInt();
                p.pattern10(n);
            }

            
        }
}