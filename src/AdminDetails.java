
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pankaj Yadav
 */
public class AdminDetails extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;
    String sn,name, matric, isbn,title,address, date;
    
    int rowCount = -1;
   
    public AdminDetails() {
        initComponents();
        
        
        //this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
            try
            {
              
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            model.setRowCount(0);
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            rs = st.executeQuery("select * from Login_vw_Table order by Fullname ASC");
           
            while(rs.next()){
                
                    name=rs.getString("Fullname");
                    title=rs.getString("Username");
                    matric=rs.getString("PhoneNo");
                    Object[] row = {name,title,matric};
                    model.addRow(row);
                    
            
            }

              
               lblmsg.setForeground(Color.blue);
               lblmsg.setText("record found");
            
            Statement st2 = connect.createStatement();
            ResultSet rs2 = st2.executeQuery("select count(*) from Login_vw_Table");
                
            while(rs2.next()){
                
                rowCount = rs2.getInt(1);
                String str1 = Integer.toString(rowCount);
                if(rowCount > 0){
                    lblcount.setForeground(Color.blue);
                    lblcount.setText("(" + str1 +")");
                }else{
                    lblcount.setText("(" + str1 +")");
                }
            }
             connect.close();
             
            }
        catch(SQLException e)
            
            {
 
 
    System.out.println("Could not retrieve database metadata " + e.getMessage());
 
    }catch (ClassNotFoundException ex) {
                Logger.getLogger(AddNewBook.class.getName()).log(Level.SEVERE, null, ex);
            }
 
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        F_user2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblmsg = new javax.swing.JLabel();
        lblcount = new javax.swing.JLabel();
        F_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1068, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Library Admin Details");
        jLabel1.setMinimumSize(new java.awt.Dimension(900, 520));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "USERNAME", "PHONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(250);
            table.getColumnModel().getColumn(1).setPreferredWidth(250);
            table.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 1030, 330));

        F_user2.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        F_user2.setForeground(new java.awt.Color(0, 0, 102));
        F_user2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_user2.setText("<--Dashboard");
        F_user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F_user2MouseClicked(evt);
            }
        });
        jPanel1.add(F_user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, 30));

        jButton8.setBackground(new java.awt.Color(0, 51, 102));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Add New Admin");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 130, 30));

        jLabel7.setBackground(new java.awt.Color(0, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b2.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 250, 130));

        lblmsg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblmsg.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 270, 20));

        lblcount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcount.setForeground(new java.awt.Color(204, 0, 0));
        lblcount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 30, 20));

        F_user.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        F_user.setForeground(new java.awt.Color(204, 0, 51));
        F_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(F_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, 41));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        AdminReg ib=new AdminReg();
        String dd = F_user.getText();
        AdminReg.F_user.setText(dd);
        ib.setVisible(true);
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
            java.util.logging.Logger.getLogger(IssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDetails().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel F_user;
    public static javax.swing.JLabel F_user2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcount;
    private javax.swing.JLabel lblmsg;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
