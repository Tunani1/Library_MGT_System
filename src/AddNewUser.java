
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pankaj Yadav
 */
public class AddNewUser extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    String query,dd, dd2;
    /**
     * Creates new form RegisterStudent
     */
    public AddNewUser() {
        initComponents();
           //this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
           
          try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("select * from Subject_vw_Table");
            
           while(rs.next()){
               
               c1.addItem(rs.getString("Subject"));
               
           }
           connect.close();
           
        }catch(Exception Error){
            
               JOptionPane.showMessageDialog(null, Error);
        }
          
          
          t3.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t3.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               t3.setEditable(true);
               //label.setText("");
            } else {
               t3.setEditable(false);
               //label.setText("* Enter only numeric digits(0-9)");
               if (!t3.getText().isEmpty()) {
                    
                   t3.setEditable(true);
                    //label.setText("");
                }
            }
         }
      });
      setVisible(true);
          
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        F_user2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        a1 = new javax.swing.JTextArea();
        t4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        F_user = new javax.swing.JLabel();
        btnCUpdate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(932, 490));
        jPanel1.setPreferredSize(new java.awt.Dimension(920, 534));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 90, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Library User Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 310, 30));

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel3.setText("Fullname");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 110, 30));

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t2FocusGained(evt);
            }
        });
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 310, 30));

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel5.setText("Course");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 80, 30));

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 90, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 140, 30));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 120, 30));

        jButton8.setBackground(new java.awt.Color(0, 51, 102));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("View Users");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 170, 30));

        F_user2.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        F_user2.setForeground(new java.awt.Color(0, 0, 102));
        F_user2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_user2.setText("<--Dashboard");
        F_user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F_user2MouseClicked(evt);
            }
        });
        jPanel1.add(F_user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 30));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 3, 360));

        jButton10.setBackground(new java.awt.Color(0, 51, 102));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("View Admin");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 170, 30));

        jButton11.setBackground(new java.awt.Color(0, 51, 102));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Add New Admin");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 170, 30));

        jButton12.setBackground(new java.awt.Color(0, 51, 102));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Issue Book");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 170, 30));

        jButton13.setBackground(new java.awt.Color(0, 51, 102));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Return Book");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 170, 30));

        jLabel8.setBackground(new java.awt.Color(0, 204, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 70));

        t3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 310, 30));

        jLabel7.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel7.setText("Phone No");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 90, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Book Details.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 160, 230));

        c1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select course --" }));
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 310, 30));

        a1.setColumns(20);
        a1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        a1.setRows(5);
        jScrollPane1.setViewportView(a1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 310, 80));

        t4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t4FocusGained(evt);
            }
        });
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 310, 30));

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 90, 30));

        F_user.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        F_user.setForeground(new java.awt.Color(204, 0, 51));
        F_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(F_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 140, 41));

        btnCUpdate.setBackground(new java.awt.Color(204, 0, 0));
        btnCUpdate.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        btnCUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnCUpdate.setText("Cancel");
        btnCUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnCUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 120, 30));

        btnUpdate.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /////////////
                
        if(t1.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Name is requied"); 
        else if(t2.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Username is requied");
        else if(t4.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Password is requied");
        else if(t3.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Phone No is requied");
        else if(a1.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Address is requied");
        else if(c1.getSelectedItem().equals("--select course --"))
            JOptionPane.showMessageDialog(this,"Please select course"); 
        else
        {
            
        try{
            
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            String sql = "insert into User_Table" + "(Full_name, User_Name, Password, Phone_No, Address, Role_ID, Subject_ID)" + "Values(?,?,?,?,?,?,?)";
             
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Subject_Table WHERE Subject = '"+ c1.getSelectedItem() +"'");
            
            Statement st2 = connect.createStatement();
            ResultSet rs2 = st2.executeQuery("select * from Role_Table where Role_Name = 'Students'");
            
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.setString(1, t1.getText());
            pst.setString(2, t2.getText());
            pst.setString(3, t4.getText());
            pst.setString(4, t3.getText());
            pst.setString(5, a1.getText());
            while(rs2.next()){
                dd2 =rs2.getString("Role_ID");
                pst.setString(6, dd2);
               
           }
            while(rs.next()){
                dd =rs.getString("Subject_ID");
                pst.setString(7, dd);
               
           }
            pst.executeUpdate();
         
            
        
        JOptionPane.showMessageDialog(this,"New User added to Library");
        
        t1.setText("");
        t2.setText("");
        t4.setText("");
        t3.setText("");
        a1.setText("");
        c1.setSelectedItem("--select course --");
       
        }
        catch(SQLException e)
            
            {
 
 
    System.out.println("Could not retrieve database metadata " + e.getMessage());
 
    }catch (ClassNotFoundException ex) {
                Logger.getLogger(AddNewBook.class.getName()).log(Level.SEVERE, null, ex);
            }
 
 
                }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       MainLayer mn=new MainLayer();
       String dd = F_user.getText();
       MainLayer.F_user.setText(dd);
       mn.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        UserDetails anb=new UserDetails();
        String dd = F_user.getText();
        UserDetails.F_user.setText(dd);
        anb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void F_user2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F_user2MouseClicked
        // TODO add your handling code here:
        MainLayer mn=new MainLayer();
        String dd = F_user.getText();
        MainLayer.F_user.setText(dd);
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_F_user2MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        AdminDetails ibs=new AdminDetails();
        String dd = F_user.getText();
        AdminDetails.F_user.setText(dd);
        ibs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        AdminReg rb=new AdminReg();
        String dd = F_user.getText();
        AdminReg.F_user.setText(dd);
        rb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        IssueBook rb=new IssueBook();
        String dd = F_user.getText();
        IssueBook.F_user.setText(dd);
        rb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        ReturnBook bd=new ReturnBook();
        String dd = F_user.getText();
        ReturnBook.F_user.setText(dd);
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:\
        
        if(!t1.getText().isEmpty()){
        
          Random rand = new Random(); 
  
            // Generate random integers in range 0 to 999 
            int rand_int1 = rand.nextInt(100); 


            String firstWord = t1.getText();
            if(firstWord.contains(" ")){
                firstWord = firstWord.substring(0, firstWord.indexOf(" ")) + rand_int1; 
                t2.setText(firstWord);
            }
        }
    }//GEN-LAST:event_t2ActionPerformed

    private void t2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t2FocusGained
        // TODO add your handling code here:
        
        if(!t1.getText().isEmpty()){
          Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(100); 
        
        
        String firstWord = t1.getText();
        if(firstWord.contains(" ")){
            firstWord = firstWord.substring(0, firstWord.indexOf(" ")) + rand_int1; 
            t2.setText(firstWord);
        }
        }
    }//GEN-LAST:event_t2FocusGained

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
        
        if(!t1.getText().isEmpty()){
          Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(100); 
        int rand_int2 = rand.nextInt(10); 
        
        
        String firstWord = t1.getText();
        if(firstWord.length() > 4){
            firstWord = firstWord.substring(0, 4) + rand_int1 + rand_int2; 
            t4.setText(firstWord);
        }
        }
    }//GEN-LAST:event_t4ActionPerformed

    private void t4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t4FocusGained
        // TODO add your handling code here:
        
        if(!t1.getText().isEmpty()){
          Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(100); 
        int rand_int2 = rand.nextInt(10); 
        
        
        String firstWord = t1.getText();
        if(firstWord.length() > 3){
            firstWord = firstWord.substring(0, 3) + rand_int1 + rand_int2; 
            t4.setText(firstWord);
        }
        }
    }//GEN-LAST:event_t4FocusGained

    private void btnCUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCUpdateActionPerformed
        // TODO add your handling code here:
        UserDetails mn=new UserDetails();
        String dd = F_user.getText();
        UserDetails.F_user.setText(dd);
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCUpdateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

       if(t1.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Name is requied"); 
        else if(t2.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Username is requied");
        else if(t4.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Password is requied");
        else if(t3.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Phone No is requied");
        else if(a1.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Address is requied");
        else if(c1.getSelectedItem().equals("--select course --"))
            JOptionPane.showMessageDialog(this,"Please select course"); 
        else
        {
            
            try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
                Connection connect = DriverManager.getConnection(url);
                //String sql = "insert into Book_Table" + "(Title, Author, Edition, Quantity, ISBN, Publisher, Yr_Of_Public)" + "Values(?,?,?,?,?,?,?)"  + " (SELECT * FROM Subject_Table WHERE Subject_ID = ?)" + " (SELECT * FROM Shelf_Table WHERE Shelf_ID= ?)";
                String sql = "update User_Table set Full_name = ?, User_Name = ?,Password = ?,Phone_No = ?, Address = ?,Role_ID = ?,Subject_ID = ? where Password = '"+ t4.getText() +"'";

                Statement st = connect.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM Subject_Table WHERE Subject = '"+ c1.getSelectedItem() +"'");

                Statement st2 = connect.createStatement();
                ResultSet rs2 = st2.executeQuery("select * from Role_Table where Role_Name = 'Students'");

                PreparedStatement pst = connect.prepareStatement(sql);
                pst.setString(1, t1.getText());
                pst.setString(2, t2.getText());
                pst.setString(3, t4.getText());
                pst.setString(4, t3.getText());
                pst.setString(5, a1.getText());
                while(rs2.next()){
                    dd2 =rs2.getString("Role_ID");
                    pst.setString(6, dd2);

               }
                while(rs.next()){
                    dd =rs.getString("Subject_ID");
                    pst.setString(7, dd);

               }

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"An Existing User updated in the Library");

                t1.setText("");
                t2.setText("");
                t4.setText("");
                t3.setText("");
                a1.setText("");
                c1.setSelectedItem("--select course --");

            }
            catch(SQLException e)

            {

                System.out.println("Could not retrieve database metadata " + e.getMessage());

            }catch (ClassNotFoundException ex) {
                Logger.getLogger(AddNewBook.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new AddNewUser().setVisible(true);
            }
            
        });
        
    }

 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel F_user;
    public static javax.swing.JLabel F_user2;
    public static javax.swing.JTextArea a1;
    public static javax.swing.JButton btnCUpdate;
    public static javax.swing.JButton btnUpdate;
    public static javax.swing.JComboBox<String> c1;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField t1;
    public static javax.swing.JTextField t2;
    public static javax.swing.JTextField t3;
    public static javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
