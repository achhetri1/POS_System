package possystem;

import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tylar
 */
public class MainMenuPanel extends CustomPanel {

    private final MainFrame mainFrame;
    
    public MainMenuPanel(MainFrame mainFrame) throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        this.mainFrame = mainFrame;
        setClockField(ClockLabel);
        CurrentUserLabel.setText("Welcome: " + mainFrame.getCurrentUser().getName());
        
        //set 2x2 grid layout for main menu menu buttons
        ButtonsPanel.setLayout(new GridLayout(2, 2));
        
        //enabling/disabling manager settings
        if(!mainFrame.getCurrentUser().isManager()){
            ManagerSettingsButton.setEnabled(false);
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

        CurrentUserLabel = new javax.swing.JLabel();
        ClockLabel = new javax.swing.JTextField();
        ButtonsPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        NewOrderButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        OrderHistoryButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ScheduleButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ManagerSettingsButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        CurrentUserLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CurrentUserLabel.setText("Welcome: User's Name");

        ClockLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ClockLabel.setText("jTextField1");
        ClockLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClockLabelActionPerformed(evt);
            }
        });

        ButtonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NewOrderButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NewOrderButton.setText("New Order");
        NewOrderButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        NewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        OrderHistoryButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OrderHistoryButton.setText("Order History");
        OrderHistoryButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        OrderHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderHistoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OrderHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OrderHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        ScheduleButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ScheduleButton.setText("Schedule / Clock-In-Out");
        ScheduleButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScheduleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScheduleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ManagerSettingsButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ManagerSettingsButton.setText("Manager Settings");
        ManagerSettingsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ManagerSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerSettingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ManagerSettingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ManagerSettingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        LogoutButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogoutButton.setText("Log Out");
        LogoutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CurrentUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LogoutButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CurrentUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    private void ScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleButtonActionPerformed
          
        //create calendar with current date
        Calendar calendar = Calendar.getInstance();
        //year returns 1900 over by function design
        //always set calendars to first day of month for display reasons
        calendar.setTime(new Date(calendar.get(Calendar.YEAR)-1900, calendar.get(Calendar.MONTH), 1));

        //try catch for possible file reading failures
        try {  
            mainFrame.setNewPanel(new ViewSchedulePanel(mainFrame, calendar));
        } 
       
        catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MainMenuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ScheduleButtonActionPerformed

    private void NewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewOrderButtonActionPerformed
        try {
            //create blank cutsomer order for customer info panel
            mainFrame.setNewPanel(new CustomerInfoPanel(mainFrame, new CustomerOrder("", "", "", false)));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MainMenuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NewOrderButtonActionPerformed

    private void ManagerSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerSettingsButtonActionPerformed

        try {
            mainFrame.setNewPanel(new ManagerSettingsPanel(mainFrame));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MainMenuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ManagerSettingsButtonActionPerformed

    private void ClockLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClockLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClockLabelActionPerformed

    private void OrderHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderHistoryButtonActionPerformed
        try {
            mainFrame.setNewPanel(new OrderHistoryPanel(mainFrame));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MainMenuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_OrderHistoryButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        mainFrame.setNewPanel(new LoginPanel(mainFrame));
    }//GEN-LAST:event_LogoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JTextField ClockLabel;
    private javax.swing.JLabel CurrentUserLabel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton ManagerSettingsButton;
    private javax.swing.JButton NewOrderButton;
    private javax.swing.JButton OrderHistoryButton;
    private javax.swing.JButton ScheduleButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
