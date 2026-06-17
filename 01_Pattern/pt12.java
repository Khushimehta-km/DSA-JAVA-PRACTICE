import java.util.Scanner;
public class pt12 {
    public void pattern12(int n)
    {
        for (int i = 1 ; i <= n ; i++)
        {
            
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print(j);
                
            }
            for (int j = 1 ; j <= 2*n-2*i ; j++)
            {
                System.out.print(" ");
                
            }
        
            for (int j = i ; j >= 1 ; j--)
            {
                System.out.print(j);
                
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        pt12 p = new pt12();

        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            p.pattern12(n);

        }
    }
    
}

