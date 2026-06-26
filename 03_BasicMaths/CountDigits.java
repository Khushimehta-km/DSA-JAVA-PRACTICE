import java.util.*;
public class CountDigits {
    public void count(int n)
    {
        // int count = 0;
        // while (n != 0)
        // {
        //     // int rem = n % 10;         /*no significance here */
        //     count++;
        //     n = n/10;

        // } 
        int count = (int)(Math.log10(n)+1);
        System.out.println(count);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CountDigits cd = new CountDigits();
        int n = sc.nextInt();
        cd.count(n);
        
    }
}
