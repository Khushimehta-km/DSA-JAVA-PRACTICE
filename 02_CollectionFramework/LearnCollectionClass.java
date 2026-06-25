import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class LearnCollectionClass {

    public static void main(String[] args)
    {
    List <Integer> list = new ArrayList<>();
    list.add(34);
    list.add(12);
    list.add(39);
    list.add(77);
    list.add(22);
    list.add(15);

    /*min element */

    System.out.println("min element" + Collections.min(list));

    /*max element */

    System.out.println("max element" + Collections.max(list));

    /*frequency */

    System.out.println("frequency of element : " + Collections.frequency(list , 12));

    /*ascending sort */

    Collections.sort(list);  /*ascending */

    Collections.sort(list , Comparator.reverseOrder());  /*descending */

    System.out.println(list);


    

}

}
