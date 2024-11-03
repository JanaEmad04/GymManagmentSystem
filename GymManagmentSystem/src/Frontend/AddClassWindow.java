package Frontend;

import Backend.AdminRole;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class AddClassWindow extends javax.swing.JFrame {

    protected TrainerRoleWindow trainerRoleWindow;

    public AddClassWindow(TrainerRoleWindow trainerRoleWindow) {

        this.trainerRoleWindow = trainerRoleWindow;
        initComponents();
        setContentPane(jPanel1);
        setTitle("Add Class");
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
        jPanel2 = new javax.swing.JPanel();
        addClassButton = new javax.swing.JButton();
        newClassId = new javax.swing.JLabel();
        newClassName = new javax.swing.JLabel();
        newClassTrainerId = new javax.swing.JLabel();
        newClassDuration = new javax.swing.JLabel();
        newClassMaxParticipants = new javax.swing.JLabel();
        newClassIdText = new javax.swing.JTextField();
        newClassNameText = new javax.swing.JTextField();
        newClassTrainerIdText = new javax.swing.JTextField();
        newClassDurationText = new javax.swing.JTextField();
        newClassMaxParticipantsText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 320));

        addClassButton.setText("Add");
        addClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassButtonActionPerformed(evt);
            }
        });

        newClassId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newClassId.setText("Class Id");

        newClassName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newClassName.setText("Class Name");

        newClassTrainerId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newClassTrainerId.setText("Trainer Id");

        newClassDuration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newClassDuration.setText("Duration");

        newClassMaxParticipants.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newClassMaxParticipants.setText("Max Participants");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(addClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newClassTrainerId, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newClassDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newClassMaxParticipants, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newClassIdText)
                    .addComponent(newClassNameText)
                    .addComponent(newClassTrainerIdText)
                    .addComponent(newClassDurationText)
                    .addComponent(newClassMaxParticipantsText, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newClassIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newClassNameText)
                    .addComponent(newClassName, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newClassTrainerIdText)
                    .addComponent(newClassTrainerId, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newClassDurationText)
                    .addComponent(newClassDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newClassMaxParticipants, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(newClassMaxParticipantsText))
                .addGap(32, 32, 32)
                .addComponent(addClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
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

    private void addClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassButtonActionPerformed
        // TODO add your handling code here:
        
        AdminRole admin=new AdminRole();
        String classId = newClassIdText.getText();
        String className = newClassNameText.getText();
        String trainerId = newClassTrainerIdText.getText();
        String duration = newClassDurationText.getText();
        String MaxParticipants = newClassMaxParticipantsText.getText();

        if (classId.isEmpty() || className.isEmpty() || trainerId.isEmpty() || duration.isEmpty() || MaxParticipants.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Some fields are Empty!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (admin.dataBase.contains(trainerId)) {
            if (validateClassName(className) && validateDuration(duration) && validateMaxParticipants(MaxParticipants)) {
                if (!trainerRoleWindow.trainerRole.classDatabase.contains(classId)) {
                    trainerRoleWindow.trainerRole.addClass(classId, className, trainerId, Integer.parseInt(duration), Integer.parseInt(MaxParticipants));
                    JOptionPane.showMessageDialog(null, "The Class with Id = " + classId + " added successfully!", "Message", JOptionPane.PLAIN_MESSAGE);
                    trainerRoleWindow.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "The class with Id = " + classId + " already exists!", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "The trainer with Id = " + trainerId + " does not exist!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_addClassButtonActionPerformed

    private boolean validateClassName(String name) {
        boolean flag = true;

        for (int i = 0; i < name.length(); i++) {

            if (Character.isDigit(name.charAt(i))) {
                flag = false;
            }
        }
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Invalid Class Name!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        return flag;
    }

    private boolean validateDuration(String duration) {
        boolean flag = true;
        for (int i = 0; i < duration.length(); i++) {
            if (!Character.isDigit(duration.charAt(i))) {
                flag = false;
            }
        }
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Invalid Duration!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        return flag;
    }

    private boolean validateMaxParticipants(String max) {
        boolean flag = true;
        for (int i = 0; i < max.length(); i++) {
            if (!Character.isDigit(max.charAt(i))) {
                flag = false;
            }
        }
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Invalid Maximum Number of Participants!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        return flag;
    }

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
            java.util.logging.Logger.getLogger(AddClassWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClassWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClassWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClassWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel newClassDuration;
    private javax.swing.JTextField newClassDurationText;
    private javax.swing.JLabel newClassId;
    private javax.swing.JTextField newClassIdText;
    private javax.swing.JLabel newClassMaxParticipants;
    private javax.swing.JTextField newClassMaxParticipantsText;
    private javax.swing.JLabel newClassName;
    private javax.swing.JTextField newClassNameText;
    private javax.swing.JLabel newClassTrainerId;
    private javax.swing.JTextField newClassTrainerIdText;
    // End of variables declaration//GEN-END:variables
}
