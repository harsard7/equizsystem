
package lk.ijse.exampro.view;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.exampro.controller.ManageAdminController;
import lk.ijse.exampro.dto.AdminDTO;

/**
 *
 * @author Harsard
 */
public class LoginFrame extends javax.swing.JFrame {
 HashMap<String,String>hashMap=new HashMap<>();
 public static String username;
    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        setSize(1368,768);
      loadAdmins();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnnewuser1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Member Login");
        setBackground(new java.awt.Color(102, 102, 255));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(101, 219, 208));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("User Name");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 40));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Password");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 171, 133, 40));

        txt_usernmae.setBackground(jPanel6.getBackground());
        txt_usernmae.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_usernmae.setBorder(null);
        txt_usernmae.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usernmaeKeyPressed(evt);
            }
        });
        jPanel6.add(txt_usernmae, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 98, 236, 30));

        txt_password.setBackground(jPanel6.getBackground());
        txt_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_password.setBorder(null);
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel6.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 163, 236, 30));

        btn_login4.setBackground(jPanel6.getBackground());
        btn_login4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_login4.setForeground(new java.awt.Color(0, 0, 153));
        btn_login4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/loginc.png"))); // NOI18N
        btn_login4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_login4.setBorderPainted(false);
        btn_login4.setContentAreaFilled(false);
        btn_login4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login4.setOpaque(true);
        btn_login4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logind.png"))); // NOI18N
        btn_login4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login4ActionPerformed(evt);
            }
        });
        btn_login4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_login4KeyPressed(evt);
            }
        });
        jPanel6.add(btn_login4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 180, 70));

        jCheckBox1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 213, 118, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 204));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 135, 236, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 204));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 201, 237, 10));

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   Login-Admin");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/asset/Admin-01-48.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/asset/0042_088_delete_close_cross-48.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/asset/Cancel_48px_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 90));

        btnnewuser1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btnnewuser1.setForeground(new java.awt.Color(0, 0, 153));
        btnnewuser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/asset/add.png"))); // NOI18N
        btnnewuser1.setText("New Admin");
        btnnewuser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnnewuser1.setBorderPainted(false);
        btnnewuser1.setContentAreaFilled(false);
        btnnewuser1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnewuser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnnewuser1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnnewuser1MouseExited(evt);
            }
        });
        btnnewuser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewuser1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnnewuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, 30));

        getContentPane().add(jPanel6);
        jPanel6.setBounds(560, 110, 470, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adminback.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 1400, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()) {
            txt_password.setEchoChar((char)0);
        } else{
            txt_password.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btn_login4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_login4KeyPressed
        //new MainWindow().setVisible(true);
    }//GEN-LAST:event_btn_login4KeyPressed

    private void btn_login4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login4ActionPerformed
        String username=txt_usernmae.getText();
        String password=txt_password.getText();

        if(username.equals("")){
            JOptionPane.showMessageDialog(null, "PLEASE TYPE USERNAME FOR LOGIN:::");
            txt_usernmae.requestFocus();
            txt_usernmae.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        }else if(password.equals("")){
            JOptionPane.showMessageDialog(null, "PLEASE TYPE PASSWORD FOR LOGIN:::");
            txt_usernmae.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
            txt_password.requestFocus();
            txt_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        }else{
            txt_password. setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
          
                boolean login =getadmins();
                if (login) {
                    new AdminWindowNew(username).setVisible(true);
                  
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    txt_usernmae.requestFocus();
                    txt_usernmae.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
                    txt_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
                }
           

        }
    }//GEN-LAST:event_btn_login4ActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed

        btn_login4.requestFocus();
        btn_login4.setForeground(Color.GREEN);
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void btnnewuser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewuser1ActionPerformed
        new NewUserForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnnewuser1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnnewuser1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnewuser1MouseEntered
        btnnewuser1.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnnewuser1MouseEntered

    private void btnnewuser1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnewuser1MouseExited
         btnnewuser1.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnnewuser1MouseExited

    private void txt_usernmaeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernmaeKeyPressed
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       txt_password.requestFocus();
    }   
    }//GEN-LAST:event_txt_usernmaeKeyPressed

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login4;
    private javax.swing.JButton btnnewuser1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usernmae;
    // End of variables declaration//GEN-END:variables
 private void SystemExit() {
        WindowEvent windowclosing=new WindowEvent(this, WindowEvent.WINDOW_CLOSING); //To change body of generated methods, choose Tools | Templates.
    }
  public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
   private void loadAdmins(){
     try {
         List<AdminDTO> allAdmins = ManageAdminController.getAllAdmins();
         if(allAdmins!=null){
         for (AdminDTO allAdmin : allAdmins) {
            
              hashMap.put(allAdmin.getUsername(),allAdmin.getPassword());
             }
         }else{
         return;
         }
     } catch (Exception ex) {
         Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
   private boolean getadmins(){
      username = txt_usernmae.getText();
     boolean containsKey = hashMap.containsKey(username);
       if(containsKey){
     String get = hashMap.get(username);
     String text = txt_password.getText();
     if(get.equals(text)){
       return true;
     }
     else{
     return false;
     }
   }
      
       return false;
   }
   public static String getUsername(){
       System.out.println(" username  login  "+username);
    return username;
       
       
   }
}
