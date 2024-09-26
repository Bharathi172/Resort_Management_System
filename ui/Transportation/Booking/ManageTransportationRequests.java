package ui.Transportation.Booking;

import resort.EcoSystem;
import resort.Email.EmailAlert;
import resort.Food.FoodItem;
import resort.Client.TransactionHistory.ClientTransaction;
import resort.User.User;
import resort.RolesCD.FoodRequest;
import resort.RolesCD.TransportRequest;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arvin
 */
public class ManageTransportationRequests extends javax.swing.JPanel {

    EcoSystem system;

    /**
     * Creates new form ManageRequests
     */
    public ManageTransportationRequests(EcoSystem system) {
        initComponents();

        this.system = system;
        populateVehicleRequestTable();
        formatRows();

    }

    //func - get values from work-request directory, checks for status
    public void populateVehicleRequestTable() {
        ArrayList<TransportRequest> pendingVehicleRequest = new ArrayList<TransportRequest>();
        ArrayList<TransportRequest> non_pendingVehicleRequest = new ArrayList<TransportRequest>();

        for (TransportRequest vehicleWRequest : system.getTransportRequestDirectory().getTransportRequestList()) {
            if (vehicleWRequest.getBookingStatus().equals("Pending")) {
                pendingVehicleRequest.add(vehicleWRequest);
            } else {
                non_pendingVehicleRequest.add(vehicleWRequest);
            }
        }

        populate_based_on_status(pendingVehicleRequest, non_pendingVehicleRequest);
    }

    public void populate_based_on_status(ArrayList<TransportRequest> pendingVehicleRequest, ArrayList<TransportRequest> non_pendingVehicleRequest) {
        DefaultTableModel model = (DefaultTableModel) tblVehicleRequests.getModel();
        model.setRowCount(0);
        for (TransportRequest vehicleWRequest : pendingVehicleRequest) {

            Object[] newRow = new Object[9];
            newRow[0] = vehicleWRequest;
            newRow[1] = vehicleWRequest.getSelectedVehicle().getTransportNumber();
            newRow[2] = vehicleWRequest.getSelectedVehicle().getTransportName();
            newRow[3] = vehicleWRequest.getSelectedVehicle().getGroup();
            newRow[4] = vehicleWRequest.getSelectedVehicle().getNoOfSeats();
            newRow[5] = vehicleWRequest.getSelectedVehicle().getRate();
            newRow[6] = vehicleWRequest.getDurationInHours();
            newRow[7] = vehicleWRequest.getReservationDate();
            newRow[8] = vehicleWRequest.getBookingStatus();

            model.addRow(newRow);
        }

        DefaultTableModel modelNon_Pending = (DefaultTableModel) tblVehicleConfirmed.getModel();
        modelNon_Pending.setRowCount(0);
        for (TransportRequest vehicleWRequest : non_pendingVehicleRequest) {

            Object[] newRow = new Object[9];
            newRow[0] = vehicleWRequest;
            newRow[1] = vehicleWRequest.getSelectedVehicle().getTransportNumber();
            newRow[2] = vehicleWRequest.getSelectedVehicle().getTransportName();
            newRow[3] = vehicleWRequest.getSelectedVehicle().getGroup();
            newRow[4] = vehicleWRequest.getSelectedVehicle().getNoOfSeats();
            newRow[5] = vehicleWRequest.getSelectedVehicle().getRate();
            newRow[6] = vehicleWRequest.getDurationInHours();
            newRow[7] = vehicleWRequest.getReservationDate();
            newRow[8] = vehicleWRequest.getBookingStatus();

            modelNon_Pending.addRow(newRow);
        }

    }

    void updateWorkRequestStatus(TransportRequest selectedVehicle, String status) {
        selectedVehicle.setBookingStatus(status);
        int index = 0;
        for (TransportRequest vehicleWRequest : system.getTransportRequestDirectory().getTransportRequestList()) {
            if (vehicleWRequest.getUserId().equals(selectedVehicle.getUserId())) {
                system.getTransportRequestDirectory().updateTransportRequest(vehicleWRequest, index);
                break;
            }
            index++;
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehicleRequests = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVehicleConfirmed = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE REQUESTS");

        tblVehicleRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "Transport Number", "Transport Name", "Category", "Number Of Seats", "Rate per hour", "Total Hours", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehicleRequests);

        tblVehicleConfirmed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "Transport Number", "Transport Name", "Category", "Number Of Seats", "Rate per hour", "Total hours", "Date", "Status Quo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVehicleConfirmed);

        btnApprove.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(0, 102, 102));
        btnApprove.setText("APPROVE");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(0, 102, 102));
        btnReject.setText("REJECT");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(440, 440, 440))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblVehicleRequests.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to approve.");
                return;
            }
            
            DefaultTableModel model = (DefaultTableModel) tblVehicleRequests.getModel();
            TransportRequest selectedVehicleWorkRequest = (TransportRequest) model.getValueAt(selectedRowIndex, 0);
            updateWorkRequestStatus(selectedVehicleWorkRequest, "Approved");
            ClientTransaction ct = new ClientTransaction();
            //User definition for email notif
            User getUser = system.getUserDirectory().getUserById(selectedVehicleWorkRequest.getUserId());
            
            float vehiclebooking_finalprice = selectedVehicleWorkRequest.getDurationInHours() * selectedVehicleWorkRequest.getSelectedVehicle().getRate();
            ct.setUserId(selectedVehicleWorkRequest.getUserId());
            ct.setSelectedCenter("Vehicle Booked - " + selectedVehicleWorkRequest.getSelectedVehicle().getTransportName() + " for " + selectedVehicleWorkRequest.getDurationInHours() + " hours");
            ct.setTotalCost(vehiclebooking_finalprice);
            system.getClientTransactionDirectory().addClientTransaction(ct);
            //email notification
            new EmailAlert().SendEmailOfNotification(getUser, "Vehicle");
            
            
            JOptionPane.showMessageDialog(this, "Request approved successfully and email notification sent");
            populateVehicleRequestTable();
            formatRows();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblVehicleRequests.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to approve.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) tblVehicleRequests.getModel();
            TransportRequest selectedVehicleWorkRequest = (TransportRequest) model.getValueAt(selectedRowIndex, 0);
            updateWorkRequestStatus(selectedVehicleWorkRequest, "Rejected");
            JOptionPane.showMessageDialog(this, "Request rejected successfully");
            populateVehicleRequestTable();
            formatRows();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblVehicleConfirmed;
    private javax.swing.JTable tblVehicleRequests;
    // End of variables declaration//GEN-END:variables


    private void formatRows() {

        DefaultTableModel model = (DefaultTableModel) tblVehicleConfirmed.getModel();

        tblVehicleConfirmed.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = String.valueOf(model.getValueAt(row, 8));
                c.setBackground(status.equals("Pending") ? Color.WHITE : status.equals("Approved") ? Color.GREEN : Color.RED);
                return c;
            }
        });

    }
}
