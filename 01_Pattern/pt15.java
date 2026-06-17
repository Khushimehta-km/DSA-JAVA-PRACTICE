
import java.util.Scanner;

public class pt15
{
    void pattern15(int n)
    {
        
        for (int i = 1 ; i <= n ; i++)
        {
            char ch = 'A';
            for (int j = 1 ; j <= (n+1)-i ; j++)
            {
                System.out.print(ch);
                ch += 1;
            
                
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        pt15 p = new pt15();

        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            p.pattern15(n);

        }
    }
}
