
package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparablePractice {
 
    public static void main(String[] args) {
        ArrayList<TeacherComparable> al = new ArrayList<>();
        al.add(new TeacherComparable(444, "Kamal"));
        al.add(new TeacherComparable(555, "Anwar"));
        al.add(new TeacherComparable(111, "Noor"));
        al.add(new TeacherComparable(333, "Akmal"));
        al.add(new TeacherComparable(222, "Sulman"));
        
        //  implements comparable and perform sorting
        /* 
                            -- Comparable vs Comparator --
        Comparable Limitations :- 
        1) at a time we are only able to perform sorting by using one property.
        2) we are mixing the bussiness logics and sorting logic together.
       
        //other differences 
        3) Comparable belong to java.lang package
        4) in contain one method that is compareTo(Object 0){..} method
        
        Comparator Advantages :- 
        1) we are able to performs sorting using more than one properties. we have customized sorting order
        2) bussiness logic is separated from the sorting logic
        
        3) Comparator  belong to java.util package
        4) It have two methods :
            i)compare method
            ii) equals method
        
        */
        
        Collections.sort(al);
        
        System.out.println("after sorting");
        
        for(TeacherComparable t : al)
        {
            System.out.println(t.tId+" --- "+t.tName);
        }   
    }
}
/*
OutPut : -
            after sorting
            111 --- Noor
            222 --- Sulman
            333 --- Akmal
            444 --- Kamal
            555 --- Anwar
*/
