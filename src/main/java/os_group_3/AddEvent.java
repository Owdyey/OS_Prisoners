/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package os_group_3;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import java.awt.List;
import java.text.SimpleDateFormat;
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
public class AddEvent extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public AddEvent() {
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
        submit = new CustomComponents.button.Button();
        roundedPanel1 = new CustomComponents.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        back = new CustomComponents.button.Button();
        dateOfEvent = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        event_name = new javax.swing.JTextField();
        event_duration = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();

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

        submit.setBackground(new java.awt.Color(103, 146, 137));
        submit.setForeground(new java.awt.Color(255, 250, 202));
        submit.setText("Submit");
        submit.setFocusable(false);
        submit.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        submit.setRound(20);
        submit.setShadowColor(new java.awt.Color(102, 102, 102));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 100, 40));

        roundedPanel1.setBackground(new java.awt.Color(255, 250, 202));
        roundedPanel1.setRoundBottomRight(20);
        roundedPanel1.setRoundTopRight(20);
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Event Information");
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));

        jPanel1.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 50));

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 250, 202));
        jLabel3.setText("Event Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 90, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 250, 202));
        jLabel4.setText("Event Description");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 120, -1));

        jLabel6.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 250, 202));
        jLabel6.setText("Event Duration");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 100, -1));

        back.setBackground(new java.awt.Color(103, 146, 137));
        back.setForeground(new java.awt.Color(255, 250, 202));
        back.setText("Back");
        back.setFocusable(false);
        back.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        back.setRound(20);
        back.setShadowColor(new java.awt.Color(102, 102, 102));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 100, 40));

        dateOfEvent.setBackground(new java.awt.Color(255, 250, 202));
        dateOfEvent.setForeground(new java.awt.Color(0, 0, 0));
        dateOfEvent.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                dateOfEventdateInput(evt);
            }
        });
        jPanel1.add(dateOfEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 210, 40));

        description.setBackground(new java.awt.Color(255, 250, 202));
        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 640, 250));

        event_name.setBackground(new java.awt.Color(255, 250, 202));
        event_name.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(event_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 260, 40));

        event_duration.setBackground(new java.awt.Color(255, 250, 202));
        event_duration.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(event_duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 140, 40));

        logo.setBackground(new java.awt.Color(255, 250, 202));
        logo.setIcon((new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\images\\bjmpLogo"
            + ".png")));
jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 430, 400));

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

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            String DocumentName = event_name.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String eventDate = dateFormat.format(dateOfEvent.getDate());

            Map<String, Object> data = new HashMap<>();
            data.put("event_name", event_name.getText());
            data.put("event_duration", event_duration.getText());
            data.put("description", description.getText());
            data.put("event_date", eventDate);

            DocumentReference eventsCollection = db_connect.db.collection("events").document(DocumentName);
            eventsCollection.set(data);

            event_name.setText("");
            event_duration.setText("");
            description.setText("");
            dateOfEvent.setDate(null);

            JOptionPane.showMessageDialog(frame, "Information added successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Error occurred when adding information",
                    "Error",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

     
    }//GEN-LAST:event_formWindowOpened

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       show(false);
       EventList form = new EventList();
       form.show();
    }//GEN-LAST:event_backActionPerformed

    private void dateOfEventdateInput(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dateOfEventdateInput

    }//GEN-LAST:event_dateOfEventdateInput

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
            java.util.logging.Logger.getLogger(AddEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomComponents.button.Button back;
    private com.toedter.calendar.JDateChooser dateOfEvent;
    private javax.swing.JTextArea description;
    private javax.swing.JTextField event_duration;
    private javax.swing.JTextField event_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private CustomComponents.RoundedPanel roundedPanel1;
    private CustomComponents.button.Button submit;
    // End of variables declaration//GEN-END:variables
}
