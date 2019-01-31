
package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractices {
    public static void main(String[] args) 
    {
        
        /*
        --> Map itself Root Interface. Map stores the data in key value pair.  Key Value pair is know as Entry.
            Group of entries is called EntrySet.
        
        --> HashMap Insertion Order is Not Preserved. LinkedHashMap Insertion Order is Preserved.
        
        --> Cursors are not Applicable for Map Interface directly. But we can use cursor for retreiving data 
            indirectly. like First we get the entrySet of Map and EntrySet Return type is Set Interface and u know well
            Set Interface only one cursor is applicable that is the Universal Cursor also called Iterator Cursor.
            see below example how can use cursor for retrieving the data...
        
        --> Just like HashSet and LinkedHashSet HashMap and LinkedHashMap also have Four Four Constructors. 
            see below HashMap Constructors :- 
            1)HashMap h1 = new HashMap(); //by default capacity 16, by default fill-ratio/load factor 0.75
            2)HashMap h2 = new HashMap(int capacity);
            3)HashMap h3 = new HashMap(int capacity, float fill-ration); //total fill ratio 0.0f to 1.0f
            4)HashMap h4 = new HashMap(Collection<T>); // add another HashMap or LinkedHashMap
        
        --> Every key is unique in the Map.
        --> Keys Duplication does Not Allowed in Map, if the key duplicate it does not gives error but it stores the
            last key that same to the previous anyone. So In Map Insert the most last duplicate key. 
        
        
        --> Null Insertion allows. But as a key only one time means Every key is unique in the Map.
        
        --> For values duplication is allowed. does not matter how many values are same , just matter every key is unique
        or not if Not then it consider/insert the last one duplicate key.
        */
        
        //Insertion order is not preserved in HashMap, HashSet
        
        HashMap h1 = new HashMap ();
        h1.put(888, "Arslan");
        h1.put(222, "Kamran"); //that is replace by the last same key 
        h1.put(null, null);
       // h1.put(null, 5545); //previous null is replace with this latest null key
        h1.put(999, null);
        
        HashMap hm = new HashMap (h1);
        hm.put(111, "Arslan");
        hm.put(222, "Hamza"); //previous 222 key and value is replaced with this latest key and value
        hm.put(333, "Noor");
        //Print all entries
        System.out.println(hm);
        
        //For getting all the keys we have method keySet(); its return type is Set Interface
        Set keys = hm.keySet();
        System.out.println("\nAll Keys : "+ keys);
        /*
        for(Object s : keys)
        {
            System.out.println(s);
        }
        */
        
        
        //For getting all the values we have values method its return type is Collection Interface
        Collection values = hm.values();
        System.out.println("\nAll Values : "+values);
        
        
        System.out.println("\nApply Cursor on entries Set");
        /* For getting all the entries in the Map we have method entrySet(). Its return type is Set interface. entry 
        nothing but a key value pair. so group of entries called entry set. 
        
        Keep in mind directly on the map entries
        cursors does not applicable. So First we get entrySet and its return type is Set interface so we get Set Object
        means the referance Variable. And on Set only one cursor is applicable that is the iterator Cursor. 
        So indirectly we are applying the cursor on map for retrieving all the entires
        */
        Set entriesSet = hm.entrySet();
        
        Iterator itr = entriesSet.iterator();
        while(itr.hasNext())
        {
            //System.out.println(itr.next());
            //OR
            
            //getting keys and values
            
            Map.Entry entry = (Map.Entry) itr.next();
            
            System.out.println("Key : "+entry.getKey()+"   --  Value : "+entry.getValue());
            
        }
    }
}

/*
Output :- 
        {null=null, 888=Arslan, 333=Noor, 222=Hamza, 999=null, 111=Arslan}

        All Keys : [null, 888, 333, 222, 999, 111]

        All Values : [null, Arslan, Noor, Hamza, null, Arslan]

        Apply Cursor on entries Set
        Key : null   --  Value : null
        Key : 888   --  Value : Arslan
        Key : 333   --  Value : Noor
        Key : 222   --  Value : Hamza
        Key : 999   --  Value : null
        Key : 111   --  Value : Arslan
*/
