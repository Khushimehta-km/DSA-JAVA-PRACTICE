import java.util.ArrayList;   //without ArrayList array cant be modified dynamically
import java.util.Iterator;

public class LearnArrayList { 

    
    public static void main (String[] args)
    {
        //1//

        ArrayList <String> studentsName = new ArrayList <> ();
        //if we want to add an element to this ARRAYLIST and increase its size
        //then the array increase its size n as n = n + n/2 + 1
        //it will itself make a new array then will copy the old array in the new array , will dump the old one and use new one
        studentsName.add("Khushi");
        studentsName.add("Angel");
        studentsName.add("Rohan");
        studentsName.add("Yuvraj");

        System.out.println(studentsName);

        //2//

        ArrayList <Integer> list = new ArrayList <> ();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(4);

        System.out.println(list);

        //if want to add element at a specific position

        list.add(1 , 50);

        System.out.println(list);

        //if want to append the list with a new list

        ArrayList <Integer> newlist = new ArrayList <> ();
        newlist.add(150);
        newlist.add(160);

        //appending newlist into list

        list.addAll(newlist);

        System.out.println(list);

        //to get a particular indexvalue

        System.out.println(list.get(4));

        //to remove a particular index value;

        list.remove(5);
        System.out.println(list);

        //to remove a particular element (a particular value)

        list.remove(Integer.valueOf(50));
        System.out.println(list);

        //to clear complete list or to empty the list

        // list.clear();
        // System.out.print(list);

        //if we remove an element from the list the other elements shift left thus time complexity is O(n) and similar in insertion as the elements shift towards right

        //to update an element
        
        list.set(2 , 1000);  //O(1)
        System.out.println(list);

        //to check if the list contain the particular element (boolean)

        System.out.println(list.contains(50));  //O(n) full traversal

        //ITERATING THE LIST

        //a//

        for (int i = 0 ; i < list.size() ; i++)
        {
            System.out.println("the element is : " + list.get(i));
        }

        //b//

        for (Integer element : list)
        {
            System.out.println("element is :" + element);
        }

        //c//

        Iterator <Integer> it = list.iterator();    //needs to import iterator
        while(it.hasNext())
        {
            System.out.println("iterator : " + it.next());
        }







        
        
        



    }                
    
}
