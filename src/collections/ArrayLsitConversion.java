
package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLsitConversion {
    
    public static void main(String[] args) {
        
        //Conversion of Array to Collection
        String[] strArray = {"aaa", "bbb", "ccc"};
        
        ArrayList<String> al = new ArrayList<>(Arrays.asList(strArray));
        al.add("Arslan");
        al.add("Asif");
        al.add("Ali");
        
        System.out.println(al);
        
        System.out.println("");
        
        //generic version conversion when we know exactly which type of data
        String[] str = new String[al.size()];
        al.toArray(str);
        for(String data : str)
        {
            System.out.println(data);
        }
        
        
        System.out.println("");
        //Normal version conversion when we dont know which type of data stored in arraylist
        ArrayList a2 = new ArrayList();
        a2.add(1111);
        a2.add("Arslan");
        a2.add(true);
        a2.add(10.99);
        
        Object[] objArray = a2.toArray();
        for(Object o : objArray)
        {
            System.out.println(o);
        } 
    }
    
}
