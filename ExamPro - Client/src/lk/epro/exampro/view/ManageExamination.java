/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.view;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.exampro.controller.ManageExaminationController;
import lk.ijse.exampro.controller.ManageQuestionController;
import lk.ijse.exampro.controller.ManageRegistrationController;
import lk.ijse.exampro.controller.ManageSubjectsController;
import lk.ijse.exampro.dto.ExaminationDTO;
import lk.ijse.exampro.dto.QuestionDTO;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import static lk.ijse.exampro.view.StudentLogin.registrationDTO;

/**
 *
 * @author Hafees
 */
public class ManageExamination extends javax.swing.JFrame implements Observer{
        private String announcement;
        private int count=0;
    /**
     * Creates new form NewManageExamination_1
     */
    public ManageExamination() {
        initComponents();
         //setSize(1368,767);
         setLocationRelativeTo(null);
         loadAllsubids();
         loadAllExamination();
         
          try {
            UnicastRemoteObject.exportObject(this, 0);
             // ManageExaminationController.registerObserver(Integer.toString(registrationDTO.getRegid()));
           ManageExaminationController.registerObserver(this);
        } catch (RemoteException ex) {
            Logger.getLogger(StudentPortal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(StudentPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblExamination = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        mobilphn_lbl2 = new javax.swing.JLabel();
        cmbsubjectid = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JToggleButton();
        email_lbl7 = new javax.swing.JLabel();
        txtsubname = new javax.swing.JTextField();
        id_lbl = new javax.swing.JLabel();
        name_lbl1 = new javax.swing.JLabel();
        txtexamid = new javax.swing.JTextField();
        txtdatechooser = new com.toedter.calendar.JDateChooser();
        name_lbl2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        btn_new = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 3, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1097, 629));
        jPanel1.setMinimumSize(new java.awt.Dimension(1097, 629));
        jPanel1.setPreferredSize(new java.awt.Dimension(1144, 629));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "    User Id", "      User Name", "   User Type", "Email Id"
            }
        ));

        tblExamination.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 3, true));
        tblExamination.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblExamination.setForeground(new java.awt.Color(51, 0, 255));
        tblExamination.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Id", "Subject Name", "Exam id", "Exam Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExamination.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblExamination.setGridColor(new java.awt.Color(0, 0, 255));
        tblExamination.setOpaque(false);
        tblExamination.setSelectionForeground(new java.awt.Color(51, 255, 51));
        jScrollPane2.setViewportView(tblExamination);

        jPanel2.setBackground(new java.awt.Color(55, 55, 188));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Examination");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 400, 50));

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
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 40, 30));

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
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 40, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(51, 0, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mobilphn_lbl2.setBackground(new java.awt.Color(255, 255, 255));
        mobilphn_lbl2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        mobilphn_lbl2.setForeground(new java.awt.Color(0, 0, 204));
        mobilphn_lbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mobilphn_lbl2.setText("Subject Id");
        jPanel3.add(mobilphn_lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 107, 30));

        cmbsubjectid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbsubjectidItemStateChanged(evt);
            }
        });
        cmbsubjectid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsubjectidActionPerformed(evt);
            }
        });
        jPanel3.add(cmbsubjectid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 47, 103, 38));

        btnSearch.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 51, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FontAwesome_f002(0)_48.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 45));

        email_lbl7.setBackground(new java.awt.Color(255, 255, 255));
        email_lbl7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        email_lbl7.setForeground(new java.awt.Color(0, 0, 204));
        email_lbl7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        email_lbl7.setText("Subject Name");
        jPanel3.add(email_lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 16, 128, 20));

        txtsubname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtsubname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsubname.setText("Subjects");
        txtsubname.setBorder(null);
        jPanel3.add(txtsubname, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 47, 140, 40));

        id_lbl.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        id_lbl.setForeground(new java.awt.Color(0, 0, 204));
        id_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        id_lbl.setText("Exam ID :");
        jPanel3.add(id_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 100, 30));

        name_lbl1.setBackground(new java.awt.Color(255, 255, 255));
        name_lbl1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        name_lbl1.setForeground(new java.awt.Color(0, 0, 204));
        name_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name_lbl1.setText("Message to Students");
        jPanel3.add(name_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 200, 30));

        txtexamid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtexamid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtexamid.setBorder(null);
        jPanel3.add(txtexamid, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 100, 40));
        jPanel3.add(txtdatechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 170, -1));

        name_lbl2.setBackground(new java.awt.Color(255, 255, 255));
        name_lbl2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        name_lbl2.setForeground(new java.awt.Color(0, 0, 204));
        name_lbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name_lbl2.setText("Exam Date");
        jPanel3.add(name_lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 100, 30));

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 250, -1));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_new.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_new.setForeground(new java.awt.Color(255, 255, 255));
        btn_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Entypo_e003(0)_32.png"))); // NOI18N
        btn_new.setText("New");
        btn_new.setContentAreaFilled(false);
        btn_new.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icomoon_e617(0)_48.png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.setContentAreaFilled(false);
        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Entypo_270e(0)_48.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.setContentAreaFilled(false);
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Entypo_e729(0)_48.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setContentAreaFilled(false);
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Entypo_27f3(0)_48.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.setContentAreaFilled(false);
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_new)
                .addGap(88, 88, 88)
                .addComponent(btn_save)
                .addGap(82, 82, 82)
                .addComponent(btn_update)
                .addGap(32, 32, 32)
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_clear)
                .addGap(139, 139, 139))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_clear, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_update)
                            .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15934, 15934, 15934)
                .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbsubjectidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbsubjectidItemStateChanged
        if(cmbsubjectid.getSelectedIndex()!=-1){
            try {
                SubjectsDTO searchSubjects = ManageSubjectsController.searchSubjects(cmbsubjectid.getSelectedItem().toString());

                txtsubname.setText(searchSubjects.getSubjectname());
            } catch (Exception ex) {
                Logger.getLogger(ManageExamination.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_cmbsubjectidItemStateChanged

    private void cmbsubjectidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsubjectidActionPerformed

    }//GEN-LAST:event_cmbsubjectidActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
         String EID = txtexamid.getText();
        try {
            searchExamination(EID);
        } catch (Exception ex) {
            Logger.getLogger(ManageExamination.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        clearAllTextFileds();
        btn_save.setEnabled(true);
        btn_new.setEnabled(false);
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_clear.setEnabled(false);
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
       Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        announcement=textarea.getText();
        
        try {
            ExaminationDTO examDTO=new ExaminationDTO();
            SubjectsDTO dto=new SubjectsDTO();

            int subid = Integer.parseInt(cmbsubjectid.getSelectedItem().toString());
            dto.setSubid(Integer.parseInt(cmbsubjectid.getSelectedItem().toString()));
            dto.setSubjectname(txtsubname.getText());

            String sid = cmbsubjectid.getSelectedItem().toString();
            SubjectsDTO searchSubjects = ManageSubjectsController.searchSubjects(sid);
            examDTO.setSubjectsDTO(dto);
            
            
            SimpleDateFormat dat=new SimpleDateFormat("yyyy-MM-dd");
        //String date=dat.format(txtDatepicker.getDate());
        String date=dat.format(txtdatechooser.getDate());
            examDTO.setDate(date);
            ManageExaminationController.setAnnouncements(sdf.format(timestamp)+" -> "+textarea.getText());
                   System.out.println("textarea.getText() "+textarea.getText());
            boolean addExamination = ManageExaminationController.addExamination(examDTO);
         
            if(addExamination){
                JOptionPane.showMessageDialog(this, "Examination saved");
                   
                loadAllExamination();
                clearAllTextFileds();
                //                new StartExam11(subid).setVisible(true);
                //                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Not saved");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageExamination.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
         try {
            ExaminationDTO examDTO=new ExaminationDTO();
            SubjectsDTO dto=new SubjectsDTO();

            int subid = Integer.parseInt(cmbsubjectid.getSelectedItem().toString());
            dto.setSubid(Integer.parseInt(cmbsubjectid.getSelectedItem().toString()));
            dto.setSubjectname(txtsubname.getText());

            String sid = cmbsubjectid.getSelectedItem().toString();
            SubjectsDTO searchSubjects = ManageSubjectsController.searchSubjects(sid);
            examDTO.setSubjectsDTO(dto);
            
            SimpleDateFormat dat=new SimpleDateFormat("yyyy-MM-dd");
        //String date=dat.format(txtDatepicker.getDate());
        String date=dat.format(txtdatechooser.getDate());
            examDTO.setDate(date);

            boolean addExamination = ManageExaminationController.updateExamination(examDTO);
            if(addExamination){
                JOptionPane.showMessageDialog(this, "Examination updated");
                loadAllExamination();
                clearAllTextFileds();
                //                new StartExam11(subid).setVisible(true);
                //                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Not updated");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageExamination.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
         try {
            boolean result = ManageQuestionController.deleteQuestion((txtexamid.getText()));
            if (result){
                JOptionPane.showMessageDialog(this, "Question has been successfully deleted.");
                loadAllExamination();
                clearAllTextFileds();
            }else{
                JOptionPane.showMessageDialog(this, "Question hasn't been deleted ");
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageExamination.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
          clearAllTextFileds();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            try {
                ManageExaminationController.unregisterObserver(this);
            } catch (Exception ex) {
                Logger.getLogger(ManageExamination.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        new AdminWindowNew().setVisible(true);
        this.setVisible(false);
        // close();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.setState(ManageExamination.ICONIFIED);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageExamination().setVisible(true);
            }
        });
    }
     public void searchExamination(String qid) throws Exception {
       ExaminationDTO examdto = ManageExaminationController.searchExamination(qid);
        if (examdto != null) {
                txtsubname.setText(examdto.getSubjectsDTO().getSubjectname());
                txtexamid.setText(examdto.getEid()+"");
                String date1=examdto.getDate();
            Date dat2=new SimpleDateFormat("yyyy-MM-dd").parse(date1);
            txtdatechooser.setDate(dat2);
            cmbsubjectid.setSelectedItem(examdto.getSubjectsDTO().getSubid());
               
        }
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton btnSearch;
    public javax.swing.JButton btn_clear;
    public javax.swing.JButton btn_delete;
    public javax.swing.JButton btn_new;
    public javax.swing.JButton btn_save;
    public javax.swing.JButton btn_update;
    public javax.swing.JComboBox<String> cmbsubjectid;
    public javax.swing.JLabel email_lbl7;
    public javax.swing.JLabel id_lbl;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton9;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    public javax.swing.JLabel mobilphn_lbl2;
    public javax.swing.JLabel name_lbl1;
    public javax.swing.JLabel name_lbl2;
    public javax.swing.JTable tblExamination;
    public javax.swing.JTextArea textarea;
    public com.toedter.calendar.JDateChooser txtdatechooser;
    public javax.swing.JTextField txtexamid;
    public javax.swing.JTextField txtsubname;
    // End of variables declaration//GEN-END:variables
private void loadAllsubids(){
        try {
            List<SubjectsDTO> allSubjectss = ManageSubjectsController.getAllSubjectss();
            cmbsubjectid.removeAllItems();
            for (SubjectsDTO allSubjects : allSubjectss) {
                int subid = allSubjects.getSubid();
                cmbsubjectid.addItem(Integer.toString(subid));
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageExamination.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    private void loadAllExamination(){
        try {
            List<ExaminationDTO> allexams = ManageExaminationController.getAllExaminations();
            DefaultTableModel dtm=(DefaultTableModel) tblExamination.getModel();
            dtm.setRowCount(0);
            if(allexams !=null){
                for (ExaminationDTO exams : allexams) {
                    Object []rowdata={
                        exams.getSubjectsDTO().getSubid(),
                        exams.getSubjectsDTO().getSubjectname(),
                        exams.getEid(),
                        exams.getDate()};
                     dtm.addRow(rowdata);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageExamination.class.getName()).log(Level.SEVERE, null, ex);
    }
}
     private void clearAllTextFileds() {
                 txtsubname.setText("");
                txtexamid.setText("");
                txtdatechooser.setDate(null);
                cmbsubjectid.setSelectedIndex(-1);
    }
    private void rowSelection(){
     int raw=tblExamination.getSelectedRow();
     if(raw> -1){
     tblExamination.setRowSelectionInterval(0, 0);
     }  
    }

   

    @Override
    public void update(String announcemts) throws Exception {
        
    }


}