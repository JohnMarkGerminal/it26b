/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {
    ArrayList<String[]> saiyans = new ArrayList<>();
    TableRowSorter<DefaultTableModel> sorter;
    DefaultTableModel model;
    
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Dashboard.class.getName());

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
    initComponents();
    setLocationRelativeTo(null);

    model = (DefaultTableModel) scroll.getModel();

    model.setRowCount(0);
    sorter = new TableRowSorter<>(model);
    scroll.setRowSorter(sorter);

    // 🔥 LOAD FILE DATA
    saiyans = SaiyanManager.loadAll();

    for (String[] s : saiyans) {
        model.addRow(s);
    }
}

    
    private String encrypt(String text, int shift) {
    StringBuilder sb = new StringBuilder();

    for (char c : text.toCharArray()) {
        sb.append((char)(c + shift));
    }

    return sb.toString();
}

private String decrypt(String text, int shift) {
    StringBuilder sb = new StringBuilder();

    for (char c : text.toCharArray()) {
        sb.append((char)(c - shift));
    }

    return sb.toString();
}

private void saveToFile() {
    try (java.io.PrintWriter pw =
         new java.io.PrintWriter(new java.io.FileWriter("saiyan_data.txt"))) {

        for (int i = 0; i < model.getRowCount(); i++) {

            String line =
                    model.getValueAt(i, 0) + "," +
                    model.getValueAt(i, 1) + "," +
                    model.getValueAt(i, 2) + "," +
                    model.getValueAt(i, 3);

            pw.println(encrypt(line, 3));
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Error saving file!");
    }
}

private void loadFromFile() {
    try (java.io.BufferedReader br =
         new java.io.BufferedReader(new java.io.FileReader("saiyan_data.txt"))) {

        model.setRowCount(0);

        String line;

        while ((line = br.readLine()) != null) {

            String decrypted = decrypt(line, 3);
            String[] data = decrypted.split(",");

            model.addRow(data);
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Error loading file!");
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        Titledashboard = new javax.swing.JLabel();
        LOGOUTBUTTON = new javax.swing.JButton();
        searchBUTTON = new javax.swing.JTextField();
        Searchname = new javax.swing.JLabel();
        SortButton = new javax.swing.JComboBox<>();
        sortname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scroll = new javax.swing.JTable();
        CREATEBUTTON = new javax.swing.JButton();
        READBUTTON = new javax.swing.JButton();
        DELETEBUTTON = new javax.swing.JButton();
        UPDATEBUTTON = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        LOGO.setIcon(new javax.swing.ImageIcon("C:\\Users\\lynee\\Downloads\\Dragon-Ball-Z-Logo-P (1).jpg")); // NOI18N

        Titledashboard.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        Titledashboard.setForeground(new java.awt.Color(255, 102, 0));
        Titledashboard.setText("Saiyan Database");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(Titledashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Titledashboard)
                    .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 990, -1));

        LOGOUTBUTTON.setBackground(new java.awt.Color(255, 51, 0));
        LOGOUTBUTTON.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        LOGOUTBUTTON.setText("LOG OUT");
        LOGOUTBUTTON.addActionListener(this::LOGOUTBUTTONActionPerformed);
        jPanel2.add(LOGOUTBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 200, 40));

        searchBUTTON.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchBUTTON.addActionListener(this::searchBUTTONActionPerformed);
        jPanel2.add(searchBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 203, -1));

        Searchname.setBackground(new java.awt.Color(255, 51, 0));
        Searchname.setFont(new java.awt.Font("Showcard Gothic", 2, 14)); // NOI18N
        Searchname.setText("Search:");
        jPanel2.add(Searchname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        SortButton.setEditable(true);
        SortButton.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        SortButton.setMaximumRowCount(5);
        SortButton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Power", "Transform", "Universe" }));
        SortButton.setName("Power Level"); // NOI18N
        SortButton.addActionListener(this::SortButtonActionPerformed);
        jPanel2.add(SortButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 111, -1));

        sortname.setFont(new java.awt.Font("Showcard Gothic", 2, 12)); // NOI18N
        sortname.setText("Sort:");
        jPanel2.add(sortname, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 116, -1, 20));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 485, 230));

        CREATEBUTTON.setBackground(new java.awt.Color(255, 51, 0));
        CREATEBUTTON.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        CREATEBUTTON.setText("Create");
        CREATEBUTTON.addActionListener(this::CREATEBUTTONActionPerformed);
        jPanel2.add(CREATEBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 200, 40));

        READBUTTON.setBackground(new java.awt.Color(255, 51, 0));
        READBUTTON.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        READBUTTON.setText("Read");
        READBUTTON.addActionListener(this::READBUTTONActionPerformed);
        jPanel2.add(READBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 200, 40));

        DELETEBUTTON.setBackground(new java.awt.Color(255, 51, 0));
        DELETEBUTTON.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        DELETEBUTTON.setText("Delete");
        DELETEBUTTON.addActionListener(this::DELETEBUTTONActionPerformed);
        jPanel2.add(DELETEBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 200, 40));

        UPDATEBUTTON.setBackground(new java.awt.Color(255, 51, 0));
        UPDATEBUTTON.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        UPDATEBUTTON.setText("Update");
        UPDATEBUTTON.addActionListener(this::UPDATEBUTTONActionPerformed);
        jPanel2.add(UPDATEBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 200, 40));

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

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

    private void SortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortButtonActionPerformed
        // TODO add your handling code here:     
     String selected = SortButton.getSelectedItem().toString();

    List<RowSorter.SortKey> sortKeys = new ArrayList<>();

    switch (selected) {

        case "Name":
            sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            break;

        case "Power":
            sortKeys.add(new RowSorter.SortKey(1, SortOrder.DESCENDING));
            break;

        case "Transform":
            sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
            break;

        case "Universe":
            sortKeys.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
            break;
    }

    sorter.setSortKeys(sortKeys);
    sorter.sort();
    }//GEN-LAST:event_SortButtonActionPerformed

    private void searchBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBUTTONActionPerformed
        // TODO add your handling code here:
        String search = searchBUTTON.getText().toLowerCase();

    javax.swing.table.TableRowSorter<DefaultTableModel> sorter =
            (javax.swing.table.TableRowSorter<DefaultTableModel>) scroll.getRowSorter();

    if (sorter == null) {
        sorter = new javax.swing.table.TableRowSorter<>(model);
        scroll.setRowSorter(sorter);
    }

    for (int i = 0; i < model.getRowCount(); i++) {

        String name = model.getValueAt(i, 0).toString().toLowerCase();

        if (name.contains(search)) {

            int viewRow = scroll.convertRowIndexToView(i);
            scroll.setRowSelectionInterval(viewRow, viewRow);
            return;
        }
    }

    javax.swing.JOptionPane.showMessageDialog(this, "No match found!");

    }//GEN-LAST:event_searchBUTTONActionPerformed

    private void LOGOUTBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTBUTTONActionPerformed
        // TODO add your handling code here:
        int confirm = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to logout?",
            "Logout",
            javax.swing.JOptionPane.YES_NO_OPTION
    );

    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        new LOGIN().setVisible(true);
        this.dispose();
    }

     
    }//GEN-LAST:event_LOGOUTBUTTONActionPerformed

    private void DELETEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEBUTTONActionPerformed
        // TODO add your handling code here:
    int row = scroll.getSelectedRow();

    if (row == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Select a row first!");
        return;
    }

    saiyans.remove(row);
    model.removeRow(row);

    SaiyanManager.saveAll(saiyans);

    javax.swing.JOptionPane.showMessageDialog(this, "Deleted & Saved!");


    }//GEN-LAST:event_DELETEBUTTONActionPerformed

    private void UPDATEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEBUTTONActionPerformed
        // TODO add your handling code here:
    int row = scroll.getSelectedRow();

    if (row == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Select a row!");
        return;
    }

    String name = javax.swing.JOptionPane.showInputDialog(this, "New Name:", saiyans.get(row)[0]);
    String power = javax.swing.JOptionPane.showInputDialog(this, "New Power:", saiyans.get(row)[1]);
    String transform = javax.swing.JOptionPane.showInputDialog(this, "New Transformation:", saiyans.get(row)[2]);
    String universe = javax.swing.JOptionPane.showInputDialog(this, "New Universe:", saiyans.get(row)[3]);

    String[] updated = {name, power, transform, universe};

    saiyans.set(row, updated);
    model.setValueAt(name, row, 0);
    model.setValueAt(power, row, 1);
    model.setValueAt(transform, row, 2);
    model.setValueAt(universe, row, 3);

    SaiyanManager.saveAll(saiyans);

    javax.swing.JOptionPane.showMessageDialog(this, "Updated & Saved!");
    }//GEN-LAST:event_UPDATEBUTTONActionPerformed

    private void READBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_READBUTTONActionPerformed
        // TODO add your handling code here:
    int row = scroll.getSelectedRow();

    if (row == -1) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Please select a Saiyan first!");
        return;
    }

    String[] s = saiyans.get(row);

    String message =
            "🔥 SAIYAN DETAILS 🔥\n"
          + "Name: " + s[0] + "\n"
          + "Power Level: " + s[1] + "\n"
          + "Transformation: " + s[2] + "\n"
          + "Universe: " + s[3];

    javax.swing.JOptionPane.showMessageDialog(this, message);
    }//GEN-LAST:event_READBUTTONActionPerformed

    private void CREATEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEBUTTONActionPerformed
        // TODO add your handling code here:
        
        
    String name = javax.swing.JOptionPane.showInputDialog(this, "Enter Name:");
    String power = javax.swing.JOptionPane.showInputDialog(this, "Enter Power Level:");
    String transform = javax.swing.JOptionPane.showInputDialog(this, "Enter Transformation:");
    String universe = javax.swing.JOptionPane.showInputDialog(this, "Enter Universe:");

    if (name == null || power == null || transform == null || universe == null) return;

    String[] newSaiyan = {name, power, transform, universe};

    saiyans.add(newSaiyan);
    model.addRow(newSaiyan);

    SaiyanManager.saveAll(saiyans);

    javax.swing.JOptionPane.showMessageDialog(this, "Saiyan Added & Saved!");



    }//GEN-LAST:event_CREATEBUTTONActionPerformed

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
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton LOGOUTBUTTON;
    private javax.swing.JButton READBUTTON;
    private javax.swing.JLabel Searchname;
    private javax.swing.JComboBox<String> SortButton;
    private javax.swing.JLabel Titledashboard;
    private javax.swing.JButton UPDATEBUTTON;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable scroll;
    private javax.swing.JTextField searchBUTTON;
    private javax.swing.JLabel sortname;
    // End of variables declaration//GEN-END:variables

}