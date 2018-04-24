/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.view;

import java.awt.Color;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.exampro.controller.ManageAdminController;
import lk.ijse.exampro.dto.AdminDTO;

/**
 *
 * @author Hafees
 */
public class NewUserForm extends javax.swing.JFrame {
    HashMap<String, String>hashmap=new HashMap<>();
    /**
     * Creates new form NewJFrame1
     */
    public NewUserForm() {
        initComponents();
        setLocationRelativeTo(null);
        loadAllIds();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_usernmae = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_login4 = new javax.swing.JButton();
        txt_password1 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_cancel3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        btn_chkavailability = new javax.swing.JButton();
        lbl_availability = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel6.setBackground(txt_password.getBackground());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("User Name");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 119, 140, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Password");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 133, 40));

        txt_usernmae.setBackground(new java.awt.Color(242, 247, 251));
        txt_usernmae.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_usernmae.setBorder(null);
        jPanel6.add(txt_usernmae, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 340, 30));

        txt_password.setBackground(new java.awt.Color(242, 247, 251));
        txt_password.setBorder(null);
        jPanel6.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 350, 30));

        btn_login4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_login4.setForeground(new java.awt.Color(0, 0, 255));
        btn_login4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icomoon_e617(0)_48.png"))); // NOI18N
        btn_login4.setText("Save");
        btn_login4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_login4.setBorderPainted(false);
        btn_login4.setContentAreaFilled(false);
        btn_login4.setDefaultCapable(false);
        btn_login4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FontAwesome_f0c7(0)_64.png"))); // NOI18N
        btn_login4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login4ActionPerformed(evt);
            }
        });
        jPanel6.add(btn_login4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 156, 50));

        txt_password1.setBackground(new java.awt.Color(242, 247, 251));
        txt_password1.setBorder(null);
        jPanel6.add(txt_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 350, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Confirm Password");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 40));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setBackground(new java.awt.Color(0, 153, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("New Admin");

        btn_cancel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_cancel3.setForeground(new java.awt.Color(51, 102, 255));
        btn_cancel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FontAwesome_f00d(0)_48.png"))); // NOI18N
        btn_cancel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        btn_cancel3.setBorderPainted(false);
        btn_cancel3.setContentAreaFilled(false);
        btn_cancel3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FontAwesome_f00d(0)_48_2.png"))); // NOI18N
        btn_cancel3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FontAwesome_f00d(0)_64.png"))); // NOI18N
        btn_cancel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 527, Short.MAX_VALUE)
                .addComponent(btn_cancel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cancel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 810, 70));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAlignmentX(2.0F);
        jSeparator1.setAlignmentY(2.0F);
        jSeparator1.setFont(new java.awt.Font("Adobe Arabic", 1, 14)); // NOI18N
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 350, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setAlignmentX(2.0F);
        jSeparator3.setAlignmentY(2.0F);
        jSeparator3.setFont(new java.awt.Font("Adobe Arabic", 1, 14)); // NOI18N
        jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 340, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setAlignmentX(2.0F);
        jSeparator4.setAlignmentY(2.0F);
        jSeparator4.setFont(new java.awt.Font("Adobe Arabic", 1, 14)); // NOI18N
        jPanel6.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 350, 20));

        jCheckBox1.setBackground(new java.awt.Color(242, 247, 251));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 200, -1));

        btn_chkavailability.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_chkavailability.setForeground(new java.awt.Color(255, 0, 51));
        btn_chkavailability.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Entypo_e704(0)_32.png"))); // NOI18N
        btn_chkavailability.setText("Check Availability");
        btn_chkavailability.setContentAreaFilled(false);
        btn_chkavailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chkavailabilityActionPerformed(evt);
            }
        });
        jPanel6.add(btn_chkavailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, 40));

        lbl_availability.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jPanel6.add(lbl_availability, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 560, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel3ActionPerformed
          new LoginFrame().setVisible(true);
        dispose();
        // new NewUserForm().dispose();
    }//GEN-LAST:event_btn_cancel3ActionPerformed

    private void btn_login4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login4ActionPerformed
         if( txt_usernmae.getText().equals("")){
            txt_usernmae.requestFocus();
            txt_usernmae.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            JOptionPane.showMessageDialog(this, "Please Enter the Username");
        }else if(txt_password.getText().equals("")){
            txt_password.requestFocus();
            JOptionPane.showMessageDialog(this, "Please Enter the Password");
        }else if(txt_password1.getText().equals("")){
            txt_password1.requestFocus();
            JOptionPane.showMessageDialog(this, "Please ReEnter the Password");
        }else{

            String username = txt_usernmae.getText();
            char[] pass1 = txt_password.getPassword();
            char[] pass2 = txt_password1.getPassword();

            //        boolean equals = Arrays.equals(pass2, pass2);
            boolean equals = new String(pass1).equals(new String(pass2));

            if (!equals) {
                JOptionPane.showMessageDialog(this, "Passwords not Match");
                txt_password.requestFocus();
            }else {
                try {
                    
                     AdminDTO adminDTO=new AdminDTO();
            adminDTO.setUsername(txt_usernmae.getText());
              adminDTO.setPassword(txt_password.getText());
             boolean result = ManageAdminController.addAdmin(adminDTO);                   
                    if (result) {
                        JOptionPane.showMessageDialog(this, "Admin added successfully");
                        new LoginFrame().setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Admin adding fail");
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(NewUserForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(NewUserForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_btn_login4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
          if(jCheckBox1.isSelected()) {
            txt_password.setEchoChar((char)0);
        } else{
            txt_password.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btn_chkavailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chkavailabilityActionPerformed
        String text = txt_usernmae.getText();
        if(hashmap.containsKey(text)){
            lbl_availability.setText("");
        lbl_availability.setText("Already Exist!  Try Another User name");
        lbl_availability.setForeground(Color.RED);
        }else{
             lbl_availability.setText("");
        lbl_availability.setText("Accepted.   Enter The Valid Password");
         lbl_availability.setForeground(Color.BLUE);
        }
        
    }//GEN-LAST:event_btn_chkavailabilityActionPerformed

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
            java.util.logging.Logger.getLogger(NewUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_cancel3;
    public javax.swing.JButton btn_chkavailability;
    public javax.swing.JButton btn_login4;
    public javax.swing.JCheckBox jCheckBox1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JLabel lbl_availability;
    public javax.swing.JPasswordField txt_password;
    public javax.swing.JPasswordField txt_password1;
    public javax.swing.JTextField txt_usernmae;
    // End of variables declaration//GEN-END:variables

    private void loadAllIds(){

        try {
            List<AdminDTO> allAdmins = ManageAdminController.getAllAdmins();
            if(allAdmins !=null){
                for (AdminDTO allAdmin : allAdmins) {
                    hashmap.put(allAdmin.getUsername(), allAdmin.getPassword());
                }
                
            }else{
            return;
            }
            
        } catch (Exception ex) {
            Logger.getLogger(NewUserForm.class.getName()).log(Level.SEVERE, null, ex);
        }

}



}
