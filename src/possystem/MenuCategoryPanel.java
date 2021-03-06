package possystem;

import possystem.menuitems.*;

/**
 *
 * @author Glenn
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
            this.SubCategoriesPanel.add(new MenuSubCategoryPanel(subCategory, mainFrame, customerOrder, this));
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

        HeaderPanel = new javax.swing.JPanel();
        CancelButton = new javax.swing.JButton();
        CategoryNameLabel = new javax.swing.JLabel();
        SubCategoriesPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        CancelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        CategoryNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CategoryNameLabel.setText("Category Name");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CategoryNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 433, Short.MAX_VALUE)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoryNameLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(HeaderPanel, java.awt.BorderLayout.NORTH);

        SubCategoriesPanel.setLayout(new java.awt.GridLayout(1, 0));
        add(SubCategoriesPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        mainFrame.setNewPanel(new NewOrderPanel(mainFrame, customerOrder));
    }//GEN-LAST:event_CancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel CategoryNameLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel SubCategoriesPanel;
    // End of variables declaration//GEN-END:variables
}
