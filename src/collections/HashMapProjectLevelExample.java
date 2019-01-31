
package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapProjectLevelExample {
    public static void main(String[] args) {
        
        //At project level how we can work just a little demo
        HashMap<Employee, Student> hm = new HashMap<>();
        hm.put(new Employee("111","Arslan"), new Student(111, "aaa"));
        hm.put(new Employee("222","Noor"), new Student(111, "nnn"));
        hm.put(new Employee("333","Kamal"), new Student(111, "kkk"));
        hm.put(new Employee("444","Zaryab"), new Student(111, "zzz"));
        
        Set entries = hm.entrySet();
        
        Iterator itr = entries.iterator();
        while(itr.hasNext())
        {
            Map.Entry entry = (Map.Entry) itr.next();
            
            //cast the entry to Employee class
            Employee e = (Employee) entry.getKey(); //get key bcz employee class use as Key
            System.out.println("Emp Id : "+e.eid+"  -- Emp Name : "+e.ename);
            
            //cast the entry to Student class
            Student s = (Student) entry.getValue(); //get Value bcz Student class use as Value
            System.out.println("Std Id : "+s.sId+"  -- Std Name : "+s.sName);
            
        }
    }
}
/*
Output :- 
            Emp Id : 111  -- Emp Name : Arslan
            Std Id : 111  -- Std Name : aaa
            Emp Id : 222  -- Emp Name : Noor
            Std Id : 111  -- Std Name : nnn
            Emp Id : 333  -- Emp Name : Kamal
            Std Id : 111  -- Std Name : kkk
            Emp Id : 444  -- Emp Name : Zaryab
            Std Id : 111  -- Std Name : zzz
*/