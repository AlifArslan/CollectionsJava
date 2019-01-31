
package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorPractices {
    public static void main(String[] args) {
        Employee e1 = new Employee("111", "FBR");
        Employee e2 = new Employee("222", "TCS");
        Employee e3 = new Employee("333", "GPS");
        Employee e4 = new Employee("444", "NTS");
        Employee e5 = new Employee("555", "ZAZ");
        Employee e6 = new Employee("666", "TAB");
        
        ArrayList<Employee> a1 = new ArrayList<>();
        a1.add(e1);
        a1.add(e2);
        a1.add(e3);
        a1.add(e4);
        
        //List Iterator Generic Versio Normal Version
        ListIterator<Employee> listItr = a1.listIterator();
        listItr.add(e6); //added at the 0 index, 
        while(listItr.hasNext())
        {   
            Employee e = listItr.next(); 
            
            
            if(e.eid.equals("333"))
            {
                listItr.set(e5); //replace object
            }
            
            if(e.eid.equals("444"))
            {
                listItr.remove(); //remove object
            }

            System.out.println(e.eid + " --- "+e.ename); 

        }
        
        System.out.println("\nAfter Modificaitons print data :- ");
        for(Employee e : a1)
        {
            System.out.println(e.eid + " --- "+e.ename); 
        }
        
        /* for printing from last to first, we must need to first iterate till last item position otherwise cursor is created
        before the first iten so before using hasPrevious() first must iterate with the hasNext().. check ratan tutorials
        */System.out.println("\nPrint data from last to First");
        while(listItr.hasPrevious())
        {
            Employee e = listItr.previous();
            System.out.println(e.eid + " --- "+e.ename); 
        }     
    }
}
