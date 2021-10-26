/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author tylar
 */
public class OrderHistoryPanel extends CustomPanel {

    private MainFrame mainFrame;
    private ArrayList<CustomerOrder> customerOrders;
    private int selectedOrderIndex;
    
    public OrderHistoryPanel(MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
        this.customerOrders = mainFrame.getCustomerOrders();
        this.selectedOrderIndex = 0;
        
        displayOrders();
    }
    
    private void displayOrders(){
        for(int i =0; i<customerOrders.size(); i++){
            OrderHistoryTextArea.setText(OrderHistoryTextArea.getText() + 
                    customerOrders.get(i).toString() + "\n" + "\n" + "\n");
        }
        
        if(customerOrders.size() != 0){
            SelectedOrderTextArea.setText(customerOrders.get(selectedOrderIndex).toString());
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

        jTextField1 = new javax.swing.JTextField();
        OrderHistoryPanel = new javax.swing.JScrollPane();
        OrderHistoryTextArea = new javax.swing.JTextArea();
        BackButton = new javax.swing.JButton();
        OrdersLogLabel = new javax.swing.JLabel();
        SelectedOrderPane = new javax.swing.JScrollPane();
        SelectedOrderTextArea = new javax.swing.JTextArea();
        SelectedOrderLabel = new javax.swing.JLabel();
        PreviousOrderButton = new javax.swing.JButton();
        NextOrderButton = new javax.swing.JButton();
        EditOrderButton = new javax.swing.JButton();
        OrderIDInput = new javax.swing.JTextField();
        SearchByIDButton = new javax.swing.JButton();
        OrLabel = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        OrderHistoryTextArea.setColumns(20);
        OrderHistoryTextArea.setRows(5);
        OrderHistoryPanel.setViewportView(OrderHistoryTextArea);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        OrdersLogLabel.setText("Orders Log");

        SelectedOrderTextArea.setColumns(20);
        SelectedOrderTextArea.setRows(5);
        SelectedOrderPane.setViewportView(SelectedOrderTextArea);

        SelectedOrderLabel.setText("Selected Order");

        PreviousOrderButton.setText("Previous Order");
        PreviousOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousOrderButtonActionPerformed(evt);
            }
        });

        NextOrderButton.setText("NextOrder");
        NextOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextOrderButtonActionPerformed(evt);
            }
        });

        EditOrderButton.setText("Edit Order");
        EditOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditOrderButtonActionPerformed(evt);
            }
        });

        OrderIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIDInputActionPerformed(evt);
            }
        });

        SearchByIDButton.setText("Search by ID");
        SearchByIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByIDButtonActionPerformed(evt);
            }
        });

        OrLabel.setText("OR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SelectedOrderPane)
                                    .addComponent(EditOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OrderIDInput)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PreviousOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NextOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(SearchByIDButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(OrLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OrderHistoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(SelectedOrderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OrdersLogLabel)
                        .addGap(140, 140, 140))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OrdersLogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectedOrderLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(OrderHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OrderIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchByIDButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OrLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PreviousOrderButton)
                                    .addComponent(NextOrderButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SelectedOrderPane, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(BackButton)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        mainFrame.setNewPanel(new MainMenuPanel(mainFrame), Boolean.FALSE, this);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void PreviousOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousOrderButtonActionPerformed
        if(selectedOrderIndex > 0){
            selectedOrderIndex--;
            SelectedOrderTextArea.setText(customerOrders.get(selectedOrderIndex).toString());
        }
    }//GEN-LAST:event_PreviousOrderButtonActionPerformed

    private void OrderIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderIDInputActionPerformed

    private void NextOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextOrderButtonActionPerformed
        if(selectedOrderIndex < customerOrders.size()-1){
            selectedOrderIndex++;
            SelectedOrderTextArea.setText(customerOrders.get(selectedOrderIndex).toString());
        }
    }//GEN-LAST:event_NextOrderButtonActionPerformed

    private void EditOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditOrderButtonActionPerformed
        mainFrame.setNewPanel(new NewOrderPanel(mainFrame, customerOrders.get(selectedOrderIndex)), Boolean.FALSE, this);
    }//GEN-LAST:event_EditOrderButtonActionPerformed

    private void SearchByIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByIDButtonActionPerformed
        String orderID = OrderIDInput.getText();
        
        for(int i =0; i < customerOrders.size(); i++){
            if(customerOrders.get(i).getOrderID().toString().equals(orderID)){
                SelectedOrderTextArea.setText(customerOrders.get(i).toString());
                selectedOrderIndex = i;
                return;
            }
        }
    }//GEN-LAST:event_SearchByIDButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton EditOrderButton;
    private javax.swing.JButton NextOrderButton;
    private javax.swing.JLabel OrLabel;
    private javax.swing.JScrollPane OrderHistoryPanel;
    private javax.swing.JTextArea OrderHistoryTextArea;
    private javax.swing.JTextField OrderIDInput;
    private javax.swing.JLabel OrdersLogLabel;
    private javax.swing.JButton PreviousOrderButton;
    private javax.swing.JButton SearchByIDButton;
    private javax.swing.JLabel SelectedOrderLabel;
    private javax.swing.JScrollPane SelectedOrderPane;
    private javax.swing.JTextArea SelectedOrderTextArea;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}