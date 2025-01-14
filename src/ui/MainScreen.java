package ui;

import business.Business;
import business.Enterprise.Enterprise;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainScreen extends javax.swing.JPanel {

    JPanel mainWorkArea;
    UserAccount userAccount;
    Enterprise ent;
    Business business;

    public MainScreen(JPanel mainWorkArea, UserAccount userAccount, Enterprise ent, Business business) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.userAccount = userAccount;
        this.ent = ent;
        this.business = business;

        initUserWorkArea();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        menuPanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        menuPanel.setBackground(new java.awt.Color(204, 204, 255));

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblWelcome.setText("<WelcomeMsg>");

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(24, 24, 24))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome)
                    .addComponent(btnLogOut))
                .addContainerGap())
        );

        splitPane.setTopComponent(menuPanel);

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // Display a message confirming the successful logout
        JOptionPane.showMessageDialog(this, "Logged out successfully", "Logout", JOptionPane.INFORMATION_MESSAGE);

        // Remove the current panel from the main work area
        mainWorkArea.remove(this);

        // Change the layout to the previous screen (assuming you're using a CardLayout)
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables

    private void initUserWorkArea() {

        lblWelcome.setText("Welcome to " + ((userAccount.getOrganisation() != null) ? userAccount.getOrganisation().getName() : userAccount.getUsername()) + "!");

        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("workArea", userAccount.getRole().createWorkArea(workArea, userAccount, ent, business));
        layout.next(workArea);
    }
}
