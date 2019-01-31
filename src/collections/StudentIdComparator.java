
package collections;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student>{
    
    @Override
    public int compare(Student s1, Student s2) {
    
        //Generic version so we dont require type casting
        
        //sort data in ascending order 
        if(s1.sId == s2.sId)
        {
            return 0;
        }
        else if(s1.sId > s2.sId)
        {
            return 1;
        }else
        {
            return -1;
        }
        
       //Sort data in descending order
        /*
        if(s2.sId == s1.sId)
        {
            return 0;
        }
        else if(s2.sId > s1.sId)
        {
            return 1;
        }else
        {
            return -1;
        }
        */
    }
}
