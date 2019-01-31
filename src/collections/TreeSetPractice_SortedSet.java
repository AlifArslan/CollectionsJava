
package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetPractice_SortedSet {
    public static void main(String[] args) {
        
       /*
            TreeSet Fourth Constructor
        SortedSet sortedObj= t3.headSet(30); //anyvalue from t3 treeSet.. head set means elements before 30
        SortedSet sortedObj= t3.tailSet(30); //anyvalue from t3 treeSet.. head set means elements after 30
        4) TreeSet t4 = new TreeSet(sortedObj); 
        */ 
        
        
        TreeSet t3 = new TreeSet();
        t3.add(99);
        t3.add(55);
        t3.add(99);
        t3.add(22);
        t3.add(77);
        t3.add(10);
        t3.add(100);
        
        System.out.println(t3);
        
        SortedSet sr1 = t3.tailSet(99); //  99 & elements after 99
        System.out.println("tailSet(99) : "+sr1);
        
        SortedSet sr2 = t3.headSet(99); // elements  before 99
        System.out.println("headSet(99) : "+sr2);
        
        SortedSet sr3 = t3.tailSet(22); // 22 & elements  after 99
        System.out.println("tailSet(22) : "+sr3);
        
        TreeSet t2 = new TreeSet(sr1);
        
        t2.addAll(sr2);
        
        t2.add(10);
        t2.add(100);
        
        System.out.println(t2);
        
    }
}
/*
Output :- 
        
    [10, 22, 55, 77, 99, 100]
    tailSet(99) : [99, 100]
    headSet(99) : [10, 22, 55, 77]
    tailSet(22) : [22, 55, 77, 99, 100]
    [10, 22, 55, 77, 99, 100]

*/
