package Frontend;

import Backend.AdminRole;  
import javax.swing.JOptionPane;

public class AddTrainerWindow extends javax.swing.JFrame {

    public AddTrainerWindow() {
        
        initComponents();
        setContentPane(jPanel1);
        setTitle("Add Trainer");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addTrainerButton = new javax.swing.JButton();
        newTrainerId = new javax.swing.JLabel();
        newTrainerName = new javax.swing.JLabel();
        newTrainerEmail = new javax.swing.JLabel();
        newTrainerSpeciality = new javax.swing.JLabel();
        newTrainerPhone = new javax.swing.JLabel();
        newTrainerIdText = new javax.swing.JTextField();
        newTrainerNameText = new javax.swing.JTextField();
        newTrainerEmailText = new javax.swing.JTextField();
        newTrainerSpecialityText = new javax.swing.JTextField();
        newTrainerPhoneText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addTrainerButton.setText("Add");
        addTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrainerButtonActionPerformed(evt);
            }
        });

        newTrainerId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newTrainerId.setText("Id");

        newTrainerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newTrainerName.setText("Name");

        newTrainerEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newTrainerEmail.setText("Email");

        newTrainerSpeciality.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newTrainerSpeciality.setText("Speciality");

        newTrainerPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newTrainerPhone.setText("Phone Number");

        newTrainerIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTrainerIdTextActionPerformed(evt);
            }
        });

        newTrainerNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTrainerNameTextActionPerformed(evt);
            }
        });

        newTrainerEmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTrainerEmailTextActionPerformed(evt);
            }
        });

        newTrainerSpecialityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTrainerSpecialityTextActionPerformed(evt);
            }
        });

        newTrainerPhoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTrainerPhoneTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(addTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newTrainerName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newTrainerId, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newTrainerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newTrainerSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newTrainerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newTrainerIdText)
                    .addComponent(newTrainerNameText)
                    .addComponent(newTrainerEmailText)
                    .addComponent(newTrainerSpecialityText)
                    .addComponent(newTrainerPhoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newTrainerId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newTrainerIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newTrainerNameText)
                    .addComponent(newTrainerName, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newTrainerEmailText)
                    .addComponent(newTrainerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newTrainerSpecialityText)
                    .addComponent(newTrainerSpeciality, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newTrainerPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(newTrainerPhoneText))
                .addGap(32, 32, 32)
                .addComponent(addTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void newTrainerIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTrainerIdTextActionPerformed
 
    }//GEN-LAST:event_newTrainerIdTextActionPerformed

    private void newTrainerNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTrainerNameTextActionPerformed

    }//GEN-LAST:event_newTrainerNameTextActionPerformed

    private void newTrainerEmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTrainerEmailTextActionPerformed

    }//GEN-LAST:event_newTrainerEmailTextActionPerformed

    private void newTrainerSpecialityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTrainerSpecialityTextActionPerformed

    }//GEN-LAST:event_newTrainerSpecialityTextActionPerformed

    private void newTrainerPhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTrainerPhoneTextActionPerformed

    }//GEN-LAST:event_newTrainerPhoneTextActionPerformed

    private void addTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrainerButtonActionPerformed
        // TODO add your handling code here:
        AdminRole adminRole = new AdminRole();
        
      String trainerId = newTrainerIdText.getText();
      String trainerName = newTrainerNameText.getText();
      String trainerEmail = newTrainerEmailText.getText();
      String trainerSpeciality = newTrainerSpecialityText.getText();
      String trainerphone = newTrainerPhoneText.getText();
      
      
      if(trainerId.isEmpty()||trainerName.isEmpty()||trainerEmail.isEmpty()||trainerSpeciality.isEmpty()||trainerphone.isEmpty())
          JOptionPane.showMessageDialog(null, "Some fields are Empty!","Message",JOptionPane.INFORMATION_MESSAGE);
      else if(!AdminRole.dataBase.contains(trainerId))
      {
      adminRole.addTrainer(trainerId, trainerName, trainerEmail, trainerSpeciality, trainerphone); 
      JOptionPane.showMessageDialog(null, "The trainer with Id = "+trainerId+" added successfully!","Message",JOptionPane.PLAIN_MESSAGE);
      }
      else JOptionPane.showMessageDialog(null, "The trainer with Id = "+trainerId+" already exists!","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_addTrainerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddTrainerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTrainerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTrainerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTrainerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTrainerWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTrainerButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newTrainerEmail;
    private javax.swing.JTextField newTrainerEmailText;
    private javax.swing.JLabel newTrainerId;
    private javax.swing.JTextField newTrainerIdText;
    private javax.swing.JLabel newTrainerName;
    private javax.swing.JTextField newTrainerNameText;
    private javax.swing.JLabel newTrainerPhone;
    private javax.swing.JTextField newTrainerPhoneText;
    private javax.swing.JLabel newTrainerSpeciality;
    private javax.swing.JTextField newTrainerSpecialityText;
    // End of variables declaration//GEN-END:variables
}
