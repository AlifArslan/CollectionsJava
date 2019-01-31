
package collections;


public class TeacherComparable implements Comparable{
    //Generic Version of Comparable
    // implements Comparable<Teacher>
    /*
    public int compareTo(Teacher obj) {
    //dont require type casting... warning does not shown when generic version
    ...}
    
    Comparable disadvantages :-
    first at a time we are only able to perform sorting using one property only.
    secondly here we have teacher class , and it contains its own logics so here we are mixing the bussiness logics and
    sorting logic together..
    
    */
    int tId;
    String tName;

    public TeacherComparable(int tId, String tName) {
        this.tId = tId;
        this.tName = tName;
    }

    @Override
    public int compareTo(Object o) {
        /* here we required type casting because of Normal Version of Comparable   */
        TeacherComparable obj = (TeacherComparable) o; 
        
       /*
        //sort the data in descending order
         if(obj.tId == tId)
        {
            return 0;
        }
        else if(obj.tId > tId)
        {
            return 1;
        }else
        {
            return -1;
        }
        */
        
        /* sort the data in ascending order */
       /*
          if(tId == obj.tId)
        {
            return 0;
        }
        else if(tId > obj.tId)
        {
            return 1;
        }else
        {
            return -1;
        }
        */
        
        /* When we compare string data then here we use compareTo() method implementions os String class compareTo
        method so we dont need to return 0 o9r , 1 or -1... String class already overriding the compareTo method and
        gives implemenations for strings comparing...
      
        */
        
        // return tName.compareTo(obj.tName); //ascending order data is printing
        
        //return -tName.compareTo(obj.tName); //descending order data is sorted and printing. Just add minus sign 
         return obj.tName.compareTo(tName);  //tricky it also print data in descending order
        
    }
    
}
