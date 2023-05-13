/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author momen
 */
public interface IMedicine {

    public String getMName(); 
    public void setMId(int MId);
    public void setPrice(int price); 
    public int getQuant();
    public void setMName(String MName);
    public int getMId();
    public int getPrice();
    public void setQuant(int quant);
    
}
