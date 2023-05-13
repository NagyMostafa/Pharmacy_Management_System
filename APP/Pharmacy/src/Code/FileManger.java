/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Mina Youssif
 */
public class FileManger implements Serializable {
     public boolean write(String path,Object data){
            try (ObjectOutputStream writter = new ObjectOutputStream(new FileOutputStream(path))) {
                writter.writeObject(data);
                writter.close();
            return true; 
            }
            catch (IOException ex) {
            System.out.println("cant write \n");
        }
   
    return false;
    }
    
    public Object read(String path){
       
    Object Result = null;
    
        try {
            System.out.println("reading from "+path);
            
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(path));
       
            Result = reader.readObject();
           
           
        }
        
        catch (IOException x) {
             System.out.println("read has stopped"+x);
        }
        
        catch (ClassNotFoundException ex) {
            System.out.println("notfound \n");
        }
  
        return Result;
            
    } 
}