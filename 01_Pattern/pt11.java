import java.util.Scanner;
public class pt11 {
    public void pattern11(int n)
    {
        for (int i = 1 ; i <= n ; i++)
        {
            int start = 1;
            if (i%2 == 0)
            {
                start = 0;
            }
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();

        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        pt11 p = new pt11();

        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            p.pattern11(n);

        }
    }
    
}
