/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lynee
 */
public class Dashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Dashboard.class.getName());

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Titledashboard = new javax.swing.JLabel();
        LOGOUTBUTTON = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        CREATEBUTTON = new javax.swing.JButton();
        READBUTTON = new javax.swing.JButton();
        UPDATEBUTTON = new javax.swing.JButton();
        DELETEBUTTON = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchBUTTON = new javax.swing.JTextField();
        Searchname = new javax.swing.JLabel();
        SortButton = new javax.swing.JComboBox<>();
        sortname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scroll = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Titledashboard.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        Titledashboard.setForeground(new java.awt.Color(255, 102, 0));
        Titledashboard.setText("Saiyan Database");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(Titledashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(Titledashboard)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        LOGOUTBUTTON.setBackground(new java.awt.Color(255, 102, 0));
        LOGOUTBUTTON.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        LOGOUTBUTTON.setText("LOG OUT");
        LOGOUTBUTTON.addActionListener(this::LOGOUTBUTTONActionPerformed);
        jPanel2.add(LOGOUTBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 94, -1, -1));

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        CREATEBUTTON.setBackground(new java.awt.Color(255, 51, 0));
        CREATEBUTTON.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        CREATEBUTTON.setText("Create");
        CREATEBUTTON.addActionListener(this::CREATEBUTTONActionPerformed);

        READBUTTON.setBackground(new java.awt.Color(255, 51, 0));
        READBUTTON.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        READBUTTON.setText("Read");
        READBUTTON.addActionListener(this::READBUTTONActionPerformed);

        UPDATEBUTTON.setBackground(new java.awt.Color(255, 51, 0));
        UPDATEBUTTON.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        UPDATEBUTTON.setText("Update");
        UPDATEBUTTON.addActionListener(this::UPDATEBUTTONActionPerformed);

        DELETEBUTTON.setBackground(new java.awt.Color(255, 51, 0));
        DELETEBUTTON.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        DELETEBUTTON.setText("Delete");
        DELETEBUTTON.addActionListener(this::DELETEBUTTONActionPerformed);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Manage functions:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UPDATEBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CREATEBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DELETEBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(READBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CREATEBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(READBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UPDATEBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DELETEBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 349, -1, -1));

        searchBUTTON.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchBUTTON.addActionListener(this::searchBUTTONActionPerformed);
        jPanel2.add(searchBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 111, 203, -1));

        Searchname.setFont(new java.awt.Font("Showcard Gothic", 2, 14)); // NOI18N
        Searchname.setText("Search:");
        jPanel2.add(Searchname, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 113, -1, -1));

        SortButton.setEditable(true);
        SortButton.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        SortButton.setMaximumRowCount(5);
        SortButton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SortButton.setName("Power Level"); // NOI18N
        SortButton.addActionListener(this::SortButtonActionPerformed);
        jPanel2.add(SortButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 97, 111, -1));

        sortname.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        sortname.setText("Sort:");
        jPanel2.add(sortname, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, -1, -1));

        scroll.setBorder(new javax.swing.border.MatteBorder(null));
        scroll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "PowerLevel", "Transformation", "Universe"
            }
        ));
        jScrollPane1.setViewportView(scroll);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 138, 485, 405));

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void READBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_READBUTTONActionPerformed
        // TODO add your handling code here:
        
                                                
    javax.swing.JOptionPane.showMessageDialog(this, "READ CLICKED");

    }//GEN-LAST:event_READBUTTONActionPerformed

    private void DELETEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEBUTTONActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_DELETEBUTTONActionPerformed

    private void SortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SortButtonActionPerformed

    private void searchBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBUTTONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBUTTONActionPerformed

    private void LOGOUTBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTBUTTONActionPerformed
        // TODO add your handling code here:
      
     
    }//GEN-LAST:event_LOGOUTBUTTONActionPerformed

    private void CREATEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEBUTTONActionPerformed
        // TODO add your handling code here:
                                               
  

    }//GEN-LAST:event_CREATEBUTTONActionPerformed

    private void UPDATEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEBUTTONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UPDATEBUTTONActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Dashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CREATEBUTTON;
    private javax.swing.JButton DELETEBUTTON;
    private javax.swing.JButton LOGOUTBUTTON;
    private javax.swing.JButton READBUTTON;
    private javax.swing.JLabel Searchname;
    private javax.swing.JComboBox<String> SortButton;
    private javax.swing.JLabel Titledashboard;
    private javax.swing.JButton UPDATEBUTTON;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable scroll;
    private javax.swing.JTextField searchBUTTON;
    private javax.swing.JLabel sortname;
    // End of variables declaration//GEN-END:variables

}