/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.panal;

import Code.Manager;
import Code.Medicine;

/**
 *
 * @author N A G Y
 */
public class AddMedicines extends javax.swing.JPanel {

    /**
     * Creates new form AddMedicines
     */
    public AddMedicines() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelname = new javax.swing.JLabel();
        jLabelid = new javax.swing.JLabel();
        jLabelprice = new javax.swing.JLabel();
        jLabelquant = new javax.swing.JLabel();
        jTextFieldname = new javax.swing.JTextField();
        jTextFieldid = new javax.swing.JTextField();
        jTextFieldprice = new javax.swing.JTextField();
        jTextFieldquant = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabeladd = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabelname.setText("Name");

        jLabelid.setText("ID");

        jLabelprice.setText("Price");

        jLabelquant.setText("Quantity");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabeladd.setText("Add New Medicine ...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabeladd, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelname)
                            .addComponent(jLabelprice)
                            .addComponent(jLabelid)
                            .addComponent(jLabelquant))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldname)
                                .addComponent(jTextFieldid)
                                .addComponent(jTextFieldprice)
                                .addComponent(jTextFieldquant, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabeladd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelname)
                    .addComponent(jTextFieldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelid)
                    .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelprice)
                    .addComponent(jTextFieldprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelquant)
                    .addComponent(jTextFieldquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jTextFieldname.getText().equals("") && !jTextFieldid.getText().equals("") && !jTextFieldprice.getText().equals("") && !jTextFieldquant.getText().equals("")) {

            Medicine x = new Medicine();
            x.setMId(Integer.parseInt(jTextFieldid.getText()));
            x.setMName(jTextFieldname.getText());
            x.setPrice(Integer.parseInt(jTextFieldprice.getText()));
            x.setQuant(Integer.parseInt(jTextFieldquant.getText()));
     
            if (x.addMedicine()){
                   jLabeladd.setForeground(java.awt.Color.red);
                   jLabeladd.setText("Added Successfully ... ");
            resetPanelData();
            }else{
                  jLabeladd.setForeground(java.awt.Color.red);
                  jLabeladd.setText("Failed to insert ... ");}
            }
        else{
        jLabeladd.setForeground(java.awt.Color.red);
        jLabeladd.setText("Missing required Fields ...   Please, complete them before submit ...");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
protected void resetPanelData(){

        jTextFieldname.setText("");
        jTextFieldid.setText("");
        jTextFieldprice.setText("");
        jTextFieldquant.setText("");
}
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabeladd;
    private javax.swing.JLabel jLabelid;
    private javax.swing.JLabel jLabelname;
    private javax.swing.JLabel jLabelprice;
    private javax.swing.JLabel jLabelquant;
    private javax.swing.JTextField jTextFieldid;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JTextField jTextFieldprice;
    private javax.swing.JTextField jTextFieldquant;
    // End of variables declaration//GEN-END:variables
}