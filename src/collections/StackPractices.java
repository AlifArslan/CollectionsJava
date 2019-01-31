
package collections;

import java.util.Stack;

public class StackPractices {
    
    public static void main(String[] args) {
        /*
        -->Stack parent class is or extends Vector class. 
            So Stack also have Synchronized methods.

        -->Stack data retrieval order is LIFO (Last in First Out).
    */
        
        Stack stack = new Stack();
        
        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");
        stack.push("ddd");
        System.out.println("Stack elemets : "+stack);
        System.out.println("");
        System.out.println("Stack Size : "+stack.size());
        System.out.println("Is Stack Empty : "+stack.isEmpty());
        
        //Index elements Bottom to Top
        System.out.println("Seached Element ccc its Index(Bottom to Top): "+stack.search("ccc"));
        
        //Last inserted Element is the Peek Element
        System.out.println("Peek element (Last inserted Element) : "+stack.peek());
        
        System.out.println("\nPrint Stack elements Using Foreach Loop :-");
        for(Object o : stack)
        {
            System.out.println(o);
        }
        
        //pop method deleted the one element that is the last inserted
        stack.pop();
        System.out.println("\nAfter Pop means Remove one Element from Stack : "+stack);
        
        stack.clear(); //deleted all elemets of stack or clear the stack
        System.out.println("After clear stack : "+stack);
    }
}

/*
    Stack Size : 4
    Is Stack Empty : false
    Seached Element ccc its Index(Bottom to Top): 2
    Peek element (Last inserted Element) : ddd

    Print Stack elements Using Foreach Loop :-
    aaa
    bbb
    ccc
    ddd

    After Pop means Remove one Element from Stack : [aaa, bbb, ccc]
    After clear stack : []
*/
