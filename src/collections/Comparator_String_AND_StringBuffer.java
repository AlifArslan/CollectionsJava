
package collections;

import java.util.Comparator;


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
