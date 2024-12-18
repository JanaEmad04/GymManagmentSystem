package Frontend;

import Backend.TrainerRole;

public class TrainerRoleWindow extends javax.swing.JFrame {

    protected TrainerRole trainerRole;
    public TrainerRoleWindow() {
        
        initComponents();
        setContentPane(jPanel1);
        setSize(400,500);
        setVisible(true);
        setTitle("Trainer Role");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        trainerRole = new TrainerRole();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addMemberButton = new javax.swing.JButton();
        viewMembersButton = new javax.swing.JButton();
        addClassButton = new javax.swing.JButton();
        viewClassesButton = new javax.swing.JButton();
        registerMemberForClassButton = new javax.swing.JButton();
        cancelRegistrationButton = new javax.swing.JButton();
        viewRegistrationsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(320, 400));

        addMemberButton.setText("Add Member");
        addMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberButtonActionPerformed(evt);
            }
        });

        viewMembersButton.setText("View Members");
        viewMembersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMembersButtonActionPerformed(evt);
            }
        });

        addClassButton.setText("Add Class");
        addClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassButtonActionPerformed(evt);
            }
        });

        viewClassesButton.setText("View Classes");
        viewClassesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClassesButtonActionPerformed(evt);
            }
        });

        registerMemberForClassButton.setText("Register Member For Class");
        registerMemberForClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMemberForClassButtonActionPerformed(evt);
            }
        });

        cancelRegistrationButton.setText("Cancel Registration");
        cancelRegistrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRegistrationButtonActionPerformed(evt);
            }
        });

        viewRegistrationsButton.setText("View Registrations");
        viewRegistrationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRegistrationsButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewRegistrationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelRegistrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerMemberForClassButton)
                    .addComponent(viewClassesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewMembersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(addMemberButton)
                .addGap(18, 18, 18)
                .addComponent(viewMembersButton)
                .addGap(18, 18, 18)
                .addComponent(addClassButton)
                .addGap(18, 18, 18)
                .addComponent(viewClassesButton)
                .addGap(18, 18, 18)
                .addComponent(registerMemberForClassButton)
                .addGap(18, 18, 18)
                .addComponent(cancelRegistrationButton)
                .addGap(18, 18, 18)
                .addComponent(viewRegistrationsButton)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberButtonActionPerformed
        // TODO add your handling code here:
         setVisible(false);
      new AddMemberWindow(this);
      dispose();
       
    }//GEN-LAST:event_addMemberButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        trainerRole.logout();
        System.exit(0);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void viewMembersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMembersButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ViewMemberWindow(this);
        dispose();
    }//GEN-LAST:event_viewMembersButtonActionPerformed

    private void addClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddClassWindow(this);
        dispose();
    }//GEN-LAST:event_addClassButtonActionPerformed

    private void registerMemberForClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerMemberForClassButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new RegisterMemberForClass(this);
         dispose();
    }//GEN-LAST:event_registerMemberForClassButtonActionPerformed

    private void viewClassesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClassesButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ViewClassWindow(this);
        dispose();
    }//GEN-LAST:event_viewClassesButtonActionPerformed

    private void cancelRegistrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRegistrationButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CancelRegistrationWindow(this);
        dispose();
    }//GEN-LAST:event_cancelRegistrationButtonActionPerformed

    private void viewRegistrationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRegistrationsButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ViewRegistrationWindow(this);
        dispose();
    }//GEN-LAST:event_viewRegistrationsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClassButton;
    private javax.swing.JButton addMemberButton;
    private javax.swing.JButton cancelRegistrationButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton registerMemberForClassButton;
    private javax.swing.JButton viewClassesButton;
    private javax.swing.JButton viewMembersButton;
    private javax.swing.JButton viewRegistrationsButton;
    // End of variables declaration//GEN-END:variables
}
