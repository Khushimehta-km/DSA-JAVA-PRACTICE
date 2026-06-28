/*Print from 1-N by using backtracking */
import java.util.Scanner;

public class Problem4 {
    public void print(int i , int n)
    {
        if (i < 1)
        {
            return;
        }
        else
        {
            print(i-1 , n);
            System.out.println(i);
        }
            
    }
    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem4 p = new Problem4();
        p.print(n , n);

    }
    
    
}
