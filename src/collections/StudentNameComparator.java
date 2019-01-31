
package collections;

import java.util.Comparator;


public class StudentNameComparator implements Comparator{
  
    @Override
    public int compare(Object o1, Object o2) {
        //Normal Version so type casting required. check EmpIdComparator where Generic version No type casting needed
       Student s1  = (Student) o1;
       Student s2  = (Student) o2;
       
       return s1.sName.compareTo(s2.sName); //ascending order
      // return -(s1.sName).compareTo(s2.sName); //descending order
    }
}
