
package collections;

import java.util.Enumeration;
import java.util.Vector;


public class VectorPractices {
    public static void main(String[] args) {
        /*
        -->Vector class introduced in 1.0 version its also called legacy classes.
        -->The difference from other Collection Classes is Vector only the class that have Synchronized Methods.
        -->Vector have 4 contructors
        
        1) Constructor
            Vector v = new Vector(); //default constructor have default capacity : 10
        
            when items reached the default or user provided capacity then the capacity will become double by 
            default. if user provide the increment value then the user provided capacity is multipy with the increment
            value.
            
        2) Constructor
            Vector v = new Vector(int capacity); //user provide capacity
        
        3) Constructor
            Vector v = new Vector(int capacity, int incrementValue) // 10, 5
        
            when items reached the default or user provided capacity then the capacity will become double by 
            default. if user provide the increment value then the user provided capacity is multipy with the increment
            value.
            like here when reached the capacity then capacity * increment value e.g. 10 * 5.. then capacity increase to 50..
          
          4) Constructor
        
            Vector v = new Vector(Vector object); //add elements of other Vector by using this constructor or use method
               v.addAll(vector_object);
             
            -----------------------
            
        -->We can print/get the capacity by using the method capacity(); like
            v.capacity();
           
        -->For getting or printing the size of the Vector we have metod size();
               v.size():
        
        -->For Vector Retrieving the data all Curosrs are Applicable and also retrieve data using for loop
       
        */
        
        System.out.println("Vector Practices Normal Version");
        Vector v = new Vector();
        v.add("zzz");
        v.add("ttt");
        v.add("aaa");
        
        //print the Vector Capactiy and Size
        System.out.println("Capacity : "+v.capacity());
        System.out.println("Size : "+v.size());
        System.out.println("Vector elements : "+v);
        v.add("yyy");
        v.add(777);
        v.add(222);
        v.add(111);
        v.add("jjj");
        v.add(444);
        v.add(555);
        v.add(000);
        
        //print the Vector Capactiy and Size
        System.out.println("Capacity : "+v.capacity());
        System.out.println("Size : "+v.size());

        System.out.println("Vector elements : "+v);
        
        ////////////////////////////////////////////////////////////////////

         System.out.println("\n\nVector Practices Generic Version");
         Vector<Employee> v2 = new Vector<>();
         v2.add(new Employee("777", "Noor"));
         v2.add(new Employee("555", "Hamid"));
         v2.add(new Employee("999", "Ali"));
         v2.add(new Employee("111", "Zaryab"));
         
         
         //For Vector Retrieving the data all Curosrs are Applicable
         //enumeration Cursor Generic Version..
         Enumeration<Employee> enumerationCursor = v2.elements();
         while(enumerationCursor.hasMoreElements())
         {
             Employee e = enumerationCursor.nextElement();
             
             System.out.println(e.eid +" -- "+e.ename);
         }
         
         /* we can also use other cursors Iterator/ListIterator cursor or for loop for printing the data */
        
    }
    
    /*
    Output :- 
                Vector Practices Normal Version
                Capacity : 10
                Size : 3
                Vector elements : [zzz, ttt, aaa]
                Capacity : 20
                Size : 11
                Vector elements : [zzz, ttt, aaa, yyy, 777, 222, 111, jjj, 444, 555, 0]


                Vector Practices Generic Version
                777 -- Noor
                555 -- Hamid
                999 -- Ali
                111 -- Zaryab
    */
    
 
}
