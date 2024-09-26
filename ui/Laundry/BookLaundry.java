package ui.Laundry;

import resort.EcoSystem;
import javax.swing.JOptionPane;
import ui.Laundry.ManageLaundry;

/**
 *
 * @author arvin
 */
public class BookLaundry extends javax.swing.JPanel {
    private EcoSystem system;

    /**
     * Creates new form BookLaundryPanel
     */
    public BookLaundry(EcoSystem system) {
        initComponents();
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnManageLaundry = new javax.swing.JButton();
        btnRequestQueue = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnManageLaundry.setBackground(new java.awt.Color(0, 102, 102));
        btnManageLaundry.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnManageLaundry.setForeground(new java.awt.Color(255, 255, 255));
        btnManageLaundry.setText("MANAGE CATEGORY");
        btnManageLaundry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLaundryActionPerformed(evt);
            }
        });

        btnRequestQueue.setBackground(new java.awt.Color(0, 102, 102));
        btnRequestQueue.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRequestQueue.setForeground(new java.awt.Color(255, 255, 255));
        btnRequestQueue.setText("MANAGE REQUESTS");
        btnRequestQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestQueueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageLaundry)
                    .addComponent(btnRequestQueue))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(btnManageLaundry)
                .addGap(35, 35, 35)
                .addComponent(btnRequestQueue)
                .addContainerGap(462, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Images_R/l1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(-3, 0, 990, 730);

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1181, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageLaundryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLaundryActionPerformed
        // TODO add your handling code here:
         try {
            ManageLaundry managelaundryPanel = new ManageLaundry(system);
            jSplitPane1.setRightComponent(managelaundryPanel);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnManageLaundryActionPerformed

    private void btnRequestQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestQueueActionPerformed
        // TODO add your handling code here:
         try {
            ManageLaundryRequests manageRequestsPanel  = new ManageLaundryRequests(system);
            jSplitPane1.setRightComponent(manageRequestsPanel);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnRequestQueueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageLaundry;
    private javax.swing.JButton btnRequestQueue;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
