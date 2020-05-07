
import java.awt.Color;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Pankaj Yadav
 */
public class BookDetails extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;
    String isbn,title,author,qty,publ,subj,call, datee,t1,at1,qty1,cal1,edt1,publ1,yop1,isbn1,subj1,dat1;
    String SName, b2,b3,b4,b5,b6,b7,b8,b9;
    
    int rowCount = -1;
    
    
    /**
     * Creates new form BookDetails
     */
    public BookDetails() {
        initComponents();
        
        //this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
        lblLG.setVisible(false);
           
          try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("select * from Book_Table order by CallNo ASC");
            
           while(rs.next()){
               
               c1.addItem(rs.getString("CallNo"));
               
           }
           connect.close();
           
        }catch(Exception Error){
            
               JOptionPane.showMessageDialog(null, Error);
        }
          
        /////
        
    
            try
            {
              
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            model.setRowCount(0);
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            rs = st.executeQuery("select * from Book_vw_Table order by CallNo ASC");
            
                while(rs.next())
                {
                    title=rs.getString("Title");
                    author=rs.getString("Author");
                    call=rs.getString("CallNo");
                    qty=rs.getString("Quantity");
                    publ=rs.getString("Publisher");
                    isbn=rs.getString("ISBN");
                    subj=rs.getString("MainClasses");
                    datee=rs.getString("DateCreated");
                    Object[] row = {title,author,call,qty,publ,isbn,subj,datee};
                    model.addRow(row);
                }
                
               lblmsg.setForeground(Color.blue);
               lblmsg.setText("record found");
            
            Statement st2 = connect.createStatement();
            ResultSet rs2 = st2.executeQuery("select count(*) from Book_vw_Table");
                
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
 
       
        //////
        
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        txt1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        r2 = new javax.swing.JRadioButton();
        c1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        F_user2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        F_user4 = new javax.swing.JLabel();
        lblmsg = new javax.swing.JLabel();
        lblcount = new javax.swing.JLabel();
        lblLG = new javax.swing.JLabel();
        F_user5 = new javax.swing.JLabel();
        F_user = new javax.swing.JLabel();
        lblMSS = new javax.swing.JLabel();
        lblUpdate = new javax.swing.JLabel();
        lblDel = new javax.swing.JLabel();
        dcTo = new com.toedter.calendar.JDateChooser();
        dcFrom = new com.toedter.calendar.JDateChooser();
        lblTo = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        btnGEN = new javax.swing.JButton();
        btnFilter1 = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        r3 = new javax.swing.JRadioButton();
        txt2 = new javax.swing.JTextField();
        r4 = new javax.swing.JRadioButton();
        txt3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1016, 574));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Book Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        b1.add(r1);
        r1.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        r1.setText("Search by Title");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 160, 30));

        txt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt1.setEnabled(false);
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1KeyReleased(evt);
            }
        });
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 140, 30));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add New Book ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 170, 30));

        b1.add(r2);
        r2.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        r2.setText("Search By Call No");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 160, 30));

        c1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select call no --" }));
        c1.setEnabled(false);
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 140, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK TITLE", "AUTHOR", "CALL NO", "QUANTITY", "PUBLISHER", "ISBN", "SUBJECT", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(150);
            table.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1090, 290));

        jLabel7.setBackground(new java.awt.Color(0, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 70));

        F_user2.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        F_user2.setForeground(new java.awt.Color(0, 0, 102));
        F_user2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_user2.setText("<--Dashboard");
        F_user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F_user2MouseClicked(evt);
            }
        });
        jPanel1.add(F_user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 170, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b2.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 250, 140));

        F_user4.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        F_user4.setForeground(new java.awt.Color(153, 0, 0));
        F_user4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_user4.setText("Refresh...");
        F_user4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F_user4MouseClicked(evt);
            }
        });
        jPanel1.add(F_user4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 100, 30));

        lblmsg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblmsg.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 270, 20));

        lblcount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcount.setForeground(new java.awt.Color(204, 0, 0));
        lblcount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 30, 20));

        lblLG.setBackground(new java.awt.Color(255, 255, 255));
        lblLG.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        lblLG.setForeground(new java.awt.Color(255, 0, 0));
        lblLG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLG.setText("Logout");
        lblLG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLGMouseClicked(evt);
            }
        });
        jPanel1.add(lblLG, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 170, 120, 30));

        F_user5.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        F_user5.setForeground(new java.awt.Color(153, 0, 0));
        F_user5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_user5.setText("Refresh...");
        F_user5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F_user5MouseClicked(evt);
            }
        });
        jPanel1.add(F_user5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 100, 30));

        F_user.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        F_user.setForeground(new java.awt.Color(204, 0, 51));
        F_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(F_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 41));

        lblMSS.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblMSS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMSS.setText("Kindly view all the books and search by the following criterias");
        jPanel1.add(lblMSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 480, 30));

        lblUpdate.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        lblUpdate.setForeground(new java.awt.Color(153, 0, 0));
        lblUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdate.setText("Update");
        lblUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateMouseClicked(evt);
            }
        });
        jPanel1.add(lblUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 210, 90, 30));

        lblDel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        lblDel.setForeground(new java.awt.Color(153, 0, 0));
        lblDel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDel.setText("Delete");
        lblDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDelMouseClicked(evt);
            }
        });
        jPanel1.add(lblDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 80, 30));
        jPanel1.add(dcTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 140, 30));
        jPanel1.add(dcFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 140, 30));

        lblTo.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        lblTo.setText("Date To");
        jPanel1.add(lblTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 80, 30));

        lblFrom.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        lblFrom.setText("Date From");
        jPanel1.add(lblFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 100, 30));

        btnGEN.setBackground(new java.awt.Color(0, 51, 102));
        btnGEN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGEN.setForeground(new java.awt.Color(255, 255, 255));
        btnGEN.setText("View Row");
        btnGEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGENActionPerformed(evt);
            }
        });
        jPanel1.add(btnGEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 570, 140, 30));

        btnFilter1.setBackground(new java.awt.Color(0, 51, 102));
        btnFilter1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFilter1.setForeground(new java.awt.Color(255, 255, 255));
        btnFilter1.setText("Filter By Date");
        btnFilter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilter1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFilter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 130, 30));

        btnExport.setBackground(new java.awt.Color(0, 51, 102));
        btnExport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("Export (Excel)");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });
        jPanel1.add(btnExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 160, 30));

        b1.add(r3);
        r3.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        r3.setText("Search by Subject");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        jPanel1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 160, 30));

        txt2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt2.setEnabled(false);
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2KeyReleased(evt);
            }
        });
        jPanel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 120, 30));

        b1.add(r4);
        r4.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        r4.setText("Search by Author");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        jPanel1.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 160, 30));

        txt3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt3.setEnabled(false);
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3KeyReleased(evt);
            }
        });
        jPanel1.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        c1.disable();
        txt2.disable();
        txt3.disable();
        txt1.enable();
        
    }//GEN-LAST:event_r1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
     try
        {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            rs = st.executeQuery("select * from Book_vw_Table where CallNo ='"+c1.getSelectedItem()+"' order by CallNo ASC");
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        while(rs.next())
        {
           
                    title=rs.getString("Title");
                    author=rs.getString("Author");
                    call=rs.getString("CallNo");
                    qty=rs.getString("Quantity");
                    publ=rs.getString("Publisher");
                    isbn=rs.getString("ISBN");
                    subj=rs.getString("MainClasses");
                    datee=rs.getString("DateCreated");
                    Object[] row = {title,author,call,qty,publ,isbn,subj,datee};
                    model.addRow(row);
        }
        
        connect.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_c1ActionPerformed

    private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        model.setRowCount(0);
        String txt=txt1.getText();
        if(txt.equals(""))
            System.out.println("");
        else
        {
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
                Connection connect = DriverManager.getConnection(url);
                Statement st = connect.createStatement();
                rs = st.executeQuery("select * from Book_vw_Table where Title LIKE '%"+txt1.getText()+"%' order by CallNo ASC");
            
               // query="select * from books where BookName LIKE \"%"+txt1.getText()+"%\";";
               // rs=stmt.executeQuery(query); 
                while(rs.next())
                {
 
                    title=rs.getString("Title");
                    author=rs.getString("Author");
                    call=rs.getString("CallNo");
                    qty=rs.getString("Quantity");
                    publ=rs.getString("Publisher");
                    isbn=rs.getString("ISBN");
                    subj=rs.getString("MainClasses");
                    datee=rs.getString("DateCreated");
                    Object[] row = {title,author,call,qty,publ,isbn,subj,datee};
                    model.addRow(row);
                }
                connect.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }   
    }//GEN-LAST:event_txt1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddNewBook anb=new AddNewBook();
        String dd = F_user.getText();
        AddNewBook.F_user.setText(dd);
        anb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void F_user2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F_user2MouseClicked
        // TODO add your handling code here:
        MainLayer mn=new MainLayer();
        String dd = F_user.getText();
        MainLayer.F_user.setText(dd);
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_F_user2MouseClicked

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        txt1.disable();
        c1.enable();
    }//GEN-LAST:event_r2ActionPerformed

    private void F_user4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F_user4MouseClicked
        // TODO add your handling code here:
          try
        {
           
           txt1.setText("");
           txt1.disable();
           c1.disable();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            rs = st.executeQuery("select * from Book_vw_Table order by CallNo ASC");
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        while(rs.next())
        {
           
                    title=rs.getString("Title");
                    author=rs.getString("Author");
                    call=rs.getString("CallNo");
                    qty=rs.getString("Quantity");
                    publ=rs.getString("Publisher");
                    isbn=rs.getString("ISBN");
                    subj=rs.getString("MainClasses");
                    datee=rs.getString("DateCreated");
                    Object[] row = {title,author,call,qty,publ,isbn,subj,datee};
                    model.addRow(row);
        }
        
        connect.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_F_user4MouseClicked

    private void lblLGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLGMouseClicked
        // TODO add your handling code here:
        int DialogButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Warning", JOptionPane.YES_NO_OPTION);

        if(DialogButton == JOptionPane.YES_OPTION){

            Logins info = new Logins();
            info.setVisible(true);
            this.dispose();

        }else{

        }
    }//GEN-LAST:event_lblLGMouseClicked

    private void F_user5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F_user5MouseClicked
        // TODO add your handling code here:
        /*
        DefaultTableModel model=(DefaultTableModel) table.getModel();
        while(model.getRowCount()>0){
        model.setRowCount(0);
        }
        */
        try
        {
           txt1.setText("");
           txt1.disable();
           c1.disable();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            rs = st.executeQuery("select * from Book_vw_Table order by CallNo ASC");
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        while(rs.next())
        {
           
                    title=rs.getString("Title");
                    author=rs.getString("Author");
                    call=rs.getString("CallNo");
                    qty=rs.getString("Quantity");
                    publ=rs.getString("Publisher");
                    isbn=rs.getString("ISBN");
                    subj=rs.getString("MainClasses");
                    datee=rs.getString("DateCreated");
                    Object[] row = {title,author,call,qty,publ,isbn,subj,datee};
                    model.addRow(row);
        }
        
        connect.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_F_user5MouseClicked

    private void lblUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMouseClicked
        // TODO add your handling code here:
         
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        //model.setRowCount(0);
          int SelectedRowIndex = table.getSelectedRow();
            String selected = model.getValueAt(SelectedRowIndex, 2).toString();
                    
                if(SelectedRowIndex >= 0){
                    // remove a row from jtable    
                    try
                   {

                       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                       String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
                       Connection connect = DriverManager.getConnection(url);
                       
                        String sql = "select * from Book_vw_Table where CallNo = ?";
                        PreparedStatement pst = connect.prepareStatement(sql);
                        
                        pst.setString( 1, selected );
                        
                        ResultSet rs = pst.executeQuery();
                        
                            
                         int DialogButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the selected record?", "Warning", JOptionPane.YES_NO_OPTION);

                        if(DialogButton == JOptionPane.YES_OPTION){
 
                            while(rs.next()){

                            AddNewBook info = new AddNewBook();
                            
                            AddNewBook.jButton1.setVisible(false);
                            AddNewBook.btnUpdate.setVisible(true);
                            AddNewBook.jButton2.setVisible(false);
                            AddNewBook.btnCUpdate.setVisible(true);
                            AddNewBook.jLabel6.setText("Update Book");
                            
                            SName=rs.getString("Title");
                            AddNewBook.txtTitle.setText(SName);
                            b2=rs.getString("Author");
                            AddNewBook.txtAuthor.setText(b2);
                            b3=rs.getString("Edition");
                            AddNewBook.txtEdition.setText(b3);
                            b4=rs.getString("Quantity");
                            AddNewBook.txtQuantity.setText(b4);
                            b5=rs.getString("ISBN");
                            AddNewBook.txtISBN.setText(b5);
                            b6=rs.getString("Publisher");
                            AddNewBook.txtPublisher.setText(b6);
                            b7=rs.getString("Yr_Of_Publication");
                            AddNewBook.txtYOP.setText(b7);
                            b8=rs.getString("CallNo");
                            AddNewBook.txtCallNo.setText(b8);
                            b9=rs.getString("MainClasses");
                            AddNewBook.drpSubject.setSelectedItem(b9);
                            info.setVisible(true);
                            this.dispose();
                            
                            }
                            //stmt.executeUpdate();
                            //model.removeRow(SelectedRowIndex);
                            //BookDetails info = new BookDetails();
                            //info.setVisible(true);
                            //this.dispose();

                        }else{

                        }


                   }
                   catch(Exception e)
                   {
                       System.out.println(e);
                   }
                }
                else{
                    System.out.println("Delete Error");
                }
           
    }//GEN-LAST:event_lblUpdateMouseClicked

    private void lblDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        //model.setRowCount(0);
          int SelectedRowIndex = table.getSelectedRow();
            String selected = model.getValueAt(SelectedRowIndex, 2).toString();
                    
                if(SelectedRowIndex >= 0){
                    // remove a row from jtable    
                    try
                   {

                       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                       String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
                       Connection connect = DriverManager.getConnection(url);
                       String sql = "delete from Book_Table where CallNo= ?";
                        PreparedStatement stmt = connect.prepareStatement(sql);
                        stmt.setString( 1, selected );
                        
                         int DialogButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the selected record?", "Warning", JOptionPane.YES_NO_OPTION);

                        if(DialogButton == JOptionPane.YES_OPTION){
 
                            stmt.executeUpdate();
                            model.removeRow(SelectedRowIndex);
                            BookDetails info = new BookDetails();
                            info.setVisible(true);
                            this.dispose();

                        }else{

                        }


                   }
                   catch(Exception e)
                   {
                       System.out.println(e);
                   }
                }
                else{
                    System.out.println("Delete Error");
                }
           
    }//GEN-LAST:event_lblDelMouseClicked

    private void btnGENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGENActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        //model.setRowCount(0);
          int SelectedRowIndex = table.getSelectedRow();
            String selected = model.getValueAt(SelectedRowIndex, 2).toString();
                    
                if(SelectedRowIndex >= 0){
                    // remove a row from jtable    
                    try
                   {

                       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                       String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
                       Connection connect = DriverManager.getConnection(url);
                       String sql = "Select * from Book_vw_Table where CallNo= ?";
                        PreparedStatement stmt = connect.prepareStatement(sql);
                        stmt.setString( 1, selected );
                        ResultSet rs = stmt.executeQuery();
                        
                         int DialogButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to generate the selected record?", "Warning", JOptionPane.YES_NO_OPTION);

                        if(DialogButton == JOptionPane.YES_OPTION){
                          while(rs.next()){
                            t1=rs.getString("Title");
                            at1=rs.getString("Author");
                            cal1=rs.getString("CallNo");
                            qty1=rs.getString("Quantity");
                            edt1=rs.getString("Edition");
                            publ1=rs.getString("Publisher");
                            yop1=rs.getString("Yr_Of_Publication");
                            isbn1=rs.getString("ISBN");
                            subj1=rs.getString("MainClasses");
                            dat1=rs.getString("DateCreated");
                            }
                            BookPrint info = new BookPrint();
                            BookPrint.lblTit.setText(t1);
                            BookPrint.lblAut.setText(at1);
                            BookPrint.lblEdit.setText(edt1);
                            BookPrint.lblQTY.setText(qty1);
                            BookPrint.lblISBN.setText(isbn1);
                            BookPrint.lblPub.setText(publ1);
                            BookPrint.lblYOP.setText(yop1);
                            BookPrint.lblCall.setText(cal1);
                            BookPrint.lblSub.setText(subj1);
                            BookPrint.lblDate.setText(dat1);
                            String dd = F_user.getText();
                            info.setVisible(true);
                            this.dispose();
                        }else{

                        }


                   }
                   catch(Exception e)
                   {
                       System.out.println(e);
                   }
                }
                else{
                    System.out.println("Delete Error");
                }
           
    }//GEN-LAST:event_btnGENActionPerformed

    private void btnFilter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilter1ActionPerformed
        // TODO add your handling code here:
        
        
        
        java.sql.Date Val1 = new java.sql.Date(dcFrom.getDate().getTime());
        java.sql.Date Val2 = new java.sql.Date(dcTo.getDate().getTime());
        //java.util.Date val1 = dcFrom.getDate();
        //java.util.Date val2 = dcTo.getDate();
        
        try
        {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            String sql = "select * from Book_vw_Table where DateCreated between ? and ? order by CallNo ASC";
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.setDate(1, Val1);
            pst.setDate(2, Val2);
            
            rs=pst.executeQuery();
            
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            model.setRowCount(0);

            if(rs.next())
            {
                        title=rs.getString("Title");
                        author=rs.getString("Author");
                        call=rs.getString("CallNo");
                        qty=rs.getString("Quantity");
                        publ=rs.getString("Publisher");
                        isbn=rs.getString("ISBN");
                        subj=rs.getString("MainClasses");
                    datee=rs.getString("DateCreated");
                    Object[] row = {title,author,call,qty,publ,isbn,subj,datee};
                        model.addRow(row);
                
            }else{
            
            
            JOptionPane.showMessageDialog(null, "Invalid date or empty value");title=rs.getString("Title");
                        author=rs.getString("Author");
                        call=rs.getString("CallNo");
                        qty=rs.getString("Quantity");
                        publ=rs.getString("Publisher");
                        isbn=rs.getString("ISBN");
                        subj=rs.getString("MainClasses");
                    datee=rs.getString("DateCreated");
                    Object[] row = {title,author,call,qty,publ,isbn,subj,datee};
                        model.addRow(row);
            }

            connect.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        
    }//GEN-LAST:event_btnFilter1ActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        
        
    JFileChooser save = new JFileChooser();
    save.setDialogTitle("Save as...");
    save.setFileFilter(new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm"));
    int choose = save.showSaveDialog(null);

    if(choose == JFileChooser.APPROVE_OPTION) {
        XSSFWorkbook export = new XSSFWorkbook();
        XSSFSheet sheet1 = export.createSheet("new file");
        XSSFFont sheetTitleFont = export.createFont();
        XSSFCellStyle cellStyle = export.createCellStyle();
        sheetTitleFont.setFontHeightInPoints((short) 14);
        sheetTitleFont.setBold(true);
        sheetTitleFont.setFontName("Arials");
                
                
        try{
            
            TableModel model = table.getModel();
            //DefaultTableModel model=(DefaultTableModel)table.getModel();
            //model.setRowCount(0);
        
            TableColumnModel modelc = table.getTableHeader().getColumnModel();
            
            /*
                XSSFRow JRow = sheet1.createRow((short) 0);
                for(int j = 0; j < 4; j++) {                       
                   XSSFCell cc = JRow.createCell(4);
                   cc.setCellValue("Ade");
                   cc.setCellStyle(cellStyle);
                }
               */ 
            
                //Get Header
                //TableColumnModel tcm = table.getColumnModel();
                XSSFRow hRow = sheet1.createRow((short) 0);
                for(int j = 0; j < modelc.getColumnCount(); j++) {                       
                   XSSFCell cell_h = hRow.createCell((short) j);
                   cell_h.setCellValue(modelc.getColumn(j).getHeaderValue().toString());
                   cell_h.setCellStyle(cellStyle);
                }

                //Get Other details
                for (int i = 0; i < model.getRowCount(); i++) {
                    XSSFRow fRow = sheet1.createRow((short) i+1);
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        XSSFCell cell_r = fRow.createCell((short) j);
                        cell_r.setCellValue(model.getValueAt(i, j).toString());
                        cell_r.setCellStyle(cellStyle);
                    }
                }
            FileOutputStream otp = new FileOutputStream(save.getSelectedFile()+".xlsx");
            try (BufferedOutputStream bos = new BufferedOutputStream(otp)) {
                export.write(bos);
            }
                    otp.close();

            JOptionPane.showMessageDialog(null, "Report generated successfully!");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        

    }//GEN-LAST:event_btnExportActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
        c1.disable();
        txt1.disable();
        txt3.disable();
        txt2.enable();
    }//GEN-LAST:event_r3ActionPerformed

    private void txt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyReleased
        // TODO add your handling code here:
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        model.setRowCount(0);
        String txt=txt2.getText();
        if(txt.equals(""))
            System.out.println("");
        else
        {
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
                Connection connect = DriverManager.getConnection(url);
                Statement st = connect.createStatement();
                rs = st.executeQuery("select * from Book_vw_Table where MainClasses LIKE '%"+txt2.getText()+"%' order by MainClasses ASC");
            
               // query="select * from books where BookName LIKE \"%"+txt1.getText()+"%\";";
               // rs=stmt.executeQuery(query); 
                while(rs.next())
                {
 
                    title=rs.getString("Title");
                    author=rs.getString("Author");
                    call=rs.getString("CallNo");
                    qty=rs.getString("Quantity");
                    publ=rs.getString("Publisher");
                    isbn=rs.getString("ISBN");
                    subj=rs.getString("MainClasses");
                    datee=rs.getString("DateCreated");
                    Object[] row = {title,author,call,qty,publ,isbn,subj,datee};
                    model.addRow(row);
                }
                connect.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_txt2KeyReleased

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
        c1.disable();
        txt2.disable();
        txt1.disable();
        txt3.enable();
    }//GEN-LAST:event_r4ActionPerformed

    private void txt3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyReleased
        // TODO add your handling code here:
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        model.setRowCount(0);
        String txt=txt3.getText();
        if(txt.equals(""))
            System.out.println("");
        else
        {
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
                Connection connect = DriverManager.getConnection(url);
                Statement st = connect.createStatement();
                rs = st.executeQuery("select * from Book_vw_Table where Author LIKE '%"+txt3.getText()+"%' order by Author ASC");
            
               // query="select * from books where BookName LIKE \"%"+txt1.getText()+"%\";";
               // rs=stmt.executeQuery(query); 
                while(rs.next())
                {
 
                    title=rs.getString("Title");
                    author=rs.getString("Author");
                    call=rs.getString("CallNo");
                    qty=rs.getString("Quantity");
                    publ=rs.getString("Publisher");
                    isbn=rs.getString("ISBN");
                    subj=rs.getString("MainClasses");
                    datee=rs.getString("DateCreated");
                    Object[] row = {title,author,call,qty,publ,isbn,subj,datee};
                    model.addRow(row);
                }
                connect.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_txt3KeyReleased

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
            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookDetails().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel F_user;
    public static javax.swing.JLabel F_user2;
    public static javax.swing.JLabel F_user4;
    public static javax.swing.JLabel F_user5;
    private javax.swing.ButtonGroup b1;
    public static javax.swing.JButton btnExport;
    public static javax.swing.JButton btnFilter1;
    public static javax.swing.JButton btnGEN;
    public static javax.swing.JComboBox<String> c1;
    public static com.toedter.calendar.JDateChooser dcFrom;
    public static com.toedter.calendar.JDateChooser dcTo;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lblDel;
    public static javax.swing.JLabel lblFrom;
    public static javax.swing.JLabel lblLG;
    public static javax.swing.JLabel lblMSS;
    public static javax.swing.JLabel lblTo;
    public static javax.swing.JLabel lblUpdate;
    private javax.swing.JLabel lblcount;
    private javax.swing.JLabel lblmsg;
    public static javax.swing.JRadioButton r1;
    public static javax.swing.JRadioButton r2;
    public static javax.swing.JRadioButton r3;
    public static javax.swing.JRadioButton r4;
    private javax.swing.JTable table;
    public static javax.swing.JTextField txt1;
    public static javax.swing.JTextField txt2;
    public static javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
