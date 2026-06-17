import java.util.Scanner;

public class pt16
{
    void pattern16(int n)
    {
        char ch = 'A';
        
        for (int i = 1 ; i <= n ; i++)
        {
            
            for (int j = 1 ; j <=i ; j++)
            {
                System.out.print(ch);
                
            
                
            }
            ch += 1;
            System.out.println();
            
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        pt16 p = new pt16();

        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            p.pattern16(n);

        }
    }
}