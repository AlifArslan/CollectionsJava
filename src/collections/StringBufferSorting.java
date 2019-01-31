package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class StringBufferSorting {

    public static void main(String[] args) {

        /* TreeSet by default stored data in ascending order but When we Put StringBuffer Data into TreeSet then 
         ClassCastException Occur. Beacuse String Buffer class does not implements the Comparable interface.. so 
         explicitly we need to perform sorting ..see how below
        
         */
        TreeSet t1 = new TreeSet(new ComparatorStringBuffer());
        t1.add(new StringBuffer("zara"));
        t1.add(new StringBuffer("paki"));
        t1.add(new StringBuffer("anaa"));
        t1.add(new StringBuffer("aana"));

        System.out.println(t1);

    }
}

/*
 class ComparatorStringBuffer implements Comparator<StringBuffer> {

        //Generic Version so type casting does not required
        @Override
        public int compare(StringBuffer sb1, StringBuffer sb2) {
            String s1 = sb1.toString();
            String s2 = sb2.toString();
            return s1.compareTo(s2);
        }

    }
*/

/*
Output :-
        [aana, anaa, paki, zara]
*/
