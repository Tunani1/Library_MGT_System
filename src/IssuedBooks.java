
import java.awt.Color;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
public class IssuedBooks extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;
    String isbn,title,author,qty,publ,subj,call, datee,t1,at1,qty1,cal1,edt1,publ1,yop1,isbn1,subj1,dat1,name,matric,address,date;
    String user,pass,sub;
    int rowCount = -1;
    
    /**
     * Creates new form IssuedBooks
     */
    public IssuedBooks() {
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
            ResultSet rs = st.executeQuery("select * from IssuedBook_vw_Table order by Call_No ASC");
            
            
           while(rs.next()){
                 
               c1.addItem(rs.getString("Call_No"));
               
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
            rs = st.executeQuery("select * from IssuedBook_vw_Table order by Call_No ASC");
           
            while(rs.next()){
                
                    name=rs.getString("Full_Name");
                    title=rs.getString("Book_Title");
                    isbn=rs.getString("Call_No");
                    matric=rs.getString("Phone_No");
                    address=rs.getString("Address");
                    date=rs.getString("IssueDate");
                    Object[] row = {name,title,isbn,matric,address, date};
                    model.addRow(row);
                    
            
            }

              
               lblmsg.setForeground(Color.blue);
               lblmsg.setText("record found");
            
            Statement st2 = connect.createStatement();
            ResultSet rs2 = st2.executeQuery("select count(*) from IssuedBook_vw_Table");
                
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
        c1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblmsg = new javax.swing.JLabel();
        lblcount = new javax.swing.JLabel();
        F_user4 = new javax.swing.JLabel();
        F_user = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        dcFrom = new com.toedter.calendar.JDateChooser();
        lblTo = new javax.swing.JLabel();
        dcTo = new com.toedter.calendar.JDateChooser();
        btnFilter1 = new javax.swing.JButton();
        btnGEN = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1071, 654));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Issued Book Details");
        jLabel1.setMinimumSize(new java.awt.Dimension(900, 520));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "BOOK TITLE", "CALL NO", "PHONE", "ADDRESS", "ISSUE DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(200);
            table.getColumnModel().getColumn(1).setPreferredWidth(200);
            table.getColumnModel().getColumn(2).setPreferredWidth(150);
            table.getColumnModel().getColumn(3).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setPreferredWidth(200);
            table.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 1030, 340));

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
        jButton8.setText("Issue Book");
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

        c1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select call no --" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 140, 30));

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel5.setText("Serach by Call No :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 160, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b2.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 250, 130));

        lblmsg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblmsg.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 270, 20));

        lblcount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcount.setForeground(new java.awt.Color(204, 0, 0));
        lblcount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 30, 20));

        F_user4.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        F_user4.setForeground(new java.awt.Color(153, 0, 0));
        F_user4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_user4.setText("Refresh...");
        F_user4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F_user4MouseClicked(evt);
            }
        });
        jPanel1.add(F_user4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 110, 30));

        F_user.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        F_user.setForeground(new java.awt.Color(204, 0, 51));
        F_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(F_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, 41));

        lblFrom.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        lblFrom.setText("Date From");
        jPanel1.add(lblFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 100, 30));
        jPanel1.add(dcFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 140, 30));

        lblTo.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        lblTo.setText("Date To");
        jPanel1.add(lblTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 80, 30));
        jPanel1.add(dcTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 140, 30));

        btnFilter1.setBackground(new java.awt.Color(0, 51, 102));
        btnFilter1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFilter1.setForeground(new java.awt.Color(255, 255, 255));
        btnFilter1.setText("Filter By Date");
        btnFilter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilter1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFilter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 130, 30));

        btnGEN.setBackground(new java.awt.Color(0, 51, 102));
        btnGEN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGEN.setForeground(new java.awt.Color(255, 255, 255));
        btnGEN.setText("View Row");
        btnGEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGENActionPerformed(evt);
            }
        });
        jPanel1.add(btnGEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 150, 30));

        btnExport.setBackground(new java.awt.Color(0, 51, 102));
        btnExport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("Export (Excel)");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });
        jPanel1.add(btnExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, 160, 30));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        IssueBook ib=new IssueBook();
            String dd = F_user.getText();
            IssueBook.F_user.setText(dd);
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

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
            
            try
            {
              
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            model.setRowCount(0);
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
             rs = st.executeQuery("select * from IssuedBook_vw_Table where Call_No='"+c1.getSelectedItem()+"' order by Call_No ASC");
  
            while(rs.next()){
                
                    name=rs.getString("Full_Name");
                    title=rs.getString("Book_Title");
                    isbn=rs.getString("Call_No");
                    matric=rs.getString("Phone_No");
                    address=rs.getString("Address");
                    date=rs.getString("IssueDate");
                    Object[] row = {name,title,isbn,matric,address, date};
                    model.addRow(row);
                    
               lblmsg.setForeground(Color.blue);
               lblmsg.setText("record found");
            
            }

             connect.close();
             
            }
        catch(SQLException e)
            
            {
 
 
    System.out.println("Could not retrieve database metadata " + e.getMessage());
 
    }catch (ClassNotFoundException ex) {
                Logger.getLogger(AddNewBook.class.getName()).log(Level.SEVERE, null, ex);
            }
 
    }//GEN-LAST:event_c1ActionPerformed

    private void F_user4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F_user4MouseClicked
        // TODO add your handling code here:

            try
            {
              c1.setSelectedItem("--select call no --");
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            model.setRowCount(0);
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
             rs = st.executeQuery("select * from IssuedBook_vw_Table order by Call_No ASC");
  
            while(rs.next()){

                    name=rs.getString("Full_Name");
                    title=rs.getString("Book_Title");
                    isbn=rs.getString("Call_No");
                    matric=rs.getString("Phone_No");
                    address=rs.getString("Address");
                    date=rs.getString("IssueDate");
                    Object[] row = {name,title,isbn,matric,address, date};
                    model.addRow(row);
                    
               lblmsg.setForeground(Color.blue);
               lblmsg.setText("record found");
            
            }

             connect.close();
             
            }
        catch(SQLException e)
            
            {
 
 
    System.out.println("Could not retrieve database metadata " + e.getMessage());
 
    }catch (ClassNotFoundException ex) {
                Logger.getLogger(AddNewBook.class.getName()).log(Level.SEVERE, null, ex);
            }
 
    }//GEN-LAST:event_F_user4MouseClicked

    private void btnFilter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilter1ActionPerformed
        // TODO add your handling code here:


        java.sql.Date Val1 = new java.sql.Date(dcFrom.getDate().getTime());
        java.sql.Date Val2 = new java.sql.Date(dcTo.getDate().getTime());

        try
        {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; database=Trinity_DB; user=sa; password=Tunani14real;";
            Connection connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            String sql = "select * from IssuedBook_vw_Table where IssueDate between ? and ? order by Call_No ASC";
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.setDate(1, Val1);
            pst.setDate(2, Val2);

            rs=pst.executeQuery();

            DefaultTableModel model=(DefaultTableModel)table.getModel();
            model.setRowCount(0);
            if(rs.next())
                { 
                    name=rs.getString("Full_Name");
                    title=rs.getString("Book_Title");
                    isbn=rs.getString("Call_No");
                    matric=rs.getString("Phone_No");
                    address=rs.getString("Address");
                    date=rs.getString("IssueDate");
                    Object[] row = {name,title,isbn,matric,address, date};
                    model.addRow(row);
                
                }else{

            }

            connect.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnFilter1ActionPerformed

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
                String sql = "Select * from IssuedBook_vw_Table where Call_No= ?";
                PreparedStatement stmt = connect.prepareStatement(sql);
                stmt.setString( 1, selected );
                ResultSet rs = stmt.executeQuery();

                int DialogButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to view the selected record?", "Warning", JOptionPane.YES_NO_OPTION);

                if(DialogButton == JOptionPane.YES_OPTION){
                    while(rs.next()){
                    name=rs.getString("Full_Name");
                    user=rs.getString("User_Name");
                    title=rs.getString("Book_Title");
                    isbn=rs.getString("Call_No");
                    pass=rs.getString("Password");
                    matric=rs.getString("Phone_No");
                    address=rs.getString("Address");
                    sub=rs.getString("Subject");
                    date=rs.getString("IssueDate");
                    }
                    IssuePrint info = new IssuePrint();
                    IssuePrint.lblFull.setText(name);
                    IssuePrint.lblUse.setText(user);
                    IssuePrint.lblTit.setText(title);
                    IssuePrint.lblCall.setText(isbn);
                    IssuePrint.lblpas.setText(pass);
                    IssuePrint.lblFon.setText(matric);
                    IssuePrint.lblAdd.setText(address);
                    IssuePrint.lblCos.setText(sub);
                    IssuePrint.lblDate.setText(date);
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
                new IssuedBooks().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel F_user;
    public static javax.swing.JLabel F_user2;
    public static javax.swing.JLabel F_user4;
    public static javax.swing.JButton btnExport;
    public static javax.swing.JButton btnFilter1;
    public static javax.swing.JButton btnGEN;
    private javax.swing.JComboBox<String> c1;
    public static com.toedter.calendar.JDateChooser dcFrom;
    public static com.toedter.calendar.JDateChooser dcTo;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblFrom;
    public static javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblcount;
    private javax.swing.JLabel lblmsg;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
