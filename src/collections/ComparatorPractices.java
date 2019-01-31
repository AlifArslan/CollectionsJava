
package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorPractices {
    public static void main(String[] args) {
        /*
        -- Comparable vs Comparator --
        Comparator Advantages :-
        1) we are able to performs sorting using more than one properties. we have customized sorting order
        2) bussiness logic is separated from the sorting logic
        3) Comparator  belong to java.util package
        4) It have two methods :
        i)compare method
        ii) equals method
        Comparable Limitations :- 
        1) at a time we are only able to perform sorting by using one property.
        2) we are mixing the bussiness logics and sorting logic together.
        //other differences 
        3) Comparable belong to java.lang package
        4) in contain one method that is compareTo(Object 0){..} method
         */ 


        
       ArrayList<Student> al = new ArrayList<>();
       al.add(new Student(333, "Noor"));
       al.add(new Student(444, "Kamal"));
       al.add(new Student(111, "Zaryab"));
       al.add(new Student(222, "Akbar"));
       
       
       //Sort by Student Id
       Collections.sort(al, new StudentIdComparator());
       
       
       //Sort by Student Name
       //Collections.sort(al, new StudentNameComparator());
       
       
       for(Student s : al)
       {
           System.out.println(s.sId+" --- "+s.sName);
       }
       
        
    }
}
