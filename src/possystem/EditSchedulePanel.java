package possystem;

import java.awt.Font;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

/**
 *
 * @author tylar
 */
//panel to display all components when viewing 'edit schedule' options
public class EditSchedulePanel extends CustomPanel {

    //mainframe variable to access various variables needed for panel function
    private final MainFrame mainFrame;
    
    //calendar graphic displayed on the panel
    private final EditScheduleCalendar editScheduleCalendar;
    
    //array of shifts for the current month displayed
    private ArrayList<Shift> shifts;
    
    //allows for single selection of shifts displayed in text box
    private DefaultListModel shiftsListModel;
    
    //calendar to align various graphic elements with respect to date displayed
    private final Calendar calendar;
    
    public EditSchedulePanel(MainFrame mainFrame, Calendar calendar) throws IOException, FileNotFoundException, ClassNotFoundException {
        //basic variable initializations
        initComponents();
        this.mainFrame = mainFrame;
        setClockField(ClockLabel);
        this.calendar = calendar;
        this.editScheduleCalendar = new EditScheduleCalendar(mainFrame, calendar);
        
        //graphic element assignments
        CurrentUserLabel.setText("Welcome: " + mainFrame.getCurrentUser().getName());
        YearLabel.setText("" + getYear());
        DateLabel.setText(mainFrame.months[getMonth()]);
        
        //access all shifts for the currently displayed month and year
        this.shifts = mainFrame.getShifts(getMonth(), getYear());

        //add calendar graphic to designated area and set layout for ease of centering
        CalendarPanel.add(editScheduleCalendar);
        CalendarPanel.setLayout(new GridLayout(1,1));

        //7 columns for 7 days of the week
        daysOfWeekPanel.setLayout(new GridLayout(1, 7));
        //create labels for each day of week name
        for(int x=0; x<7; x++){
            JLabel label = new JLabel(mainFrame.daysOfWeek[x], SwingConstants.CENTER);
            label.setFont(new Font("Tahoma", 1, 18));
            daysOfWeekPanel.add(label);
        }
        
        updateInterface();
        setSpinners();
    }
    
    //updates shifts displayed upon various user interactions
    private void updateInterface() throws IOException, FileNotFoundException, ClassNotFoundException{
        
        shifts = mainFrame.getShifts(getMonth(), getYear());
        shiftsListModel = new DefaultListModel();
            for(int x=0; x<shifts.size(); x++){
                shiftsListModel.addElement(shifts.get(x).toString());
            }
        ShiftsList = new JList(shiftsListModel);
        ListScrollPane.setViewportView(ShiftsList);
        ShiftsList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        
        editScheduleCalendar.clearSelectedDays();
    }
    
    //sets various variables to enable smooth usage of the 'spinner' graphic elements determing shift times
    private void setSpinners() throws IOException, FileNotFoundException, ClassNotFoundException{
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 12, 1);
        StartHour.setModel(model);
        model = new SpinnerNumberModel(1, 1, 12, 1);
        EndHour.setModel(model);
        model = new SpinnerNumberModel(00, 00, 45, 15);
        StartMinute.setModel(model);
        model = new SpinnerNumberModel(00, 00, 45, 15);
        EndMinute.setModel(model);
        String[] array = {"AM", "PM"};
        SpinnerListModel model2 = new SpinnerListModel(array);
        StartPhase.setModel(model2);
        model2 = new SpinnerListModel(array);
        EndPhase.setModel(model2);
        model2 = new SpinnerListModel(mainFrame.getEmployeeNames());
        EmployeeSpinner.setModel(model2);
    }
    
    //various getters+setters
    private int getYear(){
        return calendar.get(Calendar.YEAR);
    }
    
    private int getMonth(){
        return calendar.get(Calendar.MONTH);
    }

    private void setTime(Date date){
        calendar.setTime(date);
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
        YearLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        ShiftInfoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ListScrollPane = new javax.swing.JScrollPane();
        ShiftsList = new javax.swing.JList<>();
        AddShiftPanel = new javax.swing.JPanel();
        AddShiftLabel = new javax.swing.JLabel();
        EmployeeSpinner = new javax.swing.JSpinner();
        EmployeeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        StartLabel = new javax.swing.JLabel();
        StartHour = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        StartMinute = new javax.swing.JSpinner();
        StartPhase = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        StartLabel2 = new javax.swing.JLabel();
        EndHour = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        EndMinute = new javax.swing.JSpinner();
        EndPhase = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        CalendarPanel = new javax.swing.JPanel();
        daysOfWeekPanel = new javax.swing.JPanel();
        CreateShiftButton = new javax.swing.JButton();
        DeleteShiftButton = new javax.swing.JButton();
        NextMonthButton = new javax.swing.JButton();
        PreviousMonthButton = new javax.swing.JButton();

        CurrentUserLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CurrentUserLabel.setText("Welcome: User's Name");

        ClockLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ClockLabel.setText("jTextField1");
        ClockLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClockLabelActionPerformed(evt);
            }
        });

        YearLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        YearLabel.setText("jLabel1");

        DateLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DateLabel.setText("jLabel1");

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Month's Shifts:");

        ShiftsList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ShiftsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListScrollPane.setViewportView(ShiftsList);

        AddShiftLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddShiftLabel.setText("To add shifts: fill in required info, select days applicable and hit submit");

        EmployeeSpinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        EmployeeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EmployeeLabel.setText("Employee:");

        StartLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StartLabel.setText("Start Time:");

        StartHour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText(":");

        StartMinute.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        StartPhase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StartLabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(StartHour, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StartMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(StartPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(StartLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StartHour)
                    .addComponent(StartPhase)
                    .addComponent(StartMinute)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        StartLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StartLabel2.setText("End Time");

        EndHour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText(":");

        EndMinute.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        EndPhase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EndHour)
                    .addComponent(StartLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(EndMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EndPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(StartLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EndPhase, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EndHour)
                    .addComponent(EndMinute)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        CalendarPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout CalendarPanelLayout = new javax.swing.GroupLayout(CalendarPanel);
        CalendarPanel.setLayout(CalendarPanelLayout);
        CalendarPanelLayout.setHorizontalGroup(
            CalendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        CalendarPanelLayout.setVerticalGroup(
            CalendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        daysOfWeekPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout daysOfWeekPanelLayout = new javax.swing.GroupLayout(daysOfWeekPanel);
        daysOfWeekPanel.setLayout(daysOfWeekPanelLayout);
        daysOfWeekPanelLayout.setHorizontalGroup(
            daysOfWeekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        daysOfWeekPanelLayout.setVerticalGroup(
            daysOfWeekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(daysOfWeekPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CalendarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(daysOfWeekPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CalendarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        CreateShiftButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CreateShiftButton.setText("Submit Shift");
        CreateShiftButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CreateShiftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateShiftButtonActionPerformed(evt);
            }
        });

        DeleteShiftButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteShiftButton.setText("Delete Selected Shift");
        DeleteShiftButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        DeleteShiftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteShiftButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddShiftPanelLayout = new javax.swing.GroupLayout(AddShiftPanel);
        AddShiftPanel.setLayout(AddShiftPanelLayout);
        AddShiftPanelLayout.setHorizontalGroup(
            AddShiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AddShiftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddShiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddShiftPanelLayout.createSequentialGroup()
                        .addGroup(AddShiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmployeeLabel)
                            .addComponent(EmployeeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AddShiftPanelLayout.createSequentialGroup()
                        .addComponent(AddShiftLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CreateShiftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(DeleteShiftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        AddShiftPanelLayout.setVerticalGroup(
            AddShiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddShiftPanelLayout.createSequentialGroup()
                .addGroup(AddShiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateShiftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddShiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddShiftLabel)
                        .addComponent(DeleteShiftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddShiftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddShiftPanelLayout.createSequentialGroup()
                        .addComponent(EmployeeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmployeeSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NextMonthButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NextMonthButton.setText("Next Month");
        NextMonthButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        NextMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextMonthButtonActionPerformed(evt);
            }
        });

        PreviousMonthButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PreviousMonthButton.setText("Previous Month");
        PreviousMonthButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PreviousMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousMonthButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShiftInfoPanelLayout = new javax.swing.GroupLayout(ShiftInfoPanel);
        ShiftInfoPanel.setLayout(ShiftInfoPanelLayout);
        ShiftInfoPanelLayout.setHorizontalGroup(
            ShiftInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShiftInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ShiftInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShiftInfoPanelLayout.createSequentialGroup()
                        .addComponent(PreviousMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NextMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(ListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddShiftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ShiftInfoPanelLayout.setVerticalGroup(
            ShiftInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShiftInfoPanelLayout.createSequentialGroup()
                .addGroup(ShiftInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PreviousMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
            .addComponent(AddShiftPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ShiftInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(YearLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CurrentUserLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClockLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CurrentUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShiftInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ClockLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClockLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClockLabelActionPerformed

    private void PreviousMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousMonthButtonActionPerformed
        //if leap year, feb has 29 days
        if(getYear()%4 == 0){
            mainFrame.daysPerMonth[1] = 29;
        }
        else{
            mainFrame.daysPerMonth[1] = 28;
        }
           
        //if going from Jan of year x to Dec of year x-1, set new year and month
        if(getMonth() == 0){ 
            setTime(new Date((getYear()-1901), 11, 1));
        }
        //else set to previous month
        else{
            setTime(new Date((getYear()-1900), getMonth()-1, 1));
        }
        
        //try catch statements for possible file reading errors
        try {
            shifts = mainFrame.getShifts(getMonth(), getYear());
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EditSchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }      
        try {
            mainFrame.setNewPanel(new EditSchedulePanel(mainFrame, calendar));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EditSchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_PreviousMonthButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        try {
            mainFrame.setNewPanel(new ManagerSettingsPanel(mainFrame));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EditSchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BackButtonActionPerformed

    private void NextMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextMonthButtonActionPerformed
        if(getYear()%4 == 0){
            mainFrame.daysPerMonth[1] = 29;
        }
        else{
            mainFrame.daysPerMonth[1] = 28;
        }
            
        if(getMonth() == 11){
            setTime(new Date((getYear()-1899), 0, 1));
        }
        else{
            setTime(new Date((getYear()-1900), getMonth()+1, 1));
        }
        try {
            shifts = mainFrame.getShifts(getMonth(), getYear());
        } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(EditSchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            mainFrame.setNewPanel(new EditSchedulePanel(mainFrame, calendar));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EditSchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NextMonthButtonActionPerformed

    private void CreateShiftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateShiftButtonActionPerformed
        try {
            Date startDate, endDate;
            if(StartPhase.getValue().toString().equals("PM")){
                if((Integer)StartHour.getValue() == 12){
                    startDate = new Date(Integer.parseInt(YearLabel.getText()) - 1900, getMonth(), 1, (Integer)StartHour.getValue(), (Integer)StartMinute.getValue(), 0);
                }
                else{
                    startDate = new Date(Integer.parseInt(YearLabel.getText()) - 1900, getMonth(), 1, (Integer)StartHour.getValue()+12, (Integer)StartMinute.getValue(), 0);
                }
            }
            else{
                if((Integer)StartHour.getValue() == 12){
                    startDate = new Date(Integer.parseInt(YearLabel.getText()) - 1900, getMonth(), 1, 0, (Integer)StartMinute.getValue(), 0);
                }
                else{
                    startDate = new Date(Integer.parseInt(YearLabel.getText()) - 1900, getMonth(), 1, (Integer)StartHour.getValue(), (Integer)StartMinute.getValue(), 0);
                }  
            }
            
            if(EndPhase.getValue().toString().equals("PM")){
                if((Integer)EndHour.getValue() == 12){
                    endDate = new Date(Integer.parseInt(YearLabel.getText()) - 1900, getMonth(), 1, (Integer)EndHour.getValue(), (Integer)EndMinute.getValue(), 0);
                }
                else{
                    endDate = new Date(Integer.parseInt(YearLabel.getText()) - 1900, getMonth(), 1, (Integer)EndHour.getValue()+12, (Integer)EndMinute.getValue(), 0);
                }              
            }
            
            else{
                if((Integer)EndHour.getValue() == 12){
                    endDate = new Date(Integer.parseInt(YearLabel.getText()) - 1900, getMonth(), 1, 0, (Integer)EndMinute.getValue(), 0);
                }
                else{
                    endDate = new Date(Integer.parseInt(YearLabel.getText()) - 1900, getMonth(), 1, (Integer)EndHour.getValue(), (Integer)EndMinute.getValue(), 0); 
                }        
            }           
            Employee employee = mainFrame.findEmployee((String)EmployeeSpinner.getValue());  
            ArrayList<Date> selectedDays = editScheduleCalendar.getSelectedDays();
            for(int x=0; x<selectedDays.size(); x++){
                startDate.setDate(selectedDays.get(x).getDate());
                endDate.setDate(selectedDays.get(x).getDate());
                mainFrame.addShift(new Shift(employee, startDate, endDate));
                
            }
            
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EditSchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            updateInterface();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EditSchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CreateShiftButtonActionPerformed

    private void DeleteShiftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteShiftButtonActionPerformed
        for(int x=0; x<shifts.size(); x++){
            if(shifts.get(x).toString().equals(ShiftsList.getSelectedValue())){
                try {
                    mainFrame.removeShift(shifts.get(x));
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(EditSchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            updateInterface();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EditSchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteShiftButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddShiftLabel;
    private javax.swing.JPanel AddShiftPanel;
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel CalendarPanel;
    private javax.swing.JTextField ClockLabel;
    private javax.swing.JButton CreateShiftButton;
    private javax.swing.JLabel CurrentUserLabel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JButton DeleteShiftButton;
    private javax.swing.JLabel EmployeeLabel;
    private javax.swing.JSpinner EmployeeSpinner;
    private javax.swing.JSpinner EndHour;
    private javax.swing.JSpinner EndMinute;
    private javax.swing.JSpinner EndPhase;
    private javax.swing.JScrollPane ListScrollPane;
    private javax.swing.JButton NextMonthButton;
    private javax.swing.JButton PreviousMonthButton;
    private javax.swing.JPanel ShiftInfoPanel;
    private javax.swing.JList<String> ShiftsList;
    private javax.swing.JSpinner StartHour;
    private javax.swing.JLabel StartLabel;
    private javax.swing.JLabel StartLabel2;
    private javax.swing.JSpinner StartMinute;
    private javax.swing.JSpinner StartPhase;
    private javax.swing.JLabel YearLabel;
    private javax.swing.JPanel daysOfWeekPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
