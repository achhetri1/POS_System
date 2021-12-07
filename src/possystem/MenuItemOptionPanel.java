/*
 * Here comes the text of your license
 * Each line should be prefixed with  *
 */
package possystem;

import java.util.ArrayList;
import java.util.List;
import possystem.menuitems.MenuItemOption;
import possystem.menuitems.MenuItemOptionValue;

/**
 *
 * @author dakingofcheckerz
 */
public class MenuItemOptionPanel extends javax.swing.JPanel {

    private final MenuItemOption option;
    private final int index; // Index of option in MenuItem option List
    private final ArrayList<OptionValueToggleButton> buttons;

    /**
     * Creates new form MenuItemOptionPanel
     *
     * @param option Option to add value to
     * @param index Index of Option in MenuItem option list
     * @param defaultValue Position of default selected value. Less than 0 means
     * no default.
     */
    public MenuItemOptionPanel(MenuItemOption option, int index, int defaultValue) {
        initComponents();

        this.option = option;
        this.index = index;
        this.buttons = new ArrayList();

        initialize(defaultValue);
    }

    private void initialize(int defaultValue) {
        OptionTitleLabel.setText(option.getName() + ": ");

        initializeOptionButtons(defaultValue);
    }

    private void initializeOptionButtons(int defaultValue) {
        List<MenuItemOptionValue> values = option.getPossibleValues();

        for (int i = 0; i < values.size(); i++) {
            MenuItemOptionValue value = values.get(i);

            OptionValueToggleButton button = new OptionValueToggleButton(value, i);

            this.add(button);
            this.OptionButtonGroup.add(button);
            this.buttons.add(button);

            button.setSize(69, 420);

            // If i is negative, i cannot equal defaltValue
            if (i == defaultValue) {
                button.setSelected(true);
            }
        }
    }

    public Integer getSelectedValueIndex() {
        Integer index = null;
        for (var button : buttons) {
            if (button.isSelected()) {
                index = button.getIndex();
                break;
            }
        }

        return index;
    }

    public boolean isSelected() {
        boolean isSelected = false;

        for (var button : buttons) {
            if (button.isSelected()) {
                isSelected = true;
                break;
            }
        }

        return isSelected;
    }

    public MenuItemOption getOption() {
        return this.option;
    }

    public ArrayList<OptionValueToggleButton> getButtons() {
        return this.buttons;
    }

    public int getIndex() {
        return this.index;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OptionButtonGroup = new javax.swing.ButtonGroup();
        OptionTitleLabel = new javax.swing.JLabel();

        setLayout(new java.awt.GridLayout(1, 0, 12, 12));

        OptionTitleLabel.setText("Option Title:");
        add(OptionTitleLabel);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup OptionButtonGroup;
    private javax.swing.JLabel OptionTitleLabel;
    // End of variables declaration//GEN-END:variables
}
