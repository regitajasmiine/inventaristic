/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smkn4.inventaristic.admin.siswa;

/**
 *
 * @author Bagusth
 */

import com.smkn4.inventaristic.util.MySqlConnection;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ManageEdit extends javax.swing.JDialog {

    /**
     * Creates new form ManageEdit
     */
    DataPeminjam dp = new DataPeminjam(); 
    Connection connection;
    String action; 
    
    public ManageEdit(java.awt.Frame parent, boolean modal, String act, String NIS) {
        super(parent, modal);
        initComponents();
        connection = MySqlConnection.getConnection();
        action = act;
        if(action.equals("Edit")){
            jLabel1.setText("Form Edit");
            txtNIS.setEnabled(true);
            showData(NIS);
      
    }
        
    /**
     *
     */
    
    }
        DefaultTableModel dtm;
        
        public void EditData() {
        String nis = txtNIS.getText();
        String nama = namasis.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tgl_lahir = sdf.format(tanggal.getDate());
        String jenKel = jeniskel.getSelectedItem().toString();
        String kelas = cmbK.getSelectedItem().toString();
        String jurusan  = cmbJ.getSelectedItem().toString();
        String tahun_ajaran = takhoon.getSelectedItem().toString();
        String sanksi = sangsi.getText();
        
        try {
            Statement stmt = connection.createStatement();
            String query = "UPDATE siswa SET nama_siswa = '" + nama + "', " + "tgl_lahir ='" + tgl_lahir + "', " + "jenkel ='" + jenKel + "', "
                    + "" + "kelas ='" + kelas + "', jurusan = '" + jurusan + "', thn_ajaran = '" + tahun_ajaran + "', sanksi = '" + sanksi + "' WHERE nis = '" + nis + "'";
            
            System.out.println(query);
            int berhasil = stmt.executeUpdate(query);
            if (berhasil == 1) {
//                dp.dtm.getDataVector().removeAllElements();
                dp.readData();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada Query");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        namasis = new javax.swing.JTextField();
        jeniskel = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        cmbK = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbJ = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        sangsi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        takhoon = new javax.swing.JComboBox<>();
        tanggal = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form");

        jLabel2.setText("NIS");

        jLabel3.setText("Nama Siswa");

        jLabel4.setText("Kelas");

        jLabel5.setText("Tanggal Lahir");

        jLabel6.setText("Jenkel");

        jeniskel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L", "P" }));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        cmbK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X-RPL 1", "XI-RPL 1", "XII-RPL 1" }));

        jLabel7.setText("Jurusan");

        cmbJ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Multimedia", "Teknik Komputer Jaringan", "Rekayasa Perangkat Lunak", "Teknik Audio Video", "Teknik Otomasi Industri", "Teknik Instalasi Tenaga Listrik" }));

        jLabel8.setText("Sanksi");

        jLabel9.setText("Tahun Ajaran");

        takhoon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018-2019", "2019-2020", "2020-2021" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel8)))
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel9)))
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jeniskel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNIS, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namasis, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sangsi, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(takhoon, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))))
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(namasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5))
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jeniskel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(takhoon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sangsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        if(action.equals("Edit")) {
            EditData();
        }
        else {
            SubmitData();
            DataPeminjam dp = new DataPeminjam();
            dp.readData();
        }
        setVisible(false);
    }//GEN-LAST:event_submitActionPerformed
    
    public void SubmitData() {
        
        String nis = txtNIS.getText();
        String nama = namasis.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tgl_lahir = sdf.format(tanggal.getDate());
        String jenKel = jeniskel.getSelectedItem().toString();
        String kelas = cmbK.getSelectedItem().toString();
        String jurusan  = cmbJ.getSelectedItem().toString();
        String tahun_ajaran = takhoon.getSelectedItem().toString();
        String sanksi = sangsi.getText();
        
        try {
            Statement stmt = connection.createStatement();
            String query = "INSERT INTO siswa(nis, nama_siswa, tgl_lahir, jenkel, kelas, jurusan, thn_ajaran, sanksi)"
                    + "VALUES" + "('" + nis + "', '" + nama + "', '" + tgl_lahir + "', '" + jenKel + "', '"+ kelas +"', "
                    + "'" + jurusan + "', '" + tahun_ajaran + "', '" + sanksi + "' )";
            System.out.println(query);
            int berhasil = stmt.executeUpdate(query);
            if (berhasil == 1) {
//                dp.dtm.getDataVector().removeAllElements();
                dp.readData();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukan");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Data Gagal Dimasukan");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada Database");
        }
    }
        
    /**
     *
     * @param nis
     */
    public void showData (String nis){
        
        try{
            SimpleDateFormat convert = new SimpleDateFormat("MMM d, yyyy");
            SimpleDateFormat edit = new SimpleDateFormat("yyyy-mm-dd");
            Statement stmt = connection.createStatement();
            String query = "SELECT * FROM siswa WHERE nis = '"+nis+"' ";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            txtNIS.setText(rs.getString("nis"));
            namasis.setText(rs.getString("nama_siswa"));
            String tanggal_lahir = rs.getString("tgl_lahir");
            Date date = edit.parse(tanggal_lahir);
            String tgllahir = convert.format(date);
            Date tgl = convert.parse(tgllahir);
            tanggal.setDate(tgl);
            String jenkel = rs.getString("jenkel");
            if("L".equals(jenkel)){
                jeniskel.setSelectedIndex(0);
            }else if("P".equals(jenkel)){
                jeniskel.setSelectedIndex(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di Database");
        } catch (ParseException ex) {
        Logger.getLogger(ManageEdit.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
          //  public void run() {
            //    new ManageEdit().setVisible(true);
     //       }
        //});
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
          //  public void run() {
            //    new ManageEdit().setVisible(true);
     //       }
        //});
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbJ;
    private javax.swing.JComboBox<String> cmbK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jeniskel;
    private javax.swing.JTextField namasis;
    private javax.swing.JTextField sangsi;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> takhoon;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTextField txtNIS;
    // End of variables declaration//GEN-END:variables

}
