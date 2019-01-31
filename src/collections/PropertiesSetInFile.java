
package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesSetInFile {
    public static void main(String[] args) {
        Properties p = new Properties();
        try
        {
            //set the property value And properties file we can store only String data...
            p.setProperty("username", "Asif Mushtaq");
            p.setProperty("password", "fdferferfre");
            
            //save properties to project root folder
           // p.store(new FileOutputStream("default.properties.properties"), null);
            
            //OR Custom file 
            
            p.store(new FileOutputStream("src\\collections\\set_login_details.properties"), null);
            
         ///////////////////////////////////////////////////////////////////   
        //Getting the properties
       
        FileInputStream fis = new FileInputStream("src\\collections\\set_login_details.properties");
        Properties prop = new Properties();
        prop.load(fis);
        
        //Get the data from the properties file
        //String uname = prop.getProperty("username"); //OR
        String uname = prop.getProperty("username", "default user name");
        String upswd = prop.getProperty("password");
        
        
        //Use the data in the project
        System.out.println("User Name : "+uname);
        System.out.println("Password : "+ upswd);
            
            
        }catch(Exception e)
        {
            
        }
    }
}

/*
Output :- 
            User Name : Asif Mushtaq
            Password : fdferferfre
*/