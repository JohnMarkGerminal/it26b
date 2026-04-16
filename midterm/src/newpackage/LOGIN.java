package newpackage;


import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class LOGIN extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LOGIN.class.getName());

    
    public LOGIN() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameTextfield = new javax.swing.JTextField();
        USERNAMENAME = new javax.swing.JLabel();
        PasswordName = new javax.swing.JLabel();
        USERLOGINNAME = new javax.swing.JLabel();
        USERNAME = new javax.swing.JLabel();
        Passwordname = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        nameREGISTER = new javax.swing.JLabel();
        ResgisterButton = new javax.swing.JButton();
        PasswordTextfield = new javax.swing.JPasswordField();
        ShowPassowrdButton = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameTextfield.addActionListener(this::usernameTextfieldActionPerformed);
        getContentPane().add(usernameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 250, 30));

        USERNAMENAME.setBackground(new java.awt.Color(204, 204, 204));
        USERNAMENAME.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        USERNAMENAME.setForeground(new java.awt.Color(255, 51, 51));
        USERNAMENAME.setText("WARRIOR ID");
        getContentPane().add(USERNAMENAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        PasswordName.setBackground(new java.awt.Color(204, 204, 204));
        PasswordName.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        PasswordName.setForeground(new java.awt.Color(255, 51, 51));
        PasswordName.setText("KAI PASSPHASE");
        getContentPane().add(PasswordName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        USERLOGINNAME.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        USERLOGINNAME.setForeground(new java.awt.Color(255, 51, 51));
        USERLOGINNAME.setText("USER LOGIN");
        getContentPane().add(USERLOGINNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        USERNAME.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        USERNAME.setForeground(new java.awt.Color(255, 255, 255));
        USERNAME.setText("(Username):");
        getContentPane().add(USERNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 78, 20));

        Passwordname.setBackground(new java.awt.Color(0, 0, 0));
        Passwordname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Passwordname.setForeground(new java.awt.Color(255, 255, 255));
        Passwordname.setText("(Password):");
        getContentPane().add(Passwordname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        LoginButton.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 51, 51));
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(this::LoginButtonActionPerformed);
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 110, -1));

        nameREGISTER.setForeground(new java.awt.Color(255, 255, 255));
        nameREGISTER.setText("To be come a Supersaiyan?");
        getContentPane().add(nameREGISTER, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 160, 24));

        ResgisterButton.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        ResgisterButton.setForeground(new java.awt.Color(255, 51, 51));
        ResgisterButton.setText("Register Here");
        ResgisterButton.addActionListener(this::ResgisterButtonActionPerformed);
        getContentPane().add(ResgisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, -1, 20));

        PasswordTextfield.addActionListener(this::PasswordTextfieldActionPerformed);
        getContentPane().add(PasswordTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 250, 30));

        ShowPassowrdButton.setForeground(new java.awt.Color(255, 255, 255));
        ShowPassowrdButton.setText("Show Password");
        ShowPassowrdButton.addActionListener(this::ShowPassowrdButtonActionPerformed);
        getContentPane().add(ShowPassowrdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/GIF UI (1).gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 440, 500));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/dragonball-super1 (2)_1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 320, 100));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextfieldActionPerformed

    private void ResgisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResgisterButtonActionPerformed
  new Register().setVisible(true);
    this.dispose();


    }//GEN-LAST:event_ResgisterButtonActionPerformed

    private void ShowPassowrdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassowrdButtonActionPerformed
        // TODO add your handling code here:


    if (ShowPassowrdButton.isSelected()) {
        PasswordTextfield.setEchoChar((char) 0);
    } else {
       PasswordTextfield.setEchoChar('\u2022');
    }

    }//GEN-LAST:event_ShowPassowrdButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add you r handling code here:
        
  Connection con = connectionDB.getConnection();

    if (con == null) {
        JOptionPane.showMessageDialog(this, "Database not connected!");
        return;
    }

    String user = usernameTextfield.getText().trim();
    String pass = new String(PasswordTextfield.getPassword()).trim();

    if (user.isEmpty() || pass.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter username and password!");
        return;
    }

    try {
        String sql = "SELECT * FROM users WHERE username=? AND password=?";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, user);
        pst.setString(2, pass);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
            new Dashboard().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect Username or Password!");
        }

        rs.close();
        pst.close();
        con.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void PasswordTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextfieldActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LOGIN().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PasswordName;
    private javax.swing.JPasswordField PasswordTextfield;
    private javax.swing.JLabel Passwordname;
    private javax.swing.JButton ResgisterButton;
    private javax.swing.JCheckBox ShowPassowrdButton;
    private javax.swing.JLabel USERLOGINNAME;
    private javax.swing.JLabel USERNAME;
    private javax.swing.JLabel USERNAMENAME;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameREGISTER;
    private javax.swing.JTextField usernameTextfield;
    // End of variables declaration//GEN-END:variables
}
