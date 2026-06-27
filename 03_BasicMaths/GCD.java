import java.util.Scanner;
public class GCD {
    public int calGCD(int a , int b)
    {
        while(a > 0 && b > 0)
        {
            if (a > b)
            {
                a = a % b;
            }

            else
            {
                b = b % a;
            }
        }

        if (a == 0)
            return b;
        else
            return a;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        GCD gcd = new GCD();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd.calGCD(a , b));
        
    }


    
}
