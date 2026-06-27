import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class PrintAllDivisors {
    public ArrayList<Integer> getDivisors(int x)
    {
        ArrayList <Integer> ans = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        for (int i = 1 ; i*i <= x ; i++)
        {
            if (x%i == 0)
            {
                    ans.add(i);
                     if (x/i != i)
        {
                    second.add(x/i);
            
        }
            }
        
        
        
    
        }

        
        Collections.reverse(second);

        ans.addAll(second);
        return ans;

    }




    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        PrintAllDivisors pad = new PrintAllDivisors();
        System.out.println(pad.getDivisors(x));
    }
}