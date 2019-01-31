
package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties_Login_Details {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        /* 
            --> For custom file if we place in project src folder or any where but src folder recommended location for placing
            properties file we can access it directly by using file name dot extension.. Must save properties file with dot
            properties extension. e.g. login.properties 

            -->In Properties before equal operator = the key value write and after the equal operator the value is consider as value of that perticular key.

            */
        
        //properties file we can store and Get only String data...
        //Read the properties file location...or put the properties file in the src folder and read location directly by giving file name
        FileInputStream fis = new FileInputStream("src\\collections\\login_details.properties");
        
        Properties p = new Properties();
        p.load(fis);
        
        //Get the data from the properties file
        //String uname = p.getProperty("username"); //OR
        String uname = p.getProperty("username", "default user name");
        String upswd = p.getProperty("password");
        
        
        //Use the data in the project
        System.out.println("User Name : "+uname);
        System.out.println("Password : "+ upswd);
        
    }
}
