import java.util.Queue;
import java.util.LinkedList;       //if want to used under list inerface then just List <Integer> list = new LinkedList <> ();

public class LearnLinkedListQueue {

    public static void main (String[] args)
    {
        Queue <Integer> queue = new LinkedList <> ();

        //to add elements

        queue.offer(12);
        queue.offer(20);               //likewise in the case of list use the methods of list interface like add , remove , get , conatins etc
        queue.offer(23);

        System.out.println(queue);

        //to remove first element

        
        System.out.println(queue.poll());
        
        System.out.println(queue);

        //next element that will be polled out or the element that is at first

        
        System.out.println(queue.peek());

        //add() can be used to add element but throws exception if fails whereas offer() doesnt it will give false
        //remove() can be used to remove an element but throws exception if fails whereas poll() doesnt
        //element() returns the head of the queue but throws exception if fails whereas peek() doesnt


        
    }

    
}
