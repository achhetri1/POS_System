/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

import possystem.menuitems.*;

/**
 *
 * @author tylar
 */
public class MenuCategoryPanel extends CustomPanel {

    MainFrame mainFrame;
    CustomerOrder customerOrder;
    String categoryName;

    public MenuCategoryPanel(MainFrame mainFrame, CustomerOrder customerOrder, String categoryName) {
        super();
        initComponents();
        this.mainFrame = mainFrame;
        this.customerOrder = customerOrder;
        this.categoryName = categoryName;

        this.CategoryNameLabel.setText(categoryName);

        setupSubCategories();
    }

    private void setupSubCategories() {
        MenuCategory category = this.mainFrame.getMenu().getMenuCategory(this.categoryName);

        for (MenuSubCategory subCategory : category.getSubCategories()) {
            this.SubCategoriesPanel.add(new MenuSubCategoryPanel(subCategory));
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

        HeaerPanel = new javax.swing.JPanel();
        CancelButton = new javax.swing.JButton();
        CategoryNameLabel = new javax.swing.JLabel();
        SubCategoriesPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        CategoryNameLabel.setText("Category Name");

        javax.swing.GroupLayout HeaerPanelLayout = new javax.swing.GroupLayout(HeaerPanel);
        HeaerPanel.setLayout(HeaerPanelLayout);
        HeaerPanelLayout.setHorizontalGroup(
            HeaerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CategoryNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 415, Short.MAX_VALUE)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeaerPanelLayout.setVerticalGroup(
            HeaerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoryNameLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(HeaerPanel, java.awt.BorderLayout.NORTH);

        SubCategoriesPanel.setLayout(new java.awt.GridLayout());
        add(SubCategoriesPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        mainFrame.setNewPanel(new NewOrderPanel(mainFrame, customerOrder), Boolean.FALSE, this);
    }//GEN-LAST:event_CancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel CategoryNameLabel;
    private javax.swing.JPanel HeaerPanel;
    private javax.swing.JPanel SubCategoriesPanel;
    // End of variables declaration//GEN-END:variables
}
