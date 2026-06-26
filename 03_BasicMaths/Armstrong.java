import java.util.Scanner;
public class Armstrong {
    public boolean Arm(int x)
{
    int temp = x;
    int sum = 0;
    while (temp != 0)
    {
        int ld = temp % 10;
        sum = sum + (ld*ld*ld);
        temp = temp / 10;
    }

    return sum == x;


}

public static void main(String [] args)
{
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    Armstrong am = new Armstrong();
    System.out.println(am.Arm(x));
}
}
