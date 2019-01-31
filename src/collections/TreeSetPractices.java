
package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractices {
    public static void main(String[] args) {
        /*
        TreeSet implementing the SortedSet Interface so it stores the data in some sorted order by default it stores the
        data in ascending order internally using compareTo(..) method.
        
        1) All Collections Classes allows heterogenous data But TreeSet and TreeMap Deos Not Allows Heterogeous Data.
        TreeSet Allows only Homogeneous Data.
        
        1) When we insert like String Data, and we also insert some integer data , then ClassCast Exceoption Occur because
        String data is not comparable with the Integer data. Only Allows Homogeneous data.
        
        2)If we have already stores Some other Data in treeSet and then we also insert the null value in treeSet then 
        NULL Pointer Exception Occur. Because string data / integer data is not comaparable with NULL .
        
        3) When we have only null inserted into the TreeSet then Exception Does Not Occur.
        
        4) TreeSet Have Four Constructors .
            1) TreeSet t1 = new TreeSet(); // by default it sort data in ascending order 
            2) For performs customization sorting then we pass Comparator object into Contructor
                TreeSet t2 = new TreeSet(new EmpNameComparator());
        
            3) TreeSet t3 = new TreeSet(t2); //add another treeSet Object
        
            SortedSet sortedObj= t3.headSet(30); //anyvalue from t3 treeSet.. head set means two values before 30
            SortedSet sortedObj= t3.tailSet(30); //anyvalue from t3 treeSet.. head set means two values after 30
            4) TreeSet t4 = new TreeSet(sortedObj); 
        
        
        */
        System.out.println("Normal Version");
        TreeSet t1 = new TreeSet(); //it print data in ascendting order
        t1.add("ratan");
        t1.add("durga");
        t1.add("patwari");
        t1.add("yahama");
        //t1.add(100); //it generates Class Cast Exception bcz String is not comparable with Integer 
        t1.add("anu");
        //t1.add(null); //it generates NULL Pointer Exception string is not comparable with null
        
       //Retrieve data using foreach loop
        for(Object s : t1)
        {
            System.out.println(s);
        }
        
        //OR
        
       /*
         //Iterator itr1 = t1.iterator(); //by default print data in ascending order;
                //OR
        Iterator itr1 = t1.descendingIterator(); //print data in descending order
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
        */
        
        
        System.out.println("\nGeneric Version");
        //TreeSet<Student> t2 = new TreeSet<>(); //here we must use Comparator object for sorting else we get Excetion
        //Exception in thread "main" java.lang.ClassCastException: collections.Student cannot be cast to java.lang.Comparable
        //So provide Comparator object for Generic Version of TreeSet
        //TreeSet<Student> t2 = new TreeSet<>(new StudentNameComparator());  //OR Sort by Student ID
        TreeSet<Student> t2 = new TreeSet<>(new StudentIdComparator()); 
        t2.add(new Student(111, "Rashid"));
        t2.add(new Student(222, "Arslan"));
        t2.add(new Student(333, "Tariq"));
        t2.add(new Student(444, "Daniyal"));
        
        for(Student s : t2)
        {
            System.out.println(s.sId+" --- "+s.sName);
        }
        
        System.out.println("\nGeneric Version");
        TreeSet<Integer> t3 = new TreeSet();
        t3.add(99);
        t3.add(55);
        t3.add(99);
        t3.add(22);
        t3.add(77);
        
        Iterator itr3 = t3.iterator(); //by default print data in ascending order;
                //OR
        //Iterator itr3 = t3.descendingIterator(); //print data in descending order
        while(itr3.hasNext())
        {
            System.out.println(itr3.next());
        }
        
        System.out.println("\nTreeSet Generic Version (Integer  Type)");
        //TreeSet<Integer> t4 = new TreeSet(t3); //add other treeSet object
            //OR
        TreeSet<Integer> t4 = new TreeSet();
        t4.addAll(t3);
        t4.add(33);
        t4.add(11);
        t4.add(1);
        
        for(Integer i : t4)
        {
            System.out.println(i);
        }
             
        
    }
}
/*
Output :- 
Normal Version
anu
durga
patwari
ratan
yahama

Generic Version
111 --- Rashid
222 --- Arslan
333 --- Tariq
444 --- Daniyal

Generic Version
22
55
77
99

TreeSet Generic Version (Integer  Type)
1
11
22
33
55
77
99

*/