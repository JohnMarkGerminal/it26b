package newpackage;

import newpackage.LOGIN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Register extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Register.class.getName());

    public Register() {
        initComponents();
        setLocationRelativeTo(null); // center window
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        UsernameName = new javax.swing.JLabel();
        usernameTextfield = new javax.swing.JTextField();
        PasswordName = new javax.swing.JLabel();
        passwordTextfield = new javax.swing.JPasswordField();
        ConfirmPasswordName = new javax.swing.JLabel();
        ConfirmPasswordTextfield = new javax.swing.JPasswordField();
        AlreadyHaveanAccountName = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        ShowPassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameName.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        UsernameName.setForeground(new java.awt.Color(255, 51, 51));
        UsernameName.setText("Username");
        getContentPane().add(UsernameName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 172, -1));

        usernameTextfield.addActionListener(this::usernameTextfieldActionPerformed);
        getContentPane().add(usernameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 270, 39));

        PasswordName.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        PasswordName.setForeground(new java.awt.Color(255, 51, 51));
        PasswordName.setText("Password");
        getContentPane().add(PasswordName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 190, 33));

        passwordTextfield.addActionListener(this::passwordTextfieldActionPerformed);
        getContentPane().add(passwordTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 270, 37));

        ConfirmPasswordName.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        ConfirmPasswordName.setForeground(new java.awt.Color(255, 51, 51));
        ConfirmPasswordName.setText("Confirm Password");
        getContentPane().add(ConfirmPasswordName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 260, -1));

        ConfirmPasswordTextfield.addActionListener(this::ConfirmPasswordTextfieldActionPerformed);
        getContentPane().add(ConfirmPasswordTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 270, 36));

        AlreadyHaveanAccountName.setBackground(new java.awt.Color(255, 255, 255));
        AlreadyHaveanAccountName.setText("Already have an Account?");
        getContentPane().add(AlreadyHaveanAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 152, 20));

        RegisterButton.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(255, 51, 51));
        RegisterButton.setText("REGISTER");
        RegisterButton.addActionListener(this::RegisterButtonActionPerformed);
        getContentPane().add(RegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 100, -1));

        LoginButton.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 51, 51));
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(this::LoginButtonActionPerformed);
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 80, 30));

        ShowPassword.setText("Show Password");
        ShowPassword.addActionListener(this::ShowPasswordActionPerformed);
        getContentPane().add(ShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/VEGETA (1) (1).gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextfieldActionPerformed
        // TODO add your handling code here:
        // close register
    }//GEN-LAST:event_usernameTextfieldActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed

        String username = usernameTextfield.getText().trim();
        String password = new String(passwordTextfield.getPassword()).trim();
        String confirm = new String(ConfirmPasswordTextfield.getPassword()).trim();

        if (username.isEmpty() || password.isEmpty() || confirm.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Fill all fields!");
            return;
        }

        if (!password.equals(confirm)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Passwords do not match!");
            return;
        }

        Connection con = null;

        try {
            con = connectionDB.getConnection();

            if (con == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Database not connected!");
                return;
            }

            // CHECK USER
            String checkSQL = "SELECT username FROM users WHERE username=?";
            PreparedStatement checkPst = con.prepareStatement(checkSQL);
            checkPst.setString(1, username);

            ResultSet rs = checkPst.executeQuery();

            if (rs.next()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Username already exists!");
                return;
            }

            rs.close();
            checkPst.close();

            // INSERT USER
            String sql = "INSERT INTO users(username, password) VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, username);
            pst.setString(2, password);

            pst.executeUpdate();
            pst.close();

            javax.swing.JOptionPane.showMessageDialog(this, "Registered Successfully!");

            new LOGIN().setVisible(true);
            this.dispose();

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

                                                  
    Connection con = connectionDB.getConnection();

    if (con == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Database not connected!");
        return;
    }

    try {
        String sql = "SELECT * FROM users WHERE username=? AND password=?";
        PreparedStatement pst = con.prepareStatement(sql);

        String user = usernameTextfield.getText();
        String pass = new String(passwordTextfield.getPassword()); // FIXED

        pst.setString(1, user);
        pst.setString(2, pass);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Login Successful!");
            new Dashboard().setVisible(true);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Incorrect Username or Password!");
        }

        rs.close();
        pst.close();
        con.close();

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }


    }//GEN-LAST:event_LoginButtonActionPerformed

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed

        if (ShowPassword.isSelected()) {
            passwordTextfield.setEchoChar((char) 0);
            ConfirmPasswordTextfield.setEchoChar((char) 0);
        } else {
            passwordTextfield.setEchoChar('•');
            ConfirmPasswordTextfield.setEchoChar('•');
        }

    }//GEN-LAST:event_ShowPasswordActionPerformed

    private void ConfirmPasswordTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswordTextfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ConfirmPasswordTextfieldActionPerformed

    private void passwordTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextfieldActionPerformed

   
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
        java.awt.EventQueue.invokeLater(() -> new Register().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlreadyHaveanAccountName;
    private javax.swing.JLabel ConfirmPasswordName;
    private javax.swing.JPasswordField ConfirmPasswordTextfield;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PasswordName;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JLabel UsernameName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPasswordField passwordTextfield;
    private javax.swing.JTextField usernameTextfield;
    // End of variables declaration//GEN-END:variables
}
