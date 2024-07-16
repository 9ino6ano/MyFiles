/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.text.*;

/**
 *
 * @author Pana
 */
public class EditEmployee extends javax.swing.JFrame {

    ArrayList<Job> objJob;
    ArrayList<Employee> objEmployee;
    DecimalFormat formatter;
    /**
     * Creates new form EditEmployee
     */
    public EditEmployee() {
        initComponents();
        //instantiate the formatter before using it 
        formatter = new DecimalFormat("#,###.00");
        
        //setting 2 arrays for the two classes, the empoyee extending a job
        objJob = new ArrayList<Job>();
        objEmployee = new ArrayList<Employee>();
        populateArrayList();
        //we set the combo box, we need string values for the job
        String[] jobsArray= new String[objJob.size()];
        for (int i = 0; i < objJob.size(); i++) {
            jobsArray[i] = objJob.get(i).getNameOfJob() + " ,R" + formatter.format(objJob.get(i).getSalary());
//using  the decimal formater changes the appearance of the string                                                                                                              
//objJob.get(i).getSalary()
        }
        
        cbojob2.setModel(new javax.swing.DefaultComboBoxModel<>(jobsArray));
    
        //we set the combo box, we need string values for the job
        String[] EmpArray= new String[objEmployee.size()];
        for (int i = 0; i < objEmployee.size(); i++) {
            EmpArray[i] = objEmployee.get(i).getName() + " , " + objEmployee.get(i).getSurname();
//using  the decimal formater changes the appearance of the string                                                                                                              
//objJob.get(i).getSalary()
        }
        
        cboEmp.setModel(new javax.swing.DefaultComboBoxModel<>(EmpArray));
    
        cboEmp.setSelectedIndex(0);
   
    }
    public void populateArrayList(){
        //this method gets the contents in a file
        //we must catch an exeption, normally we throw exeption
        try {
            //for reading into the file we use file input
            FileInputStream isFile = new FileInputStream("Jobs.dat");
            ObjectInputStream inFile = new ObjectInputStream(isFile);
            
            boolean endOfFile = false;
            
            while (!endOfFile) {                
                try {//while reading we will add objects into the array from the file
                    //we will try reading from the file
                    // read= get info from array job = make sure its of type jop objJob = save it to an array
                    objJob.add((Job)inFile.readObject());
//the object that gets returned is of (type object) = cast the object to return.
                    // after while loop you must close the file
                } catch (EOFException e) {
                    endOfFile = true;
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
            //we finished reading from the file
            inFile.close();
            /**
             *What happened in this method is , it will first go to the file (jobs.txt),
             *which we do not have,but it will show the user an exception message(which we catch)
             * thereafter show program(doesn't stop program, calls method for creating the file) for entering a new object.
             */
        }
        catch (IOException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       // this methods add data form the employees file and adds to employee arrays
        try {
            //for reading into the file we use file input
            FileInputStream isFile2 = new FileInputStream("Employees.dat");
            ObjectInputStream inFile2 = new ObjectInputStream(isFile2);
            
            boolean endOfFile2 = false;
            
            while (!endOfFile2) {                
                try {//while reading we will add objects into the array from the file
                    //we will try reading from the file
                    // read= get info from array job = make sure its of type jop objJob = save it to an array
                    objEmployee.add((Employee)inFile2.readObject());
//the object that gets returned is of (type object) = cast the object to return.
                    // after while loop you must close the file
                } catch (EOFException e) {
                    endOfFile2 = true;
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
            //we finished reading from the file
            inFile2.close();
            /**
             *What happened in this method is , it will first go to the file (jobs.txt),
             *which we do not have,but it will show the user an exception message(which we catch)
             * thereafter show program(doesn't stop program, calls method for creating the file) for entering a new object.
             */
        }
        catch (IOException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
        
    }
    public void saveEmployeesToFile(){
        //for writing into the file we use file output
        try {
            FileOutputStream ofFlle = new FileOutputStream("Employees.dat");
            ObjectOutputStream outFile = new ObjectOutputStream(ofFlle);
            //we read/write into the same file
            for (int i = 0; i < objEmployee.size(); i++) {
                //what we want to write to file is the active Arraylist<> = jobs array
                outFile.writeObject(objEmployee.get(i));
                //this code writes into the file an object at the [pos i] of the array
                
            }
            //after all records have been processed , close the file
            outFile.close();
            //alert the user that objects have been saved to the file
            JOptionPane.showMessageDialog(null, "Data Successfully Saved.");
            this.dispose();  
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void DeleteEmployeesToFile(){
        //for writing into the file we use file output
        try {
            FileOutputStream ofFlle = new FileOutputStream("Employees.dat");
            ObjectOutputStream outFile = new ObjectOutputStream(ofFlle);
            //we read/write into the same file
            for (int i = 0; i < objEmployee.size(); i++) {
                //what we want to write to file is the active Arraylist<> = jobs array
                outFile.writeObject(objEmployee.get(i));
                //this code writes into the file an object at the [pos i] of the array
                
            }
            //after all records have been processed , close the file
            outFile.close();
            //alert the user that objects have been saved to the file
            JOptionPane.showMessageDialog(null, "Data Successfully Deleted.");
            this.dispose();  
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboEmp = new javax.swing.JComboBox();
        txtEmpName = new javax.swing.JTextField();
        txtEmpSurname = new javax.swing.JTextField();
        cbojob2 = new javax.swing.JComboBox();
        txtStNo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Existing Employee");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Edit Employee Data:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Choose an Employee:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Employee Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Employee Surname:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Employee Job:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Employee Staff Number:");

        cboEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpActionPerformed(evt);
            }
        });

        cbojob2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pana\\Pictures\\Pics\\save.png")); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pana\\Pictures\\Pics\\exit.png")); // NOI18N
        jButton2.setText("Dekete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpSurname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbojob2, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                            .addComponent(cboEmp, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmpSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbojob2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtStNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpActionPerformed
        // TODO add your handling code here:
        int selectedIndex = cboEmp.getSelectedIndex();
        txtEmpName.setText(objEmployee.get(selectedIndex).getName());
        txtEmpSurname.setText(objEmployee.get(selectedIndex).getSurname());
        txtStNo.setText(objEmployee.get(selectedIndex).getStaffNumber()+"");
        int index = 0;
        Job jobObj = objEmployee.get(selectedIndex).getEmpJob();
        for (int i = 0; i < objJob.size(); i++) {
            if (objJob.get(i).equals(jobObj)) {
                index = 1;
                break;//break out of the for loop
            }
        }
        cbojob2.setSelectedIndex(index);
    }//GEN-LAST:event_cboEmpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (txtEmpName.getText().isEmpty()&&txtEmpSurname.getText().isEmpty()&&txtStNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Employee Details In The Fields Provided");
        }//tests if the user has entered input in the text fields
        else{
            int selectedIndex = cboEmp.getSelectedIndex();
            objEmployee.get(selectedIndex).setName(txtEmpName.getText().trim());
            objEmployee.get(selectedIndex).setSurname(txtEmpSurname.getText().trim());
            objEmployee.get(selectedIndex).setStaffNumber(Integer.parseInt(txtStNo.getText().trim()));

            Job job = objJob.get(cbojob2.getSelectedIndex());
            objEmployee.get(selectedIndex).setEmpJob(job);
           
            //we need to save the array to a file
            saveEmployeesToFile();
            
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedIn = cboEmp.getSelectedIndex();
        
        objEmployee.remove(selectedIn);
        DeleteEmployeesToFile();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboEmp;
    private javax.swing.JComboBox cbojob2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpSurname;
    private javax.swing.JTextField txtStNo;
    // End of variables declaration//GEN-END:variables
}
