
package collections;

import java.util.ArrayList;


public class ArrayListPractices {
    public static void main(String[] args) {
        Employee e1 = new Employee("111", "FBR");
        Employee e2 = new Employee("222", "TCS");
        Employee e3 = new Employee("333", "GPS");
        
        Employee e4 = new Employee("444", "NTS");
        
         //Object type arraylist when retreiving type casting must be required
        ArrayList a1 = new ArrayList();
       
        a1.add(e1);
        
        a1.add("UBL");
        a1.add("HBL");
        
        a1.add(10);
        
        
        
        for(Object data : a1)
        {
            if(data instanceof Employee)
            {
                Employee e = (Employee) data;
                System.out.println(e.eid + " --- "+e.ename);
            }
            
             if(data instanceof String)
             {
                 System.out.println("String Data : "+data);
             }
             
             if(data instanceof Integer)
             {
                 
                 System.out.println("Ineger Data : "+data);
             }
             
        }
        
        
     /*'
           ArrayList<Employee> a1 = new ArrayList();
        
        a1.add(e1);
        a1.add(e2);
        a1.add(e3);
        
        ArrayList<Employee> a2 = new ArrayList(a1);
        //OR 
        //ArrayList<Employee> a2 = new ArrayList();
        //a2.addAll(a1);
        
        a2.add(e4);
        
        for(Employee e : a2)
        {
            System.out.println(e.eid + " --- "+e.ename);
        }
        */
        
    }
}
