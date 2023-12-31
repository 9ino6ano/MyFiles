/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.text.*;
/**
 *
 * @author Pana
 */
public class EditStudent extends javax.swing.JFrame {

    DecimalFormat format;
    ArrayList<Course> arrCourse;
    ArrayList<Student> arrStudents;
    /**
     * Creates new form EditStudent
     */
    public EditStudent() {
        initComponents();
        
        format = new DecimalFormat("#,###.00");
        arrCourse = new ArrayList<Course>();
        arrStudents = new ArrayList<Student>();
        populate();
        String[] arrSubj = new String[arrCourse.size()];
        for (int i = 0; i < arrCourse.size(); i++) {
            arrSubj[i] = arrCourse.get(i).getSubjName() + " : R"+format.format(arrCourse.get(i).getSubjPrice());
        }
        jcmbSubject.setModel(new javax.swing.DefaultComboBoxModel<>(arrSubj));
    
        String[] arrStud = new String[arrStudents.size()];
        for (int i = 0; i < arrStudents.size(); i++) {
            arrStud[i] = arrStudents.get(i).getStName() + " , "+arrStudents.get(i).getSSurname();
        }
        jcmbStudent.setModel(new javax.swing.DefaultComboBoxModel<>(arrStud));
    
        //default selection
        jcmbStudent.setSelectedIndex(0);
        
    }
    public void clearData(){
        txtName.setText("");
        txtSurname.setText("");
        txtStNo.setText("");
        txtPrice.setText("");
        jcmbStudent.setSelectedIndex(-1);
        jcmbSubject.setSelectedIndex(-1);
        jcmbStudent.requestFocus();
    }
    public void SaveStudentsToFile(){
        try {
            
            FileOutputStream fos = new FileOutputStream("students.dat");
            ObjectOutputStream outFile = new ObjectOutputStream(fos);
            
            for (int i = 0; i < arrStudents.size(); i++) {
                outFile.writeObject(arrStudents.get(i));
            }
            outFile.close();
            JOptionPane.showMessageDialog(null, "Student's Modification Successfully Saved.");
            this.dispose();
            
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()
            );
        }
    }
    public void SaveDeleteStudentsToFile(){
        try {
            
            FileOutputStream fos = new FileOutputStream("students.dat");
            ObjectOutputStream outFile = new ObjectOutputStream(fos);
            
            for (int i = 0; i < arrStudents.size(); i++) {
                outFile.writeObject(arrStudents.get(i));
            }
            outFile.close();
            JOptionPane.showMessageDialog(null, "Student'S Record Successfully Removed.");
            this.dispose();
            
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()
            );
        }
    }
    
    
    public void populate(){
         
        try {
            FileInputStream fis = new FileInputStream("course.dat");
            ObjectInputStream inputFile = new ObjectInputStream(fis);
            
            boolean endOf = false;
            while (!endOf) {                
            try {
                arrCourse.add((Course) inputFile.readObject());
                
            }catch (EOFException e){
                
            endOf = true;
            }
            catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
            }
            }
            inputFile.close();
        } catch (IOException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        //this populates the students array
        try {
            FileInputStream fis2 = new FileInputStream("students.dat");
            ObjectInputStream inputFile2 = new ObjectInputStream(fis2);
            
            boolean endOf2 = false;
            while (!endOf2) {                
            try {
                arrStudents.add((Student) inputFile2.readObject());
                
            }catch (EOFException e){
                
            endOf2 = true;
            }
            catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
            }
            }
            inputFile2.close();
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

        pnlStud = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtStNo = new javax.swing.JTextField();
        jcmbSubject = new javax.swing.JComboBox();
        txtPrice = new javax.swing.JTextField();
        jcmbStudent = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Student Records:");

        pnlStud.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Modifying The Current Student's Record:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Select A Student:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Student Name:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Student Surname:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Student No:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Select A Course / Subject:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Subject Price [$]:");

        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.setCaretColor(new java.awt.Color(255, 0, 0));

        txtSurname.setBackground(new java.awt.Color(204, 204, 204));
        txtSurname.setCaretColor(new java.awt.Color(255, 0, 0));

        txtStNo.setBackground(new java.awt.Color(204, 204, 204));
        txtStNo.setCaretColor(new java.awt.Color(255, 0, 0));

        jcmbSubject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmbSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSubjectActionPerformed(evt);
            }
        });

        txtPrice.setBackground(new java.awt.Color(204, 204, 204));
        txtPrice.setCaretColor(new java.awt.Color(255, 0, 0));

        jcmbStudent.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmbStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbStudentActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pana\\Documents\\IT\\Development Software\\GUI\\Pics\\Pics\\save.png")); // NOI18N
        btnSave.setText("Save Change");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pana\\Documents\\IT\\Development Software\\GUI\\Pics\\Pics\\job.png")); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pana\\Documents\\IT\\Development Software\\GUI\\Pics\\Pics\\exit.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStudLayout = new javax.swing.GroupLayout(pnlStud);
        pnlStud.setLayout(pnlStudLayout);
        pnlStudLayout.setHorizontalGroup(
            pnlStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudLayout.createSequentialGroup()
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlStudLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(pnlStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(txtSurname)
                    .addComponent(txtStNo)
                    .addComponent(jcmbSubject, 0, 170, Short.MAX_VALUE)
                    .addComponent(txtPrice)
                    .addComponent(jcmbStudent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );
        pnlStudLayout.setVerticalGroup(
            pnlStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudLayout.createSequentialGroup()
                .addGroup(pnlStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStudLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jcmbStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlStudLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(pnlStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtStNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jcmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pana\\Documents\\IT\\Development Software\\GUI\\enemy5.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Please Modify The Student Details Using The Fields: ");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pana\\Documents\\IT\\Development Software\\GUI\\pac2.jpg")); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pana\\Documents\\IT\\Development Software\\GUI\\user.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlStud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(pnlStud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbStudentActionPerformed
        // TODO add your handling code here:
        int selectStudent = jcmbStudent.getSelectedIndex();
        
        txtName.setText(arrStudents.get(selectStudent).getStName());
        txtSurname.setText(arrStudents.get(selectStudent).getSSurname());
        txtStNo.setText(arrStudents.get(selectStudent).getStNo()+"");
        
        Course objCourse = arrStudents.get(selectStudent).getObjCourse();
        int indCourse = 0;
        for (int i = 0; i < arrCourse.size(); i++) {
            if (arrCourse.get(i).equals(objCourse)) {
                indCourse = i;
                break;
            }
        }
        jcmbSubject.setSelectedIndex(indCourse);
        txtPrice.setText(arrCourse.get(indCourse).getSubjPrice()+"");
        txtPrice.setEditable(false);
    }//GEN-LAST:event_jcmbStudentActionPerformed

    private void jcmbSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbSubjectActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        //clearData();
        jcmbStudent.requestFocus();
        JOptionPane.showMessageDialog(null, "Change The Fields To Affirm Modification.");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String StName;
        String StSurname;
        int StNo;
        if (txtName.getText().isEmpty()&&txtSurname.getText().isEmpty()&&txtStNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Please Enter Information In All Fields Below");
        }
        else{
            
            int selectindex = jcmbStudent.getSelectedIndex();
            arrStudents.get(selectindex).setStName(txtName.getText().trim());
            arrStudents.get(selectindex).setSSurname(txtSurname.getText().trim());
            arrStudents.get(selectindex).setStNo(Integer.parseInt(txtStNo.getText().trim()));
            Course objCourse = arrCourse.get(jcmbStudent.getSelectedIndex());
            arrStudents.get(selectindex).setObjCourse(objCourse);
            SaveStudentsToFile();
            
        }
    
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //arrStudents.removeAll(i);
        int deleteIndex = jcmbStudent.getSelectedIndex();
        String name = arrStudents.get(deleteIndex).toString();
        System.out.println(name+ "\nHas Been Removed From 9ino6ano Academy");
        JOptionPane.showMessageDialog(null, name + ", Has Been Deleted.");
        arrStudents.remove(deleteIndex);
        
        SaveDeleteStudentsToFile();
        
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
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox jcmbStudent;
    private javax.swing.JComboBox jcmbSubject;
    private javax.swing.JPanel pnlStud;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStNo;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
