
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pankaj Yadav
 */
public class ReturnBook extends javax.swing.JFrame {
    
    Connection connect;
    Statement stmt;
    String dd4 = "";
    ResultSet rs, rs3;
    String query, url;
    Date date;
    SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
    String  checkAvailability,SName,Address,SStream,SClass,title,dd2,dd, ds, sql;
    

    /**
     * Creates new form ReturnBook
     */
    public ReturnBook() {
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
            ResultSet rs = st.executeQuery("select * from IssuedBook_vw_Table");
            
           while(rs.next()){
               
               c1.addItem(rs.getString("Password"));
               
           }
           connect.close();
           
        }catch(Exception Error){
            
               JOptionPane.showMessageDialog(null, Error);
        }
       
          try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("select * from IssuedBook_vw_Table");
            
           while(rs.next()){
               
               c2.addItem(rs.getString("Call_No"));
               
           }
           connect.close();
           
        }catch(Exception Error){
            
               JOptionPane.showMessageDialog(null, Error);
        }
     
       
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        //get current date time with Date()
        date = new Date();
        t7.setText(dateFormat.format(date));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        F_user2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        F_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Return Book To The Library ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel7.setText("Issued On");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 100, 30));

        t5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t5.setEnabled(false);
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 300, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        F_user2.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        F_user2.setForeground(new java.awt.Color(0, 0, 102));
        F_user2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_user2.setText("<--Dashboard");
        F_user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F_user2MouseClicked(evt);
            }
        });
        jPanel1.add(F_user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 30));

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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 3, 360));

        jLabel8.setBackground(new java.awt.Color(0, 204, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Book Details.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 160, 230));

        c1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select user id --" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 300, 30));

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel2.setText("User ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 100, 30));

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t2.setEnabled(false);
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 300, 33));

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 100, 31));

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel4.setText("Call No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 85, 31));

        c2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select call no --" }));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 300, 30));

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel5.setText("Book Title");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, 32));

        t4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t4.setEnabled(false);
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 300, 30));

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel6.setText("Return Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, 29));

        t7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t7.setEnabled(false);
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        jPanel1.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 300, 29));

        jButton10.setBackground(new java.awt.Color(0, 51, 102));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("View Returned Books");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 30));

        jButton14.setBackground(new java.awt.Color(0, 51, 102));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("View Books");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, 30));

        jButton8.setBackground(new java.awt.Color(0, 51, 102));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Add New Book ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 170, 30));

        jButton11.setBackground(new java.awt.Color(0, 51, 102));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Issue Book");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 170, 30));

        jButton12.setBackground(new java.awt.Color(0, 51, 102));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Add New User");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 170, 30));

        F_user.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        F_user.setForeground(new java.awt.Color(204, 0, 51));
        F_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(F_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, 41));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       MainLayer mn=new MainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        if(c1.getSelectedItem().equals("--select user id --"))
            JOptionPane.showMessageDialog(this,"Please select User ID"); 
        else if(c2.getSelectedItem().equals("--select call no --"))
            JOptionPane.showMessageDialog(this,"Please select Call No");
        else
        {
           
        try{
           
            
            
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            connect = DriverManager.getConnection(url);
            sql = "insert into Return_Table" + "(Book_Title, Call_No, User_ID, IssuedOn, ReturnDate)" + "Values(?,?,?,?,?)" + "update Book_Table set Quantity = Quantity + 1 where CallNo = '"+c2.getSelectedItem()+"'" + "Delete FROM Issue_Table where Issue_ID = '"+ dd4 +"' and  Call_No = '"+ c2.getSelectedItem() +"'";
          
            Statement st = connect.createStatement();
            rs = st.executeQuery("SELECT * FROM User_Table WHERE Password = '"+ c1.getSelectedItem() +"'");
             
            PreparedStatement pst = connect.prepareStatement(sql);
            
            pst.setString(1, t4.getText());
            pst.setString(2, (String) c2.getSelectedItem());
            
             
            while(rs.next()){
                String dd =rs.getString("User_ID");
                pst.setString(3, dd);
                
               
           }
              
            pst.setString(4, t5.getText());
            pst.setString(5, t7.getText());
            pst.executeUpdate();
          
            JOptionPane.showMessageDialog(this," You just returned a book to the Library");
               
            c1.setSelectedItem("--select user id --");
            t2.setText("");
            c2.setSelectedItem("--select call no --");
            t4.setText("");
            t5.setText("");
            ReturnBook mn=new ReturnBook();
            mn.setVisible(true);
            this.setVisible(false);
        
              connect.close();   
        }
        catch(SQLException e)
            
            {
 
 
    System.out.println("Could not retrieve database metadata " + e.getMessage());
 
    }catch (ClassNotFoundException ex) {
                Logger.getLogger(AddNewBook.class.getName()).log(Level.SEVERE, null, ex);
            }
 
 
                }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void F_user2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F_user2MouseClicked
        // TODO add your handling code here:
        MainLayer mn=new MainLayer();
            String dd = F_user.getText();
            MainLayer.F_user.setText(dd);
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_F_user2MouseClicked

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            String sql = "select * from User_Table where Password = ?";
            
            
            Statement st = connect.createStatement();
            ResultSet rs2 = st.executeQuery("select Issue_ID, Book_Title, Call_No from IssuedBook_vw_Table where Password = '"+ c1.getSelectedItem() +"' ");
            
            PreparedStatement pst = connect.prepareStatement(sql);

            pst.setString(1, String.valueOf(c1.getSelectedItem()));

            ResultSet rs = pst.executeQuery();

            t2.setText("");
            while(rs.next()){
                //c1.addItem(rs.getString("Password"));
                SName=rs.getString("Full_name");
                t2.setText(SName);
            }
            
            //    c2.setSelectedItem("--select call no --");
               
             while(rs2.next()){
               dd4 = (rs2.getString("Issue_ID"));
             //  c2.addItem(rs2.getString("Call_No"));
             }
           
            
               connect.close();

        }catch(Exception Error){

            JOptionPane.showMessageDialog(null, Error);
        }
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            sql = "select * from IssuedBook_vw_Table where Call_No = ?";
            PreparedStatement pst = connect.prepareStatement(sql);
            

            pst.setString(1, String.valueOf(c2.getSelectedItem()));

            ResultSet rs = pst.executeQuery();

            t4.setText("");
            while(rs.next()){
                t4.setText(rs.getString("Book_Title"));
                t5.setText(rs.getString("IssueDate"));
                

            }
                       

            connect.close();

        }catch(Exception Error){

            JOptionPane.showMessageDialog(null, Error);
        }
    }//GEN-LAST:event_c2ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        ReturnedBooks ibs=new ReturnedBooks();
            String dd = F_user.getText();
            ReturnedBooks.F_user.setText(dd);
        ibs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        BookDetails ibs=new BookDetails();
            String dd = F_user.getText();
            BookDetails.F_user.setText(dd);
        ibs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        AddNewBook anb=new AddNewBook();
            String dd = F_user.getText();
            AddNewBook.F_user.setText(dd);
        anb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        IssueBook rb=new IssueBook();
            String dd = F_user.getText();
            IssueBook.F_user.setText(dd);
        rb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        AddNewUser rb=new AddNewUser();
            String dd = F_user.getText();
            AddNewUser.F_user.setText(dd);
        rb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel F_user;
    public static javax.swing.JLabel F_user2;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t7;
    // End of variables declaration//GEN-END:variables
}
