import java.util.Scanner;

public class pt14
{
    void pattern14(int n)
    {
        
        for (int i = 1 ; i <= n ; i++)
        {
            char ch = 'A';
            for (int j = 1 ; j <= i ; j++)
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
        pt14 p = new pt14();

        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            p.pattern14(n);

        }
    }
}
