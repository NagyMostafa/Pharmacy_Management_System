/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author N A G Y
 */
public class Medicine implements Serializable,IMedicine {
    
      private String MName;
      private int    MId;
      private int price;
      private int quant;

      
    private final String MedicineFileName = "Medicine.bin";
    FileManger FManger = new FileManger();
    public static ArrayList<Medicine> Medicines = new ArrayList<Medicine>();

    
    public Medicine(String MName, int MId, int price, int quant) {
        this.MName = MName;
        this.MId = MId;
        this.price = price;
        this.quant = quant;
    }

    public Medicine() {
    }

    @Override
    public String toString() {
        return "Medicine{" + "MName=" + MName + ", MId=" + MId + ", price=" + price + ", quant=" + quant + '}';
    }

    public String getMName() {
        return MName;
    }

    public void setMId(int MId) {
        this.MId = MId;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getQuant() {
        return quant;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public int getMId() {
        return MId;
    }

    public int getPrice() {
        return price;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
      
    public boolean addMedicine() {
        loadFromFile();
        Medicines.add(this);
        return commitToFile();
    }
    
    public boolean commitToFile() {
        return FManger.write(MedicineFileName, Medicines);
    }

    public void loadFromFile() {
        Medicines = (ArrayList<Medicine>) FManger.read(MedicineFileName);
    }

    private int getMedicineIndex(int id) {
        for (int i = 0; i < Medicines.size(); i++) {
            if (Medicines.get(i).getMId()== id) {
                return i;
            }
        }

        return -1;
    }

    public Medicine searchMedicineById(int id) {
        Medicine temp = new Medicine();
        loadFromFile();
        int index = getMedicineIndex(id);
        if (index != -1) {
            return Medicines.get(index);
        } else {
            return temp;
        }
    }

    public ArrayList<Medicine> listMedicine() {
        loadFromFile();
        return Medicines;
    }

    public boolean updateMedicine() {
        loadFromFile();
        int index = getMedicineIndex(this.getMId());

        if (index != -1) {
            Medicines.set(index, this);

            return commitToFile();
        }

        return false;
    }

    public boolean deleteMedicine(int id) {
        loadFromFile();
        int index = getMedicineIndex(id);

        if (index != -1) {
            Medicines.remove(index);

            return commitToFile();
        }

        return false;
    }
   
    
}