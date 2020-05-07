
//import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
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
public class BookPrint extends javax.swing.JFrame {
    
    //Connection con;
    //Statement stmt;
    String dd, dd2;

    /**
     * Creates new form AddNewBook
     */
    public BookPrint() {
        initComponents();
           
        //this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
             
    
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        F_user2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTit = new javax.swing.JLabel();
        lblAut = new javax.swing.JLabel();
        lblEdit = new javax.swing.JLabel();
        lblQTY = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        lblPub = new javax.swing.JLabel();
        lblYOP = new javax.swing.JLabel();
        lblCall = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(855, 630));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(932, 611));
        jPanel1.setPreferredSize(new java.awt.Dimension(932, 611));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Book Details");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 430, 40));

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel3.setText("Edition");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, 30));

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel4.setText("Date Added ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 120, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 120, 30));

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel1.setText("Quantity");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 110, 30));

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel2.setText("Author");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, 30));

        jLabel7.setBackground(new java.awt.Color(0, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 70));

        F_user2.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        F_user2.setForeground(new java.awt.Color(0, 0, 102));
        F_user2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_user2.setText("<--Back");
        F_user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F_user2MouseClicked(evt);
            }
        });
        jPanel1.add(F_user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 170, 30));

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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 3, 380));

        jLabel8.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel8.setText("Publisher");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 130, 30));

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel5.setText("Book Title");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 30));

        jLabel9.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel9.setText("ISBN");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, 30));

        jLabel10.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel10.setText("Call No");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 100, 30));

        jLabel11.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel11.setText("Yr of Publication");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 150, 30));

        jLabel13.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel13.setText("Subject");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 120, 30));

        lblTit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(lblTit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 220, 30));

        lblAut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(lblAut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 220, 30));

        lblEdit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(lblEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 220, 30));

        lblQTY.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(lblQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 220, 30));

        lblISBN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(lblISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 220, 30));

        lblPub.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(lblPub, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 260, 30));

        lblYOP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(lblYOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 260, 30));

        lblCall.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(lblCall, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 260, 30));

        lblSub.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(lblSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 260, 30));

        lblDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 260, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // create a PDF Printer Job
    	        
        final Component comp = null;
        PrinterJob pj = PrinterJob.getPrinterJob();
           pj.setJobName(" Print Component ");

           pj.setPrintable (new Printable() {    
             public int print(Graphics pg, PageFormat pf, int pageNum) {
               if (pageNum > 0) return Printable.NO_SUCH_PAGE;

               Graphics2D g2 = (Graphics2D) pg;
               g2.translate(pf.getImageableX(), pf.getImageableY());
               comp.paint(g2);
               return Printable.PAGE_EXISTS;
             }

           });

           if (pj.printDialog() == false) return;

           try {
             pj.print();
           } catch (PrinterException ex) {
             // handle exception
           }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void F_user2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F_user2MouseClicked
        // TODO add your handling code here:
         BookDetails mn=new BookDetails();
         mn.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_F_user2MouseClicked

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
                new BookPrint().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel F_user2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel lblAut;
    public static javax.swing.JLabel lblCall;
    public static javax.swing.JLabel lblDate;
    public static javax.swing.JLabel lblEdit;
    public static javax.swing.JLabel lblISBN;
    public static javax.swing.JLabel lblPub;
    public static javax.swing.JLabel lblQTY;
    public static javax.swing.JLabel lblSub;
    public static javax.swing.JLabel lblTit;
    public static javax.swing.JLabel lblYOP;
    // End of variables declaration//GEN-END:variables
}
