/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable1;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Addstudentgroup extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "8080";
    private static final String dataconn = "jdbc:mysql://localhost:3306/student";
    
    
    Connection sqlconn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
     DefaultTableModel model;
    
    int q,i,id, deleteItem;
    
      public Addstudentgroup() throws SQLException {
        initComponents();
         model = (DefaultTableModel) jTable12.getModel();
         upDateDB();
    }

  
    @SuppressWarnings("unchecked")
    
      public void upDateDB()
   {
       int q,i;
      try
      {
           Class.forName("com.mysql.cj.jdbc.Driver");
           sqlconn = DriverManager.getConnection(username,password,dataconn);
           pst = sqlconn.prepareStatement("select * from addstudent");
           
           rs = pst.executeQuery();
           ResultSetMetaData stData = rs.getMetaData();
           
           
           q = stData.getColumnCount();
           
            DefaultTableModel RecordTable = (DefaultTableModel)jTable12.getModel();
                   RecordTable.setRowCount(0);
                   
                   
                   while(rs.next()){
                   
                   Vector columnData = new Vector ();
                   
                         for(i = 1; i <= q; i++)
                         {
                         
                         columnData.add(rs.getString("id"));
                         columnData.add(rs.getString("StudentID"));
                         columnData.add(rs.getString("Studentname"));
                         columnData.add(rs.getString("Center"));
                         columnData.add(rs.getString("Academicyearsemaster"));
                         columnData.add(rs.getString("Program"));
                         columnData.add(rs.getString("GroupID"));
                         columnData.add(rs.getString("GroupNO"));
                        
                          }
                   RecordTable.addRow(columnData);
                   }
      
      
      }
                catch(Exception ex){
               JOptionPane.showMessageDialog(null, ex);
                
                }
   
   }
   
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Academicyear = new javax.swing.JComboBox<>();
        Center = new javax.swing.JComboBox<>();
        programme = new javax.swing.JComboBox<>();
        Groupid = new javax.swing.JComboBox<>();
        groupno = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextStudentID = new javax.swing.JTextField();
        jTextStudentname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("CENTER");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("ACADEMIC YEAR");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("PROGRAMME");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("GROUP NO");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("GROUP ID");

        Academicyear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Academicyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACADEMIC YEAR", "1 st  year 1 st  semester", "1 st  year 2 nd semester", "2 nd year 1 st semester", "2 nd year 2 nd semester", "3 rd  year 1 st  semester", "3 rd  year 2 nd semester", "4 th year 1 st semester", "4 th year 2 nd semester" }));

        Center.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Center.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " CENTER", "MALABE - CAMPUS", "METRO - CAMPUS", "MATARA - CENTER", "KANDY - CENTER", "KURUNAGALA - CENTER", "JAFFNA - CENTER" }));

        programme.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        programme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROGRAMME", "Faculty of Business", "Faculty of Computing", "Faculty Of Engineering" }));

        Groupid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Groupid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GROUP ID", "Y1S1", "Y1S2", "Y2S1", "Y2S2", "Y3S1", "Y3S2", "Y4S1", "Y4S2" }));

        groupno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        groupno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GROUP NO", "IT1", "IT2", "IT3", "BM1", "BM2", "BM3", "EN1", "EN2", "EN3", " " }));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("NEXT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2)
                            .addComponent(jButton6))))
                .addGap(25, 25, 25))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("ADD STUDENT GROUP");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("STUDENT ID");

        jTextStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextStudentIDActionPerformed(evt);
            }
        });

        jTextStudentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextStudentnameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("STUDENT NAME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextStudentname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Center, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Academicyear, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(programme, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Groupid, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupno, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(393, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(533, 533, 533))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jTextStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(programme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jTextStudentname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(Groupid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(groupno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Academicyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane2.addTab("ADD STUDENT GROUP", jPanel2);

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STUDENT ID", "STUDENT NAME", "CENTER", "ACADEMIC YEAR", "PROGRAMME", "GROUP ID", "GROUP NO"
            }
        ));
        jTable12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable12MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable12);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("MANAGE STUDENT GROUP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jButton5)))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(jButton5))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("MANAGE GROUP", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1272, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable12MouseClicked

        DefaultTableModel RecordTable = (DefaultTableModel)jTable12.getModel();
        int SelectedRows = jTable12.getSelectedRow();

        jTextStudentID.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        jTextStudentname.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        Center.setSelectedItem(RecordTable.getValueAt(SelectedRows, 2).toString());
        Academicyear.setSelectedItem(RecordTable.getValueAt(SelectedRows, 3).toString());
        programme.setSelectedItem(RecordTable.getValueAt(SelectedRows, 4).toString());
        Groupid.setSelectedItem(RecordTable.getValueAt(SelectedRows, 5).toString());
        groupno.setSelectedItem(RecordTable.getValueAt(SelectedRows, 6).toString());
        
 
    }//GEN-LAST:event_jTable12MouseClicked

    private void jTextStudentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextStudentnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextStudentnameActionPerformed

    private void jTextStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextStudentIDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        frame = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(frame, "confirm if you to exit","",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)

    {

        System.exit(0);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jTextStudentID.setText("");
        jTextStudentname.setText("");
        Center.setSelectedIndex(0);
        Academicyear.setSelectedIndex(0);
        programme.setSelectedIndex(0);
        Groupid.setSelectedIndex(0);
        groupno.setSelectedIndex(0);
        
         DefaultTableModel RecordTable = (DefaultTableModel)jTable12.getModel();
                   RecordTable.setRowCount(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlconn = DriverManager.getConnection(dataconn,username,password);

            pst = sqlconn.prepareStatement("insert into addstudent(StudentID,Studentname,Center,Academicyearsemaster,"
                + "program,GroupID,GroupNO)value(?,?,?,?,?,?,?)");

            pst.setString(1, jTextStudentID.getText());
            pst.setString(2, jTextStudentname.getText());
            pst.setString(3, Center.getSelectedItem().toString());
            pst.setString(4, Academicyear.getSelectedItem().toString());
            pst.setString(5, programme.getSelectedItem().toString());
            pst.setString(6, Groupid.getSelectedItem().toString());
            pst.setString(7, groupno.getSelectedItem().toString());

            pst.execute();

            JOptionPane.showMessageDialog(this, " STUDENT RECORD ADDED");
            upDateDB();

            model.insertRow(model.getRowCount(),new Object[]{jTextStudentID.getText(),jTextStudentname.getText(),Center.getSelectedItem(),Academicyear.getSelectedItem(), programme.getSelectedItem(),Groupid.getSelectedItem(),groupno.getSelectedItem()});

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Addstudentgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            //System.err.print(ex);
            java.util.logging.Logger.getLogger(Addstudentgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        try {
            new tag ().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Addstudentgroup.class.getName()).log(Level.SEVERE, null, ex);
        }
             this.setVisible(false);
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
             
         DefaultTableModel RecordTable = (DefaultTableModel)jTable12.getModel();
        int SelectedRows = jTable12.getSelectedRow();
        
          try
        {
             int id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlconn = DriverManager.getConnection(dataconn,username,password);

            pst = sqlconn.prepareStatement("update addstudent set StudentID =?,Studentname =?"
                    +"Center =?, Academicyearsemaster =?,Program =?, GroupID =?,GroupNO =? where id =?");

            pst.setString(1, jTextStudentID.getText());
            pst.setString(2, jTextStudentname.getText());
            pst.setString(3, Center.getSelectedItem().toString());
            pst.setString(4, Academicyear.getSelectedItem().toString());
            pst.setString(5, programme.getSelectedItem().toString());
            pst.setString(6, Groupid.getSelectedItem().toString());
            pst.setString(7, groupno.getSelectedItem().toString());
            pst.setInt(8, id);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, " STUDENT RECORD UPDATE");
            upDateDB();

            model.insertRow(model.getRowCount(),new Object[]{jTextStudentID.getText(),jTextStudentname.getText(),Center.getSelectedItem(),Academicyear.getSelectedItem(), programme.getSelectedItem(),Groupid.getSelectedItem(),groupno.getSelectedItem()});

        } catch (ClassNotFoundException ex) {
       java.util.logging.Logger.getLogger(Addstudentgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.err.print(ex);
            //java.util.logging.Logger.getLogger(Addstudentgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
          
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         
        DefaultTableModel RecordTable = (DefaultTableModel)jTable12.getModel();
        int SelectedRows = jTable12.getSelectedRow();
        
          try
        {
             int id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
             
             int deleteItem = JOptionPane.showConfirmDialog(null,"confirm if you want to delete item",
                     "Warining",JOptionPane.YES_NO_OPTION);
             if (deleteItem ==JOptionPane.NO_OPTION)
             {
             
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlconn = DriverManager.getConnection(dataconn,username,password);

            pst = sqlconn.prepareStatement("delete from addstudent where id =?");

            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, " STUDENT RECORD UPDATE");
            upDateDB();
            
        jTextStudentID.setText("");
         jTextStudentID.requestFocus();
        jTextStudentname.setText("");
        Center.setSelectedIndex(0);
        Academicyear.setSelectedIndex(0);
        programme.setSelectedIndex(0);
        Groupid.setSelectedIndex(0);
        groupno.setSelectedIndex(0);
        
             }
           

            //model.insertRow(model.getRowCount(),new Object[]{jTextStudentID.getText(),jTextStudentname.getText(),Center.getSelectedItem(),Academicyear.getSelectedItem(), programme.getSelectedItem(),Groupid.getSelectedItem(),groupno.getSelectedItem()});

        } catch (ClassNotFoundException ex) {
       java.util.logging.Logger.getLogger(Addstudentgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.err.print(ex);
            //java.util.logging.Logger.getLogger(Addstudentgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
 
    }//GEN-LAST:event_jButton5ActionPerformed

     private JFrame frame;
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
            java.util.logging.Logger.getLogger(Addstudentgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addstudentgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addstudentgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addstudentgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Addstudentgroup().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Addstudentgroup.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Academicyear;
    private javax.swing.JComboBox<String> Center;
    private javax.swing.JComboBox<String> Groupid;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> groupno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable12;
    private javax.swing.JTextField jTextStudentID;
    private javax.swing.JTextField jTextStudentname;
    private javax.swing.JComboBox<String> programme;
    // End of variables declaration//GEN-END:variables
}
