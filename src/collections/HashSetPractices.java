package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractices {

    public static void main(String[] args) {
        /* 
        Set :- HashSet implements / belongs the/to Set Interface.. Set Interface Does not allowed duplicate objects  But 
        List:-List Interface Allows duplicate Objects.
         1)HashSet Insertion order is not preserved
         2)Duplicate objects not allowed. 
         3)it have four Constructors
         4)Only Iterator Cursor is applicable for retreiving the objects from hashset/collection classes
         5)allows heterogeous data
         6)Introduce in 1.2 Version
         7)Underlaying data structure is hashtable
         8)Null Insertion allowed but only one time
         9) non-synchronized method
         */
        //Normal Version of Hashset
        System.out.println("Insertion Order is not preserved in HashSet");
        HashSet h1 = new HashSet(); //by default capacity 16, by default fill-ratio/load factor 0.75
        //HashSet h1 = new HashSet(int capacity);
        //HashSet h1 = new HashSet(int capacity, float fill-ration); //total fill ratio 0.0f to 1.0f
        //HashSet h2 = new HashSet(Collection<T>); // add another hashset or linked hashset
        h1.add("aaa");
        h1.add("bbb");
        h1.add(10);
        h1.add(10);
        h1.add(null);
        h1.add(null); //not allowed , it only insert one object only one time, Not Duplicates Objects
        h1.add("aaa"); //not allowed , it only insert one object only one time, Not Duplicates Objects
        h1.add(222);
        
        Iterator itr = h1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        //Generic Version
        //HashSet<Integer> h3 = new HashSet<>(h1); 
                        //OR
        HashSet<Integer> h3 = new HashSet<>(); 
        h3.addAll(h1);
        
        h3.add(10);
        h3.add(111);
        h3.add(222);
        h3.add(111);
        h3.add(444);
        h3.add(444);
        h3.add(555);
        
        System.out.println(); //just for add one line space
        Iterator itr3 = h3.iterator();
        while(itr3.hasNext())
        {
            System.out.println(itr3.next());
        }
    }
}
/*
Output :- 
Insertion Order is not preserved in HashSet
aaa
null
bbb
10
222

aaa
null
bbb
10
555
444
222
111
*/