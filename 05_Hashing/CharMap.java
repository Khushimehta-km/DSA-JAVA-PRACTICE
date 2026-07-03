import java.util.*;
import java.util.HashMap;

public class CharMap {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String s = sc.next();
        HashMap <Character , Integer> map = new HashMap<>();
        for (int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }

        System.out.println(map);

        

        
    }
    
}
