/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import Project.Managelocations;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dilshika
 */
public class AssignRoom extends javax.swing.JFrame {

    DBConnection dbcon = new DBConnection();
    PreparedStatement pst = null;
    
    
    
    
    
    
    

    /**
     * Creates new form AssignRoom
     */
    public AssignRoom() {
        
        initComponents();
        
        droploc();
        
    }
    
    
    
    public void droploc()
    {
        
        if((combomodule.getSelectedIndex() == 0) || (combomodule.getSelectedIndex() == 1) || (combomodule.getSelectedIndex() == 2) || (combomodule.getSelectedIndex() == 5) || (combomodule.getSelectedIndex() == 6) || (combomodule.getSelectedIndex() == 8) && (combotag.getSelectedIndex() == 0) || (combotag.getSelectedIndex() == 1) || (combotag.getSelectedIndex() == 2) || (combotag.getSelectedIndex() == 3) )
         {
             
             
            try {

                    String sql = "select concat(BUILDING, ROOMNAME,  ROOMTYPE) as Location from Location";
                    
                    Connection c = dbcon.getConnection();

                    pst = c.prepareStatement(sql);
                 
                    ResultSet rs  = pst.executeQuery();
                 
                 
                 while(rs.next())
                 {
                     
                     comboloc.addItem(rs.getString("Location"));
                     
                 }
            
                 
                 pst.execute();

                 c.close();

            } catch (Exception e) {

                System.err.println(e.getMessage());

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        combomodule = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combolec2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        combolec3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        combolec1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        combolec4 = new javax.swing.JComboBox<>();
        combotag = new javax.swing.JComboBox<>();
        label = new javax.swing.JLabel();
        combosubgroup = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textases = new javax.swing.JTextArea();
        btnsubmit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        comboloc = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        combosgroup = new javax.swing.JComboBox<>();
        btnshowsession = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assign Room");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Select Module");

        combomodule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Introduction to Programming", "Software Engineering", "IT Project", "Finance Accounting", "Economics", "Machine Learning", "Computer Networking", "Event Management", "Data Science and Analytics", "General English", "Mobile Application Development", "Object Oriented Programming", "Electrical Engineering " }));
        combomodule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomoduleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tag");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Lecturer 1 ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Lecturer 2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Lecturer 3 ");

        combolec1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.Jagath Wickramarathne", "Mr.Prasad Jayawardana", "Mrs. Oshadi Gajasinghe", "Mrs. Bhagya Jayasinghe", "Mr.Upul Dias", "Mrs. Sanuki Kariyawasam", "Mr. Dilshika Netthikumarage", "Mr. Ajith Wijesundara", "Mrs. Tharuka Jayawickrama", "Mr. Kelum Perera" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Lecturer 4");

        combotag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotagActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setText("Student SubGroup");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Selected Session");

        textases.setColumns(20);
        textases.setRows(5);
        jScrollPane1.setViewportView(textases);

        btnsubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsubmitMouseClicked(evt);
            }
        });
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Location");

        comboloc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        comboloc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combolocMouseClicked(evt);
            }
        });
        comboloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combolocActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Student  Group");

        btnshowsession.setText("Show Session");
        btnshowsession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowsessionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboloc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combolec1, 0, 197, Short.MAX_VALUE)
                    .addComponent(combomodule, 0, 197, Short.MAX_VALUE)
                    .addComponent(combolec2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combolec3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combolec4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combotag, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combosubgroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(combosgroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnshowsession, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combomodule, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combosgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combosubgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnshowsession, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(combotag, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combolec1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combolec2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combolec3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(combolec4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(comboloc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combotagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotagActionPerformed
        
       
          
         if(combotag.getSelectedItem().equals("Lecture") || (combotag.getSelectedItem().equals("Tutorial")))
         {
                
                
                combosgroup.addItem("Y1.S1.1(IT)");
                combosgroup.addItem("Y1.S1.2(IT)");
                combosgroup.addItem("Y1.S2.1(IT)");
                combosgroup.addItem("Y1.S2.2(IT)");
                combosgroup.addItem("Y2.S1.1(IT)");
                combosgroup.addItem("Y2.S1.2(IT)");
                combosgroup.addItem("Y2.S2.1(IT)");
                combosgroup.addItem("Y1.S1.1(BM)");
                combosgroup.addItem("Y2.S2.2(IT)");
                combosgroup.addItem("Y2.S2.2(CSNE)");
                combosgroup.addItem("Y3.S1.1(IT)");
                combosgroup.addItem("Y3.S1.2(IT)");
                combosgroup.addItem("Y3.S2.1(IT)");
                combosgroup.addItem("Y3.S2.2(IT)");
                combosgroup.addItem("Y4.S1.1(IT)");
                combosgroup.addItem("Y4.S1.1(IT)");
                combosgroup.addItem("Y4.S2.1(IT)");
                combosgroup.addItem("Y4.S2.2(IT)");
                
                
                
                combolec2.setEnabled(false);
                
                combolec3.setEnabled(false);
                
                combolec4.setEnabled(false);
                
                combosgroup.setEnabled(true);
                combosubgroup.setEnabled(false);
                
                
                
                
            
          }
         
         else
         {
         
            combolec2.setEnabled(true);
             
            combolec2.addItem("Mr. Dushan");
            combolec2.addItem("Mr. Samatha ");
            combolec2.addItem("Mr. Deepal");
            combolec2.addItem("Mrs. Tharusha");
            combolec2.addItem("Miss. Jagath");
            combolec2.addItem("Miss. Sandakelum");
            combolec2.addItem("Mr. Perera");
            combolec2.addItem("Mr. Hansaka");
            combolec2.addItem("Miss. Udara ");
            combolec2.addItem("Mr. Kamal ");
            combolec2.addItem("Mr. Ganesh ");
            
            
            
            combosubgroup.addItem("Y1.S1.1.1(IT)");
            combosubgroup.addItem("Y1.S1.2,2(IT)");
            combosubgroup.addItem("Y1.S2.1.1(IT)");
            combosubgroup.addItem("Y1.S2.2.2(IT)");
            combosubgroup.addItem("Y2.S1.1.1(IT)");
            combosubgroup.addItem("Y2.S1.2.2(IT)");
            combosubgroup.addItem("Y2.S2.1.1(IT)");
            combosubgroup.addItem("Y2.S2.2.2(IT)");
            combosubgroup.addItem("Y2.S2.2.1(CSNE)");
            combosubgroup.addItem("Y3.S1.1.1(IT)");
            combosubgroup.addItem("Y3.S1.2.2(IT)");
            combosubgroup.addItem("Y3.S2.1.1(IT)");
            combosubgroup.addItem("Y3.S2.2.2(IT)");
            combosubgroup.addItem("Y4.S1.1.1(IT)");
            combosubgroup.addItem("Y4.S1.2.2(IT)");
            combosubgroup.addItem("Y4.S2.1.1(IT)");
            combosubgroup.addItem("Y4.S2.2.2(IT)");
            
            combosubgroup.setEnabled(true);
            combosgroup.setEnabled(false);
            
         
         }
       
        
        
        
        if(combotag.getSelectedItem().equals("Evaluations") && (combomodule.getSelectedItem().equals("IT Project")))
        {
            
            
            
            combolec2.addItem("Mr. Dushan");
            combolec2.addItem("Mr. Samantha ");
            combolec2.addItem("Mr. Deepal");
            combolec2.addItem("Mrs. Tharusha");
            combolec2.addItem("Mr. Jagath");
            combolec2.addItem("Mr. Sandakelum");
            combolec2.addItem("Mr. Perera");
            combolec2.addItem("Mr. Hansaka");
            combolec2.addItem("Miss. Udara");
            combolec2.addItem("Mr. Kamal ");
            combolec2.addItem("Mr. Ganesh ");
            
            
            
            combolec3.addItem("Mr. Wadeesha");
            combolec3.addItem("Mr. Udaya ");
            combolec3.addItem("Mr. Oshan");
            combolec3.addItem("Mrs. Dharani ");
            combolec3.addItem("Miss.Uthpala");
            combolec3.addItem("Miss. Janani ");
            combolec3.addItem("Mr. Nuresh ");
            combolec3.addItem("Mr. Sandaruwan");
            combolec3.addItem("Miss. Tharushika");
            combolec3.addItem("Mr. Nayana");
            combolec3.addItem("Mr. Nuwan");
            
            combolec4.addItem("Mrs. Manjula ");
            combolec4.addItem("Mrs. Gayani ");
            combolec4.addItem("Mr. Pasan");
            combolec4.addItem("Mr. Yashantha");
            combolec4.addItem("Mrs.Kaushi");
            combolec4.addItem("Ms. Udara");
            combolec4.addItem("Mr. Suresh");
            combolec4.addItem("Mr. Selvaraja");
            combolec4.addItem("Mr. Banuja");
            combolec4.addItem("Mrs. Nayana");
            combolec4.addItem("Mr. Nuwandi");
            
            
            combolec2.setEnabled(true);
            combolec3.setEnabled(true);
            combolec4.setEnabled(true);
        
       }
       
        
        
    }//GEN-LAST:event_combotagActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        
        
        
        if((combotag.getSelectedItem().equals("Lecture") || (combotag.getSelectedItem().equals("Tutorial"))))
        {
        
            try {
                
                    Connection c = dbcon.getConnection();

                    String sql = "insert into ASSIGNROOMSTOSESSION(MODULE,MODULETAG,LECTURER1,STUDENTGROUP,LOCATION) values (?,?,?,?,?)";

                    pst = c.prepareStatement(sql);
            
                    
                    pst.setString(1,combomodule.getSelectedItem().toString());
                    pst.setString(2, combotag.getSelectedItem().toString()); 
                    pst.setString(3, combolec1.getSelectedItem().toString());
                    pst.setString(4, combosgroup.getSelectedItem().toString());
                    pst.setString(5, comboloc.getSelectedItem().toString());
            
                    
                   ManageAssignRooms marooms = new ManageAssignRooms();
                   marooms.setVisible(true);

                    pst.execute();

                    c.close();

            } catch (Exception e) {

                System.err.println(e.getMessage());

            }
        
             
        
       
            
        }
        else if((combotag.getSelectedItem().equals("Practical")))
        {
            
             try {
                    
                    Connection c = dbcon.getConnection();

                    

                    String sql = "insert into ASSIGNROOMSTOSESSION(MODULE,MODULETAG,LECTURER1,LECTURER2,LOCATION,STUDENTSUBGROUP) values (?,?,?,?,?,?)";

                    pst = c.prepareStatement(sql);
            
                    
            
                   pst.setString(1,combomodule.getSelectedItem().toString());
                   pst.setString(2, combotag.getSelectedItem().toString()); ;
                   pst.setString(3, combolec1.getSelectedItem().toString());
                   pst.setString(4, combolec2.getSelectedItem().toString());
                   pst.setString(5, comboloc.getSelectedItem().toString());
                   pst.setString(6, combosubgroup.getSelectedItem().toString());
            
                    
                   ManageAssignRooms marooms = new ManageAssignRooms();
                   marooms.setVisible(true);

                    pst.execute();

                    c.close();

            } catch (Exception e) {

                System.err.println(e.getMessage());

            }
        
         
        }
        
        
            
        
            
         else if(combotag.getSelectedItem().equals("Evaluations"))
         {
             
             try {

                    Connection c = dbcon.getConnection();

                    

                    String sql = "insert into ASSIGNROOMSTOSESSION(MODULE,MODULETAG,LECTURER1,LECTURER2,LECTURER3,LECTURER4,LOCATION,STUDENTSUBGROUP) values (?,?,?,?,?,?,?,?)";

                    pst = c.prepareStatement(sql);
            
                   pst.setString(1,combomodule.getSelectedItem().toString());
                   pst.setString(2, combotag.getSelectedItem().toString()); ;
                   pst.setString(3, combolec1.getSelectedItem().toString());
                   pst.setString(4, combolec2.getSelectedItem().toString());
                   pst.setString(5, combolec3.getSelectedItem().toString());
                   pst.setString(6, combolec4.getSelectedItem().toString());
                   pst.setString(7, comboloc.getSelectedItem().toString());
                   pst.setString(8, combosubgroup.getSelectedItem().toString());
            
                   JOptionPane.showMessageDialog(this, "Room Assigned Successfully");
                   
                   ManageAssignRooms marooms = new ManageAssignRooms();
                   marooms.setVisible(true);

                    pst.execute();

                    c.close();

            } catch (Exception e) {

                System.err.println(e.getMessage());

            }
         
         
         }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void combomoduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomoduleActionPerformed
        
        
        
      if((combomodule.getSelectedIndex() == 0) || (combomodule.getSelectedIndex() == 1) || (combomodule.getSelectedIndex() == 5) || (combomodule.getSelectedIndex() == 6) || (combomodule.getSelectedIndex() == 8 ) || (combomodule.getSelectedIndex() == 10))
      {
           
           
           combotag.addItem("Lecture");
           combotag.addItem("Tutorial");
           combotag.addItem("Practical");
           combotag.removeItem("Evaluations");
       
      }
      
      
      else  
      if((combomodule.getSelectedItem().equals("Economics")) || (combomodule.getSelectedItem().equals("Finance Accounting")) || (combomodule.getSelectedItem().equals("General English")) || (combomodule.getSelectedItem().equals("Event Management")))
       {
           
           combotag.addItem("Lecture");
           combotag.addItem("Tutorial");
           combotag.removeItem("Practical");
           combotag.removeItem("Evaluations");
           
           
           combosgroup.setEnabled(true);
       
       }
      
      else
      if((combomodule.getSelectedItem().equals("IT Project")))
      {
        
          combotag.addItem("Evaluations");
          combotag.removeItem("Lecture");
          combotag.removeItem("Practical");
          combotag.removeItem("Tutorial");
      }
      
      
     
            
            
           
            
            
        
            
            
            
     
     
      
      
      
      
       
        
        
    }//GEN-LAST:event_combomoduleActionPerformed

    private void combolocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combolocMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_combolocMouseClicked

    private void combolocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combolocActionPerformed
        
         
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_combolocActionPerformed

    private void btnsubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsubmitMouseClicked
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnsubmitMouseClicked

    private void btnshowsessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowsessionActionPerformed
       
        
        if((combotag.getSelectedItem().equals("Lecture") || (combotag.getSelectedItem().equals("Tutorial"))))
        {
                textases.setText(combomodule.getSelectedItem().toString() + combotag.getSelectedItem().toString() + combolec1.getSelectedItem().toString() + combosgroup.getSelectedItem().toString() + comboloc.getSelectedItem().toString());
        
        }
        else if(combotag.getSelectedItem().equals("Practical"))
        {
        
            textases.setText(combomodule.getSelectedItem().toString() + combotag.getSelectedItem().toString() + combolec1.getSelectedItem().toString() + combolec2.getSelectedItem().toString() + combosubgroup.getSelectedItem().toString() + comboloc.getSelectedItem().toString());
        
        
        }
        else if(combotag.getSelectedItem().equals("Evaluations"))
        {
        
            textases.setText(combomodule.getSelectedItem().toString() + combotag.getSelectedItem().toString() + combolec1.getSelectedItem().toString() + combolec2.getSelectedItem().toString() + combolec3.getSelectedItem().toString() + combolec4.getSelectedItem().toString() + combosubgroup.getSelectedItem().toString() + comboloc.getSelectedItem().toString());
        
        }
        
        
        
    }//GEN-LAST:event_btnshowsessionActionPerformed

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
            java.util.logging.Logger.getLogger(AssignRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignRoom().setVisible(true);
                
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnshowsession;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> combolec1;
    private javax.swing.JComboBox<String> combolec2;
    private javax.swing.JComboBox<String> combolec3;
    private javax.swing.JComboBox<String> combolec4;
    public javax.swing.JComboBox<String> comboloc;
    private javax.swing.JComboBox<String> combomodule;
    private javax.swing.JComboBox<String> combosgroup;
    private javax.swing.JComboBox<String> combosubgroup;
    private javax.swing.JComboBox<String> combotag;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTextArea textases;
    // End of variables declaration//GEN-END:variables
}
