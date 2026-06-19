/*Sometimes it can be a case that we want to make a set of custom class and not that of the primitive 
class so here a custom class comprises of different data types some are string some are int so here
its necessary to choose wisely that for which particular data type we want our hashcode to be generated
because if we havent specified about this then our hashcode will not able to find duplicates because 
acc to it we are making new objects each time a new element is added so irrespective of if the elements
are same it will still print them in its set  */

import java.util.Set;
import java.util.HashSet;

public class LearnSetOfCustomClass
{
    public static void main(String[] args)
    {
        Set <Student> studentSet = new HashSet <>();  /*(a hashset that will store student type objects) .... in normal set like Set <Integer> set = new HashSet<>(); ... here java knows that how to check duplicates because in integer class equals() and hashCode() is already defined 
        but here we have made class of our own so java doesnt know the meaning of duplicates...here we will decide same name?...same rollno?...same both?*/

        studentSet.add(new Student("Khushi" , 1));               /*for memory obj:1 */
        studentSet.add(new Student("Shruti" , 2));               /*for memory obj:2 */
        studentSet.add(new Student("Prakriti" , 3));             /*for memory obj:3 */
        studentSet.add(new Student("Namita" , 2));               /*for memory obj:4 */
            /*Shruti and Namita are logically duplicates */
        System.out.println(studentSet);
        /*for now every student is being printed even if they have same rollno to avoid this we have 
        to use equals() method in the student file that helps  to check duplicates */
    }
}
