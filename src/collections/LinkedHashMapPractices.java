
package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapPractices {
    public static void main(String[] args) {
        
        /*
        --> Map itself Root Interface. Map stores the data in key value pair.  Key Value pair is know as Entry.
        --> HashMap Insertion Order is Not Preserved. LinkedHashMap Insertion Order is Preserved.
        --> Cursors are not Applicable for Map Interface directly. But we can use cursor for retreiving data 
            indirectly. like First we get the entrySet of Map and EntrySet Return type is Set Interface and u know well
            Set Interface only one cursor is applicable that is the Universal Cursor also called Iterator Cursor.
            see below example how can use cursor for retrieving the data...
        
        --> Just like HashSet and LinkedHashSet HashMap and LinkedHashMap also have Four Four Constructors. 
            see below
            1)LinkedHashMap l1 = new LinkedHashMap(); //by default capacity 16, by default fill-ratio/load factor 0.75
            2)LinkedHashMap l2 = new LinkedHashMap(int capacity);
            3)LinkedHashMap l3 = new LinkedHashMap(int capacity, float fill-ration); //total fill ratio 0.0f to 1.0f
            4)LinkedHashMap l4 = new LinkedHashMap(Collection<T>); // add another HashMap or LinkedHashMap
        */
        
        //HashMap insertion Order is Not Preserved
        HashMap hm = new HashMap();
        hm.put(888, "Arslan");
        hm.put(666, 666);
        
        //Linked HashMap Insertion Order is Preserved
        LinkedHashMap l =  new LinkedHashMap(hm); //HashMap insertion order is not preserved even we added in LinkedHashMap
        //OR
       // l.putAll(hm);
        l.put(111, "Arslan");
        l.put(222, "Hamza");
        l.put(333, "null");
        l.put(null, "null");
        l.put(444, "Hamza");
        
        System.out.println(" All Entries Of LinkedHashMap =  "+l);
        
       
        //For getting all the keys we have method keySet(); its return type is Set Interface
        Set keys = l.keySet();
        System.out.println("\nAll Keys : "+ keys);
        
        //For getting all the values we have values method its return type is Collection Interface
        Collection values = l.values();
        System.out.println("\nAll Values : "+values);
        
        
        System.out.println("\nApply Cursor on LinkedHashMap :- ");
         /* For getting all the entries in the Map we have method entrySet(). Its return type is Set interface. entry 
        nothing but a key value pair. so group of entries called entry set. 
        
        Keep in mind directly on the map entries
        cursors does not applicable. So First we get entrySet and its return type is Set interface so we get Set Object
        means the referance Variable. And on Set only one cursor is applicable that is the iterator Cursor. 
        So indirectly we are applying the cursor on map for retrieving all the entires
        */
        
        Set entries = l.entrySet();
        
        Iterator itr = entries.iterator();
        while(itr.hasNext())
        {
            //System.out.println(itr.next());
            
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("Key : "+entry.getKey() + " -- Value : "+entry.getValue());
        }
        
    }
}
/*
Output :- 
    All Entries Of LinkedHashMap =  {888=Arslan, 666=666, 111=Arslan, 222=Hamza, 333=null, null=null, 444=Hamza}

    All Keys : [888, 666, 111, 222, 333, null, 444]

    All Values : [Arslan, 666, Arslan, Hamza, null, null, Hamza]

   Apply Cursor on LinkedHashMap :- 
   Key : 888 -- Value : Arslan
   Key : 666 -- Value : 666
   Key : 111 -- Value : Arslan
   Key : 222 -- Value : Hamza
   Key : 333 -- Value : null
   Key : null -- Value : null
   Key : 444 -- Value : Hamza
*/