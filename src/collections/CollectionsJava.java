
package collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class CollectionsJava {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Common Point :  Every Collection class implements two interfaces by default.
        
        TreeMap t = new TreeMap();
        
        boolean isTrue = t instanceof Serializable;
        System.out.println("is TreeMap instanceof Serializeable = "+ isTrue);
        System.out.print("is TreeMap instanceof Cloneable = ");
        System.out.print(t instanceof Cloneable);
        
        System.out.println("\n"); //just for new line
                
        HashMap h = new HashMap();
        System.out.println("HashMap :-");
         System.out.println(h instanceof Serializable);    
         System.out.println(h instanceof Cloneable);  
        
         
         ArrayList al = new ArrayList();
          System.out.println("\nArrayList :-");
         System.out.println(al instanceof Serializable);    
         System.out.println(al instanceof Cloneable);  
        
        
        /*
             Employee e1 = new Employee("111", "Ars");
        
        //Object type arraylist when retreiving type casting must be required
        ArrayList a1 = new ArrayList();
        
        a1.add(e1);
        
        for(Object data : a1)
        {
            Employee e = (Employee) data;
            System.out.println(e.eid + " --- "+e.ename);
        }
        */
    }
}

/*
OutPut :- 
            is TreeMap instanceof Serializeable = true
            is TreeMap instanceof Cloneable = true

            HashMap :-
            true
            true

            ArrayList :-
            true
            true
*/