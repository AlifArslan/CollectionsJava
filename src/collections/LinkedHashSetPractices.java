package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractices {

    public static void main(String[] args) {
        /* 
         Set :- HashSet implements / belongs the/to Set Interface.. Set Interface Does not allowed duplicate objects  But 
         List:-List Interface Allows duplicate Objects.
         1)LinkedHashSet Insertion order is Preserved -- main difference From Hashset
         2)Duplicate objects not allowed. 
         3)it have four Constructors
         4)Only Iterator Cursor is applicable for retreiving the objects from hashset/collection classes
         5)allows heterogeous data
         6)Introduce in 1.2 Version
         7)Underlaying data structure is hashtable & Linked List -- Difference from HashSet
         8)Null Insertion allowed but only one time
         9) non-synchronized method
         */
        //Normal Version of Hashset
        System.out.println("Insertion Order is Preserved in LinkedHashSet and Duplicate Objects Not Allowed");

        LinkedHashSet l = new LinkedHashSet(); //by default capacity 16, by default fill-ratio/load factor 0.75
        //LinkedHashSet l = new LinkedHashSet(int capacity);
        //LinkedHashSet l2 = new LinkedHashSet(int capacity, float fill-ration); //total fill ratio 0.0f to 1.0f
        //LinkedHashSet l3 = new LinkedHashSet(Collection<T>); // add another hashset or linked hashset

        l.add(10);
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        
        for(Object o : l)
        {
            System.out.println(o);
        }
            //OR
       /*
         Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        */

        System.out.println("\n");
        HashSet h1 = new HashSet();
        h1.add("aaa");
        h1.add("ddd");
        h1.add(40);

        LinkedHashSet l2 = new LinkedHashSet(h1); //add hashset h1
        l2.addAll(l);

        l2.add("zzz");
        l2.add("yyyy");

        Iterator itr2 = l2.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        //Generic Version of LinkedHashSet
        System.out.println("\nGeneric Version");
        LinkedHashSet<Employee> l3 = new LinkedHashSet<>();

        l3.add(new Employee("111", "Kamal"));
        l3.add(new Employee("222", "Noor"));
        l3.add(new Employee("333", "Arslan"));
        l3.add(new Employee("444", "Hamid"));

        l3.addAll(l); //here we can also able to store any type of other LinkedHashSet or HashSet Object

        //Generic Version of Iterator
        Iterator<Employee> itr3 = l3.iterator();
        while (itr3.hasNext()) {
            Object o = itr3.next();
            if (o instanceof Employee) {
                Employee e = (Employee) o;
                System.out.println(e.eid + " --- " + e.ename);
            } else {
                System.out.println(o);
            }

            /*
             //OR If we have want just Employee data then directly we do this 
             //but we must comment this line  : l3.addAll(l);  // line number 68
             Employee e = itr3.next();
             System.out.println(e.eid+" --- "+e.ename);
             */
        }
    }
}
/*
Output :- 
Insertion Order is Preserved in LinkedHashSet and Duplicate Objects Not Allowed
10
20
30
40


aaa
ddd
40
10
20
30
zzz
yyyy

Generic Version
111 --- Kamal
222 --- Noor
333 --- Arslan
444 --- Hamid
10
20
30
40
*/