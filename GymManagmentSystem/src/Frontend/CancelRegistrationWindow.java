package Frontend;
import Backend.TrainerRole;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class CancelRegistrationWindow extends javax.swing.JFrame {

    private final TrainerRoleWindow trainerRoleWindow;
    
    public CancelRegistrationWindow(TrainerRoleWindow trainerRoleWindow) {
        this.trainerRoleWindow = trainerRoleWindow;
        initComponents();
        setContentPane(jPanel1);
        setTitle("Cancel Registration");
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        
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
        CancelRegistrationMemberId = new javax.swing.JLabel();
        CancelRegistrationClassId = new javax.swing.JLabel();
        CancelRegistrationMemberIdText = new javax.swing.JTextField();
        CancelRegistrationClassIdText = new javax.swing.JTextField();
        cancelRegistrationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CancelRegistrationMemberId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CancelRegistrationMemberId.setText("Member Id");

        CancelRegistrationClassId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CancelRegistrationClassId.setText("Class Id");

        cancelRegistrationButton.setText("Cancel Registration");
        cancelRegistrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRegistrationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CancelRegistrationMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(CancelRegistrationMemberIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CancelRegistrationClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(CancelRegistrationClassIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(cancelRegistrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelRegistrationMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelRegistrationMemberIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelRegistrationClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelRegistrationClassIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(cancelRegistrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
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

    private void cancelRegistrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRegistrationButtonActionPerformed
        // TODO add your handling code here:
       
       
       String memberId = CancelRegistrationMemberIdText.getText();
       String classId = CancelRegistrationClassIdText.getText();
       
       if(trainerRoleWindow.trainerRole.memberDatabase.contains(memberId))
       {
           if(trainerRoleWindow.trainerRole.classDatabase.contains(classId))
           {
               if(trainerRoleWindow.trainerRole.cancelRegistration(memberId, classId))
               {
               JOptionPane.showMessageDialog(null, "The Registration of member with Id = "+memberId+" cancelled successfully!","Success",JOptionPane.PLAIN_MESSAGE);
               }
               else
               {
                JOptionPane.showMessageDialog(null, "Can't Cancel After 3 days of Registration","Message",JOptionPane.INFORMATION_MESSAGE);   
               }
               trainerRoleWindow.setVisible(true);
               dispose();
           }
           else JOptionPane.showMessageDialog(null, "The class with Id = "+classId+" does not exist!","Message",JOptionPane.INFORMATION_MESSAGE);
       }
       else JOptionPane.showMessageDialog(null, "The member with Id = "+memberId+" does not exist!","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cancelRegistrationButtonActionPerformed

   
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
            java.util.logging.Logger.getLogger(CancelRegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelRegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelRegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelRegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CancelRegistrationClassId;
    private javax.swing.JTextField CancelRegistrationClassIdText;
    private javax.swing.JLabel CancelRegistrationMemberId;
    private javax.swing.JTextField CancelRegistrationMemberIdText;
    private javax.swing.JButton cancelRegistrationButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
