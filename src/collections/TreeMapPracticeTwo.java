
package collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPracticeTwo {
    public static void main(String[] args) {
        
        /* Project level example 
        here Employee is our key. keep in mind tree map only sort data in tree map
        */
        
        //TreeMap<Employee, Student> tm = new TreeMap<>(new ENameComparator());
        TreeMap<Employee, Student> tm = new TreeMap<>(new EIdComparator());
        tm.put(new Employee("50", "bbb"), new Student(444, "zzz"));
        tm.put(new Employee("40", "eee"), new Student(222, "yyy"));
        tm.put(new Employee("30", "aaa"), new Student(777, "uuu"));
        tm.put(new Employee("20", "ccc"), new Student(333, "www"));
        
        //getting all keys by using keySet and keySet return type is Set interface
        Set<Employee> keys = tm.keySet();
        // Set<Employee> keys = tm.descendingKeySet(); it prints the keys in descending order
        System.out.println("All Keys of TreeMap tm :- ");
        System.out.println("Sort Data on base of key Employee Name :-");
        for(Employee key : keys)
        {
            System.out.println(key.eid + " : "+key.ename);
        }
        
        System.out.println("All Values of TreeMap tm");
        //for getting values we have values method its return type is Collection interface
        Collection values = tm.values();
        System.out.println("All Values : "+values);
        
        //OR
        
         Collection<Student> myValues = tm.values();
        for(Student value : myValues)
        {
            System.out.println("Student = "+value.sId+" : "+value.sName);
        }
        
        
        System.out.println("All Entries of TreeMap :- ");
        //For retrieving both keys and values we also have iterator approuch
        
        Set allEntries = tm.entrySet();
        
        Iterator itr = allEntries.iterator();
        while(itr.hasNext())
        {
            Map.Entry entry = (Map.Entry) itr.next();
            
            Employee e = (Employee)entry.getKey();
            
            Student s = (Student)entry.getValue();
            
            System.out.println("Key = "+e.eid+" : "+e.ename+"  &  Value = "+s.sId+ " : "+s.sName);
           
        }
    }
}

class ENameComparator implements Comparator<Employee>
{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.ename.compareTo(e2.ename);
    }
    
}

class EIdComparator implements Comparator<Employee>
{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.eid.compareTo(e2.eid);
    }
    
}

/*  OUTPUT :- 
All Keys of TreeMap tm :- 
Sort Data on base of key Employee Name :-
20 : ccc
30 : aaa
40 : eee
50 : bbb
All Values of TreeMap tm
All Values : [collections.Student@659e0bfd, collections.Student@2a139a55, collections.Student@15db9742, collections.Student@6d06d69c]
Student = 333 : www
Student = 777 : uuu
Student = 222 : yyy
Student = 444 : zzz
All Entries of TreeMap :- 
Key = 20 : ccc  &  Value = 333 : www
Key = 30 : aaa  &  Value = 777 : uuu
Key = 40 : eee  &  Value = 222 : yyy
Key = 50 : bbb  &  Value = 444 : zzz
*/