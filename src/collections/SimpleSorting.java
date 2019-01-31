package collections;

import java.util.*;

public class SimpleSorting {

    
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Kamal");
        al.add("Noor");
        al.add("Bilal");
        al.add("Zaryab");
        al.add("Arslan");
      
        
        System.out.println("Before Sorting : "+ al);
        
        /* Simple sorting using static method sort. Sort method only sort the String class data by default..&
        Data must be homogeneous.
        sort method only works when the class is implements the comparable interface. So by default 
        sort method only applicable for String data. Because String class implements the Comaparable interface.
        For user define class we must need to implement the comparable for performing sorting like Employee class data
        sorting etc.
                */
        Collections.sort(al);
        
        System.out.println("After Sorting : "+al);
        
        /*
        to perform sorting the data must be homogeneous and the class implements the comparable interface.
        */
    
    }
}
