/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.view;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import lk.ijse.exampro.controller.ManageAdminController;
import lk.ijse.exampro.dto.AdminDTO;


/**
 *
 * @author Hafees
 */
public class AdminWindowNew extends javax.swing.JFrame {
    private static String username=LoginFrame.getUsername();
    private int timeRun;
     private ImageIcon formate=null;
    HashMap<String,AdminDTO>hashMap=new HashMap<>();

    /**
     * Creates new form DashBoard
     */
    public AdminWindowNew() {
          this(username);
//        initComponents();
//      
//        setExtendedState(AdminWindowNew.MAXIMIZED_BOTH);
//        int timeRun = 0;
//        setLocationRelativeTo(null);
//        getPanelSize();
//        currentime();
//        MouseEvent evt = null;
//         loadAdmins();
//        getAdminDetails();
        //lbladminname.setText(string);
       // home_lblMouseClicked( evt);
        
//        home_lbl.setDisplayedMnemonic(KeyEvent.VK_F1);
//         addsubjects_lbl.setDisplayedMnemonic(KeyEvent.VK_F3);
//       home_lbl.setToolTipText("Home Screen");
        
    }

    AdminWindowNew(String username) {
        this.username=username;
          initComponents();
        setExtendedState(AdminWindowNew.MAXIMIZED_BOTH);
        int timeRun = 0;
        setLocationRelativeTo(null);
        getPanelSize();
        currentime();
        MouseEvent evt = null;
        loadAdmins();
        getAdminDetails();
       
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        pnlheader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbladminname = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        lblimage = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        lbltime = new javax.swing.JLabel();
        pnlcontent = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);

        pnl1.setBackground(new java.awt.Color(255, 255, 255));
        pnl1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlheader.setBackground(new java.awt.Color(51, 51, 255));
        pnlheader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Admin Portal");
        pnlheader.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 38, 351, 58));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel3.setText("Login as");
        pnlheader.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 96, 100, 40));

        lbladminname.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        lbladminname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbladminname.setText("user");
        lbladminname.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlheader.add(lbladminname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 121, 30));

        jDesktopPane2.setBackground(new java.awt.Color(153, 153, 255));

        jDesktopPane2.setLayer(lblimage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pnlheader.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, -1, -1));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlheader.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 153, 1154, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FontAwesome_f00d(0)_48.png"))); // NOI18N
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 52, 182), 2, true));
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FontAwesome_f00d(0)_48_1.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        pnlheader.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 11, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize.png"))); // NOI18N
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minim ize.png"))); // NOI18N
        jButton9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minim ize.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        pnlheader.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1244, 20, 50, 44));

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime.setForeground(new java.awt.Color(255, 255, 255));
        lbltime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbltime.setText("34234234");
        pnlheader.add(lbltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 100, 200, 43));

        pnl1.add(pnlheader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 150));

        pnlcontent.setBackground(new java.awt.Color(255, 255, 255));
        pnlcontent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnl1.add(pnlcontent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1374, 1377, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icomoon_e657(0)_256_1.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(true);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icomoon_e657(0)_256_2.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnl1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 172, 249, 220));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Manage Admin");
        pnl1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 192, 29));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admin256.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setOpaque(true);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FontAwesome_f007(0)_256.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnl1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 172, 249, 220));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Manage Student");
        pnl1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 239, 29));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Entypo_d83d(0)_256.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setOpaque(true);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Entypo_d83d(0)_256_2.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnl1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(942, 162, 249, 220));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Manage Subject");
        pnl1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, 239, 29));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FontAwesome_f12b(0)_256_1.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setOpaque(true);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FontAwesome_f12b(0)_256_3.png"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pnl1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 497, 249, 160));

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Manage Questions");
        pnl1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, 210, 29));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Manage Examination");
        pnl1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 663, 239, 29));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Material Icons_e01e(0)_256_1.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setOpaque(true);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Material Icons_e01e(0)_256_2.png"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pnl1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 487, 249, 170));

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("View Results");
        pnl1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 650, 239, 29));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FontAwesome_f080(0)_256.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setOpaque(true);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FontAwesome_f080(0)_256_1.png"))); // NOI18N
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        pnl1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(942, 503, 249, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 1365, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
       
        jLabel6.setForeground(Color.BLUE);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
     
        jLabel6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
       
        jLabel7.setForeground(Color.BLUE);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
     
        jLabel7.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
         
        jLabel8.setForeground(Color.BLUE);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
     
        jLabel8.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jLabel9.setForeground(Color.BLUE);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
         jLabel9.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jLabel10.setForeground(Color.BLUE);
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jLabel10.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
      jLabel11.setForeground(Color.BLACK);
                                         
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
       jLabel11.setForeground(Color.BLUE);
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.setState(AdminWindowNew.ICONIFIED);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new LoginFrame().setVisible(true);
        this.setVisible(false);
       // close();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ManageAdmin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      new NewStudentForm_admin().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          new ManageSubjects().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      new ManageQuestion().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new ManageExamination().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            new ViewResultsAll().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed
 
    public void getPanelSize() {
        
        //int h=mainpanel3.getSize().height;
        // int w=mainpanel3.getSize().width;
        // System.out.println(w+","+h);
    }

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
            java.util.logging.Logger.getLogger(AdminWindowNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminWindowNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminWindowNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminWindowNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AdminWindowNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbladminname;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lbltime;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnlcontent;
    private javax.swing.JPanel pnlheader;
    // End of variables declaration//GEN-END:variables

   public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    
    private void currentime() {
        new Thread() {
            public void run() {
                while (timeRun == 0) {
                    Calendar cal = new GregorianCalendar();
                    int hour = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE);
                    int sec = cal.get(Calendar.SECOND);
                    int AM_PM = cal.get(Calendar.AM_PM);

                    String day_night = "";
                    if (AM_PM == 1) {
                        day_night = "PM";
                    } else {
                        day_night = "AM";
                    }
                    String time = hour + ":" + min + ":" + sec + ":" + day_night;

                   lbltime.setText(time);

                }
            }  
        }.start();
    }
    
    private void loadAdmins(){
     try {
         List<AdminDTO> allAdmins = ManageAdminController.getAllAdmins();
         if(allAdmins!=null){
         for (AdminDTO allAdmin : allAdmins) {
              hashMap.put(allAdmin.getUsername(),allAdmin);
        
             }
         }else{
         return;
         }
     } catch (Exception ex) {
         Logger.getLogger(AdminWindowNew.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
    
    private void getAdminDetails(){
        AdminDTO admin = hashMap.get(username);
       
        if(admin!=null){
         byte[]image =admin.getAdminimage();
               formate=new ImageIcon(image);
                lblimage.setIcon(formate);
                 lbladminname.setText(username);
        }
    }
    
      
}
