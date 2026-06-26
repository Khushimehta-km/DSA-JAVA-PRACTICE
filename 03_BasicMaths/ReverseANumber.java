import java.util.*;
public class ReverseANumber {
    public void revNo(int n)
    {
        int revNo = 0;
        while(n != 0)
        {
            int rem = n % 10;
            revNo = (revNo * 10) + rem;
            n = n / 10;
        }

        System.out.println(revNo);
        System.out.printf("%05d" , revNo);
        System.out.println();
        

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReverseANumber rv = new ReverseANumber();
        rv.revNo(n);
    }
}
