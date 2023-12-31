/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;
import java.util.ArrayList;
import javax.swing.JFrame;
/**
 *
 * @author Pana
 */
public class ViewEmployeeDetails extends javax.swing.JFrame {

    //declare an array for saving employees
    // this array captures objects created in the Empdetails form
    public static ArrayList<Employee> employeeEntityList;
    /**
     * Creates new form ViewEmployeeDetails
     */
    //The combo box is to be loaded with employee numbers when the form is loaded
    //This method loads objects into the combo box
    public void LoadComboBox(){
    //clearing the combo box
        cboEmpNo.removeAllItems();
        /**
         * use the enhance for loop to store all objects of the array list
         * you can also use the ordinary for loop, word the same way
         */
        for (Employee empEntityList : employeeEntityList) {
            // adding employee numbers into the combo box
            cboEmpNo.addItem(empEntityList.getEmpNumber());
        }
    }
    /**
     *Construct a new form of view employee details
     */
    public ViewEmployeeDetails() {
        initComponents();
        //calling the methods that populate the combo box with employee numbers
        LoadComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlView = new javax.swing.JPanel();
        lblCombo = new javax.swing.JLabel();
        cboEmpNo = new javax.swing.JComboBox();
        pnlBtns = new javax.swing.JPanel();
        btnViewAll = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("frmView");

        pnlView.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATABASE - View Employee "));

        lblCombo.setText("Select An Employee No:");
        lblCombo.setToolTipText("");

        cboEmpNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpNoActionPerformed(evt);
            }
        });

        pnlBtns.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnViewAll.setLabel("View All Employees");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        btnAdd.setLabel("Add Employee [+]");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBtnsLayout = new javax.swing.GroupLayout(pnlBtns);
        pnlBtns.setLayout(pnlBtnsLayout);
        pnlBtnsLayout.setHorizontalGroup(
            pnlBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBtnsLayout.setVerticalGroup(
            pnlBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnViewAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnViewAll.getAccessibleContext().setAccessibleName("ViewEmpButton");
        btnAdd.getAccessibleContext().setAccessibleName("AddEmpButton");

        txtDisplay.setEditable(false);
        txtDisplay.setColumns(20);
        txtDisplay.setRows(5);
        txtDisplay.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Display"));
        jScrollPane1.setViewportView(txtDisplay);
        txtDisplay.getAccessibleContext().setAccessibleName("DisplayTextArea");

        javax.swing.GroupLayout pnlViewLayout = new javax.swing.GroupLayout(pnlView);
        pnlView.setLayout(pnlViewLayout);
        pnlViewLayout.setHorizontalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCombo)
                    .addComponent(pnlBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboEmpNo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlViewLayout.setVerticalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlViewLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblCombo)
                        .addGap(18, 18, 18)
                        .addComponent(cboEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(pnlBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );

        lblCombo.getAccessibleContext().setAccessibleName("EmployeComboLabel");
        cboEmpNo.getAccessibleContext().setAccessibleName("EmpNoComboBox");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pnlView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboEmpNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpNoActionPerformed
        // TODO add your handling code here:
        //Checking if the user has selected any item from the combo box
        if (cboEmpNo.getSelectedItem() == null) {
            //return an empty string if nothing has been selected
            return;
        }
        //Read the selected item from the combo box
        
        String empNo = cboEmpNo.getSelectedItem().toString();
        
        //looping through the array list comparing the employee number in the combo box
        // with the employee no in the array list
        for (Employee empEntity : employeeEntityList) {
            //if the EmpNo in the combo box is the same as the one in the array list
            if (empNo.equals(empEntity.getEmpNumber())) {
                //Display the details of that employee on the text area
                txtDisplay.setText(empEntity.toString());
            }
            
        }
    }//GEN-LAST:event_cboEmpNoActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        // TODO add your handling code here:
        /**
         * This button displays all employee records stored in the array list
         */
        txtDisplay.setText("****.*.*.*.Database Employee.*.*.*.****\n------View All Records------");
        for (Employee objEntity : employeeEntityList) {
            //display all the employee records contained in the entire database/array
            txtDisplay.append(objEntity.toString() + "\n...................\n");
        }
        
        
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        EmployeeDetailsEntry objAdd = new EmployeeDetailsEntry();
        objAdd.setTitle("Add A New Employee");
        objAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objAdd.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEmployeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JComboBox cboEmpNo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCombo;
    private javax.swing.JPanel pnlBtns;
    private javax.swing.JPanel pnlView;
    private javax.swing.JTextArea txtDisplay;
    // End of variables declaration//GEN-END:variables
}
