package ui.PackagingTeam;

import business.Business;
import business.Enterprise.BuildingTeamEnterprise;
import business.Enterprise.Enterprise;
import business.Enterprise.MaintenanceTeamEnterprise;
import business.Enterprise.PackagingTeamEnterprise;
import business.Organisation.Organisation;
import business.UserAccount.UserAccount;
import business.WorkQueue.ServiceWorkRequest;
import business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class DeliveryGuyWorkArea extends javax.swing.JPanel {

    private JPanel workArea;
    private PackagingTeamEnterprise ent;
    private Business business;
    private UserAccount userAccount;

    public DeliveryGuyWorkArea(JPanel userProcessContainer, UserAccount account, PackagingTeamEnterprise par, Business business) {
        initComponents();

        this.workArea = userProcessContainer;
        this.ent = par;
        this.business = business;
        this.userAccount = account;

        populateAssignedDeliveries();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Updatevalidation = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AssignDelivery = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 230, 253));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delivery Agent Work Area Portal");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Updatevalidation.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Updatevalidation.setText("Update Delivery Status");
        Updatevalidation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Updatevalidation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatevalidationActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        AssignDelivery.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        AssignDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Apt. No", "Assigned by", "Delivery Guy", "Status", "Date Assigned"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AssignDelivery);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(364, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Updatevalidation, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Updatevalidation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(289, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateAssignedDeliveries();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void UpdatevalidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatevalidationActionPerformed
        int selectedRow = AssignDelivery.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a delivery to update.");
            return;
        }

        String aptNo = (String) AssignDelivery.getValueAt(selectedRow, 0);
        String deliveryStatus = (String) AssignDelivery.getValueAt(selectedRow, 3);

        if (deliveryStatus.equals("Delivered") || deliveryStatus.equals("Returned")) {
            JOptionPane.showMessageDialog(null, "This delivery has already been marked as " + deliveryStatus + ".");
            return;
        }

        // Show a popup with two options: Delivered or Returned
        Object[] options = {"Delivered", "Returned"};
        int choice = JOptionPane.showOptionDialog(null, "Update Delivery Status",
                "Choose Status",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);

        if (choice == JOptionPane.CLOSED_OPTION) {
            return; // If the dialog was closed without choosing an option
        }

        String newStatus = (choice == 0) ? "Delivered" : "Returned"; // "Delivered" is 0, "Returned" is 1

        // Iterate through the work requests in the delivery guy's work queue
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workRequest.getMessage().equals(aptNo)) {
                // Update the status of the delivery request
                workRequest.setStatus(newStatus);

                // Create a new ServiceWorkRequest for the resident based on the status
                ServiceWorkRequest newRequestToResident = new ServiceWorkRequest();
                newRequestToResident.setMessage(newStatus.equals("Delivered") ? "Please collect your order" : "The delivery was returned");
                newRequestToResident.setSender(userAccount);
                newRequestToResident.setStatus(newStatus);
                newRequestToResident.setType("Delivery");

                // Get the resident's account and add the new work request
                UserAccount residentAccount = getResidentAccountForDelivery(aptNo);
                if (residentAccount != null) {
                    residentAccount.getWorkQueue().getWorkRequestList().add(newRequestToResident);
                    JOptionPane.showMessageDialog(null, "New Service request Created for User: " + newStatus);
                }

                // Refresh the table to reflect the update
                populateAssignedDeliveries();
                return;
            }
        }

        // If no matching request found
        JOptionPane.showMessageDialog(null, "No matching delivery request found.");
    }//GEN-LAST:event_UpdatevalidationActionPerformed

    private void populateAssignedDeliveries() {
        DefaultTableModel model = (DefaultTableModel) AssignDelivery.getModel();
        model.setRowCount(0);

        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workRequest.getReceiver() != null && workRequest.getReceiver().equals(userAccount)) {
                Object[] row = {
                    workRequest.getMessage(),
                    workRequest.getSender().getUsername(),
                    workRequest.getReceiver().getUsername(),
                    workRequest.getStatus(),
                    workRequest.getRequestDate() != null ? workRequest.getRequestDate().toString() : "N/A"
                };
                model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AssignDelivery;
    private javax.swing.JButton Updatevalidation;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private UserAccount getResidentAccountForDelivery(String aptNo) {
        for (Enterprise enterprise : business.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organisation organisation : enterprise.getOrganisationDirectory().getOrganisationList()) {
                for (UserAccount account : organisation.getUserAccountDirectory().getUserAccountList()) {
                    // Match based on the apartment number
                    if (account.getId() != -1 && String.valueOf(account.getId()).equals(aptNo)) {
                        return account;
                    }
                }
            }
        }
        return null;
    }
}
