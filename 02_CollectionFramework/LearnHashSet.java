import java.util.HashSet;                       //no order defined
import java.util.Set;                            //no duplicate element allowed
public class LearnHashSet 
{
    public static void main(String[] args)
    {
        Set <Integer> s = new HashSet<>();

        s.add(12);                    /*every element has its unique hash */
        s.add(2);
        s.add(54);
        s.add(21);
        s.add(65);

        System.out.println(s);

        s.remove(54);
        System.out.println(s);

        System.out.println(s.contains(21));

        System.out.println(s.isEmpty());

        System.out.println(s.size());

        /*s.clear();                    will clear out the complete set */
    } 
}
