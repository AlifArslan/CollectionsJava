package collections;

import java.util.TreeSet;
import java.util.Comparator;
public class TreeSet_String_StringBuffer_Both_Sorting {

    public static void main(String[] args) {
        
        /*
        Here we have both String and StringBuffer Data so Explicitly need to perform sorting , if we dont do then
        we get ClassCastException.
        */
        
        TreeSet t1 = new TreeSet(new Comparator_String_AND_StringBuffer());

        t1.add("vvv");

        t1.add(new StringBuffer("zara"));
        t1.add(new StringBuffer("paki"));
        t1.add(new StringBuffer("anaa"));
        t1.add(new StringBuffer("aana"));

        t1.add("sss");
        t1.add("nnn");

        System.out.println(t1);
    }
}

/*

class Comparator_String_AND_StringBuffer implements Comparator {
        
        @Override
        public int compare(Object o1, Object o2) {
            String s1 =  o1.toString();
            //String s2 = (String) o2; //dont type cast if u want string object then entire java toString method use. 
            // because here to also get string buffer object for sorting so thats why toString() method is use.
            String s2 = o2.toString();
            return s1.compareTo(s2);
        }

    }
*/

/*
Output :- 
        [aana, anaa, nnn, paki, sss, vvv, zara]
*/
