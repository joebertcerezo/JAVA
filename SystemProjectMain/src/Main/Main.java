/*
File: Main.java
Description: Carinderia Management System
Programmer: Joebert L. Cerezo
Date: June 09, 2021
 */

package Main;

import java.awt.CardLayout;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.URL; //open url import
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {
    //declaration of global variables
    ArrayList<Register> Users;
    ArrayList<Receipt> Resibo;
    String header[] = new String[]{"First Name", "Last Name", "Email Address", "Username", "Password"};
    String header1[] = new String[]{"Reference No.", "Date", "Time", "Receipt"};
    DefaultTableModel dtm;
    DefaultTableModel dtm1;
    int row,col;
    double[] i = new double[100];
    CardLayout cardLayout;
    
    public Main() {
        initComponents();
        
        //set jframe location to center
        setLocationRelativeTo(null);
        
        //card layout to jlayeredpanel
        cardLayout=(CardLayout) jLayeredPane1.getLayout();
        
        //hide jPanel2 and jPanel4
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        
        //Initialize arraylist and table model
        Users = new ArrayList<>();
        dtm = new DefaultTableModel(header,0);
        jTable1.setModel(dtm);  
        
        Resibo = new ArrayList<>();
        dtm1 = new DefaultTableModel(header1,0);
        jTable2.setModel(dtm1); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        login = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        UserLogin = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        register = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        admin = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        AdminLogin = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        abouts = new javax.swing.JPanel();
        facebook = new javax.swing.JLabel();
        instagram = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel25 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Alltotal = new javax.swing.JLabel();
        TotalMeals = new javax.swing.JLabel();
        jlblCostOfMeal = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textmeal10 = new javax.swing.JTextField();
        textmeal1 = new javax.swing.JTextField();
        textmeal2 = new javax.swing.JTextField();
        textmeal3 = new javax.swing.JTextField();
        textmeal4 = new javax.swing.JTextField();
        textmeal5 = new javax.swing.JTextField();
        textmeal6 = new javax.swing.JTextField();
        textmeal7 = new javax.swing.JTextField();
        textmeal8 = new javax.swing.JTextField();
        textmeal9 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        textdrinks5 = new javax.swing.JTextField();
        textdrinks1 = new javax.swing.JTextField();
        textdrinks2 = new javax.swing.JTextField();
        textdrinks3 = new javax.swing.JTextField();
        textdrinks4 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        JButtonReceipt = new javax.swing.JButton();
        JButtonTotal = new javax.swing.JButton();
        JButtonTotal1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        textmeal11 = new javax.swing.JTextField();
        textmeal12 = new javax.swing.JTextField();
        textmeal13 = new javax.swing.JTextField();
        textmeal14 = new javax.swing.JTextField();
        textmeal15 = new javax.swing.JTextField();
        textmeal16 = new javax.swing.JTextField();
        textmeal17 = new javax.swing.JTextField();
        textmeal18 = new javax.swing.JTextField();
        textmeal19 = new javax.swing.JTextField();
        textmeal20 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        textdrinks6 = new javax.swing.JTextField();
        textdrinks7 = new javax.swing.JTextField();
        textdrinks8 = new javax.swing.JTextField();
        textdrinks9 = new javax.swing.JTextField();
        textdrinks10 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jLabel51 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel27 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CARINDERIA MANAGEMENT SYSTEM");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1068, 536));
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(0, 204, 153));
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Username");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Password");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Not yet a member?");

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(19, 101, 138));
        jButton3.setText("Sign Up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        UserLogin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        UserLogin.setText("Login");
        UserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserLogin)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jTextField1)
                        .addComponent(jLabel7)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserLogin)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        login.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 370, 280));

        jPanel8.setBackground(new java.awt.Color(0, 204, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Login");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/kissclipart-logo-login-png-clipart-login-clip-art-03c0b94716052faf (1).png"))); // NOI18N
        jPanel8.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 70));

        login.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 370, 90));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/GRT-filipino-food-dishes-1296x728-header.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        login.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 410));

        jLayeredPane1.add(login, "card1");

        register.setBackground(new java.awt.Color(0, 204, 153));
        register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 204, 153));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Register");
        jPanel13.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        register.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 530, 90));

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("First Name:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Last Name:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Email Address:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Username: ");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Password:");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Sign Up");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(jTextField5))))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField3))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        register.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/GRT-filipino-food-dishes-1296x728-header.jpg"))); // NOI18N
        jLabel17.setText("jLabel15");
        register.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 410));

        jLayeredPane1.add(register, "card3");

        admin.setBackground(new java.awt.Color(0, 204, 153));
        admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Username");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Password");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Not an Admin?");

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(19, 101, 138));
        jButton5.setText("User Login");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        AdminLogin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AdminLogin.setText("Login");
        AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdminLogin)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10)
                        .addComponent(jTextField2)
                        .addComponent(jLabel11)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdminLogin)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        admin.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 370, 280));

        jPanel10.setBackground(new java.awt.Color(0, 204, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel99.setText("ADMIN");
        jPanel10.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 70, 20));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/kissclipart-logo-login-png-clipart-login-clip-art-03c0b94716052faf (1).png"))); // NOI18N
        jPanel10.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 70));

        jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("Login");
        jPanel10.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        admin.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 370, 90));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/GRT-filipino-food-dishes-1296x728-header.jpg"))); // NOI18N
        jLabel16.setText("jLabel15");
        admin.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 410));

        jLayeredPane1.add(admin, "card2");

        abouts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/ac573b439cde3dec8ca1c6739ae7f628 (3).jpg"))); // NOI18N
        facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebookMouseClicked(evt);
            }
        });
        abouts.add(facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 40, 40));

        instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Instagram logo (3).jpg"))); // NOI18N
        instagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instagramMouseClicked(evt);
            }
        });
        abouts.add(instagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 40, 40));

        twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/download (1) (1).jpg"))); // NOI18N
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
        });
        abouts.add(twitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 40, 40));

        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Contact me: (Click the icon)");
        jPanel32.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        abouts.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 180, 70));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("File: Main.java\nDescription: Carinderia Management System\nProgrammer: Joebert L. Cerezo\nDate: June 09, 2021\n\n\nSystem Requirements:\n\t* 1 gigahertz (GHz) or faster 32-bit (x86) or 64-bit (x64) processor\n\t* 1 gigabyte (GB) RAM (32-bit) / 2 GB RAM (64-bit)\n\t* 16 GB available disk space (32-bit) / 20 GB (64-bit)\n\t* DirectX 9 graphics processor with WDDM 1.0 or higher driver\n\t* Java JDK SE 8\n\t* Neatbeans IDE 8.2\n\nSystem Specifications:\n\t* Admin & User Login\n\t* Admin can add & delete users (admin page)\n\t* Admin can edit price list (admin page)\n\t* Users can print Receipt (users page)\n\t* Stores printed receipt (admin page)\n\t* Pop ups additional calculator (users page)\n");
        jScrollPane3.setViewportView(jTextArea2);

        abouts.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 520, 370));

        jPanel25.setBackground(new java.awt.Color(0, 0, 0));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/ako.jpg"))); // NOI18N
        jLabel74.setText("jLabel74");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abouts.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 200, 200));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/shutterstock_506898349-1280x720.jpg"))); // NOI18N
        jLabel73.setText("jLabel73");
        abouts.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 410));

        jLayeredPane1.add(abouts, "card4");

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 116, 830, 410));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carinderia Management System");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 25, 802, -1));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 780, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/images.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 240, 80));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/images.jpg"))); // NOI18N
        jLabel18.setText("jLabel14");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 80));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/images.jpg"))); // NOI18N
        jLabel19.setText("jLabel14");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 270, 80));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/images.jpg"))); // NOI18N
        jLabel20.setText("jLabel14");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 270, 80));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tab1.setBackground(new java.awt.Color(0, 0, 0));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User");

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tab2.setBackground(new java.awt.Color(0, 0, 0));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin");

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab3.setBackground(new java.awt.Color(0, 0, 0));
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Abouts");

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/download.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel97)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel97)
                .addGap(29, 29, 29)
                .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, 420));

        jLayeredPane2.setLayout(new java.awt.CardLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setText("Total");
        jPanel14.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel28.setText("Total");
        jPanel14.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel29.setText("Meals");
        jPanel14.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        Alltotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Alltotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Alltotal.setText("0.00");
        Alltotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel14.add(Alltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 140, 30));

        TotalMeals.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TotalMeals.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TotalMeals.setText("0.00");
        TotalMeals.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel14.add(TotalMeals, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 140, 30));

        jlblCostOfMeal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblCostOfMeal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCostOfMeal.setText("0.00");
        jlblCostOfMeal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel14.add(jlblCostOfMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 140, 30));

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel75.setText("Drinks");
        jPanel14.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jPanel4.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 290, 140));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setPreferredSize(new java.awt.Dimension(325, 418));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Meals");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        textmeal10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal10.setText("0");
        jPanel5.add(textmeal10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 40, 30));

        textmeal1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal1.setText("0");
        jPanel5.add(textmeal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 40, 30));

        textmeal2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal2.setText("0");
        jPanel5.add(textmeal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 40, 30));

        textmeal3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal3.setText("0");
        jPanel5.add(textmeal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 40, 30));

        textmeal4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal4.setText("0");
        jPanel5.add(textmeal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 40, 30));

        textmeal5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal5.setText("0");
        jPanel5.add(textmeal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 40, 30));

        textmeal6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal6.setText("0");
        jPanel5.add(textmeal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 40, 30));

        textmeal7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal7.setText("0");
        jPanel5.add(textmeal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 40, 30));

        textmeal8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal8.setText("0");
        jPanel5.add(textmeal8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 40, 30));

        textmeal9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal9.setText("0");
        jPanel5.add(textmeal9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 40, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel30.setText("Pork Humba");
        jLabel30.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel31.setText("Paklay");
        jLabel31.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel32.setText("Ngohiong");
        jLabel32.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel33.setText("Kinilaw");
        jLabel33.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel34.setText("Tinolang Manok");
        jLabel34.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 156, 30));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel35.setText("Pork Barbecue");
        jLabel35.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel36.setText("Chicken Adobo");
        jLabel36.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel37.setText("Pancit Canton");
        jLabel37.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 30));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel38.setText("Fried Chicken");
        jLabel38.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 30));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel39.setText("Pork Menudo");
        jLabel39.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 30));

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel78.setText("Qty.");
        jPanel5.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel79.setText("Price");
        jPanel5.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel80.setText("0");
        jLabel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 90, 30));

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel81.setText("0");
        jLabel81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 90, 30));

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel82.setText("0");
        jLabel82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 90, 30));

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel83.setText("0");
        jLabel83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 90, 30));

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel84.setText("0");
        jLabel84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 90, 30));

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel85.setText("0");
        jLabel85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 90, 30));

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel86.setText("0");
        jLabel86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 90, 30));

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel87.setText("0");
        jLabel87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 90, 30));

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel88.setText("0");
        jLabel88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 90, 30));

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel89.setText("0");
        jLabel89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 90, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, 340, 370));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textdrinks5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textdrinks5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textdrinks5.setText("0");
        jPanel6.add(textdrinks5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 40, 30));

        textdrinks1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textdrinks1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textdrinks1.setText("0");
        jPanel6.add(textdrinks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 40, 30));

        textdrinks2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textdrinks2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textdrinks2.setText("0");
        jPanel6.add(textdrinks2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 40, 30));

        textdrinks3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textdrinks3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textdrinks3.setText("0");
        jPanel6.add(textdrinks3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 40, 30));

        textdrinks4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textdrinks4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textdrinks4.setText("0");
        jPanel6.add(textdrinks4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 40, 30));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel40.setText("Coke");
        jLabel40.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel41.setText("Mountain Dew");
        jLabel41.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel42.setText("Royal");
        jLabel42.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel43.setText("Sparkle");
        jLabel43.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel44.setText("Sprite");
        jLabel44.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel45.setText("Drinks");
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel76.setText("Qty.");
        jPanel6.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel77.setText("Price");
        jPanel6.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel91.setText("0");
        jLabel91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 70, 30));

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel90.setText("0");
        jLabel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 70, 30));

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel94.setText("0");
        jLabel94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 70, 30));

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel92.setText("0");
        jLabel92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 70, 30));

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel93.setText("0");
        jLabel93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 70, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 290, 217));

        JButtonReceipt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JButtonReceipt.setText("Print Receipt");
        JButtonReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonReceiptActionPerformed(evt);
            }
        });
        jPanel4.add(JButtonReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 140, 40));

        JButtonTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JButtonTotal.setText("Reset");
        JButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTotalActionPerformed(evt);
            }
        });
        jPanel4.add(JButtonTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 80, 40));

        JButtonTotal1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JButtonTotal1.setText("Total");
        JButtonTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTotal1ActionPerformed(evt);
            }
        });
        jPanel4.add(JButtonTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 80, 40));

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Receipt");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 380, 400));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("BACK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLayeredPane2.add(jPanel2, "carinderia");

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel21.setPreferredSize(new java.awt.Dimension(325, 418));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textmeal11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal11.setText("0");
        jPanel21.add(textmeal11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 90, 30));

        textmeal12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal12.setText("0");
        jPanel21.add(textmeal12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 90, 30));

        textmeal13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal13.setText("0");
        jPanel21.add(textmeal13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 90, 30));

        textmeal14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal14.setText("0");
        jPanel21.add(textmeal14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 90, 30));

        textmeal15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal15.setText("0");
        jPanel21.add(textmeal15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 90, 30));

        textmeal16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal16.setText("0");
        jPanel21.add(textmeal16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 90, 30));

        textmeal17.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal17.setText("0");
        jPanel21.add(textmeal17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 90, 30));

        textmeal18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal18.setText("0");
        jPanel21.add(textmeal18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 90, 30));

        textmeal19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal19.setText("0");
        jPanel21.add(textmeal19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 90, 30));

        textmeal20.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textmeal20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textmeal20.setText("0");
        jPanel21.add(textmeal20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 90, 30));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel55.setText("Pork Humba");
        jLabel55.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel21.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel56.setText("Paklay");
        jLabel56.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel21.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 30));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel57.setText("Ngohiong");
        jLabel57.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel21.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 30));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel58.setText("Kinilaw");
        jLabel58.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel21.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel62.setText("Tinolang Manok");
        jLabel62.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel21.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 156, 30));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel63.setText("Pork Barbecue");
        jLabel63.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel21.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 30));

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel64.setText("Chicken Adobo");
        jLabel64.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel21.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 30));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel65.setText("Pancit Canton");
        jLabel65.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel21.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 30));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel66.setText("Fried Chicken");
        jLabel66.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel21.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel67.setText("Pork Menudo");
        jLabel67.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel21.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 30));

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 330, 320));

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textdrinks6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textdrinks6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textdrinks6.setText("0");
        jPanel24.add(textdrinks6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 70, 30));

        textdrinks7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textdrinks7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textdrinks7.setText("0");
        jPanel24.add(textdrinks7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 70, 30));

        textdrinks8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textdrinks8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textdrinks8.setText("0");
        jPanel24.add(textdrinks8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 70, 30));

        textdrinks9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textdrinks9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textdrinks9.setText("0");
        jPanel24.add(textdrinks9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 70, 30));

        textdrinks10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textdrinks10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textdrinks10.setText("0");
        jPanel24.add(textdrinks10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 70, 30));

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel68.setText("Coke");
        jLabel68.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel24.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel69.setText("Mountain Dew");
        jLabel69.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel24.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel70.setText("Royal");
        jLabel70.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel24.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel71.setText("Sparkle");
        jLabel71.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel24.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel72.setText("Sprite");
        jLabel72.setPreferredSize(new java.awt.Dimension(135, 33));
        jPanel24.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        jPanel20.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 278, 190));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setText("BACK");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("Update Price");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 180, 70));

        jPanel22.setBackground(new java.awt.Color(0, 204, 153));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Price List");
        jPanel22.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jPanel23.setBackground(new java.awt.Color(0, 0, 0));

        jLabel60.setBackground(new java.awt.Color(0, 0, 0));
        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("ADMIN MODE");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));

        jPanel30.setBackground(new java.awt.Color(0, 0, 0));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setText("Price List");
        jButton14.setPreferredSize(new java.awt.Dimension(83, 25));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 150, 20));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setText("Receipt");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 20));

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton16.setText("Users");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        jPanel22.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 370, 20));

        jPanel20.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1070, 90));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/about-blaine-corp2.jpg"))); // NOI18N
        jLabel61.setText("jLabel46");
        jPanel20.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 440));

        jLayeredPane2.add(jPanel20, "card3");

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel18.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 30));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("First Name:");
        jPanel18.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 20));
        jPanel18.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, 30));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setText("Username: ");
        jPanel18.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 20));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Last Name:");
        jPanel18.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 20));
        jPanel18.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 160, 30));
        jPanel18.add(jPasswordField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 160, 30));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Password:");
        jPanel18.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, -1));
        jPanel18.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 140, 30));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("Email Address:");
        jPanel18.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 20));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 100, 30));

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton20.setText("Clear");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 80, 30));

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 300, 240));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Email Address", "Username", "Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel16.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 630, 290));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jPanel17.setBackground(new java.awt.Color(0, 204, 153));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Users");
        jPanel17.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jPanel19.setBackground(new java.awt.Color(0, 0, 0));

        jLabel53.setBackground(new java.awt.Color(0, 0, 0));
        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("ADMIN MODE");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Price List");
        jButton9.setPreferredSize(new java.awt.Dimension(83, 25));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel29.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 150, 20));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Receipt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel29.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 20));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setText("Users");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel29.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        jPanel17.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 370, 20));

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1070, 90));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/about-blaine-corp2.jpg"))); // NOI18N
        jLabel46.setText("jLabel46");
        jPanel16.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 440));

        jLayeredPane2.add(jPanel16, "card3");

        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("BACK");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane5.setViewportView(jTextArea3);

        jPanel26.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 390, 320));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reference No.", "Date", "Time", "Receipt"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel26.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 530, 260));

        jPanel27.setBackground(new java.awt.Color(0, 204, 153));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel100.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("Receipt");
        jPanel27.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jPanel28.setBackground(new java.awt.Color(0, 0, 0));

        jLabel101.setBackground(new java.awt.Color(0, 0, 0));
        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("ADMIN MODE");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel27.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));

        jPanel31.setBackground(new java.awt.Color(0, 0, 0));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.setText("Price List");
        jButton17.setPreferredSize(new java.awt.Dimension(83, 25));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel31.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 150, 20));

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setText("Receipt");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel31.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 20));

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setText("Users");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel31.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        jPanel27.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 370, 20));

        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1070, 90));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/about-blaine-corp2.jpg"))); // NOI18N
        jLabel102.setText("jLabel46");
        jPanel26.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 440));

        jLayeredPane2.add(jPanel26, "card5");

        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1070, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //method when tab1 is mouse clicked
    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        
        //access card1 through jLayeredPane1 card layout
        cardLayout.show(jLayeredPane1, "card1");
        
        //hide jPanel2 and jPanel4
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        
        //set color background to tab1, tab2 and tab3
        tab1.setBackground(new java.awt.Color(153,153,153));
        tab2.setBackground(new java.awt.Color(0,0,0));
        tab3.setBackground(new java.awt.Color(0,0,0));
        
        //set text jTextField2 and jPasswordField2 to null
        jTextField2.setText(null);
        jPasswordField2.setText(null);
    }//GEN-LAST:event_tab1MouseClicked

    //method when tab2 is mouse clicked
    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
        
        //access card2 through jLayeredPane1 card layout
        cardLayout.show(jLayeredPane1, "card2");
        
        //hide jPanel2 and jPanel4
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        
        //set color background to tab1, tab2 and tab3
        tab2.setBackground(new java.awt.Color(153,153,153));
        tab1.setBackground(new java.awt.Color(0,0,0));
        tab3.setBackground(new java.awt.Color(0,0,0));
        
        //set text jTextField2 and jPasswordField2 to null
        jTextField1.setText(null);
        jPasswordField1.setText(null);
    }//GEN-LAST:event_tab2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(true);
        jPanel16.setVisible(false);
        
        tab2.setBackground(new java.awt.Color(0,0,0));
        tab1.setBackground(new java.awt.Color(0,0,0));
        tab3.setBackground(new java.awt.Color(0,0,0));
        jLayeredPane1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginActionPerformed
        String password = jTextField2.getText();
        String username = jPasswordField2.getText();
        
        //conditions to check input username and password
        if (password.equals("admin") && (username.equals("admin")))
        {
            jTextField2.setText(null);
            jPasswordField2.setText(null);
            JOptionPane.showMessageDialog(null,"Login Successfully");
            
            //clear panels
            jPanel2.setVisible(false);
            jPanel4.setVisible(false);
            jPanel1.setVisible(false);
            jPanel16.setVisible(true);

            login.setVisible(false);
            register.setVisible(false);
            admin.setVisible(false);
            jLayeredPane1.setVisible(false);
        }
        else if (password.contains("") || (username.contains("")))
        {
            JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error",JOptionPane.ERROR_MESSAGE);
            jTextField2.setText(null);
            jPasswordField2.setText(null);
        }
    }//GEN-LAST:event_AdminLoginActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cardLayout.show(jLayeredPane1, "card1");
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        
        tab1.setBackground(new java.awt.Color(153,153,153));
        tab2.setBackground(new java.awt.Color(0,0,0));
        tab3.setBackground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cardLayout.show(jLayeredPane1, "card3");
        
        //tab color
        tab1.setBackground(new java.awt.Color(0,0,0));
        tab2.setBackground(new java.awt.Color(0,0,0));
        tab3.setBackground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_jButton3ActionPerformed

    //method to set text fields to zero
    private void JButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTotalActionPerformed
        textmeal1.setText("0");
        textmeal2.setText("0");
        textmeal3.setText("0");
        textmeal4.setText("0");
        textmeal5.setText("0");
        textmeal6.setText("0");
        textmeal7.setText("0");
        textmeal8.setText("0");
        textmeal9.setText("0");
        textmeal10.setText("0");
        
        textdrinks1.setText("0");
        textdrinks2.setText("0");
        textdrinks3.setText("0");
        textdrinks4.setText("0");
        textdrinks5.setText("0");
        
        TotalMeals.setText("0.00");
        jlblCostOfMeal.setText("0.00");
        Alltotal.setText("0.00");
        
        jTextArea1.setText(null);
    }//GEN-LAST:event_JButtonTotalActionPerformed

    private void JButtonTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTotal1ActionPerformed
        TotalMeals.setText("0.00");
        jlblCostOfMeal.setText("0.00");
        Alltotal.setText("0.00");
        
        double TotalMeal = Double.parseDouble(TotalMeals.getText());
        double TotalDrink = Double.parseDouble(jlblCostOfMeal.getText());
        double MealTotal=0, DrinkTotal=0;
        
        //condition parse input data to double
        //drinks
        if (!textdrinks1.getText().equals("0"))
        {
        double coke = Double.parseDouble(textdrinks1.getText());
        double coke1 = Double.parseDouble(jLabel93.getText());
        i[0] = (coke * coke1) + TotalDrink;
        DrinkTotal += i[0];   
        }
        
        if (!textdrinks2.getText().equals("0"))
        {
        double moutain_dew = Double.parseDouble(textdrinks2.getText());
        double moutain_dew1 = Double.parseDouble(jLabel90.getText());
        i[1] = (moutain_dew * moutain_dew1) + TotalDrink;
        DrinkTotal += i[1];   
        }
        
        if (!textdrinks3.getText().equals("0"))
        {
        double royal = Double.parseDouble(textdrinks3.getText());
        double royal1 = Double.parseDouble(jLabel92.getText());
        i[2] = (royal * royal1) + TotalDrink;
        DrinkTotal += i[2];   
        }
        
        if (!textdrinks4.getText().equals("0"))
        {
        double sparkle = Double.parseDouble(textdrinks4.getText());
        double sparkle1 = Double.parseDouble(jLabel91.getText());
        i[3] = (sparkle * sparkle1) + TotalDrink;
        DrinkTotal += i[3];   
        }
        
        if (!textdrinks5.getText().equals("0"))
        {
        double sprite = Double.parseDouble(textdrinks5.getText());
        double sprite1 = Double.parseDouble(jLabel94.getText());
        i[4] = (sprite * sprite1) + TotalDrink;
        DrinkTotal += i[4];   
        }
        
        
        //meals
        if (!textmeal1.getText().equals("0"))
        {
        double pork_humba = Double.parseDouble(textmeal1.getText());
        double pork_humba1 = Double.parseDouble(jLabel81.getText());
        i[5] = (pork_humba * pork_humba1) + TotalMeal;
        MealTotal += i[5];  
        }
        
        if (!textmeal2.getText().equals("0"))
        {
        double paklay = Double.parseDouble(textmeal2.getText());
        double paklay1 = Double.parseDouble(jLabel80.getText());
        i[6] = (paklay * paklay1) + TotalMeal;
        MealTotal += i[6];  
        }
        
        if (!textmeal3.getText().equals("0"))
        {
        double ngohiong = Double.parseDouble(textmeal3.getText());
        double ngohiong1 = Double.parseDouble(jLabel82.getText());
        i[7] = (ngohiong * ngohiong1) + TotalMeal;
        MealTotal += i[7];  
        }
        
        if (!textmeal4.getText().equals("0"))
        {
        double kinilaw = Double.parseDouble(textmeal4.getText());
        double kinilaw1 = Double.parseDouble(jLabel83.getText());
        i[8] = (kinilaw * kinilaw1) + TotalMeal;
        MealTotal += i[8];  
        }
        
        if (!textmeal5.getText().equals("0"))
        {
        double tinolang_manok = Double.parseDouble(textmeal5.getText());
        double tinolang_manok1 = Double.parseDouble(jLabel87.getText());
        i[9] = (tinolang_manok * tinolang_manok1) + TotalMeal;
        MealTotal += i[9];  
        }
        
        if (!textmeal6.getText().equals("0"))
        {
        double pork_barbecue = Double.parseDouble(textmeal6.getText());
        double pork_barbecue1 = Double.parseDouble(jLabel86.getText());
        i[10] = (pork_barbecue * pork_barbecue1) + TotalMeal;
        MealTotal += i[10];  
        }
        
        if (!textmeal7.getText().equals("0"))
        {
        double chicken_adobo = Double.parseDouble(textmeal7.getText());
        double chicken_adobo1 = Double.parseDouble(jLabel85.getText());
        i[11] = (chicken_adobo * chicken_adobo1) + TotalMeal;
        MealTotal += i[11];  
        }
        
        if (!textmeal8.getText().equals("0"))
        {
        double pancit_canton = Double.parseDouble(textmeal8.getText());
        double pancit_canton1 = Double.parseDouble(jLabel84.getText());
        i[12] = (pancit_canton * pancit_canton1) + TotalMeal;
        MealTotal += i[12];  
        }
        
        if (!textmeal9.getText().equals("0"))
        {
        double fried_chicken = Double.parseDouble(textmeal9.getText());
        double fried_chicken1 = Double.parseDouble(jLabel89.getText());
        i[13] = (fried_chicken * fried_chicken1) + TotalMeal;  
        MealTotal += i[13];  
        }
        
        if (!textmeal10.getText().equals("0"))
        {
        double pork_menudo = Double.parseDouble(textmeal10.getText());
        double pork_menudo1 = Double.parseDouble(jLabel88.getText());
        i[14] = (pork_menudo * pork_menudo1) + TotalMeal; 
        MealTotal += i[14];  
        }
        
        String DrinkTotals = String.format("%.2f", DrinkTotal);
        jlblCostOfMeal.setText(DrinkTotals);
        
        String MealTotals = String.format("%.2f", MealTotal);
        TotalMeals.setText(MealTotals);
        
        String All = String.format("%.2f", (MealTotal+DrinkTotal));
        Alltotal.setText(All);
        
        /*if ((!textdrinks1.getText().equals("0"))||(!textdrinks2.getText().equals("0"))||(!textdrinks3.getText().equals("0"))||(!textdrinks4.getText().equals("0"))||(!textdrinks5.getText().equals("0"))||
            (!textmeal1.getText().equals("0"))||(!textmeal2.getText().equals("0"))||(!textmeal3.getText().equals("0"))||(!textmeal4.getText().equals("0"))||(!textmeal5.getText().equals("0"))||
            (!textmeal6.getText().equals("0"))||(!textmeal7.getText().equals("0"))||(!textmeal8.getText().equals("0"))||(!textmeal9.getText().equals("0"))||(!textmeal10.getText().equals("0")))
        {
        for (int k=0; k<5; k++)
        {
            DrinkTotal += i[k];   
        }  
            
        String DrinkTotals = String.format("₱ %.2f", DrinkTotal);
        jlblCostOfMeal.setText(DrinkTotals);
  
        for (int k=5; k<15; k++)
        {
            MealTotal += i[k];  
        }   
        String MealTotals = String.format("₱ %.2f", MealTotal);
        TotalMeals.setText(MealTotals);
        }
        */
            
        
        
    }//GEN-LAST:event_JButtonTotal1ActionPerformed

    //method to print reciept
    private void JButtonReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonReceiptActionPerformed
        jTextArea1.setText(null);
        
        int reference_no = 1325 + (int) (Math.random()*4238);
        int No_of_items=0;
        double MealTotal=0, DrinkTotal=0;
        
        //function to generate time and date
        Calendar time = Calendar.getInstance();
        time.getTime();
        
        SimpleDateFormat Time = new SimpleDateFormat("HH:mm:ss");
        Time.format(time.getTime());
        
        SimpleDateFormat Date = new SimpleDateFormat("MMM / dd / yyyy");
        Date.format(time.getTime());
        
        String paymentS = JOptionPane.showInputDialog("Input payment: ");
        double payment = Double.parseDouble(paymentS);
        
        jTextArea1.append("\t           SALES INVOICE\n\n");
        jTextArea1.append("Date: "+ Date.format(time.getTime()) +"  "+Time.format(time.getTime()));
        jTextArea1.append("\tReference No. "+reference_no);
        jTextArea1.append("\n\nDescription\t\t\tAmount");
        
        if (!textmeal1.getText().equals("0"))
        {
            jTextArea1.append("\n"+Integer.parseInt(textmeal1.getText())+"x  PORK HUMBA\t\t"+Double.parseDouble(textmeal1.getText())*Double.parseDouble(jLabel81.getText()));
            No_of_items+=Double.parseDouble(textmeal1.getText());
            MealTotal += i[5];  
        }
        if (!(textmeal2.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textmeal2.getText())+"x  PAKLAY\t\t\t"+Double.parseDouble(textmeal2.getText())*Double.parseDouble(jLabel80.getText()));
            No_of_items+=Double.parseDouble(textmeal2.getText());
            MealTotal += i[6];  
        }
        if (!(textmeal3.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textmeal3.getText())+"x  NGOHIONG\t\t\t"+Double.parseDouble(textmeal3.getText())*Double.parseDouble(jLabel82.getText()));
            No_of_items+=Double.parseDouble(textmeal3.getText());
            MealTotal += i[7];  
        }
        if (!(textmeal4.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textmeal4.getText())+"x  KINILAW\t\t\t"+Double.parseDouble(textmeal4.getText())*Double.parseDouble(jLabel83.getText()));
            No_of_items+=Double.parseDouble(textmeal4.getText());
            MealTotal += i[8];  
        }
        if (!(textmeal5.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textmeal5.getText())+"x  TINOLANG MANOK\t\t"+Double.parseDouble(textmeal5.getText())*Double.parseDouble(jLabel87.getText()));
            No_of_items+=Double.parseDouble(textmeal5.getText());
            MealTotal += i[9];  
        }
        if (!(textmeal6.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textmeal6.getText())+"x  PORK BARBECUE\t\t"+Double.parseDouble(textmeal6.getText())*Double.parseDouble(jLabel86.getText()));
            No_of_items+=Double.parseDouble(textmeal6.getText());
            MealTotal += i[10];  
        }
        if (!(textmeal7.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textmeal7.getText())+"x  CHICKEN ADOBO\t\t"+Double.parseDouble(textmeal7.getText())*Double.parseDouble(jLabel85.getText()));
            No_of_items+=Double.parseDouble(textmeal7.getText());
            MealTotal += i[11];  
        }
        if (!(textmeal8.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textmeal8.getText())+"x  PANCIT CANTON\t\t"+Double.parseDouble(textmeal8.getText())*Double.parseDouble(jLabel84.getText()));
            No_of_items+=Double.parseDouble(textmeal8.getText());
            MealTotal += i[12];  
        }
        if (!(textmeal9.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textmeal9.getText())+"x  FRIED CHICKEN\t\t"+Double.parseDouble(textmeal9.getText())*Double.parseDouble(jLabel89.getText()));
            No_of_items+=Double.parseDouble(textmeal9.getText());
            MealTotal += i[13];  
        }
        if (!(textmeal10.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textmeal10.getText())+"x  PORK MENUDO\t\t"+Double.parseDouble(textmeal10.getText())*Double.parseDouble(jLabel88.getText()));
            No_of_items+=Double.parseDouble(textmeal10.getText());
            MealTotal += i[14];  
        }
        
        //DRINKS
        if (!(textdrinks1.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textdrinks1.getText())+"x  COKE\t\t\t"+Double.parseDouble(textdrinks1.getText())*Double.parseDouble(jLabel93.getText()));
            No_of_items+=Double.parseDouble(textdrinks1.getText());
            DrinkTotal += i[0];
        }
        if (!(textdrinks2.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textdrinks2.getText())+"x  MOUNTAIN DEW\t\t"+Double.parseDouble(textdrinks2.getText())*Double.parseDouble(jLabel90.getText()));
            No_of_items+=Double.parseDouble(textdrinks2.getText());
            DrinkTotal += i[1];
        }
        if (!(textdrinks3.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textdrinks3.getText())+"x  ROYAL\t\t\t"+Double.parseDouble(textdrinks3.getText())*Double.parseDouble(jLabel92.getText()));
            No_of_items+=Double.parseDouble(textdrinks3.getText());
            DrinkTotal += i[2];
        }
        if (!(textdrinks4.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textdrinks4.getText())+"x  SPARKLE\t\t\t"+Double.parseDouble(textdrinks4.getText())*Double.parseDouble(jLabel91.getText()));
            No_of_items+=Double.parseDouble(textdrinks4.getText());
            DrinkTotal += i[3];
        }
        if (!(textdrinks5.getText().equals("0")))
        {
            jTextArea1.append("\n"+Integer.parseInt(textdrinks5.getText())+"x  SPRITE\t\t\t"+Double.parseDouble(textdrinks5.getText())*Double.parseDouble(jLabel94.getText()));
            No_of_items+=Double.parseDouble(textdrinks5.getText());
            DrinkTotal += i[4];
        }
        
        /*if (!(jlblCostOfMeal.getText().contains("0.00")))
        {
        for (int k=0; k<5; k++)
        {
            DrinkTotal += i[k];
        }
        String DrinkTotals = String.format("₱ %.2f", DrinkTotal);
        jlblCostOfMeal.setText(DrinkTotals);
        }
        
        if (!(TotalMeals.getText().contains("0.00")))
        {
        for (int k=5; k<15; k++)
        {
            MealTotal += i[k];
        }
        String MealTotals = String.format("₱ %.2f", MealTotal);
        TotalMeals.setText(MealTotals);
        }*/
        
        
        jTextArea1.append("\n\nNo of Items : \t\t\t"+ No_of_items+"x");
        jTextArea1.append("\n\nTotal PHP \t\t\t"+(DrinkTotal+MealTotal));
        jTextArea1.append("\nCash \t\t\t"+ payment);
        jTextArea1.append("\nChange \t\t\t"+ (payment-(DrinkTotal+MealTotal)));
        
        jTextArea1.append("\n\n\n\tThis is your Official Receipt\n\n");
        
        Calculator calcu  = new Calculator();
        calcu.setVisible(true);
        
        //store receipt in table
        String receipt = jTextArea1.getText();
        int reference = reference_no;
        String date = Date.format(time.getTime());
        String t = Time.format(time.getTime());
        Resibo.add(new Receipt(receipt, reference, date, t));
        dtm1.setRowCount(0);//reset data model
        for (int i = 0; i < Resibo.size(); i++) {
            Object[] objs = {Resibo.get(i).reference, Resibo.get(i).date, Resibo.get(i).t, Resibo.get(i).receipt};
            dtm1.addRow(objs);
        }
    }//GEN-LAST:event_JButtonReceiptActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(true);
        
        tab2.setBackground(new java.awt.Color(0,0,0));
        tab1.setBackground(new java.awt.Color(0,0,0));
        tab3.setBackground(new java.awt.Color(0,0,0));
        jLayeredPane1.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String fname = jTextField5.getText();
        String lname = jTextField6.getText();
        String email = jTextField7.getText();
        String username = jTextField3.getText();
        String password = jPasswordField3.getText();
       
        
        if (jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField3.getText().equals("") || jPasswordField3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Fill out all fields", "SignUp Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        Users.add(new Register(fname, lname, email, username, password));
        
        dtm.setRowCount(0);//reset data model
        for (int i = 0; i < Users.size(); i++) 
        {
            Object[] objs = {Users.get(i).fname,Users.get(i).lname,Users.get(i).email,Users.get(i).username,Users.get(i).password};
            dtm.addRow(objs);
        }
        JOptionPane.showMessageDialog(null,"Registered Successfully"); 
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
        jTextField3.setText(null);
        jPasswordField3.setText(null);
        }
        
        //remove already existed user
        String fname1 = fname;
        String lname1 = lname;
        String email1 = email;
        String username1 = username;
        String password1 = password;
        int repeat=0;
        
        for (int i = 0; i < Users.size(); i++) 
        {
            if (Users.get(i).fname.equals(fname1) && Users.get(i).lname.equals(lname1))
            {
                repeat++;
            }
            if (repeat>1)
            {
                JOptionPane.showMessageDialog(null,"Opss! This user already exist!", "SignUp Error",JOptionPane.ERROR_MESSAGE);
                dtm.removeRow(i);
                Users.remove(i);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String fname = jTextField8.getText();
        String lname = jTextField9.getText();
        String email = jTextField10.getText();
        String username = jTextField4.getText();
        String password = jPasswordField4.getText();
        
        if (jTextField8.getText().equals("") || jTextField9.getText().equals("") || jTextField10.getText().equals("") || jTextField4.getText().equals("") || jPasswordField4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Fill out all fields", "SignUp Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        Users.add(new Register(fname, lname, email, username, password));
        
        dtm.setRowCount(0);//reset data model
        for (int i = 0; i < Users.size(); i++) 
        {
            Object[] objs = {Users.get(i).fname,Users.get(i).lname,Users.get(i).email,Users.get(i).username,Users.get(i).password};
            dtm.addRow(objs);
        }
        
        JOptionPane.showMessageDialog(null,"Registered Successfully");
        
        jTextField8.setText(null);
        jTextField9.setText(null);
        jTextField10.setText(null);
        jTextField4.setText(null);
        jPasswordField4.setText(null);
        }
        
        //remove already existed user
        String fname1 = fname;
        String lname1 = lname;
        String email1 = email;
        String username1 = username;
        String password1 = password;
        int repeat=0;
        
        for (int i = 0; i < Users.size(); i++) 
        {
            if (Users.get(i).fname.equals(fname1) && Users.get(i).lname.equals(lname1))
            {
                repeat++;
            }
            if (repeat>1)
            {
                JOptionPane.showMessageDialog(null,"Opss! This user already exist!", "SignUp Error",JOptionPane.ERROR_MESSAGE);
                dtm.removeRow(i);
                Users.remove(i);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void UserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLoginActionPerformed
        String userlogin = jTextField1.getText();
        String userpassword = jPasswordField1.getText();
        int count=0;
        
        for (int i = 0; i < Users.size(); i++) 
        {
            if (Users.get(i).username.equals(userlogin) && !Users.get(i).password.equals(userpassword))
            {
                JOptionPane.showMessageDialog(null,"Please re -enter your password", "Login Error",JOptionPane.ERROR_MESSAGE);
                jPasswordField1.setText(null);
            }
            else if (!Users.get(i).username.equals(userlogin) && Users.get(i).password.equals(userpassword))
            {
                JOptionPane.showMessageDialog(null,"Incorrect username", "Login Error",JOptionPane.ERROR_MESSAGE);
            }
            else if (Users.get(i).username.equals(userlogin) && Users.get(i).password.equals(userpassword))
            {
                JOptionPane.showMessageDialog(null,"Login Successfully");
                jPanel2.setVisible(true);
                jPanel4.setVisible(true);
                jPanel1.setVisible(false);

                login.setVisible(false);
                register.setVisible(false);
                admin.setVisible(false);
                jLayeredPane1.setVisible(false);
                
                jTextField1.setText(null);
                jPasswordField1.setText(null);
                break;
            }
            else
            {
                count++;
            }
            
        }
        
        if (count==Users.size())
        {
            JOptionPane.showMessageDialog(null,"User does not exist", "Login Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_UserLoginActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", JOptionPane.YES_NO_OPTION);
        if(dialogResult == 0) 
        {
            dtm.removeRow(row);
            Users.remove(row);
            dtm.setRowCount(0);//reset table and populate again with foodlist
            
            for (int i = 0; i < Users.size(); i++) 
            {
            Object[] objs = {Users.get(i).fname,Users.get(i).lname,Users.get(i).email,Users.get(i).username,Users.get(i).password};
            dtm.addRow(objs);
            }
            
        jTextField8.setText(null);
        jTextField9.setText(null);
        jTextField10.setText(null);
        jTextField4.setText(null);
        jPasswordField4.setText(null);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(true);
        jPanel20.setVisible(false);
        
        tab2.setBackground(new java.awt.Color(0,0,0));
        tab1.setBackground(new java.awt.Color(0,0,0));
        tab3.setBackground(new java.awt.Color(0,0,0));
        jLayeredPane1.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        double coke = Double.parseDouble(textdrinks7.getText());
        String coke1 = String.format("%.2f", coke);
        jLabel93.setText(coke1);
        
        double moutain_dew = Double.parseDouble(textdrinks8.getText());
        String moutain_dew1 = String.format("%.2f", moutain_dew);
        jLabel90.setText(moutain_dew1);
        
        double royal = Double.parseDouble(textdrinks9.getText());
        String royal1 = String.format("%.2f", royal);
        jLabel92.setText(royal1);
        
        double sparkle = Double.parseDouble(textdrinks10.getText());
        String sparkle11 = String.format("%.2f", sparkle);
        jLabel91.setText(sparkle11);
        
        double sprite = Double.parseDouble(textdrinks6.getText());
        String sprite1 = String.format("%.2f", sprite);
        jLabel94.setText(sprite1);
        
        
        //meals
        double pork_humba = Double.parseDouble(textmeal12.getText());
        String pork_humba1 = String.format("%.2f", pork_humba);
        jLabel81.setText(pork_humba1);
        
        double paklay = Double.parseDouble(textmeal13.getText());
        String paklay1 = String.format("%.2f", paklay);
        jLabel80.setText(paklay1);
        
        double ngohiong = Double.parseDouble(textmeal14.getText());
        String ngohiong1 = String.format("%.2f", ngohiong);
        jLabel82.setText(ngohiong1);
        
        double kinilaw = Double.parseDouble(textmeal15.getText());
        String kinilaw1 = String.format("%.2f", kinilaw);
        jLabel83.setText(kinilaw1);
        
        double tinolang_manok = Double.parseDouble(textmeal16.getText());
        String tinolang_manok1 = String.format("%.2f", tinolang_manok);
        jLabel87.setText(tinolang_manok1);
        
        double pork_barbecue = Double.parseDouble(textmeal17.getText());
        String pork_barbecue1 = String.format("%.2f", pork_barbecue);
        jLabel86.setText(pork_barbecue1);
        
        double chicken_adobo = Double.parseDouble(textmeal18.getText());
        String chicken_adobo1 = String.format("%.2f", chicken_adobo);
        jLabel85.setText(chicken_adobo1);
        
        double pancit_canton = Double.parseDouble(textmeal19.getText());
        String pancit_canton1 = String.format("%.2f", pancit_canton);
        jLabel84.setText(pancit_canton1);
        
        double fried_chicken = Double.parseDouble(textmeal20.getText());
        String fried_chicken1 = String.format("%.2f", fried_chicken);
        jLabel89.setText(fried_chicken1);
        
        double pork_menudo = Double.parseDouble(textmeal11.getText());
        String pork_menudo1 = String.format("%.2f", pork_menudo);
        jLabel88.setText(pork_menudo1);
        
        
        JOptionPane.showMessageDialog(null,"Price List Update Successfully");
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            jPanel2.setVisible(false);
        jPanel1.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(false);
        jPanel16.setVisible(false);
        jPanel20.setVisible(true);
        jPanel26.setVisible(false);

        login.setVisible(false);
        register.setVisible(false);
        admin.setVisible(false);
        jLayeredPane1.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
        cardLayout.show(jLayeredPane1, "card4");
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        
        tab3.setBackground(new java.awt.Color(153,153,153));
        tab2.setBackground(new java.awt.Color(0,0,0));
        tab1.setBackground(new java.awt.Color(0,0,0));
        
        jTextField1.setText(null);
        jPasswordField1.setText(null);
    }//GEN-LAST:event_tab3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        row = jTable1.getSelectedRow();
        col = jTable1.getColumnCount();
        
        
        jTextField8.setText(dtm.getValueAt(row, 0).toString());
        jTextField9.setText(dtm.getValueAt(row, 1).toString());
        jTextField10.setText(dtm.getValueAt(row, 2).toString());
        jTextField4.setText(dtm.getValueAt(row, 3).toString());
        jPasswordField4.setText(dtm.getValueAt(row, 4).toString());
        
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String userlogin = jTextField1.getText();
        String userpassword = jPasswordField1.getText();
        int count=0;
        
        for (int i = 0; i < Users.size(); i++) 
        {
            if (Users.get(i).username.equals(userlogin) && !Users.get(i).password.equals(userpassword))
            {
                JOptionPane.showMessageDialog(null,"Please re -enter your password", "Login Error",JOptionPane.ERROR_MESSAGE);
            }
            else if (!Users.get(i).username.equals(userlogin) && Users.get(i).password.equals(userpassword))
            {
                JOptionPane.showMessageDialog(null,"Incorrect username", "Login Error",JOptionPane.ERROR_MESSAGE);
            }
            else if (Users.get(i).username.equals(userlogin) && Users.get(i).password.equals(userpassword))
            {
                JOptionPane.showMessageDialog(null,"Login Successfully");
                jPanel2.setVisible(true);
                jPanel4.setVisible(true);
                jPanel1.setVisible(false);

                login.setVisible(false);
                register.setVisible(false);
                admin.setVisible(false);
                jLayeredPane1.setVisible(false);
                
                jTextField1.setText(null);
                jPasswordField1.setText(null);
            }
            else
            {
                count++;
            }
            
        }
        
        if (count==Users.size())
        {
            JOptionPane.showMessageDialog(null,"User does not exist", "Login Error",JOptionPane.ERROR_MESSAGE);
        }
        
        }
            
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String password = jTextField2.getText();
        String username = jPasswordField2.getText();
        
        //conditions to check input username and password
        if (password.equals("admin") && (username.equals("admin")))
        {
            jTextField2.setText(null);
            jPasswordField2.setText(null);
            JOptionPane.showMessageDialog(null,"Login Successfully");
            
            //clear panels
            jPanel2.setVisible(false);
            jPanel4.setVisible(false);
            jPanel1.setVisible(false);
            jPanel16.setVisible(true);

            login.setVisible(false);
            register.setVisible(false);
            admin.setVisible(false);
            jLayeredPane1.setVisible(false);
        }
        else if (password.contains("") || (username.contains("")))
        {
            JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error",JOptionPane.ERROR_MESSAGE);
            jTextField2.setText(null);
            jPasswordField2.setText(null);
        }
        }
    }//GEN-LAST:event_jPasswordField2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel2.setVisible(false);
        jPanel1.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(false);
        jPanel16.setVisible(false);
        jPanel20.setVisible(false);
        jPanel26.setVisible(true);

        login.setVisible(false);
        register.setVisible(false);
        admin.setVisible(false);
        jLayeredPane1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        row = jTable2.getSelectedRow();
        col = jTable2.getColumnCount();
        
        
        jTextArea3.setText(dtm1.getValueAt(row, 3).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(true);
        jPanel26.setVisible(false);
        
        tab2.setBackground(new java.awt.Color(0,0,0));
        tab1.setBackground(new java.awt.Color(0,0,0));
        tab3.setBackground(new java.awt.Color(0,0,0));
        
        jLayeredPane1.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jPanel2.setVisible(false);
        jPanel1.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(false);
        jPanel16.setVisible(true);
        jPanel20.setVisible(false);
        jPanel26.setVisible(false);

        login.setVisible(false);
        register.setVisible(false);
        admin.setVisible(false);
        jLayeredPane1.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jPanel2.setVisible(false);
        jPanel1.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(false);
        jPanel16.setVisible(false);
        jPanel20.setVisible(true);
        jPanel26.setVisible(false);

        login.setVisible(false);
        register.setVisible(false);
        admin.setVisible(false);
        jLayeredPane1.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
          jPanel2.setVisible(false);
        jPanel1.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(false);
        jPanel16.setVisible(false);
        jPanel20.setVisible(false);
        jPanel26.setVisible(true);

        login.setVisible(false);
        register.setVisible(false);
        admin.setVisible(false);
        jLayeredPane1.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jPanel2.setVisible(false);
        jPanel1.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(false);
        jPanel16.setVisible(true);
        jPanel20.setVisible(false);
        jPanel26.setVisible(false);

        login.setVisible(false);
        register.setVisible(false);
        admin.setVisible(false);
        jLayeredPane1.setVisible(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
         jPanel2.setVisible(false);
        jPanel1.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(false);
        jPanel16.setVisible(false);
        jPanel20.setVisible(true);
        jPanel26.setVisible(false);

        login.setVisible(false);
        register.setVisible(false);
        admin.setVisible(false);
        jLayeredPane1.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
         jPanel2.setVisible(false);
        jPanel1.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(false);
        jPanel16.setVisible(false);
        jPanel20.setVisible(false);
        jPanel26.setVisible(true);

        login.setVisible(false);
        register.setVisible(false);
        admin.setVisible(false);
        jLayeredPane1.setVisible(false);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jPanel2.setVisible(false);
        jPanel1.setVisible(false);
        jPanel4.setVisible(false);
        jPanel1.setVisible(false);
        jPanel16.setVisible(true);
        jPanel20.setVisible(false);
        jPanel26.setVisible(false);

        login.setVisible(false);
        register.setVisible(false);
        admin.setVisible(false);
        jLayeredPane1.setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseClicked
            try 
            {
                Desktop.getDesktop().browse(new URL("https://www.facebook.com/bjjoebertcerezo").toURI());
            } 
            catch (Exception e) 
            {
                
            }
    }//GEN-LAST:event_facebookMouseClicked

    private void instagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramMouseClicked
            try 
            {
                Desktop.getDesktop().browse(new URL("https://www.instagram.com/joebertcerezo/").toURI());
            } 
            catch (Exception e) 
            {
                
            }
    }//GEN-LAST:event_instagramMouseClicked

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_twitterMouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jTextField8.setText(null);
        jTextField9.setText(null);
        jTextField10.setText(null);
        jTextField4.setText(null);
        jPasswordField4.setText(null);
    }//GEN-LAST:event_jButton20ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLogin;
    private javax.swing.JLabel Alltotal;
    private javax.swing.JButton JButtonReceipt;
    private javax.swing.JButton JButtonTotal;
    private javax.swing.JButton JButtonTotal1;
    private javax.swing.JLabel TotalMeals;
    private javax.swing.JButton UserLogin;
    private javax.swing.JPanel abouts;
    private javax.swing.JPanel admin;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel instagram;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel jlblCostOfMeal;
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JTextField textdrinks1;
    private javax.swing.JTextField textdrinks10;
    private javax.swing.JTextField textdrinks2;
    private javax.swing.JTextField textdrinks3;
    private javax.swing.JTextField textdrinks4;
    private javax.swing.JTextField textdrinks5;
    private javax.swing.JTextField textdrinks6;
    private javax.swing.JTextField textdrinks7;
    private javax.swing.JTextField textdrinks8;
    private javax.swing.JTextField textdrinks9;
    private javax.swing.JTextField textmeal1;
    private javax.swing.JTextField textmeal10;
    private javax.swing.JTextField textmeal11;
    private javax.swing.JTextField textmeal12;
    private javax.swing.JTextField textmeal13;
    private javax.swing.JTextField textmeal14;
    private javax.swing.JTextField textmeal15;
    private javax.swing.JTextField textmeal16;
    private javax.swing.JTextField textmeal17;
    private javax.swing.JTextField textmeal18;
    private javax.swing.JTextField textmeal19;
    private javax.swing.JTextField textmeal2;
    private javax.swing.JTextField textmeal20;
    private javax.swing.JTextField textmeal3;
    private javax.swing.JTextField textmeal4;
    private javax.swing.JTextField textmeal5;
    private javax.swing.JTextField textmeal6;
    private javax.swing.JTextField textmeal7;
    private javax.swing.JTextField textmeal8;
    private javax.swing.JTextField textmeal9;
    private javax.swing.JLabel twitter;
    // End of variables declaration//GEN-END:variables
}
