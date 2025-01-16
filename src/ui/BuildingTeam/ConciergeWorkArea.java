package ui.BuildingTeam;

import business.Business;
import business.Enterprise.BuildingTeamEnterprise;
import business.Enterprise.MaintenanceTeamEnterprise;
import business.Enterprise.Enterprise;
import business.Enterprise.PackagingTeamEnterprise;
import business.Enterprise.PestControlEnterprise;
import business.Organisation.Organisation;
import business.UserAccount.UserAccount;
import business.WorkQueue.ServiceWorkRequest;
import business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.MainScreen;
import javax.swing.ImageIcon;
import java.awt.Image;

public class ConciergeWorkArea extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    BuildingTeamEnterprise par;
    Business business;

    /**
     * Creates new form ConciergeWorkArea
     */
    public ConciergeWorkArea(JPanel userProcessContainer, UserAccount account, BuildingTeamEnterprise par, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.par = par;
        this.business = business;
        populate();
        check();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ServiceRequest = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Service = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnPestCtrlRequest = new javax.swing.JButton();
        btnMaintainenceRequest = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Package = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        Enquries = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        Complaints = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnBack3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        WorkArea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        ServiceRequest.setBackground(new java.awt.Color(204, 204, 255));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        Service.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Unit  No.", "Res. Name", "Type", "Message", "Status", "Feedback"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Service);
        if (Service.getColumnModel().getColumnCount() > 0) {
            Service.getColumnModel().getColumn(0).setResizable(false);
            Service.getColumnModel().getColumn(1).setResizable(false);
            Service.getColumnModel().getColumn(2).setResizable(false);
            Service.getColumnModel().getColumn(3).setResizable(false);
            Service.getColumnModel().getColumn(4).setResizable(false);
            Service.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Concierge Service Request Area");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPestCtrlRequest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPestCtrlRequest.setText("Pest Control");
        btnPestCtrlRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPestCtrlRequestActionPerformed(evt);
            }
        });

        btnMaintainenceRequest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMaintainenceRequest.setText("Maintenance");
        btnMaintainenceRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintainenceRequestActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Send Service Request To Enterprise");

        javax.swing.GroupLayout ServiceRequestLayout = new javax.swing.GroupLayout(ServiceRequest);
        ServiceRequest.setLayout(ServiceRequestLayout);
        ServiceRequestLayout.setHorizontalGroup(
            ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceRequestLayout.createSequentialGroup()
                .addGroup(ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ServiceRequestLayout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ServiceRequestLayout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(btnMaintainenceRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPestCtrlRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ServiceRequestLayout.createSequentialGroup()
                            .addGap(267, 267, 267)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ServiceRequestLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        ServiceRequestLayout.setVerticalGroup(
            ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceRequestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPestCtrlRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaintainenceRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(409, Short.MAX_VALUE))
        );

        add(ServiceRequest, "card3");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Packages");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBack1.setText("BACK");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PackageLayout = new javax.swing.GroupLayout(Package);
        Package.setLayout(PackageLayout);
        PackageLayout.setHorizontalGroup(
            PackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PackageLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnBack1)
                .addContainerGap(1305, Short.MAX_VALUE))
        );
        PackageLayout.setVerticalGroup(
            PackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PackageLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack1)
                .addContainerGap(782, Short.MAX_VALUE))
        );

        add(Package, "card4");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enquries");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBack2.setText("BACK");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EnquriesLayout = new javax.swing.GroupLayout(Enquries);
        Enquries.setLayout(EnquriesLayout);
        EnquriesLayout.setHorizontalGroup(
            EnquriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnquriesLayout.createSequentialGroup()
                .addGroup(EnquriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnquriesLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EnquriesLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnBack2)))
                .addContainerGap(987, Short.MAX_VALUE))
        );
        EnquriesLayout.setVerticalGroup(
            EnquriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnquriesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnBack2)
                .addContainerGap(763, Short.MAX_VALUE))
        );

        add(Enquries, "card5");

        Complaints.setBackground(new java.awt.Color(153, 0, 0));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Complaints");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnBack3.setText("<<BACK");
        btnBack3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout ComplaintsLayout = new javax.swing.GroupLayout(Complaints);
        Complaints.setLayout(ComplaintsLayout);
        ComplaintsLayout.setHorizontalGroup(
            ComplaintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ComplaintsLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(ComplaintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(591, Short.MAX_VALUE))
        );
        ComplaintsLayout.setVerticalGroup(
            ComplaintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComplaintsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(490, Short.MAX_VALUE))
        );

        add(Complaints, "card6");

        WorkArea.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Concierge Work Area");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Raise Service Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Check for Package");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Send Enquiry to Leasing Team");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Check for Complaints");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkAreaLayout.createSequentialGroup()
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WorkAreaLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(WorkAreaLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(854, Short.MAX_VALUE))
        );
        WorkAreaLayout.setVerticalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkAreaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(492, Short.MAX_VALUE))
        );

        add(WorkArea, "card7");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(true);
        Package.setVisible(false);
        Complaints.setVisible(false);
        WorkArea.setVisible(false);
        Enquries.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(true);
        Complaints.setVisible(false);
        WorkArea.setVisible(false);
        Enquries.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(false);
        Complaints.setVisible(false);
        WorkArea.setVisible(false);
        Enquries.setVisible(true);

        ServiceWorkRequest request = new ServiceWorkRequest();
        request.setMessage("Enquiry Check");
        request.setSender(account);
        request.setStatus("Sent");

        if (par != null) {
            System.out.println(par.getWorkQueue().getWorkRequestList() + "    bjdsvsbdvk");
            par.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
        }

        JOptionPane.showMessageDialog(null, "Request for enq message sent");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(false);
        Complaints.setVisible(true);
        WorkArea.setVisible(false);
        Enquries.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(false);
        Complaints.setVisible(false);
        WorkArea.setVisible(true);
        Enquries.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(false);
        Complaints.setVisible(false);
        WorkArea.setVisible(true);
        Enquries.setVisible(false);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(false);
        Complaints.setVisible(false);
        WorkArea.setVisible(true);
        Enquries.setVisible(false);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(false);
        Complaints.setVisible(false);
        WorkArea.setVisible(true);
        Enquries.setVisible(false);
    }//GEN-LAST:event_btnBack3ActionPerformed

    private void btnMaintainenceRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainenceRequestActionPerformed
        // TODO add your handling code here:
        // Get selected row
        int selectedRow = Service.getSelectedRow();
        if (selectedRow >= 0) {
            // Get request message from the selected row
            String request = (String) Service.getValueAt(selectedRow, 3);
            System.out.println("Selected Request: " + request);

            WorkRequest wok = null;
            // Find the corresponding WorkRequest
            for (WorkRequest wkk : par.getWorkQueue().getWorkRequestList()) {
                System.out.println("Existing Request Message: " + wkk.getMessage());
                if (wkk.getMessage() != null && wkk.getMessage().equals(request)) {
                    wok = wkk;
                    break;
                }
            }

            if (wok != null) {
                Enterprise ent = null;
                // Find the MaintenanceTeamEnterprise
                for (Enterprise enter : business.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enter instanceof MaintenanceTeamEnterprise) {
                        System.out.println("Maintenance Enterprise Found: " + enter.getName());
                        ent = enter;
                        break;
                    } else {
                        System.out.println("Not a MaintenanceTeamEnterprise: " + enter.getName());
                    }
                }

                if (ent != null) {
                    // Assign the work request to the MaintenanceTeamEnterprise
                    ent.getWorkQueue().getWorkRequestList().add(wok);
                    wok.setSender2(account);
                    JOptionPane.showMessageDialog(null, "Service request sent to MaintenanceTeamEnterprise.");
                } else {
                    JOptionPane.showMessageDialog(null, "No Maintenance Team Enterprise found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Work request not found. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMaintainenceRequestActionPerformed

    private void btnPestCtrlRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPestCtrlRequestActionPerformed
        // Get selected row
        int selectedRow = Service.getSelectedRow();
        if (selectedRow >= 0) {
            // Get request message from the selected row
            String request = (String) Service.getValueAt(selectedRow, 3);
            System.out.println("Selected Request: " + request);

            WorkRequest wok = null;
            // Find the corresponding WorkRequest
            for (WorkRequest wkk : par.getWorkQueue().getWorkRequestList()) {
                System.out.println("Existing Request Message: " + wkk.getMessage());
                if (wkk.getMessage() != null && wkk.getMessage().equals(request)) {
                    wok = wkk;
                    break;
                }
            }

            if (wok != null) {
                Enterprise ent = null;
                // Find the PestControlEnterprise
                for (Enterprise enter : business.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enter instanceof PestControlEnterprise) {
                        System.out.println("Pest Control Enterprise Found: " + enter.getName());
                        ent = enter;
                        break;
                    } else {
                        System.out.println("Not a PestControlEnterprise: " + enter.getName());
                    }
                }

                if (ent != null) {
                    // Assign the work request to the PestControlEnterprise
                    ent.getWorkQueue().getWorkRequestList().add(wok);
                    wok.setSender2(account);
                    JOptionPane.showMessageDialog(null, "Service request sent to PestControlEnterprise.");
                } else {
                    JOptionPane.showMessageDialog(null, "No Pest Control Enterprise found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Work request not found. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPestCtrlRequestActionPerformed
    public void populate() {
        DefaultTableModel model = (DefaultTableModel) Service.getModel();
        model.setRowCount(0);

        if (par != null) {
            for (WorkRequest work : par.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[6];
                row[0] = work.getSender().id;
                row[1] = work.getSender();
                row[2] = work.getType();
                row[3] = work.getMessage();
                row[4] = work.getStatus();

                model.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Enterprise Workqueue");
        }
    }

    public void check() {
        ServiceWorkRequest request = new ServiceWorkRequest();
        request.setMessage("Maintain Check");
        request.setSender(account);
        request.setStatus("Sent");

        Enterprise ent = null;
        for (Enterprise enter : business.getEnterpriseDirectory().getEnterpriseList()) {

            if (enter instanceof MaintenanceTeamEnterprise) {

                ent = enter;
                break;
            }
        }
        if (ent != null) {
            System.out.println(ent.getName() + "amrish lord");
            System.out.println(ent.getOrganisationDirectory().toString());
            ent.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Complaints;
    private javax.swing.JPanel Enquries;
    private javax.swing.JPanel Package;
    private javax.swing.JTable Service;
    private javax.swing.JPanel ServiceRequest;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnMaintainenceRequest;
    private javax.swing.JButton btnPestCtrlRequest;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}