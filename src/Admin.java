
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Admin extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Admin() {
        initComponents();
        showdate();
        showtime();
        datecombo.setEnabled(false);
        itemcombo.setVisible(false);
        populatedatecombo();
        displayProducts();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        timelb = new javax.swing.JLabel();
        proftxt = new javax.swing.JLabel();
        profitlabel = new javax.swing.JLabel();
        quanttxt1 = new javax.swing.JLabel();
        quantitylabel1 = new javax.swing.JLabel();
        datelb = new javax.swing.JLabel();
        loginaslb = new javax.swing.JLabel();
        proftxt1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        itemcombo = new javax.swing.JComboBox<>();
        datecombo = new javax.swing.JComboBox<>();
        delbtn = new javax.swing.JButton();
        headerlb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salesp1 = new javax.swing.JLabel();
        salesp2 = new javax.swing.JLabel();
        salesp = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setOpaque(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Male_User_50px.png"))); // NOI18N

        timelb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        proftxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        proftxt.setText("GHC");
        proftxt.setOpaque(true);

        profitlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        profitlabel.setText("profit");
        profitlabel.setOpaque(true);

        quanttxt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        quanttxt1.setText("Total Quantity");

        quantitylabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        quantitylabel1.setText("quantit");
        quantitylabel1.setOpaque(true);

        datelb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        loginaslb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginaslb.setText("login as");

        proftxt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        proftxt1.setText("Total Profit");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_New_Product_50px.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("       Add Products");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Add_User_Male_50px.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("    Add Shop Info");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Stocks_50px.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText(" Check Stock Level");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Logout_Rounded_Left_50px.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("        Log Out");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Settings_50px.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("         Settings");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("           Sales");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Total_Sales_50px.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Add_User_Male_50px.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("    Add Sales Person");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Calendar_50px.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Time_50px.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("                                                                I MIND MA BUSINESS SUPER MARKET");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        itemcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        itemcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcomboActionPerformed(evt);
            }
        });

        datecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        datecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datecomboActionPerformed(evt);
            }
        });

        delbtn.setText("Delete");
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });

        headerlb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerlb.setText("PRODUCTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174)
                .addComponent(headerlb, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(headerlb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delbtn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        salesp1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salesp1.setText("Total selling Price");

        salesp2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salesp2.setText("GHC");
        salesp2.setOpaque(true);

        salesp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salesp.setText("salesp");
        salesp.setOpaque(true);

        jMenu1.setText("File");

        jMenuItem9.setText("Sales Window");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem8.setText("Products");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem7.setText("Sales Person Info");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem1.setText("Shop Info");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Events");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(proftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(profitlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(loginaslb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(datelb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(timelb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quanttxt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantitylabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salesp1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salesp2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(salesp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(proftxt1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(loginaslb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(datelb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(timelb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantitylabel1)
                            .addComponent(quanttxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(profitlabel)
                            .addComponent(proftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salesp)
                            .addComponent(salesp2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salesp1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(proftxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void datecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datecomboActionPerformed
       dateSelect();
        profitlabel.setVisible(true);
        proftxt.setVisible(true);
        quanttxt1.setVisible(true);
        quantitylabel1.setVisible(true);
        proftxt1.setVisible(true);
    }//GEN-LAST:event_datecomboActionPerformed

    private void itemcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcomboActionPerformed
        itemSelect();
         profitlabel.setVisible(true);
        proftxt.setVisible(true);
        quanttxt1.setVisible(true);
        quantitylabel1.setVisible(true);
    }//GEN-LAST:event_itemcomboActionPerformed

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        if(headerlb.getText().equals("PRODUCTS")){
           int confirm = JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Delete!", "WARNING!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
           if(confirm== JOptionPane.YES_OPTION){
               try{
                dbConnect();
                
               pst = con.prepareStatement("DELETE FROM sales  WHERE productsid=?");
               pst.setString(1,model.getValueAt(jTable1.getSelectedRow(),0).toString());
               pst.executeUpdate();
              
                
                
               pst = con.prepareStatement("DELETE FROM products  WHERE productsid=?");
               pst.setString(1,model.getValueAt(jTable1.getSelectedRow(),0).toString());
               pst.executeUpdate();
               model.removeRow(jTable1.getSelectedRow());
               
               JOptionPane.showMessageDialog(this,"Deleted!");
               
               dbClose();
               }catch(Exception e){
                   JOptionPane.showMessageDialog(this,e.getMessage());
               }
                sumUp();
           }
       }else if(headerlb.getText().equals("SALES")){
            int confirm = JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Delete!", "WARNING!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
           if(confirm== JOptionPane.YES_OPTION){
               
               try{
                   dbConnect();
               pst = con.prepareStatement("DELETE FROM sales WHERE salesid=? AND time=?");
               pst.setString(1,model.getValueAt(jTable1.getSelectedRow(),0).toString());
               pst.setString(2,model.getValueAt(jTable1.getSelectedRow(),2).toString());
               pst.executeUpdate();
               model.removeRow(jTable1.getSelectedRow());
               
               JOptionPane.showMessageDialog(this,"Deleted!");
               
               dbClose();
               }catch(Exception e){
                   JOptionPane.showMessageDialog(this,e.getMessage());
               }
               
           }
           
       }else if(headerlb.getText().equals("EVENTS OCCURRED")){
            int confirm = JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Delete!", "WARNING!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
           if(confirm== JOptionPane.YES_OPTION){
               
               
                try{
                    dbConnect();
               pst = con.prepareStatement("DELETE FROM events WHERE eventsid=?");
               pst.setString(1,model.getValueAt(jTable1.getSelectedRow(),0).toString());
               pst.executeUpdate();
               model.removeRow(jTable1.getSelectedRow());
               
               JOptionPane.showMessageDialog(this,"Deleted!");
               
               dbClose();
               }catch(Exception e){
                   JOptionPane.showMessageDialog(this,e.getMessage());
               }
           }
           
       }else if(headerlb.getText().equals("SALES PERSON INFORMATION")){
           
            int confirm = JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Delete!", "WARNING!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
           if(confirm== JOptionPane.YES_OPTION){
               
               
                try{
                    dbConnect();
                    
               pst = con.prepareStatement("DELETE FROM events WHERE salespersonsid=?");
               pst.setString(1,model.getValueAt(jTable1.getSelectedRow(),0).toString());
               pst.executeUpdate();
                
               
                pst = con.prepareStatement("DELETE FROM sales WHERE salespersonsid=?");
               pst.setString(1,model.getValueAt(jTable1.getSelectedRow(),0).toString());
               pst.executeUpdate();
              
                    
               pst = con.prepareStatement("DELETE FROM salespersons WHERE salespersonsid=?");
               pst.setString(1,model.getValueAt(jTable1.getSelectedRow(),0).toString());
               pst.executeUpdate();
               model.removeRow(jTable1.getSelectedRow());
               
               JOptionPane.showMessageDialog(this,"Deleted!");
               
               dbClose();
               }catch(Exception e){
                   JOptionPane.showMessageDialog(this,e.getMessage());
               }
           }
       }
    }//GEN-LAST:event_delbtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      /*
        if(headerlb.getText().equals("PRODUCTS")){
  
       itemidtxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
       itemnametxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
       quantitytxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
       costpricetxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
       totalcostpricetxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
       salespricetxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
       totalsalestxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
       profittxt.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
        }else{
            
        }
        */
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        displayStock();
        delbtn.setEnabled(false);
        datecombo.setEnabled(false);
        itemcombo.setEnabled(false);
        quanttxt1.setVisible(true);
        quantitylabel1.setVisible(true);
        proftxt.setVisible(false);
        profitlabel.setVisible(false);
        proftxt1.setVisible(false);
        salesp.setVisible(false);
        salesp1.setVisible(false);
        salesp2.setVisible(false);
        sumUp2();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         quantitylabel1.setText("");
       profitlabel.setText("");
        displaySales();      
        delbtn.setEnabled(true);
        profitlabel.setVisible(true);
        proftxt.setVisible(true);
        proftxt1.setVisible(true);
        quanttxt1.setVisible(true);
        quantitylabel1.setVisible(true);
        datecombo.setEnabled(true);
        itemcombo.setEnabled(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AddProduct add = new AddProduct();
       add.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ShopForm shop = new ShopForm();
        shop.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        quantitylabel1.setText("");
        profitlabel.setText("");
        displaySales();      
        delbtn.setEnabled(true);
        profitlabel.setVisible(true);
        proftxt.setVisible(true);
        proftxt1.setVisible(true);
        quanttxt1.setVisible(true);
        quantitylabel1.setVisible(true);
        salesp1.setVisible(true);
        salesp2.setVisible(true);
        salesp.setVisible(true);
        datecombo.setEnabled(true);
        itemcombo.setEnabled(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       dispose();
       mainwin main = new mainwin();
       main.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        displayevents();
        delbtn.setEnabled(true);
        profitlabel.setVisible(false);
        proftxt.setVisible(false);
        proftxt1.setVisible(false);
        quanttxt1.setVisible(false);
        quantitylabel1.setVisible(false);
        salesp.setVisible(false);
        salesp1.setVisible(false);
        salesp2.setVisible(false);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        salespersonInfo();
        delbtn.setEnabled(true);
        datecombo.setEnabled(false);
        itemcombo.setEnabled(false);
        quanttxt1.setVisible(false);
        quantitylabel1.setVisible(false);
        proftxt.setVisible(false);
        proftxt1.setVisible(false);
        profitlabel.setVisible(false);
        salesp.setVisible(false);
        salesp1.setVisible(false);
        salesp2.setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        displayProducts();
        delbtn.setEnabled(true);
        datecombo.setEnabled(false);
        itemcombo.setEnabled(false);
        quanttxt1.setVisible(true);
        quantitylabel1.setVisible(true);
        proftxt.setVisible(true);
        proftxt1.setVisible(true);
        profitlabel.setVisible(true);
         salesp1.setVisible(true);
        salesp2.setVisible(true);
        salesp.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        saleswin sales = new saleswin();
        sales.setVisible(true);
        sales.username(loginaslb.getText());
        insertEvent();
        dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         SalesPersonForm salesform = new SalesPersonForm();
        salesform.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       getShopInfo();
        delbtn.setEnabled(true);
        datecombo.setEnabled(false);
        itemcombo.setEnabled(false);
        quanttxt1.setVisible(false);
        quantitylabel1.setVisible(false);
        proftxt.setVisible(false);
        proftxt1.setVisible(false);
        profitlabel.setVisible(false);
        salesp.setVisible(false);
        salesp1.setVisible(false);
        salesp2.setVisible(false);
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> datecombo;
    private javax.swing.JLabel datelb;
    private javax.swing.JButton delbtn;
    private javax.swing.JLabel headerlb;
    private javax.swing.JComboBox<String> itemcombo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel loginaslb;
    private javax.swing.JLabel profitlabel;
    private javax.swing.JLabel proftxt;
    private javax.swing.JLabel proftxt1;
    private javax.swing.JLabel quantitylabel1;
    private javax.swing.JLabel quanttxt1;
    private javax.swing.JLabel salesp;
    private javax.swing.JLabel salesp1;
    private javax.swing.JLabel salesp2;
    private javax.swing.JLabel timelb;
    // End of variables declaration//GEN-END:variables


     public void showdate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        datelb.setText(s.format(d));
    }
    
    public void showtime(){
        new Timer(0,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                timelb.setText(s.format(d));
            }
        }).start();
    }
    
    
    public void dbConnect(){
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/myStore","root","");
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
}

public void dbClose(){
    
    try{
    con.close();
    pst.close();
    rs.close();
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
}



public void displayProducts(){
    headerlb.setText("PRODUCTS");
    
    try{
        dbConnect();
        pst = con.prepareStatement("SELECT * FROM products");
        
        rs = pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        dbClose();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
    sumUp();
    
}

public void displayStock(){
    
    headerlb.setText("AVAILABLE STOCK");
    try{
        dbConnect();
        pst = con.prepareStatement("SELECT productsid, productname, quantity FROM products");
        
        rs = pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        dbClose();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
    
    
    sumUp2();
}


public void displaySales(){
    
    headerlb.setText("SALES");
    try{
        dbConnect();
        pst = con.prepareStatement("SELECT salespersons.salespersonsid, date,time,products.productsid, products.productname, sales.quantity, sales.amount, sales.profit FROM sales"
                + " INNER JOIN salespersons ON sales.salespersonsid = salespersons.salespersonsid"
                + " INNER JOIN products ON sales.productsid = products.productsid");
        
        rs = pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        dbClose();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
    
    sumUp1();
}

public void populatedatecombo(){
    try{       
         dbConnect();
        pst = con.prepareStatement("SELECT DISTINCT date FROM sales");    
        rs = pst.executeQuery();
        
        while(rs.next()){
            datecombo.addItem(rs.getString("date"));
        }
        
        dbClose();
        
    }catch(Exception e){
         JOptionPane.showMessageDialog(this,e.getMessage());
    }
}


public void dateSelect(){
    
    headerlb.setText("SALES");
    try{
        dbConnect();
        
        pst = con.prepareStatement("SELECT salespersons.salespersonsid,salespersons.firstname, sales.date, products.productname, sales.quantity, sales.amount, sales.profit FROM sales"
                + " INNER JOIN salespersons ON sales.salespersonsid = salespersons.salespersonsid"
                + " INNER JOIN products ON sales.productsid = products.productsid WHERE sales.date=?");
        
        pst.setString(1,datecombo.getSelectedItem().toString());
        
        rs = pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        dbClose();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
    
    sumUp1();
}


public void itemSelect(){
       
    headerlb.setText("SALES");
    try{
        dbConnect();
        
        pst = con.prepareStatement("SELECT salespersons.salespersonsid,salespersons.firstname, date, products.productname, quantity, amount, profit FROM sales"
                + " INNER JOIN salespersons ON sales.salespersonsid = salespersons.salespersonsid"
                + " INNER JOIN products ON sales.productsid = products.productsid WHERE productsid=?");
        
        pst.setString(1,itemcombo.getSelectedItem().toString());
        
        rs = pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        dbClose();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
    
     sumUp1();
       
}

public void displayevents(){
    profitlabel.setVisible(false);
    quantitylabel1.setVisible(false);
    headerlb.setText("EVENTS OCCURRED");
    
    try{
        dbConnect();
         
         pst = con.prepareStatement("SELECT events.eventsid,salespersons.salespersonsid, salespersons.lastname, events.action, events.date, events.time FROM events "
                 + "INNER JOIN salespersons ON events.salespersonsid = salespersons.salespersonsid");
        
        rs = pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        dbClose();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
        
    }
     
}

public void salespersonInfo(){
    headerlb.setText("SALES PERSON INFORMATION");
    quantitylabel1.setVisible(false);
    profitlabel.setVisible(false);
    datecombo.setEnabled(false);
    itemcombo.setEnabled(false);
    
    try{
        dbConnect();
        
        pst = con.prepareStatement("SELECT * FROM salespersons");
        
        rs = pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        dbClose();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
    
}

public void sumUp1(){
    
        double total = 0;
        double total1 = 0;
        int quantity = 0;
        
     for(int i=0; i<jTable1.getRowCount(); i++){

            double profit = Double.parseDouble(jTable1.getValueAt(i,6).toString());
            double amount = Double.parseDouble(jTable1.getValueAt(i,6).toString());
            int quant = Integer.parseInt(jTable1.getValueAt(i,4).toString());
            quantity+=quant;
            total+=profit;
            total1+=amount;

        }
    profitlabel.setText(String.format("%.2f", total));
    salesp.setText(String.format("%.2f", total1));
    quantitylabel1.setText(Integer.toString(quantity));
    
}


public void sumUp(){
        double total = 0;
        double total1 =0;
        int quantity = 0;
        for(int i=0; i<jTable1.getRowCount(); i++){

            double profit = Double.parseDouble(jTable1.getValueAt(i,7).toString());
            double amount = Double.parseDouble(jTable1.getValueAt(i,6).toString());
            int quant = Integer.parseInt(jTable1.getValueAt(i,2).toString());
            quantity+=quant;
            total+=profit;
            total1+=amount;

        }
    profitlabel.setText(String.format("%.2f", total));
    salesp.setText(String.format("%.2f", total1));
    quantitylabel1.setText(Integer.toString(quantity));
   
}

public void sumUp2(){

        int quantity = 0;
        for(int i=0; i<jTable1.getRowCount(); i++){

            int quant = Integer.parseInt(jTable1.getValueAt(i,2).toString());
            quantity+=quant;
         

        }
    quantitylabel1.setText(Integer.toString(quantity));
}

public void insertEvent(){
        
        try{
            dbConnect();
            pst = con.prepareStatement("INSERT INTO `events`( `SalesPersonsId`, `Action`, `Date`, `Time`) "
                    + "VALUES (?,?,?,?)");
            pst.setString(1,loginaslb.getText());
            pst.setString(2,"Logged Into Sales Win");
            pst.setString(3,datelb.getText());
            pst.setString(4,timelb.getText());
            
            pst.executeUpdate();
            
            dbClose();
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,e);
        }
    }

public void getShopInfo(){
     try{
                dbConnect();
                    pst = con.prepareStatement("SELECT * FROM shop_info ");
                   
                    rs = pst.executeQuery();
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
                
                JOptionPane.showMessageDialog(this, e);
            }
    
}

public void loginlabel(String n){
   loginaslb.setText(n);

}
}
