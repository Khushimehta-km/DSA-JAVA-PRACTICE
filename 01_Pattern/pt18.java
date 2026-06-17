import java.util.Scanner;
public class pt18
{
    public void pattern18(int n)
    {
        for (int i = 0 ; i < n ; i++)
        {
            for (char ch = (char)('E' - i) ; ch <= 'E' ; ch++)
            {
                    System.out.print(ch);
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        pt18 p = new pt18();
        int t = sc.nextInt();
        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            p.pattern18(n);
        }
    }
}

