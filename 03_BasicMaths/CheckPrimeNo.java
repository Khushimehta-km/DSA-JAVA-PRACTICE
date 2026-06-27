import java.util.Scanner;
public class CheckPrimeNo {
    public boolean isPrime(int x)
    {
        int count = 0;
        for (int i = 1 ; i*i <= x ; i++)
        {
            if (x % i == 0)
            {
                count++;
                if (x/i != i)
                {
                    count++;
                }
            }
        }

        if (count == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        CheckPrimeNo cpn = new CheckPrimeNo();
        System.out.println(x + " is prime number : " + cpn.isPrime(x));

    }
}
