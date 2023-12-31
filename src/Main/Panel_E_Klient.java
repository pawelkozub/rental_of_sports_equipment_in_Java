/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pavel
 */
public class Panel_E_Klient extends javax.swing.JPanel {
    String IDD;// = DataContainer.ID;
    
//    String IDD = String.valueOf(ID);
    
    public Panel ParentFrame;
    public Panel_E_Klient() {
        IDD = DataContainer.ID_K;
        //System.out.println("Po: "+IDD);
        initComponents();
        Baza();
        Clear();
    }
    
    public void Clear(){
        L_S_imie.setVisible(false);
        L_S_nazwisko.setVisible(false);
        L_S_ulica.setVisible(false);
        L_S_nr.setVisible(false);
        L_S_kod.setVisible(false);
        L_S_miasto.setVisible(false);
        
    }
    
    public void Baza(){
        try{
            Mysql sql = new Mysql();
            String baza[] = new String[sql.Tabel_col("klient")];
            baza =  sql.Client_Search(IDD);
            EE_imie.setText(baza[1]);
            EE_nazwisko.setText(baza[2]);
            EE_ulica.setText(baza[3]);
            EE_nr.setText(baza[4]);
            EE_kod.setText(baza[5]);
            EE_miasto.setText(baza[6]);
            
        } catch (SQLException ex) {
            Logger.getLogger(Panel_S_Mag.class.getName()).log(Level.SEVERE, null, ex);
            Plik p = new Plik();
            try {
                p.zapisPliku(ex.toString());
            } catch (IOException ex1) {
                Logger.getLogger(Panel_E_Klient.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_imie1 = new javax.swing.JLabel();
        L_nazwisko1 = new javax.swing.JLabel();
        L_ulica1 = new javax.swing.JLabel();
        L_nr1 = new javax.swing.JLabel();
        L_kod1 = new javax.swing.JLabel();
        L_miasto1 = new javax.swing.JLabel();
        EE_imie = new javax.swing.JTextField();
        EE_nazwisko = new javax.swing.JTextField();
        EE_ulica = new javax.swing.JTextField();
        EE_nr = new javax.swing.JTextField();
        EE_kod = new javax.swing.JTextField();
        EE_miasto = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        L_S_imie = new javax.swing.JLabel();
        L_S_nazwisko = new javax.swing.JLabel();
        L_S_ulica = new javax.swing.JLabel();
        L_S_nr = new javax.swing.JLabel();
        L_S_kod = new javax.swing.JLabel();
        L_S_miasto = new javax.swing.JLabel();

        L_imie1.setText("Imię:");

        L_nazwisko1.setText("Nazwisko:");

        L_ulica1.setText("Ulica:");

        L_nr1.setText("Nr:");

        L_kod1.setText("Kod:");

        L_miasto1.setText("Miasto:");

        EE_imie.setText("      ");
        EE_imie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EE_imieActionPerformed(evt);
            }
        });

        EE_nazwisko.setText("      ");
        EE_nazwisko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EE_nazwiskoActionPerformed(evt);
            }
        });

        EE_ulica.setText("      ");

        EE_nr.setText("      ");

        EE_kod.setText("      ");

        EE_miasto.setText("      ");

        Save.setText("Zapisz");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Quit.setText("Anuluj");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });

        L_S_imie.setForeground(new java.awt.Color(255, 0, 51));
        L_S_imie.setText("Brakuje pola!!");

        L_S_nazwisko.setForeground(new java.awt.Color(255, 0, 51));
        L_S_nazwisko.setText("Brakuje pola!!");

        L_S_ulica.setForeground(new java.awt.Color(255, 0, 51));
        L_S_ulica.setText("Brakuje pola!!");

        L_S_nr.setForeground(new java.awt.Color(255, 0, 51));
        L_S_nr.setText("Brakuje pola!!");

        L_S_kod.setForeground(new java.awt.Color(255, 0, 51));
        L_S_kod.setText("Brakuje pola!!");

        L_S_miasto.setForeground(new java.awt.Color(255, 0, 51));
        L_S_miasto.setText("Brakuje pola!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(EE_nr, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_S_nr))
                    .addComponent(L_imie1)
                    .addComponent(L_nazwisko1)
                    .addComponent(L_kod1)
                    .addComponent(L_ulica1)
                    .addComponent(L_miasto1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Quit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_nr1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EE_miasto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(EE_imie, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(EE_nazwisko)
                                        .addComponent(EE_ulica)
                                        .addComponent(EE_kod)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_S_imie)
                            .addComponent(L_S_nazwisko)
                            .addComponent(L_S_ulica)
                            .addComponent(L_S_kod)
                            .addComponent(L_S_miasto))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_imie1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EE_imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_S_imie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_nazwisko1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EE_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_S_nazwisko))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_ulica1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EE_ulica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_S_ulica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_nr1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EE_nr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_S_nr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_kod1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EE_kod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_S_kod))
                .addGap(3, 3, 3)
                .addComponent(L_miasto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EE_miasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_S_miasto))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Quit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EE_imieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EE_imieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EE_imieActionPerformed

    private void EE_nazwiskoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EE_nazwiskoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EE_nazwiskoActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        int n = 6;
        int sum = 0;
        int spr[] = new int[n];
        if(!EE_imie.getText().equals("")){
            spr[0] = 1;
            L_S_imie.setVisible(false);
        }else{
            spr[0] = 0;
            L_S_imie.setVisible(true);
        }
        
        if(!EE_nazwisko.getText().equals("")){
            spr[1] = 1;
            L_S_nazwisko.setVisible(false);
        }else{
            spr[1] = 0;
            L_S_nazwisko.setVisible(true);
        }
        
        if(!EE_ulica.getText().equals("")){
            spr[2] = 1;
            L_S_nazwisko.setVisible(false);
        }else{
            spr[2] = 0;
            L_S_nazwisko.setVisible(true);
        }
        
        if(!EE_nr.getText().equals("")){
            spr[3] = 1;
            L_S_nr.setVisible(false);
        }else{
            spr[3] = 0;
            L_S_nr.setVisible(true);
        }
        
        if(!EE_kod.getText().equals("")){
            spr[4] = 1;
            L_S_kod.setVisible(false);
        }else{
            spr[4] = 0;
            L_S_kod.setVisible(true);
        }
        
        if(!EE_miasto.getText().equals("")){
            spr[5] = 1;
            L_S_miasto.setVisible(false);
        }else{
            spr[5] = 0;
            L_S_miasto.setVisible(true);
        }
        
        for(int i=0;i<n;i++){
            sum+=spr[i];
        }
        if(sum == n){
            Save_Baza(EE_imie.getText(), EE_nazwisko.getText(), EE_ulica.getText(), EE_nr.getText(), EE_kod.getText(), EE_miasto.getText());
            
            ParentFrame.Opened_S_Klient();
        }
    }//GEN-LAST:event_SaveActionPerformed
  
    public void Save_Baza(String imie, String nazwisko, String ul, String nr, String kod, String miasto){
        try {
            Mysql sql = new Mysql();
            sql.Client_Edit(imie, nazwisko, ul, nr, kod, miasto, IDD);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_E_Klient.class.getName()).log(Level.SEVERE, null, ex);
            Plik p = new Plik();
            try {
                p.zapisPliku(ex.toString());
            } catch (IOException ex1) {
                Logger.getLogger(Panel_E_Klient.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        ParentFrame.Opened_S_Klient();
    }//GEN-LAST:event_QuitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EE_imie;
    private javax.swing.JTextField EE_kod;
    private javax.swing.JTextField EE_miasto;
    private javax.swing.JTextField EE_nazwisko;
    private javax.swing.JTextField EE_nr;
    private javax.swing.JTextField EE_ulica;
    private javax.swing.JLabel L_S_imie;
    private javax.swing.JLabel L_S_kod;
    private javax.swing.JLabel L_S_miasto;
    private javax.swing.JLabel L_S_nazwisko;
    private javax.swing.JLabel L_S_nr;
    private javax.swing.JLabel L_S_ulica;
    private javax.swing.JLabel L_imie1;
    private javax.swing.JLabel L_kod1;
    private javax.swing.JLabel L_miasto1;
    private javax.swing.JLabel L_nazwisko1;
    private javax.swing.JLabel L_nr1;
    private javax.swing.JLabel L_ulica1;
    private javax.swing.JButton Quit;
    private javax.swing.JButton Save;
    // End of variables declaration//GEN-END:variables
}
