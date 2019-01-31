
package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice_Two {
    public static void main(String[] args) {
        //insertion order is not preserved means data print randomly
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        
        System.out.println(hs);
        
        //LinkedHashSet Insertion Order is Preserved MEans in which order we write the data is printed in that same order.
        LinkedHashSet ls = new LinkedHashSet();
        ls.add(hs); //hashSet object is added as a single element check it
        ls.add(5);
        ls.add(15);
        ls.add(25);
        ls.add(35);
        ls.add(50);
        ls.add(60);
        
        System.out.println(ls);
        
        LinkedHashSet l3 = new LinkedHashSet();
        l3.addAll(hs); //the the items of HashSet are printed randomly even we add in LinkedHashSet. insertion order is not preserved.
        l3.addAll(ls); //insertion order is preserved
        
        System.out.println();
        
        System.out.println("Both Hash Set and LinkedHashSet\n Note HashSet elements insertion order "
                + "is Not Preserved Even Added in LinkedHashSet");
        
        System.out.println(l3);
    }
}

/*
Output :- 
        [50, 20, 40, 10, 30]
        [[50, 20, 40, 10, 30], 5, 15, 25, 35, 50, 60]

        Both Hash Set and LinkedHashSet
         Note HashSet elements insertion order is Not Preserved Even Added in LinkedHashSet
        [50, 20, 40, 10, 30, [50, 20, 40, 10, 30], 5, 15, 25, 35, 60]
*/