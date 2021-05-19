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
import java.util.Properties;


/**
 *
 * @author Dhivahar
 */
public class timetable1 extends javax.swing.JFrame {

    
     private static final String username = "root";
    private static final String password = "8080";
    private static final String dataconn = "jdbc:mysql://localhost:3306/student";
    
    
    Connection sqlconn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int q,i,id, deleteItem;
    
    /**
     * Creates new form timetable1
     */
    public timetable1()throws SQLException {
        initComponents();
        
    }

     public void upDateDB() throws SQLException
   {
      try
      {
           Class.forName("com.mysql.cj.jdbc.Driver");
           sqlconn = DriverManager.getConnection(username,password,dataconn);
           pst = sqlconn.prepareStatement("select * from student");
           
           rs = pst.executeQuery();
           ResultSetMetaData stData = rs.getMetaData();
           
           
           q = stData.getColumnCount();
           
            
                   
                   
                   while(rs.next()){
                   
                   Vector columnData = new Vector ();
                   
                         for(i = 1;i <= q; i++)
                         {
                         
                         columnData.add(rs.getString("ID"));
                         columnData.add(rs.getString("StudentID"));
                         columnData.add(rs.getString("Studentname"));
                         columnData.add(rs.getString("Center"));
                         columnData.add(rs.getString("Faculty"));
                         columnData.add(rs.getString("Gender"));
                         columnData.add(rs.getString("Address"));
                         columnData.add(rs.getString("Email"));
                         columnData.add(rs.getString("Phonenumber"));
                         
                         
                            }
                  
                   }
      
      
      }
                catch(Exception ex){
               JOptionPane.showMessageDialog(null, ex);
                
                }
   
   }
   
   
   
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jtxtAddress = new javax.swing.JTextField();
        jtxtStudentname = new javax.swing.JTextField();
        jtxtStudentID = new javax.swing.JTextField();
        jtxtPhonenumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jtxtCenter = new javax.swing.JComboBox<>();
        jtxtGender = new javax.swing.JComboBox<>();
        jtxtFaculty = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jbtnadd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jtxtExit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 9, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("STUDENT PROFILE");
        jPanel3.add(jLabel1);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 570, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("PHONE NUMBER");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("CENTER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("STUDENT NAME");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("STUDENT ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("GENDER");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("FACULTY");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("ADDRESS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.setForeground(new java.awt.Color(0, 51, 51));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("PERSONAL DETAILS");
        jPanel4.add(jLabel12);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 250, 40));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("CLASS DETAILS");
        jPanel5.add(jLabel11);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 210, 40));

        jtxtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 170, 60));

        jtxtStudentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtStudentnameActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtStudentname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 170, 30));

        jtxtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtStudentIDActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 170, 30));
        jPanel1.add(jtxtPhonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 170, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("EMAIL");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));
        jPanel1.add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 170, 50));

        jtxtCenter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtxtCenter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CENTER", "KANDY", "METRO", "JAFFNA", "KURUNAGLE", "MATARA" }));
        jPanel1.add(jtxtCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 170, 30));

        jtxtGender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtxtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENDER", "MALE", "FEMALE" }));
        jPanel1.add(jtxtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 140, 30));

        jtxtFaculty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtxtFaculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FACULTY", "COMPUTING", "BUSINESS", "ENGINEERING", "HUMANITIES AND SCIENCES", "GRADUATE STUDIES AND RESEARCH" }));
        jPanel1.add(jtxtFaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 220, 30));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jbtnadd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnadd.setForeground(new java.awt.Color(0, 51, 51));
        jbtnadd.setText("ADD");
        jbtnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnaddActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnadd);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);

        jtxtExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtxtExit.setText("EXIT");
        jtxtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtExitActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtExit);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 350, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1120, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtStudentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtStudentnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtStudentnameActionPerformed

    private void jtxtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAddressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jtxtStudentID.setText("");
        jtxtStudentname.setText("");
        jtxtCenter.setSelectedIndex(0);
        jtxtFaculty.setSelectedIndex(0);
        jtxtGender.setSelectedIndex(0);
        jtxtAddress.setText("");
        jtxtPhonenumber.setText("");
        jtxtEmail.setText("");
      
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

     private JFrame frame;
    
    private void jtxtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtExitActionPerformed
        
        frame = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(frame, "confirm if you to exit","",
               JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            
        {
        
                System.exit(0);
        
        }
        
        
        
        
    }//GEN-LAST:event_jtxtExitActionPerformed

    private void jbtnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnaddActionPerformed
      
          try
      {
           Class.forName("com.mysql.cj.jdbc.Driver");
           sqlconn = DriverManager.getConnection(dataconn,username,password);
           
           pst = sqlconn.prepareStatement("insert into student(StudentID,Studentname,Center,Faculty,"
                       + "Gender,Address,Email,Phonenumber)value(?,?,?,?,?,?,?,?)");
           
              
         
           pst.setString(1, jtxtStudentID.getText());
           pst.setString(2, jtxtStudentname.getText());
           pst.setString(3, jtxtCenter.getSelectedItem().toString());
           pst.setString(4, jtxtFaculty.getSelectedItem().toString());
           pst.setString(5, jtxtGender.getSelectedItem().toString());
           pst.setString(6, jtxtAddress.getText());
           pst.setString(7, jtxtEmail.getText());
           pst.setString(8, jtxtPhonenumber.getText());
           
           pst.execute();
           
           JOptionPane.showMessageDialog(this, " STUDENT RECORD ADDED");
           upDateDB();
      
      } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Addstudentgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Addstudentgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }                                          

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                           
      
    
        
    }//GEN-LAST:event_jbtnaddActionPerformed

    private void jtxtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtStudentIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
         
         try {
             new Addstudentgroup ().setVisible(true);
             this.setVisible(false);
         } catch (SQLException ex) {
             Logger.getLogger(timetable1.class.getName()).log(Level.SEVERE, null, ex);
         }
      
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(timetable1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(timetable1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(timetable1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(timetable1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new timetable1().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(timetable1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnadd;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JComboBox<String> jtxtCenter;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JButton jtxtExit;
    private javax.swing.JComboBox<String> jtxtFaculty;
    private javax.swing.JComboBox<String> jtxtGender;
    private javax.swing.JTextField jtxtPhonenumber;
    private javax.swing.JTextField jtxtStudentID;
    private javax.swing.JTextField jtxtStudentname;
    // End of variables declaration//GEN-END:variables
}
