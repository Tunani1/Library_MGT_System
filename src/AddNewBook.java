
//import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pankaj Yadav
 */
public class AddNewBook extends javax.swing.JFrame {
    
    //Connection con;
    //Statement stmt;
    String dd, dd2;

    /**
     * Creates new form AddNewBook
     */
    public AddNewBook() {
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
            ResultSet rs = st.executeQuery("select * from MainClass_LC_Table");
            
           while(rs.next()){
               
               drpSubject.addItem(rs.getString("MainClasses"));
               
           }
           connect.close();
           
        }catch(Exception Error){
            
               JOptionPane.showMessageDialog(null, Error);
        }
          
          txtQuantity.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = txtQuantity.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               txtQuantity.setEditable(true);
               //label.setText("");
            } else {
               txtQuantity.setEditable(false);
               //label.setText("* Enter only numeric digits(0-9)");
               if (!txtQuantity.getText().isEmpty()) {
                    
                   txtQuantity.setEditable(true);
                    //label.setText("");
                }
            }
         }
      });
      setVisible(true);
          
          
          txtYOP.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = txtYOP.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               txtYOP.setEditable(true);
               //label.setText("");
            } else {
               txtYOP.setEditable(false);
               //label.setText("* Enter only numeric digits(0-9)");
               if (!txtYOP.getText().isEmpty()) {
                    
                   txtYOP.setEditable(true);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        drpSubject = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtEdition = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        F_user2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtPublisher = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        txtCallNo = new javax.swing.JTextField();
        txtYOP = new javax.swing.JTextField();
        F_user = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnCUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(932, 611));
        jPanel1.setPreferredSize(new java.awt.Dimension(932, 611));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add a New Book");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 360, 40));

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel3.setText("Edition");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 90, 30));

        txtAuthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 280, 30));

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel4.setText("Subject :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 120, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 120, 30));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 120, 30));

        drpSubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        drpSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --" }));
        jPanel1.add(drpSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 280, 30));

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel1.setText("Quantity");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 100, 30));

        txtEdition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEdition.setFocusTraversalPolicyProvider(true);
        jPanel1.add(txtEdition, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 280, 30));

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel2.setText("Author");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 80, 30));

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 280, 30));

        jButton4.setBackground(new java.awt.Color(0, 51, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Issue Book");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 170, 30));

        jButton6.setBackground(new java.awt.Color(0, 51, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("View Issued Books");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 170, 30));

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Return Book");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 170, 30));

        jLabel7.setBackground(new java.awt.Color(0, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 70));

        F_user2.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        F_user2.setForeground(new java.awt.Color(0, 0, 102));
        F_user2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_user2.setText("<--Dashboard");
        F_user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F_user2MouseClicked(evt);
            }
        });
        jPanel1.add(F_user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 170, 30));

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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 3, 400));

        txtPublisher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 280, 30));

        jLabel8.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel8.setText("Publisher");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 130, 30));

        txtTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 280, 30));

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel5.setText("Book Title");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 120, 30));

        jLabel9.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel9.setText("ISBN");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 90, 30));

        txtISBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 280, 30));

        jLabel10.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel10.setText("Call No");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 100, 30));

        jLabel11.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel11.setText("Yr of Publication");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 150, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Book Details.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 180, 230));

        jButton10.setBackground(new java.awt.Color(0, 51, 102));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("View Books");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 170, 30));

        txtCallNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCallNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCallNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCallNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 280, 30));

        txtYOP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtYOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 280, 30));

        F_user.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        F_user.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.add(F_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 41));

        btnUpdate.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 120, 30));

        btnCUpdate.setBackground(new java.awt.Color(204, 0, 0));
        btnCUpdate.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        btnCUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnCUpdate.setText("Cancel");
        btnCUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnCUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainLayer mn=new MainLayer();
        String dd = F_user.getText();
        MainLayer.F_user.setText(dd);
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
     
        
        if(txtTitle.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Book Title is requied"); 
        else if(txtAuthor.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Author is requied");
        else if(txtEdition.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Book Edition is requied");
        else if(txtQuantity.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Quantity is requied");
        else if(txtISBN.getText().equals(""))
            JOptionPane.showMessageDialog(this,"ISBN is requied");
        else if(txtPublisher.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Author is requied");  
        else if(txtYOP.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Year of Publication is required");
        else if(txtCallNo.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Call No is required"); 
        else if(drpSubject.getSelectedItem().equals("-- Select --"))
            JOptionPane.showMessageDialog(this,"Please select Subject"); 
        else
        {
           
        try{
           
         
            
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            //String sql = "insert into Book_Table" + "(Title, Author, Edition, Quantity, ISBN, Publisher, Yr_Of_Public)" + "Values(?,?,?,?,?,?,?)"  + " (SELECT * FROM Subject_Table WHERE Subject_ID = ?)" + " (SELECT * FROM Shelf_Table WHERE Shelf_ID= ?)";
             String sql = "insert into Book_Table" + "(Title, Author, Edition, Quantity, ISBN, Publisher, Yr_Of_Publication, CallNo, LC_ID)" + "Values(?,?,?,?,?,?,?,?,?)";
            
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM MainClass_LC_Table WHERE MainClasses = '"+ drpSubject.getSelectedItem() +"'");
           
            Statement st2 = connect.createStatement();
            ResultSet rs2 = st2.executeQuery("select * from Book_vw_Table WHERE CallNo = '"+ txtCallNo.getText() +"'");
            
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.setString(1, txtTitle.getText());
            pst.setString(2, txtAuthor.getText());
            pst.setString(3, txtEdition.getText());
            pst.setString(4, txtQuantity.getText());
            pst.setString(5, txtISBN.getText());
            pst.setString(6, txtPublisher.getText());
            pst.setString(7, txtYOP.getText());
            pst.setString(8, txtCallNo.getText());
            while(rs.next()){
                dd =rs.getString("LC_ID");
                pst.setString(9, dd);
               
           }
              
            if(rs2.next()){
                    JOptionPane.showMessageDialog(this, "A book with this Call No '" + rs2.getString("CallNo") + "' already exist");

            }else{
                pst.executeUpdate();
            

                JOptionPane.showMessageDialog(this,"New book added to Library");

                txtTitle.setText("");
                txtAuthor.setText("");
                txtEdition.setText("");
                txtQuantity.setText("");
                txtISBN.setText("");
                txtPublisher.setText("");
                txtYOP.setText("");
                txtCallNo.setText("");
                drpSubject.setSelectedItem("-- Select --");
        
            }
          
        
        }
        catch(SQLException e)
            
            {
 
 
    System.out.println("Could not retrieve database metadata " + e.getMessage());
 
    }catch (ClassNotFoundException ex) {
                Logger.getLogger(AddNewBook.class.getName()).log(Level.SEVERE, null, ex);
            }
 
 
                }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        IssueBook ib=new IssueBook();
        String dd = F_user.getText();
        IssueBook.F_user.setText(dd);
        ib.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ReturnBook rb=new ReturnBook();
        String dd = F_user.getText();
        ReturnBook.F_user.setText(dd);
        rb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        IssuedBooks ibs=new IssuedBooks();
        String dd = F_user.getText();
        IssuedBooks.F_user.setText(dd);
        ibs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void F_user2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F_user2MouseClicked
        // TODO add your handling code here:
         MainLayer mn=new MainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_F_user2MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        BookDetails ibs=new BookDetails();
        String dd = F_user.getText();
        BookDetails.F_user.setText(dd);
        ibs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void txtCallNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCallNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCallNoActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        
        if(txtTitle.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Book Title is requied"); 
        else if(txtAuthor.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Author is requied");
        else if(txtEdition.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Book Edition is requied");
        else if(txtQuantity.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Quantity is requied");
        else if(txtISBN.getText().equals(""))
            JOptionPane.showMessageDialog(this,"ISBN is requied");
        else if(txtPublisher.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Author is requied");  
        else if(txtYOP.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Year of Publication is required");
        else if(txtCallNo.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Call No is required"); 
        else if(drpSubject.getSelectedItem().equals("-- Select --"))
            JOptionPane.showMessageDialog(this,"Please select Subject"); 
        else
        {
           
        try{
           
         
            
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            //String sql = "insert into Book_Table" + "(Title, Author, Edition, Quantity, ISBN, Publisher, Yr_Of_Public)" + "Values(?,?,?,?,?,?,?)"  + " (SELECT * FROM Subject_Table WHERE Subject_ID = ?)" + " (SELECT * FROM Shelf_Table WHERE Shelf_ID= ?)";
             String sql = "update Book_Table set Title = ?, Author = ?,Edition = ?,Quantity = ?, ISBN = ?,Publisher = ?,Yr_Of_Publication = ?, CallNo = ?,LC_ID = ? where CallNo = '"+ txtCallNo.getText() +"'";
            
             
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM MainClass_LC_Table WHERE MainClasses = '"+ drpSubject.getSelectedItem() +"'");
           
            //Statement st2 = connect.createStatement();
            //ResultSet rs2 = st2.executeQuery("select * from Book_vw_Table WHERE CallNo = '"+ txtCallNo.getText() +"'");
            
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.setString(1, txtTitle.getText());
            pst.setString(2, txtAuthor.getText());
            pst.setString(3, txtEdition.getText());
            pst.setString(4, txtQuantity.getText());
            pst.setString(5, txtISBN.getText());
            pst.setString(6, txtPublisher.getText());
            pst.setString(7, txtYOP.getText());
            pst.setString(8, txtCallNo.getText());
            while(rs.next()){
                dd =rs.getString("LC_ID");
                pst.setString(9, dd);
               
           }
             
                pst.executeUpdate();
            

                JOptionPane.showMessageDialog(this,"An Existing book updated in the Library");

                txtTitle.setText("");
                txtAuthor.setText("");
                txtEdition.setText("");
                txtQuantity.setText("");
                txtISBN.setText("");
                txtPublisher.setText("");
                txtYOP.setText("");
                txtCallNo.setText("");
                drpSubject.setSelectedItem("-- Select --");
            
        
        }
        catch(SQLException e)
            
            {
 
 
    System.out.println("Could not retrieve database metadata " + e.getMessage());
 
    }catch (ClassNotFoundException ex) {
                Logger.getLogger(AddNewBook.class.getName()).log(Level.SEVERE, null, ex);
            }
 
 
                }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCUpdateActionPerformed
        // TODO add your handling code here:
        BookDetails mn=new BookDetails();
        String dd = F_user.getText();
        BookDetails.F_user.setText(dd);
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewBook().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel F_user;
    public static javax.swing.JLabel F_user2;
    public static javax.swing.JButton btnCUpdate;
    public static javax.swing.JButton btnUpdate;
    public static javax.swing.JComboBox<String> drpSubject;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JTextField txtAuthor;
    public static javax.swing.JTextField txtCallNo;
    public static javax.swing.JTextField txtEdition;
    public static javax.swing.JTextField txtISBN;
    public static javax.swing.JTextField txtPublisher;
    public static javax.swing.JTextField txtQuantity;
    public static javax.swing.JTextField txtTitle;
    public static javax.swing.JTextField txtYOP;
    // End of variables declaration//GEN-END:variables
}
