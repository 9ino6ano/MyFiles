/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nino;
//import database packages 

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pana
 */
public class HomeForm extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    //declare global database access variables
    /**
     * Creates new form HomeForm
     */
    public HomeForm() {
        initComponents();
        try {
            connect();
            JOptionPane.showMessageDialog(null, "Connection established!!!!!");
            Update_display();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed.n"+e.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblMusic = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCourse = new javax.swing.JTextField();
        txtNo = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Form");

        jtblMusic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Course", "Musical_No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtblMusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblMusicMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblMusic);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel2.setText("Music_Name:");

        jLabel3.setText("Music_Course:");

        jLabel4.setText("Music_No:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txtCourse)
                            .addComponent(txtNo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel1.setText("9ino6ano Academy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //create a connection method for accessing the database
    //call the method in the main method
    //--create a clear method
    public void connect(){
        String URL = "jdbc:mysql://localhost:3306/ninonano";
        String USER = "root";
        String PASS = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL,USER,PASS);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Update_display(){
        int p;
        try {
            ps = con.prepareStatement("select * from academy");
            rs = ps.executeQuery();
            //retrieving more than one column form the database table
            ResultSetMetaData rsm = rs.getMetaData();
            p = rsm.getColumnCount();
            //selecting the table which we will add data into
            DefaultTableModel dt = (DefaultTableModel) jtblMusic.getModel();
            dt.setRowCount(0);
            //looping through the records
            while (rs.next()) {                
                Vector v2 = new Vector();
                for (int i = 0; i < p; i++) {
                    v2.add(rs.getInt("ID"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Course"));
                    v2.add(rs.getInt("Music_No"));
                }
                dt.addRow(v2);
            }
            
        } catch (SQLException e) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void clear(){
        txtName.setText("");
        txtCourse.setText("");
        txtNo.setText("");
        txtName.requestFocus();
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        /**
         * First declare local variables to access text boxes
         * ensure relative validation
         * add the records into the database
         * declare local variables into database variables
         * INSERT OR SAVE VARIABLES INTO TABLES
         * SHOW CONFIRMATION MESSAGE
         * CLEAR THE TEXT BOXES
         * DISPLAY ON THE TABLE
         * -- save into array, save into file
         * --disable buttons
         * --ensure relative try .. catch
         */
        String Music_Name,Music_Course;
        Integer Music_No;
        if (!txtName.getText().isEmpty() && !txtCourse.getText().isEmpty() || !txtNo.getText().isEmpty()) {
            try {
                Music_Name = txtName.getText();
                Music_Course = txtCourse.getText();
                Music_No = Integer.parseInt(txtNo.getText());
                ps = con.prepareStatement("insert into academy(Name,Course,Music_No) values(?,?,?)");
                ps.setString(1, Music_Name);
                ps.setString(2, Music_Course);
                ps.setInt(3, Music_No);
                int k = ps.executeUpdate();
                if (k == 1) {
                    JOptionPane.showMessageDialog(null,Music_Name+" Successfully Saved.");
                    Update_display();
                }else{
                    JOptionPane.showMessageDialog(null, "Database not found.");
                }
            } catch (SQLException e) {
                Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please enter the information required , on the text-fields provided.");
        }
        clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jtblMusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblMusicMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)jtblMusic.getModel();
        int selected_index = jtblMusic.getSelectedRow();
        int id = Integer.parseInt(dtm.getValueAt(selected_index, 0).toString());
        txtName.setText(dtm.getValueAt(selected_index, 1).toString());
        txtCourse.setText(dtm.getValueAt(selected_index, 2).toString());
        txtNo.setText(dtm.getValueAt(selected_index, 3).toString());
    }//GEN-LAST:event_jtblMusicMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)jtblMusic.getModel();
        int selected_index = jtblMusic.getSelectedRow();
        
        String Music_Name,Music_Course;
        Integer Music_No;
        int id = Integer.parseInt(dtm.getValueAt(selected_index, 0).toString());
        
        if (!txtName.getText().isEmpty() || !txtCourse.getText().isEmpty() || !txtNo.getText().isEmpty()) {
            try {
                
                Music_Name = txtName.getText();
                Music_Course = txtCourse.getText();
                Music_No = Integer.parseInt(txtNo.getText());
                
                ps = con.prepareStatement("update academy set Name=?,Course=?,Music_No=? where ID=?");
                ps.setString(1, Music_Name);
                ps.setString(2, Music_Course);
                ps.setInt(3, Music_No);
                ps.setInt(4, id);
                
                int k = ps.executeUpdate();
                
                if (k == 1) {
                    JOptionPane.showMessageDialog(null,Music_Name+" Updated Successfully.");
                    Update_display();
                }else{
                    JOptionPane.showMessageDialog(null, "Database not found.");
                }
            } catch (SQLException e) {
                Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please enter the information required , on the text-fields provided.");
        }
        clear();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)jtblMusic.getModel();
        int selected_index = jtblMusic.getSelectedRow();
        int id = Integer.parseInt(dtm.getValueAt(selected_index, 0).toString());
        
        int diag_res = JOptionPane.showConfirmDialog(null, "Do You Want To Delete The Record ?","Remove Record",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION);
        
        try {
                
                if (diag_res == JOptionPane.YES_OPTION) {
                    ps = con.prepareStatement("delete from academy where ID=?");
                
                ps.setInt(1, id);
                
                int k = ps.executeUpdate();
                if (k == 1) {
                    JOptionPane.showMessageDialog(null,id+" Deleted Successfully.");
                    Update_display();
                }else{
                    JOptionPane.showMessageDialog(null, "Database not found.");
                }
            }
                
            } catch (SQLException e) {
                Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, e);
            }
            clear();
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblMusic;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNo;
    // End of variables declaration//GEN-END:variables
}