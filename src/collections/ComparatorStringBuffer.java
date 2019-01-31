
package collections;

import java.util.Comparator;

 class ComparatorStringBuffer implements Comparator<StringBuffer> {

        //Generic Version so type casting does not required
        @Override
        public int compare(StringBuffer sb1, StringBuffer sb2) {
            String s1 = sb1.toString();
            String s2 = sb2.toString();
            return s1.compareTo(s2);
        }

    }