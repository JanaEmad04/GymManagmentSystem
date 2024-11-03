
package Frontend;

import Backend.TrainerRole;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class RegisterMemberForClass extends javax.swing.JFrame {

    private final TrainerRoleWindow trainerRoleWindow;
    private String selectedDateString;
    public RegisterMemberForClass(TrainerRoleWindow trainerRoleWindow) {
        this.trainerRoleWindow = trainerRoleWindow;
        initComponents();
        setContentPane(jPanel1);
        setTitle("Register Member For Class");
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);

        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Add today's date
        registrationDateComboBox.addItem("Today's Date: " + today.format(formatter));

        // Add a range of dates (e.g., for the next 7 days)
        for (int i = 1; i <= 7; i++) {
            LocalDate date = today.plusDays(i);
            registrationDateComboBox.addItem(date.format(formatter));
        }

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                trainerRoleWindow.setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RegistrationMemberId = new javax.swing.JLabel();
        registrationClassId = new javax.swing.JLabel();
        RegistrationDate = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        registrationMemberIdText = new javax.swing.JTextField();
        registrationClassIdText = new javax.swing.JTextField();
        registrationDateComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegistrationMemberId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistrationMemberId.setText("Member Id");

        registrationClassId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationClassId.setText("Class Id");

        RegistrationDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistrationDate.setText("Registration Date");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        registrationMemberIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationMemberIdTextActionPerformed(evt);
            }
        });

        LocalDate today=LocalDate.now();
        registrationDateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationDateComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegistrationMemberId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registrationClassId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegistrationDate, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrationMemberIdText)
                    .addComponent(registrationClassIdText)
                    .addComponent(registrationDateComboBox, 0, 148, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrationMemberIdText, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(RegistrationMemberId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrationClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrationClassIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrationDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validateRegistration(String memberId, String classId) {

        if (!trainerRoleWindow.trainerRole.memberDatabase.contains(memberId)) //Validates if Member with ID entered Exists!
        {
            JOptionPane.showMessageDialog(null, "The member with Id = " + memberId + " does not exist!", "Message", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        if (!trainerRoleWindow.trainerRole.classDatabase.contains(classId)) //Validates if Class with ID entered Exists!
        {
            JOptionPane.showMessageDialog(null, "The class with Id = " + classId + " does not exist!", "Message", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if (trainerRoleWindow.trainerRole.classDatabase.getRecord(classId).getAvailableSeats() <= 0) //Validates if there is avaliable Seats
        {
            JOptionPane.showMessageDialog(null, "No Avaliable Seats!", "Message", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if(trainerRoleWindow.trainerRole.registrationDatabase.contains(memberId+","+classId))
        {
          JOptionPane.showMessageDialog(null, "The member with Id = "+memberId+" already Registered !", "Message", JOptionPane.INFORMATION_MESSAGE);  
          return false;
        }
        return true;
    }
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        TrainerRole trainerRole = new TrainerRole();

        String memberId = registrationMemberIdText.getText();
        String classId = registrationClassIdText.getText();
        selectedDateString = (String) registrationDateComboBox.getSelectedItem();
        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(selectedDateString, formatter);
        if (validateRegistration(memberId, classId)) {
            trainerRoleWindow.trainerRole.registerMemberForClass(memberId, classId, localDate);
            JOptionPane.showMessageDialog(null, "The member with Id = " + memberId + " registered to Class " + classId + " successfully!", "Success", JOptionPane.PLAIN_MESSAGE);
        }
        trainerRoleWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void registrationMemberIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationMemberIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrationMemberIdTextActionPerformed

    private void registrationDateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationDateComboBoxActionPerformed
        // TODO add your handling code here:
        selectedDateString = (String) registrationDateComboBox.getSelectedItem();
        JOptionPane.showMessageDialog(null, "Selected Date: " + selectedDateString, "Message", JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_registrationDateComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterMemberForClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterMemberForClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterMemberForClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterMemberForClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegistrationDate;
    private javax.swing.JLabel RegistrationMemberId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registrationClassId;
    private javax.swing.JTextField registrationClassIdText;
    private javax.swing.JComboBox<String> registrationDateComboBox;
    private javax.swing.JTextField registrationMemberIdText;
    // End of variables declaration//GEN-END:variables
}
