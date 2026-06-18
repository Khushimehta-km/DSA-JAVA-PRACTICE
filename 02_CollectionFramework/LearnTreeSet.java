import java.util.TreeSet;                /*along with the properties of a set it also inherit the properties of a binary tree like set it will have unique elements and like tree binary tree it will be sorted  */
import java.util.Set;

public class LearnTreeSet               
{
    public static void main(String[] args)
    {
    Set <Integer> set = new TreeSet<>();
    set.add(12);
    set.add(15);
    set.add(45);
    set.add(10);

    System.out.println(set);              
    set.remove(15);

    
    System.out.println(set);

    
    System.out.println(set.contains(2));
    
    System.out.println(set.isEmpty());


    }

}
