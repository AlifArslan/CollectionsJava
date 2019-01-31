
package collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapPractices {
    public static void main(String[] args) {
        
        /* 
        tree map also stores key value pair and store data in some sorted form...  
        tree map only sort data on key basis
        */
        
        TreeMap tm = new TreeMap(); //default constructor print data in ascending order 
        tm.put("yyy", "Bilal");
        tm.put("zzz", "zzz");
        tm.put("aaa", "Kamran");
        tm.put("ccc", "Arslan");
        tm.put("bbb", "Noor");
        
        tm.put("222", "pakistan");
        
        tm.put("333", "india");
        tm.put("111", "ameria");
        
        System.out.println("tm = "+tm); //by default sort data base on key or alpha-betical order
        
        System.out.println("tailMap : 222  = "+tm.tailMap("222"));
        System.out.println("head map : ccc = "+tm.headMap("ccc"));
        
        TreeMap tm2 = new TreeMap(tm); //we can pass other tree map object 
        //tm2.putAll(tm);
        tm2.put("000", "aaaaaaa");
        tm2.put("888", "fff");
        
        System.out.println("tm2  = t"+tm2);
        
        
        SortedMap sortedMap = tm2.headMap("333"); //headMap or tailMap return type is SortedMap
        
        TreeMap tm3 = new TreeMap(sortedMap); //we can also pass sorted map object in constructor
        
        System.out.println("tm3 = "+tm3);
        
        
    }
}

/*  OUTPUT :- 
tm = {111=ameria, 222=pakistan, 333=india, aaa=Kamran, bbb=Noor, ccc=Arslan, yyy=Bilal, zzz=zzz}
tailMap : 222  = {222=pakistan, 333=india, aaa=Kamran, bbb=Noor, ccc=Arslan, yyy=Bilal, zzz=zzz}
head map : ccc = {111=ameria, 222=pakistan, 333=india, aaa=Kamran, bbb=Noor}
tm2  = t{000=aaaaaaa, 111=ameria, 222=pakistan, 333=india, 888=fff, aaa=Kamran, bbb=Noor, ccc=Arslan, yyy=Bilal, zzz=zzz}
tm3 = {000=aaaaaaa, 111=ameria, 222=pakistan}
*/