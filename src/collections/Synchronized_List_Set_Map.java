
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Synchronized_List_Set_Map {
   
    public static void main(String[] args) {
        
        /*
        Synchronized means Thread Safe. Only one Thread is able to access.
        By default all List Classes, Map classes, Set Classes means All collections classes have non-sychronied 
        methods except Vector class methods. Vector class methods are synchronized.
        
        To make classes methods Synchronized we have method 
        1)  For List classes ArrayList & LinkedList
        we have method synchronizedList(List type class object):  its return type is List interface
            -->public static java.util.List<T> synchronizedList(java.util.List<T>);
        Demo Examples :-
            1)
                ArrayList aa = new ArrayList();
                Lisr list = Collections.synchronizedList(aa);

            2)  
                LinkedList ll = new LinkedList();
                Lisr list = Collections.synchronizedList(ll);
------------------------------------------------------------------------------------
        
        2)  For Set classes HashSet & LinkedHashSet
        we have method synchronizedSet(Set type class object):  its return type is Set interface 
            -->public static java.util.Sett<T> synchronizedSet(java.util.Set<T>);
        Demo Examples :-
            1)
                HashSet hs = new HashSet();
                Set s = Collections.synchronizedSet(hs);

            2)  
                LinkedHashSet ls = new LinkedHashSet();
                Set s = Collections.synchronizedSet(ls);
-------------------------------------------------------------------------------------
        
        3)  For Map classes HashMap & LinkedHashMap
        we have method synchronizedMap(Map type class object):  its return type is Map interface 
            -->public static java.util.Map<T> synchronizedList(java.util.Map<T>);
        Demo Examples :-
        1) 
            HashMap hm = new HashMap();
            Map m = Collections.synchronizedMap(hm);
        2)
            LinkedHashMap lm = new LinkedHashMap();
            Map m = Collections.synchronizedMap(lm);
----------------------------------------------------------------------------------------       
        4) For Tree Set
        we have method synchronizedSortedSet(TreeSet obj):  its return type is SortedSett interface 
        
            -->public static java.util.SortedSett<T> synchronizedSortedSet(java.util.SortedSett<T>)
        
        Demo Example :-
        TreeSet ts = new TreeSet();
        SortedSet ss = Collections.synchronizedSortedSet(ts);
------------------------------------------------------------------------------------------       
        5) For TreeMap
        we have method synchronizedSortedMap(TreeMap obj):  its return type is SortedMap interface 
            -->public static java.util.SortedMap<T> synchronizedSortedMap(java.util.SortedMap<T>);
        
        Demo Example :-
        TreeMap tm = new TreeMap();
        SortedMap sm = Collections.synchronizedSortedMap(tm);
-----------------------------------------------------------------------------------------
        */
        
        //ArrayList Example Practically
        Employee e1 = new Employee("111", "FBR");
        Employee e2 = new Employee("222", "TCS");
        Employee e3 = new Employee("333", "GPS");
        
        Employee e4 = new Employee("444", "NTS");
        
         //Object type arraylist when retreiving type casting must be required
        ArrayList arrayList = new ArrayList(); //non-synchronized
        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);
        
        
        //make the arrayList methods are synchronized Version
        List sList = Collections.synchronizedList(arrayList);
        
        System.out.println("ArrayList Synchronized Version ");
        
        for(Object o : sList)
        {
            Employee e = (Employee) o;
            System.out.println(e.eid+" -- "+e.ename);
        }   
    }
}

/*
Output :- 
ArrayList Synchronized Version 
111 -- FBR
222 -- TCS
333 -- GPS
444 -- NTS
*/
