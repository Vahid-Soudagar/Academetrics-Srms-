/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_management_system;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author moham
 */
public class AddNewStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddNewStudent
     */
    
    final String URL = "jdbc:mysql://localhost:3306/";
    final String DATABASE_NAME = "srms";
    final String TABLE_NAME = "Student";
    final String USER = "root";
    final String PASSWORD = "90041";
    
    public AddNewStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        addNewStudent = new javax.swing.JButton();
        addResult = new javax.swing.JButton();
        registeredStudents = new javax.swing.JButton();
        allStudentsList = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        course = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mobileNumber = new javax.swing.JTextField();
        rollNumber = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        branchName1 = new javax.swing.JComboBox<>();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_system/log-out.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        addNewStudent.setBackground(new java.awt.Color(0, 204, 204));
        addNewStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addNewStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_system/add.png"))); // NOI18N
        addNewStudent.setText("Add New Student");
        addNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudentActionPerformed(evt);
            }
        });

        addResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_system/results.png"))); // NOI18N
        addResult.setText("Add Result");
        addResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResultActionPerformed(evt);
            }
        });

        registeredStudents.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registeredStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_system/register.png"))); // NOI18N
        registeredStudents.setText("Registered Students");
        registeredStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredStudentsActionPerformed(evt);
            }
        });

        allStudentsList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allStudentsList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_system/customer.png"))); // NOI18N
        allStudentsList.setText("All Student List");
        allStudentsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudentsListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(addNewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(addResult, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(registeredStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(allStudentsList, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(addNewStudent)
                    .addContainerGap(414, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(addResult)
                    .addContainerGap(341, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addComponent(registeredStudents)
                    .addContainerGap(257, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(313, Short.MAX_VALUE)
                    .addComponent(allStudentsList)
                    .addGap(168, 168, 168)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 520));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Mobile Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 150, 30));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Course");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 150, 30));

        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "M.Tech", "BBA", "MBA", "B.SC", "M.SC", " " }));
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });
        getContentPane().add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Branch Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 150, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Roll Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 150, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 150, 30));

        mobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileNumberActionPerformed(evt);
            }
        });
        getContentPane().add(mobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 170, -1));

        rollNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollNumberActionPerformed(evt);
            }
        });
        getContentPane().add(rollNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 170, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 170, -1));

        branchName1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EEE", "CSE", "IT", "ECE", "Finance", "Marketing", " " }));
        branchName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchName1ActionPerformed(evt);
            }
        });
        getContentPane().add(branchName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_system/upload.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminIndex().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void addNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddNewStudent().setVisible(true);
    }//GEN-LAST:event_addNewStudentActionPerformed

    private void addResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddResult().setVisible(true);
    }//GEN-LAST:event_addResultActionPerformed

    private void registeredStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredStudentsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new RegisteredStudents().setVisible(true);
    }//GEN-LAST:event_registeredStudentsActionPerformed

    private void allStudentsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentsListActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AllStudentResult().setVisible(true);
    }//GEN-LAST:event_allStudentsListActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void mobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileNumberActionPerformed

    private void rollNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollNumberActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void branchName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchName1ActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        
        String course = this.course.getSelectedItem().toString();
        String department = branchName1.getSelectedItem().toString();
        String rollNo = rollNumber.getText();
        String name = this.name.getText();
        String gender = this.gender.getSelectedItem().toString();
        String mobileNumber = this.mobileNumber.getText();

        try {
            Connection connection = DriverManager.getConnection(URL + DATABASE_NAME, USER, PASSWORD);
            String query = "INSERT INTO " + TABLE_NAME +
                    "(rollno, course, branchName, name, gender, mobileNumber) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, rollNo);
            preparedStatement.setString(2, course);
            preparedStatement.setString(3, department);
            preparedStatement.setString(4, name);
            preparedStatement.setString(5, gender);
            preparedStatement.setString(6, mobileNumber);

            int rows = preparedStatement.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Student added successfully");
                setVisible(false);
                new AdminHome().setVisible(true);
                System.out.println("Values inserted");
            } else {
                JOptionPane.showMessageDialog(null, "Insertion Failed");
                System.out.println("Insertion failed");
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Insertion Failed "+e.getMessage());
        }

    }//GEN-LAST:event_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton addNewStudent;
    private javax.swing.JButton addResult;
    private javax.swing.JButton allStudentsList;
    private javax.swing.JComboBox<String> branchName1;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField mobileNumber;
    private javax.swing.JTextField name;
    private javax.swing.JButton registeredStudents;
    private javax.swing.JTextField rollNumber;
    // End of variables declaration//GEN-END:variables
}