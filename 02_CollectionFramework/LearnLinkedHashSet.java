import java.util.LinkedHashSet;                /*inherit the properties of both set and linked list */
import java.util.Set;

public class LearnLinkedHashSet               
{
    public static void main(String[] args)
    {
    Set <Integer> set = new LinkedHashSet<>();
    set.add(12);
    set.add(15);
    set.add(45);
    set.add(10);

    System.out.println(set);              /*unlike queue and hashset it will not arrange elements in random order will print them as added */
    
    set.remove(15);

    
    System.out.println(set);

    
    System.out.println(set.contains(2));
    
    System.out.println(set.isEmpty());


    }

}