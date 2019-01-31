package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractices {

    public static void main(String[] args) {
        Employee e1 = new Employee("111", "FBR");
        Employee e2 = new Employee("222", "TCS");
        Employee e3 = new Employee("333", "GPS");
        Employee e4 = new Employee("444", "NTS");
        
        ArrayList<Employee> a1 = new ArrayList<>();
        a1.add(e1);
        a1.add(e2);
        a1.add(e3);
        a1.add(e4);
        
        //Iterator Cursor Normal Version
       
        Iterator itr = a1.iterator();
        while(itr.hasNext())
        {
            Employee e = (Employee) itr.next();
            //do some modifications
            if((e.eid).equals("444"))
            {
               e.ename="ZZZ"; 
               itr.remove(); //when we print data again next time that object is removed from arraylist
            }
            System.out.println(e.eid + " --- "+e.ename);
        }
        
        System.out.print("\n");
        for(Employee e : a1)
        {
           System.out.println(e.eid + " --- "+e.ename); 
        }
        
         System.out.println();
        //Iterator Cursor Generic Version
        Iterator<Employee> itr2 = a1.iterator();
        while(itr2.hasNext())
        {
            Employee e = itr2.next();
            System.out.println(e.eid + " --- "+e.ename);
        }
    }
}
