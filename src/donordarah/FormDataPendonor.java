/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donordarah;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import donordarah.Koneksi;
public class FormDataPendonor extends javax.swing.JFrame {

    /**
     * Creates new form FormBuku
     */
    public FormDataPendonor() {
        initComponents();
        loadData();
    }
private void loadData(){
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("NIK");
    model.addColumn("Nama");
    model.addColumn("Jenis Kelamin");
    model.addColumn("Nomor HP");
    model.addColumn("Tempat Lahir");
    model.addColumn("Tanggal Lahir");
    model.addColumn("Golongan");
    model.addColumn("Alamat");
    
    
    try{
        String sql = "select * from donor";
        java.sql.Connection conn = (Connection) Koneksi.koneksiDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet res = stm.executeQuery(sql);
        
        while(res.next()){
            model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8)});
        }
        table_donor.setModel(model);
        
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    
}
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nik = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_tempat_lahir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_no_hp = new javax.swing.JTextField();
        btn_edit = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_hapus1 = new javax.swing.JButton();
        cb_jk = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txt_tgl_lahir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_alamat = new javax.swing.JTextField();
        cb_golongan = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_donor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trajan Pro", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Donor Darah");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 310, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Work\\PBO\\UTS-DonorDarah-531417017\\Donor-PNG-File.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIK");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel2.add(txt_nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 220, 30));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel2.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 220, 30));

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tempat Lahir");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        txt_tempat_lahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tempat_lahirActionPerformed(evt);
            }
        });
        jPanel2.add(txt_tempat_lahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 260, 30));

        jLabel6.setFont(new java.awt.Font("Trajan Pro", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nomor HP");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txt_no_hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_no_hpActionPerformed(evt);
            }
        });
        jPanel2.add(txt_no_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 220, 30));

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel2.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 70, 30));

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel2.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 80, 30));

        btn_hapus1.setText("Hapus");
        btn_hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapus1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_hapus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 70, 30));

        cb_jk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih...", "Pria", "Wanita" }));
        cb_jk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_jkActionPerformed(evt);
            }
        });
        jPanel2.add(cb_jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 90, 30));

        jLabel7.setFont(new java.awt.Font("Trajan Pro", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tanggal Lahir");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        txt_tgl_lahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tgl_lahirActionPerformed(evt);
            }
        });
        jPanel2.add(txt_tgl_lahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 260, 30));

        jLabel8.setFont(new java.awt.Font("Trajan Pro", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Golongan Darah");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trajan Pro", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Alamat");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });
        jPanel2.add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 260, 30));

        cb_golongan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih...", "A", "B", "O", "AB" }));
        jPanel2.add(cb_golongan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 90, 30));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_donor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_donor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_donorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_donor);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
         try {
           
            String sql = "update donor set nama = '"+txt_nama.getText()+"', jk = '"+
                    cb_jk.getSelectedItem()+"',no_hp = '"+txt_no_hp.getText()+"', tempat_lahir = '"+txt_tempat_lahir.getText()+"', tgl_lahir = '"+txt_tgl_lahir.getText()+"', golongan = '"+cb_golongan.getSelectedItem()+"', alamat = '"+txt_alamat.getText()+"' where nik = '"+txt_nik.getText()+"' ";
            
            java.sql.Connection conn = (Connection) Koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil Di Edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        loadData();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        try{
            String sql = "INSERT INTO donor(nik,nama,jk,no_hp,tempat_lahir,tgl_lahir,golongan,alamat)VALUES('"+txt_nik.getText()+"','"+txt_nama.getText()+"','"+cb_jk.getSelectedItem()+"','"+txt_no_hp.getText()+"','"+txt_tempat_lahir.getText()+"','"+txt_tgl_lahir.getText()+"','"+cb_golongan.getSelectedItem()+"','"+txt_alamat.getText()+"')";
              java.sql.Connection conn = (Connection) Koneksi.koneksiDB();
              java.sql.PreparedStatement pst = conn.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        loadData();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapus1ActionPerformed
       try{
              String sql = "DELETE FROM donor WHERE nik="+txt_nik.getText();
              java.sql.Connection conn = (Connection) Koneksi.koneksiDB();
              java.sql.PreparedStatement pst = conn.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        loadData();
    }//GEN-LAST:event_btn_hapus1ActionPerformed

    private void table_donorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_donorMouseClicked
       int baris = table_donor.rowAtPoint(evt.getPoint());
       String nik = table_donor.getValueAt(baris, 0).toString();
       txt_nik.setText(nik);
       String nama = table_donor.getValueAt(baris, 1).toString();
       txt_nama.setText(nama);
       String jk = table_donor.getValueAt(baris, 2).toString();
       cb_jk.setSelectedItem(jk);
       String no_hp = table_donor.getValueAt(baris, 3).toString();
       txt_no_hp.setText(no_hp);
       String tempat_lahir = table_donor.getValueAt(baris, 4).toString();
       txt_tempat_lahir.setText(tempat_lahir);
       String tgl_lahir = table_donor.getValueAt(baris, 5).toString();
       txt_tgl_lahir.setText(tgl_lahir);
       String golongan = table_donor.getValueAt(baris, 6).toString();
       cb_golongan.setSelectedItem(golongan);
       String alamat = table_donor.getValueAt(baris, 7).toString();
       txt_alamat.setText(alamat);
       
    }//GEN-LAST:event_table_donorMouseClicked

    private void cb_jkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_jkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_jkActionPerformed

    private void txt_tempat_lahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tempat_lahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tempat_lahirActionPerformed

    private void txt_tgl_lahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tgl_lahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tgl_lahirActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void txt_no_hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_no_hpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_no_hpActionPerformed

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
            java.util.logging.Logger.getLogger(FormDataPendonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataPendonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataPendonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataPendonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataPendonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus1;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox cb_golongan;
    private javax.swing.JComboBox cb_jk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_donor;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nik;
    private javax.swing.JTextField txt_no_hp;
    private javax.swing.JTextField txt_tempat_lahir;
    private javax.swing.JTextField txt_tgl_lahir;
    // End of variables declaration//GEN-END:variables
}
