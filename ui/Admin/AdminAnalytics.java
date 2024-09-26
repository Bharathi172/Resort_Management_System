package ui.Admin;

import resort.EcoSystem;
import resort.Client.TransactionHistory.ClientTransaction;
import resort.User.User;
import resort.RolesCD.FoodRequest;
import resort.RolesCD.GameRequest;
import resort.RolesCD.LaundryRequest;
import resort.RolesCD.PoolRequest;
import resort.RolesCD.TransportRequest;

/**
 *
 * @author arvin
 */
public class AdminAnalytics extends javax.swing.JPanel {

    /**
     * Creates new form AdminAnalytics
     */
    EcoSystem system;

    public AdminAnalytics(EcoSystem system) {
        initComponents();
        this.system = system;
        
        customerTxt.setEditable(false);
        foodManagerTxt.setEditable(false);
        foodManagerTxt1.setEditable(false);
        gameInchargeTxt.setEditable(false);
        gameInchargeTxt1.setEditable(false);
        janitorTxt.setEditable(false);
        laundryManagerTxt.setEditable(false);
        laundryManagerTxt1.setEditable(false);
        poolInchargeTxt.setEditable(false);
        poolInchargeTxt1.setEditable(false);
        shopManagerTxt.setEditable(false);
        totalRequestTxt.setEditable(false);
        totalRevenueTxt.setEditable(false);
        vehicleContractorTxt.setEditable(false);
        vehicleContractorTxt1.setEditable(false);

        populateFields();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        customerTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        vehicleContractorTxt = new javax.swing.JTextField();
        foodManagerTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gameInchargeTxt = new javax.swing.JTextField();
        janitorTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        laundryManagerTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        poolInchargeTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        shopManagerTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        totalRequestTxt = new javax.swing.JTextField();
        totalRevenueTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        vehicleContractorTxt1 = new javax.swing.JTextField();
        foodManagerTxt1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        gameInchargeTxt1 = new javax.swing.JTextField();
        laundryManagerTxt1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        poolInchargeTxt1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Total number of Users");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pending requests");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Total Resort Revenue:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Admin Analytics");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Customers:");

        customerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTxtActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Vehicle Contractors:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Food Managers:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Gaming Incharges:");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Janitors:");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Laundry Managers:");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Pool Incharges:");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel14.setText("Shop Managers:");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel15.setText("Total requests:");

        totalRequestTxt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Vehicle:");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Food and Beverages:");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Gaming:");

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Laundry Managers:");

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Pool Incharges:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Images_R/customer1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(totalRevenueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(vehicleContractorTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(foodManagerTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gameInchargeTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(laundryManagerTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(poolInchargeTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(customerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vehicleContractorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foodManagerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gameInchargeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(janitorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(laundryManagerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poolInchargeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(shopManagerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalRequestTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, jLabel16, jLabel17, jLabel18, jLabel19, jLabel20, jLabel4, jLabel7, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {customerTxt, foodManagerTxt, foodManagerTxt1, gameInchargeTxt, gameInchargeTxt1, janitorTxt, laundryManagerTxt, laundryManagerTxt1, poolInchargeTxt, poolInchargeTxt1, shopManagerTxt, totalRequestTxt, totalRevenueTxt, vehicleContractorTxt, vehicleContractorTxt1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(totalRevenueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(vehicleContractorTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(foodManagerTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gameInchargeTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(laundryManagerTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(poolInchargeTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicleContractorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(foodManagerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(gameInchargeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(janitorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(laundryManagerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(poolInchargeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(shopManagerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(totalRequestTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 173, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, jLabel16, jLabel17, jLabel18, jLabel19, jLabel20, jLabel4, jLabel7, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {customerTxt, foodManagerTxt, foodManagerTxt1, gameInchargeTxt, gameInchargeTxt1, janitorTxt, laundryManagerTxt, laundryManagerTxt1, poolInchargeTxt, poolInchargeTxt1, shopManagerTxt, totalRequestTxt, totalRevenueTxt, vehicleContractorTxt, vehicleContractorTxt1});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3});

    }// </editor-fold>//GEN-END:initComponents

    private void customerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField customerTxt;
    private javax.swing.JTextField foodManagerTxt;
    private javax.swing.JTextField foodManagerTxt1;
    private javax.swing.JTextField gameInchargeTxt;
    private javax.swing.JTextField gameInchargeTxt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField janitorTxt;
    private javax.swing.JTextField laundryManagerTxt;
    private javax.swing.JTextField laundryManagerTxt1;
    private javax.swing.JTextField poolInchargeTxt;
    private javax.swing.JTextField poolInchargeTxt1;
    private javax.swing.JTextField shopManagerTxt;
    private javax.swing.JTextField totalRequestTxt;
    private javax.swing.JTextField totalRevenueTxt;
    private javax.swing.JTextField vehicleContractorTxt;
    private javax.swing.JTextField vehicleContractorTxt1;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {

        try {

            int customerCount = 0;
            int vehicleContractorCount = 0;
            int foodManagerCount = 0;
            int poolInchargeCount = 0;
            int gameInchargeCount = 0;
            int shopManagerCount = 0;
            int laundryManagerCount = 0;
            int janitorCount = 0;
            int totalRequestCount = 0;
            int vehiclePendingRequestCount = 0;
            int foodBevPendingRequestCount = 0;
            int poolPendingRequestCount = 0;
            int gamePendingRequestCount = 0;
            int laundryPendingRequestCount = 0;
            float totalRevenue = 0;

            for (User user : system.getUserDirectory().getUsers()) {

                if (user.getUserRole().equals("Client")) {
                    customerCount += 1;
                } else if (user.getUserRole().equals("Transportation Provider")) {
                    vehicleContractorCount += 1;
                } else if (user.getUserRole().equals("Swimming Pool Manager")) {
                    poolInchargeCount += 1;
                } else if (user.getUserRole().equals("Game Supervisor")) {
                    gameInchargeCount += 1;
                } else if (user.getUserRole().equals("Laundry Services Manager")) {
                    laundryManagerCount += 1;
                } else if (user.getUserRole().equals("House Keeping Supervisor")) {
                    janitorCount += 1;
                } else if (user.getUserRole().equals("Food Services Manager")) {
                    foodManagerCount += 1;
                } else if (user.getUserRole().equals("Shop Manager")) {
                    shopManagerCount += 1;
                }
            }

            for (ClientTransaction transaction : system.getClientTransactionDirectory().getClientTransactionList()) {

                totalRevenue += transaction.getTotalCost();
            }

            totalRequestCount = system.getFoodRequestDirectory().getFoodRequestsList().size()
                    + system.getGameRequestDirectory().getGameRequestList().size()
                    + system.getLaundryRequestDirectory().getLaundryRequestList().size()
                    + system.getPoolRequestDirectory().getPoolRequestList().size()
                    + system.getTransportRequestDirectory().getTransportRequestList().size();

            for (TransportRequest vehicleWorkRequest : system.getTransportRequestDirectory().getTransportRequestList()) {

                if (vehicleWorkRequest.getBookingStatus().equals("Pending")) {
                    vehiclePendingRequestCount += 1;
                }
            }

            for (FoodRequest foodBevWorkRequest : system.getFoodRequestDirectory().getFoodRequestsList()) {

                if (foodBevWorkRequest.getOrderStatus().equals("Pending")) {
                    foodBevPendingRequestCount += 1;
                }
            }

            for (PoolRequest poolWorkRequest : system.getPoolRequestDirectory().getPoolRequestList()) {

                if (poolWorkRequest.getBookingStatus().equals("Pending")) {
                    poolPendingRequestCount += 1;
                }
            }

            for (GameRequest gameWorkRequest : system.getGameRequestDirectory().getGameRequestList()) {

                if (gameWorkRequest.getBookingStatus().equals("Pending")) {
                    gamePendingRequestCount += 1;
                }
            }

            for (LaundryRequest laundryWorkRequest : system.getLaundryRequestDirectory().getLaundryRequestList()) {

                if (laundryWorkRequest.getOrderStatus().equals("Pending")) {
                    laundryPendingRequestCount += 1;
                }
            }

            customerTxt.setText(String.valueOf(customerCount));
            vehicleContractorTxt.setText(String.valueOf(vehicleContractorCount));
            poolInchargeTxt.setText(String.valueOf(poolInchargeCount));
            gameInchargeTxt.setText(String.valueOf(gameInchargeCount));
            laundryManagerTxt.setText(String.valueOf(laundryManagerCount));
            janitorTxt.setText(String.valueOf(janitorCount));
            foodManagerTxt.setText(String.valueOf(foodManagerCount));
            shopManagerTxt.setText(String.valueOf(shopManagerCount));
            totalRevenueTxt.setText(String.valueOf(totalRevenue));
            totalRequestTxt.setText(String.valueOf(totalRequestCount));
            vehicleContractorTxt1.setText(String.valueOf(vehiclePendingRequestCount));
            poolInchargeTxt1.setText(String.valueOf(poolPendingRequestCount));
            gameInchargeTxt1.setText(String.valueOf(gamePendingRequestCount));
            laundryManagerTxt1.setText(String.valueOf(laundryPendingRequestCount));
            foodManagerTxt1.setText(String.valueOf(foodBevPendingRequestCount));

        } catch (Exception e) {

        }
    }
}
