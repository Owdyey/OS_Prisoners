/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package os_group_3;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import java.awt.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static os_group_3.db_connect.frame;

/**
 *
 * @author johnl
 */
public class CheckPrisoner extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public CheckPrisoner() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OS_Group3");
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 53, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 250, 202));
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 90, -1));

        jLabel5.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 250, 202));
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 90, -1));

        jLabel6.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 250, 202));
        jLabel6.setText("Middle Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 90, -1));

        firstname.setBackground(new java.awt.Color(255, 250, 202));
        firstname.setForeground(new java.awt.Color(0, 0, 0));
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 240, 50));

        middlename.setBackground(new java.awt.Color(255, 250, 202));
        middlename.setForeground(new java.awt.Color(0, 0, 0));
        middlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlenameActionPerformed(evt);
            }
        });
        jPanel1.add(middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 240, 50));

        lastname.setBackground(new java.awt.Color(255, 250, 202));
        lastname.setForeground(new java.awt.Color(0, 0, 0));
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 240, 50));

        jPanel2.setBackground(new java.awt.Color(255, 250, 202));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Check Prisoner");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 250, 70));

        submit.setBackground(new java.awt.Color(103, 146, 137));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 387, 90, 40));

        logo.setBackground(new java.awt.Color(255, 250, 202));
        logo.setIcon((new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\bjmpLogo"
            + ".png")));
jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 430, 400));

back.setBackground(new java.awt.Color(103, 146, 137));
back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
back.setText("Back");
back.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        backActionPerformed(evt);
    }
    });
    jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 517, 90, 40));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void middlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlenameActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        show(false);
        Homepage form = new Homepage();
        form.show();
    }//GEN-LAST:event_backActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            String documentName = firstname.getText() + " " + middlename.getText() + " " + lastname.getText();

            DocumentReference docRef = db_connect.db.collection("prisoners").document(documentName);
            ApiFuture<DocumentSnapshot> future = docRef.get();

            DocumentSnapshot document = future.get();

            if (document.exists()) {
                // Document found, you can access the data using document.getData()
                Map<String, Object> data = document.getData();
                // Do something with the retrieved data

                variables.pdl_firstname = data.get("first_name").toString();
                variables.pdl_middlename = data.get("middle_name").toString();
                variables.pdl_lastname = data.get("last_name").toString();
                variables.pdl_age = data.get("age").toString();
                variables.pdl_gender = data.get("pdl_gender").toString();
                variables.pdl_remaining_hours = data.get( "remaining_time").toString();

                variables.availability = "False"; // Default value if not found
                if (data.containsKey("is_eligible") && data.get("is_eligible").toString().equalsIgnoreCase("True")) {
                    variables.availability = "True";
                }
                show(false);
                AddPrisoner form = new AddPrisoner();
                form.show();
            } else {
                int option = JOptionPane.showConfirmDialog(frame, "User information not found! Do you want to create a new prisoner?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

                if (option == JOptionPane.YES_OPTION) {
                    show(false);
                    AddPrisoner form = new AddPrisoner();
                    form.show();
                    variables.pdl_firstname = firstname.getText();
                    variables.pdl_lastname = lastname.getText();
                    variables.pdl_middlename = middlename.getText();
                    variables.pdl_age = "";
                    variables.pdl_gender = "";
                    variables.pdl_remaining_hours = "";
                } else {
                    return;
                }
            }

            // Clear text fields after searching
            firstname.setText("");
            middlename.setText("");
            lastname.setText("");
        } catch (Exception e) {
            e.printStackTrace();  // Print the stack trace for debugging
            JOptionPane.showMessageDialog(frame, "Error occurred when searching for information",
                "Error",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(CheckPrisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckPrisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckPrisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckPrisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckPrisoner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField middlename;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
