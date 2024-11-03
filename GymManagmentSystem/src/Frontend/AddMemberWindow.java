package Frontend;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class AddMemberWindow extends javax.swing.JFrame {
    protected TrainerRoleWindow trainerRoleWindow;

    public AddMemberWindow(TrainerRoleWindow trainerRoleWindow) {
        
        this.trainerRoleWindow = trainerRoleWindow;
        initComponents();
        setContentPane(jPanel1);
        setSize(359,400);
        setTitle("Add Member");
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
        addTrainerButton = new javax.swing.JButton();
        newMemberId = new javax.swing.JLabel();
        newMemberName = new javax.swing.JLabel();
        newMemberEmail = new javax.swing.JLabel();
        newMemberStatus = new javax.swing.JLabel();
        newMemberPhone = new javax.swing.JLabel();
        newMemberNameText = new javax.swing.JTextField();
        newMemberEmailText = new javax.swing.JTextField();
        newMemberIdText = new javax.swing.JTextField();
        newMemebrMembershipTypeText = new javax.swing.JTextField();
        newMemberMembershipType = new javax.swing.JLabel();
        newMemberPhoneText = new javax.swing.JTextField();
        newMemberStatusText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(320, 400));

        addTrainerButton.setText("Add");
        addTrainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrainerButtonActionPerformed(evt);
            }
        });

        newMemberId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newMemberId.setText("Id");

        newMemberName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newMemberName.setText("Name");

        newMemberEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newMemberEmail.setText("Email");

        newMemberStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newMemberStatus.setText("Status");

        newMemberPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newMemberPhone.setText("Phone Number");

        newMemberMembershipType.setText("Membership Type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(newMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newMemberIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newMemberMembershipType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newMemberEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newMemberPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newMemberStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newMemberEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newMemebrMembershipTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newMemberPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newMemberStatusText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(newMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(newMemberNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(addTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newMemberIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newMemberNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newMemberEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newMemberEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newMemebrMembershipTypeText, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(newMemberMembershipType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newMemberPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newMemberPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newMemberStatusText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newMemberStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(addTrainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

    private void addTrainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrainerButtonActionPerformed
        // TODO add your handling code here:
      
      String memberId = newMemberIdText.getText();
      String memberName = newMemberNameText.getText();
      String memberEmail = newMemberEmailText.getText();
      String membershipType = newMemebrMembershipTypeText.getText();
      String memberPhone = newMemberPhoneText.getText();
      String memberStatus = newMemberStatusText.getText();
      
      if(memberId.isEmpty()||memberName.isEmpty()||memberEmail.isEmpty()||membershipType.isEmpty()||memberPhone.isEmpty()||membershipType.isEmpty())
          JOptionPane.showMessageDialog(null, "Some fields are Empty!","Message",JOptionPane.INFORMATION_MESSAGE);
      else if(!trainerRoleWindow.trainerRole.memberDatabase.contains(memberId))
      {
          if(validateName(memberName)&&validateEmail(memberEmail)&&validateMembershipType(membershipType)&&validatePhone(memberPhone)&&validateStatus(memberStatus))
          {
              trainerRoleWindow.trainerRole.addMember(memberId, memberName, membershipType, memberEmail, memberPhone, memberStatus);
              JOptionPane.showMessageDialog(null, "The member with Id = "+memberId+" added successfully!","Message",JOptionPane.PLAIN_MESSAGE);
              trainerRoleWindow.setVisible(true);
              dispose();
          }
          else  JOptionPane.showMessageDialog(null, "The member with Id = "+memberId+" already exists!","Message",JOptionPane.INFORMATION_MESSAGE);
      }
      
    }//GEN-LAST:event_addTrainerButtonActionPerformed

    private boolean validateName(String name)
    {
        boolean  flag = true;
       
        for(int i=0; i<name.length(); i++)
        {
          
         if(Character.isDigit(name.charAt(i)))
         {
             flag = false;
         }
         }
        if(!flag) JOptionPane.showMessageDialog(null, "Invalid Name!","Message",JOptionPane.INFORMATION_MESSAGE);
  return flag;
    }
    
    private boolean validateEmail(String email)
    {
        boolean flagAt = false, flagCom = false;
        
        String Com = "";
        for(int j=email.length()-4; j<email.length(); j++)
            Com = Com + email.charAt(j);
        if(Com.equals(".com")) flagCom = true;
        for(int i=0; i<email.length(); i++)
        {
         char c = email.charAt(i);  
         if(c=='@')
            flagAt = true;
        }
        if(flagAt&&flagCom) return true;
        else JOptionPane.showMessageDialog(null, "Invalid Email!","Message",JOptionPane.INFORMATION_MESSAGE);
       return false;
    }
    
     private boolean validatePhone(String phone)
    {
        boolean flagDigit = true;
        int num = 0;
        for(int i=0; i<phone.length(); i++)
        {
            if(!Character.isDigit(phone.charAt(i)))
                flagDigit = false;
            num++;
        }
        if(flagDigit&&num==11) return true;
        else 
            JOptionPane.showMessageDialog(null, "Invalid Phone number!","Message",JOptionPane.INFORMATION_MESSAGE);
        return false;    
    }
     
      private boolean validateMembershipType(String speciality)
    {
        boolean  flag = true;
       
        for(int i=0; i<speciality.length(); i++)
        {
         if(Character.isDigit(speciality.charAt(i)))
         {
             flag = false;
         }
         }
        if(!flag) JOptionPane.showMessageDialog(null, "Invalid Membership Type!","Message",JOptionPane.INFORMATION_MESSAGE);
  return flag;
    }
      
       private boolean validateStatus(String speciality)
    {
        boolean  flag = true;
       
        for(int i=0; i<speciality.length(); i++)
        {
         if(Character.isDigit(speciality.charAt(i)))
         {
             flag = false;
         }
         }
        if(!flag) JOptionPane.showMessageDialog(null, "Invalid Status!","Message",JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(AddMemberWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMemberWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMemberWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMemberWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTrainerButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newMemberEmail;
    private javax.swing.JTextField newMemberEmailText;
    private javax.swing.JLabel newMemberId;
    private javax.swing.JTextField newMemberIdText;
    private javax.swing.JLabel newMemberMembershipType;
    private javax.swing.JLabel newMemberName;
    private javax.swing.JTextField newMemberNameText;
    private javax.swing.JLabel newMemberPhone;
    private javax.swing.JTextField newMemberPhoneText;
    private javax.swing.JLabel newMemberStatus;
    private javax.swing.JTextField newMemberStatusText;
    private javax.swing.JTextField newMemebrMembershipTypeText;
    // End of variables declaration//GEN-END:variables
}
