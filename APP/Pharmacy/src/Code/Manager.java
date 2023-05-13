/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Momen 
 */
public class Manager implements Serializable{
    
    
    private int aid;
    private String UserName;
    private String password;

        private final String StoreFileName = "Store.bin";
    public static ArrayList<Store> Stores = new ArrayList<Store>();
    FileManger FManger = new FileManger();
    
    public Manager() {
    }

    public Manager(int aid, String UserName, String password) {
        this.aid = aid;
        this.UserName = UserName;
        this.password = password;
    }

    public int getAid() {
        return aid;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Manager{" + "aid=" + aid + ", UserName=" + UserName + ", password=" + password + '}';
    }

        public boolean login(String UserName, String Password) {
        if (UserName.equals("Admin") && Password.equals("0000")) 
        {
            return true;
        }
        else if (UserName.equals("admin") && Password.equals("0000")) 
        {
            return true;
        }
        return false;
}
        
           public void Alarm(int quant,String name){
        
        if(quant < 6 && quant >= 0){
          JOptionPane.showMessageDialog(null," (((  "+ name  +" ))) That Will Soon Be Over        ","Alert",JOptionPane.WARNING_MESSAGE);
}
}  

    public boolean commitToFile() {
        return FManger.write(StoreFileName, Stores);
    }

    public void loadFromFile() {
        Stores = (ArrayList<Store>) FManger.read(StoreFileName);
    }

    public boolean MakeReport() {
        loadFromFile();
        //Stores.add(this);
        return commitToFile();    }

        
}




