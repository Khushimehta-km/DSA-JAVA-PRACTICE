import java.util.Objects;

public class Student {                                 
    String name;
    int rollNo;

    public Student(String name , int rollNo)
    {
            this.name = name;
            this.rollNo = rollNo;

    }

    /*if we code upto the above lines only then output by LearnSetOfCustomClass will be a hash set 
    with the value of Object of each new Student made becuase acc to it new objects are being made and 
    each have diff hash code*/

    /*So firstly to avoid printing the object value and to print the real details of student we have
    to use toString() */
    /*so to let java know that we dont want to see the object address , we want to see the students detail */
    @Override
    public String toString() {
        return "Student{" + "name=" + name + " " + "rollno=" + " " + rollNo + "}";
                
    }

    /*hash set internally uses two methods of object class .. hashCode() and equals() */

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (this == obj) return true;          /*if both are pointing to same object , return true */
        if (obj == null || getClass() != obj.getClass()) 
            return false;
        Student student = (Student) obj;
        return rollNo == student.rollNo;
    }

    /*instructing java to make students hash from rollNo */
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(rollNo);
    }

    /*Shruti and Namita will have same hash set so hashSet will think that they could be same so then it will run equals() */

    /*hashCode decides the field used for hashing , equals decides whether two objects are actually equal */
}
