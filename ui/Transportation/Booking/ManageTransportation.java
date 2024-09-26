package ui.Transportation.Booking;

import resort.EcoSystem;
import resort.Food.FoodItem;
import resort.Transportation.Booking.Transport;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arvin
 */
public class ManageTransportation extends javax.swing.JPanel {
    private EcoSystem system;
    
    String mainValidationString = "";
    String validationString1 = "";
    String validationString2 = "";

    /**
     * Creates new form ManageVehicle
     */
    public ManageTransportation(EcoSystem system) {
        initComponents();
        this.system = system;
        
        populateTable();
    }
    
    private void resetVehicleData() {
        cmbCategory.setSelectedItem("Choose Category");
        txtVehicleName.setText("");
        txtVehicleNum.setText("");
        cmbSeater.setSelectedItem("Choose Seater");
        txtPrice.setText("");
    }
    
    public boolean areDataFieldsEmpty() {
        validationString1 = "";
        if (txtVehicleNum.getText().isEmpty()) {
            validationString1 += "Vehicle Number, ";
        }
        if (txtVehicleName.getText().isEmpty()) {
            validationString1 += "Vehicle Name, ";
        }
        if (txtPrice.getText() == null) {
            validationString1 += "Price per hour, ";
        }
        
        if(cmbCategory.getSelectedIndex() == 0){
            validationString1 += "Category, ";
        }
        
        if(cmbSeater.getSelectedIndex() == 0){
            validationString1 += "Seater, ";
        }
        
        return isNotValid(validationString1);
    }

    public boolean areDataTypesCorrect() {
        validationString2 = "";
        if (!validateFloatDataType(txtPrice.getText())) {
            validationString2 += "Price, ";
        }
        return isNotValid(validationString2);
    }

    public boolean isNotValid(String str) {
        if (str.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateFloatDataType(String str) {
        try {
            Float.parseFloat(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void validationErrorMessagesDialog(boolean validation1, boolean validation2) {
        if (validation1) {
            mainValidationString = validationString1;
            JOptionPane.showMessageDialog(this, "Please update the data for these fields: " + mainValidationString);
        } else if (validation2) {
            mainValidationString = validationString2;
            JOptionPane.showMessageDialog(this, "Please enter only numbers for these fields: " + mainValidationString);
        }
    }
    
    private boolean vehicleDetailsExistence() {
        String vehicleNumber = txtVehicleNum.getText();
        boolean exist = false;
            for (Transport vehicle : system.getTransportDirectory().getTransportdirectory()) {
                if (vehicleNumber.equals(vehicle.getTransportNumber())) {
                    exist = true;
                    break;
                }
            }
        return exist;
    }
    
     private void populateTable() {
        //new test
         
         DefaultTableModel model = (DefaultTableModel) tblVehicle.getModel();
        
        model.setRowCount(0);

        for (Transport vehicle : system.getTransportDirectory().getTransportdirectory() ) {
            Object[] row = new Object[5];

            row[0] = vehicle;
            row[1] = vehicle.getTransportName();
            row[2] = vehicle.getGroup();
            row[3] = vehicle.getNoOfSeats();
            row[4] = vehicle.getRate();
            

            model.addRow(row);
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
        txtVehicleName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVehicleNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAddVehicle = new javax.swing.JButton();
        btnDeleteVehicle = new javax.swing.JButton();
        btnViewVehicle = new javax.swing.JButton();
        btnUpdateVehicle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehicle = new javax.swing.JTable();
        cmbCategory = new javax.swing.JComboBox<>();
        cmbSeater = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Transports");

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Transport Name:");

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Transport Number:");

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Number Of Seats :");

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Category:");

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rate per hour ($):");

        btnAddVehicle.setText("ADD");
        btnAddVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVehicleActionPerformed(evt);
            }
        });

        btnDeleteVehicle.setText("DELETE");
        btnDeleteVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteVehicleActionPerformed(evt);
            }
        });

        btnViewVehicle.setText("VIEW");
        btnViewVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVehicleActionPerformed(evt);
            }
        });

        btnUpdateVehicle.setText("UPDATE");
        btnUpdateVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateVehicleActionPerformed(evt);
            }
        });

        tblVehicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vehicle Number", "Vehicle Name", "Category", "Seater", "Price per hour"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehicle);

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Category", "SUV", "Hatchback", "Sedan" }));

        cmbSeater.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Seater", "3", "4", "5", "6", "7" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtVehicleName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnViewVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDeleteVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(btnUpdateVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleNum, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSeater, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddVehicle, btnDeleteVehicle, btnUpdateVehicle, btnViewVehicle});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVehicleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddVehicle))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteVehicle))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVehicleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewVehicle))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbSeater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateVehicle))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(261, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddVehicle, btnDeleteVehicle, btnUpdateVehicle, btnViewVehicle});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVehicleActionPerformed
        // TODO add your handling code here:
        try {
            boolean validation1 = areDataFieldsEmpty();
            boolean validation2 = areDataTypesCorrect();

            if (!validation1 && !validation2) {
                String vehicleNumber = txtVehicleNum.getText();
                String vehicleName = txtVehicleName.getText();
                String category = (String) cmbCategory.getSelectedItem();
                Integer seater = Integer.parseInt((String) cmbSeater.getSelectedItem());
                Float price = Float.parseFloat(txtPrice.getText());

                if (!vehicleDetailsExistence()) {
                    Transport vehicle = system.getTransportDirectory().addTransportDetails();
                    vehicle.setTransportName(vehicleName);
                    vehicle.setTransportNumber(vehicleNumber);
                    vehicle.setRate(price);
                    vehicle.setNoOfSeats(seater);
                    vehicle.setGroup(category);

                    JOptionPane.showMessageDialog(this, "Vehicle number " + vehicleNumber + " added");
                    resetVehicleData();
                    populateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Vehicle details already exists with the Vehicle Number"
                            + " : " + vehicleNumber);
                }
            } else {
                validationErrorMessagesDialog(validation1, validation2);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnAddVehicleActionPerformed

    private void btnDeleteVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteVehicleActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblVehicle.getSelectedRow();

            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row for deletion");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) tblVehicle.getModel();
            Transport selectedVehicle = (Transport) model.getValueAt(selectedRowIndex, 0);

            system.getTransportDirectory().deleteTransport(selectedVehicle);

            JOptionPane.showMessageDialog(this, "Vehicle Deleted");

            populateTable();
            resetVehicleData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        
    }//GEN-LAST:event_btnDeleteVehicleActionPerformed

    private void btnViewVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVehicleActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblVehicle.getSelectedRow();

            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row for viewing");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) tblVehicle.getModel();
            Transport selectedVehicle = (Transport) model.getValueAt(selectedRowIndex, 0);

            txtVehicleNum.setText(selectedVehicle.getTransportNumber());
            txtVehicleName.setText(selectedVehicle.getTransportName());
            cmbCategory.setSelectedItem(selectedVehicle.getGroup());
            cmbSeater.setSelectedItem(String.valueOf(selectedVehicle.getNoOfSeats()));
            txtPrice.setText(String.valueOf(selectedVehicle.getRate()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }


        
    }//GEN-LAST:event_btnViewVehicleActionPerformed

    private void btnUpdateVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateVehicleActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) tblVehicle.getModel();

            if (tblVehicle.getSelectedRowCount() == 1) {

                String vehicleNumber = txtVehicleNum.getText();
                String vehicleName = txtVehicleName.getText();
                int seater = Integer.parseInt((String) cmbSeater.getSelectedItem());
                float price = Float.parseFloat(txtPrice.getText());
                String category = (String) cmbCategory.getSelectedItem();

                int selectedRowIndex = tblVehicle.getSelectedRow();
                Transport vehicle = system.getTransportDirectory().getTransport(selectedRowIndex);

                vehicle.setTransportNumber(vehicleNumber);
                vehicle.setTransportName(vehicleName);
                vehicle.setGroup(category);
                vehicle.setNoOfSeats(seater);
                vehicle.setRate(price);

                populateTable();
                resetVehicleData();

                JOptionPane.showMessageDialog(this, "Update successful!");
            } else if (tblVehicle.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(this, "Please select single row");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }


    }//GEN-LAST:event_btnUpdateVehicleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVehicle;
    private javax.swing.JButton btnDeleteVehicle;
    private javax.swing.JButton btnUpdateVehicle;
    private javax.swing.JButton btnViewVehicle;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbSeater;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVehicle;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtVehicleName;
    private javax.swing.JTextField txtVehicleNum;
    // End of variables declaration//GEN-END:variables
}
