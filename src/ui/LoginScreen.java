package ui;

import business.Business;
import business.Enterprise.Enterprise;
import business.Organisation.Organisation;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.Analytics.FakeDataGenerator;

public class LoginScreen extends javax.swing.JPanel {

    JPanel mainWorkArea;
    Business business;

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen(JPanel mainWorkArea, Business business) {
        initComponents();

        this.mainWorkArea = mainWorkArea;
        this.business = business;
        generateFakeData();

    }
    // Method to generate fake data

    private void generateFakeData() {
        // Check if the WorkRequest.json file exists
        File file = new File("/Users/suhasreddybr/Downloads/Residents-Enterprise-Management-System-main 2/Final/Final_Group70/src/ui/Analytics/WorkRequest.json");

        // If the file does not exist or is empty, generate fake data
        if (!file.exists() || file.length() == 0) {
            FakeDataGenerator.main(new String[]{});  // Call FakeDataGenerator to create the file
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        pwdField = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ACTIVE BUILDING LOGIN");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 26, 890, 80));

        lblUser.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Username:");
        add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 146, 29));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 146, 29));

        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 171, 29));

        pwdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(pwdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 171, 29));

        btnLogin.setBackground(new java.awt.Color(204, 255, 204));
        btnLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 137, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Images/LivingEase_logo.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 465, 208));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Images/Login_background.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 930));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Get user name
        String userName = txtUserName.getText();
        // Get Password
        char[] passwordCharArray = pwdField.getPassword();
        String password = String.valueOf(passwordCharArray);
        boolean flag = false;

        UserAccount userAccount = null;
        for (Enterprise ent : business.getEnterpriseDirectory().getEnterpriseList()) {
            //    System.out.println(ent);
            for (Organisation org : ent.getOrganisationDirectory().getOrganisationList()) {
                //     System.out.println(org);
                // for()
                userAccount = org.getUserAccountDirectory().authenticateUser(userName, password);
                //   System.out.println(userAccount);

                if (userAccount != null) {
                    //    System.out.println(userAccount);
                    JPanel mainScreen = new MainScreen(mainWorkArea, userAccount, ent, business);
                    mainWorkArea.add("MainScreen", mainScreen);
                    CardLayout layout = (CardLayout) mainWorkArea.getLayout();
                    layout.next(mainWorkArea);

                    flag = true;
                    break;
                }
            }
        }

        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Invalid User Name/ Password.");
            return;

        }

//        btnLogin.setEnabled(false);
//        logoutJButton.setEnabled(true);
//        userNameJTextField.setEnabled(false);
//        passwordField.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
private void initLoginScreen() {

        JPanel loginScreen = new LoginScreen(mainWorkArea, business);
        mainWorkArea.add("LoginScreen", loginScreen);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);

    }

}
