/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import java.text.*;//the decimal formatter class
/**
 *
 * @author Pana
 */
public class AddEmployee extends javax.swing.JFrame {
    //Exactly like the job object , except extention in attributes
    ArrayList<Job> objJob;
    ArrayList<Employee> objEmployee;
    DecimalFormat formatter;//formats a string object.
    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        initComponents();
        //instantiate the formatter before using it 
        formatter = new DecimalFormat("#,###.00");
        
        //setting 2 arrays for the two classes, the empoyee extending a job
        objJob = new ArrayList<Job>();
        objEmployee = new ArrayList<Employee>();
        populateArrayList();
        //call the method that reads from the 2 files
        
        //we set the combo box, we need string values for the job
        String[] jobsArray= new String[objJob.size()];
        for (int i = 0; i < objJob.size(); i++) {
            jobsArray[i] = objJob.get(i).getNameOfJob() + " ,R" + formatter.format(objJob.get(i).getSalary());
//using  the decimal formater changes the appearance of the string                                                                                                              
//objJob.get(i).getSalary()
        }
        
        cboJob.setModel(new javax.swing.DefaultComboBoxModel<>(jobsArray));
    }
    //The method that gets all the jobs saved inside the Jobs txt
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
    //a method for saving the created jobs back into the file
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
        jName = new javax.swing.JTextField();
        jSurname = new javax.swing.JTextField();
        jStNo = new javax.swing.JTextField();
        cboJob = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add a new Employee");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add A New Employee By Entering The Details Below:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Enter Employee Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Enter Employee Surname:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Choose A Job:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Enter The Staff Number:");

        cboJob.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pana\\Pictures\\Pics\\save.png")); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jName)
                            .addComponent(jSurname)
                            .addComponent(jStNo)
                            .addComponent(cboJob, 0, 150, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jStNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //test to see if there has been any text entered in the text boxes
        if (jName.getText().isEmpty()&&jSurname.getText().isEmpty()&&jStNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Employee Details In The Fields Provided");
        }//tests if the user has entered input in the text fields
        else{
            String empName = jName.getText().trim();
            String empSurame = jSurname.getText().trim();
            //for the job combo box you can either use getSelectedIndex or getSelectedItem
            int empJobIndex = cboJob.getSelectedIndex();
            Job empJob = objJob.get(empJobIndex);
            int staffNo = Integer.parseInt(jStNo.getText());
            //because all text input is a string , you need to cast a type you passing the input into.
            //create an object of employee from the given input
            Employee objEmp = new Employee(empName, empSurame, empJob, staffNo);
            //add the created employee into the array
            objEmployee.add(objEmp);
            //we need to save the array to a file
            saveEmployeesToFile();
            
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboJob;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jName;
    private javax.swing.JTextField jStNo;
    private javax.swing.JTextField jSurname;
    // End of variables declaration//GEN-END:variables
}
