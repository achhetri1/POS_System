/*
 * Here comes the text of your license
 * Each line should be prefixed with  *
 */
package possystem.menuitems;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dakingofcheckerz
 */
public class OrderedMenuItem implements Serializable {

    private MenuItem menuItem;
    private List<Topping> toppings;
    private ArrayList<Integer> selectedOptions;

    public OrderedMenuItem(MenuItem menuItem) {
        initialize(menuItem);
    }

    public OrderedMenuItem(MenuItem menuItem, List<Topping> toppings) {
        initialize(menuItem);

        addToppings(toppings);
    }

    public void addToppings(List<Topping> toppings) {
        if (toppings != null) {
            for (Topping topping : toppings) {
                this.toppings.add(topping);
            }
        }
    }

    public OrderedMenuItem(MenuItem menuItem, List<Topping> toppings, ArrayList<Integer> selectedOptions) {
        initialize(menuItem);

        addToppings(toppings);

        this.selectedOptions = selectedOptions;
    }

    private void initialize(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.toppings = new ArrayList();
        this.selectedOptions = new ArrayList();
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(MenuItem topping) {
        this.toppings.remove(topping);
    }

    public void setSelectedOption(int option, int selectedOption) {
        this.selectedOptions.set(option, selectedOption);
    }

    public void setSelectedOption(MenuItemOption option, int selectedOption) {
        int optionIndex = this.menuItem.getOptions().indexOf(option);
        setSelectedOption(optionIndex, selectedOption);
    }

    public double getPrice() {
        double price = 0d;

        price += this.menuItem.getBasePrice();

        for (MenuItem topping : toppings) {
            price += topping.getBasePrice();
        }

        List<MenuItemOption> options = menuItem.getOptions();
        for (int i = 0; i < selectedOptions.size(); i++) {
            price += options.get(i).getPossibleValues().get(selectedOptions.get(i)).getPriceModifier();
        }
        
        return price;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("%-38s $%4.2f", menuItem.getName(), this.menuItem.getBasePrice()));

        for (int i = 0; i < menuItem.getOptions().size(); i++) {
            MenuItemOption option = menuItem.getOptions().get(i);
            MenuItemOptionValue value = option.getPossibleValues().get(selectedOptions.get(i));
            stringBuilder.append("\n      ")
                    .append(String.format("%-31s ", option.getName() + ": " + value.getValue()));

            if (value.getPriceModifier() < 0) {
                stringBuilder.append("-");
            } else {
                stringBuilder.append('+');
            }

            stringBuilder.append(String.format("$%4.2f", Math.abs(value.getPriceModifier())));

        }

        for (Topping topping : toppings) {
            stringBuilder.append("\n      ")
                    .append(String.format("%-32s $%4.2f", topping.getName() + " (" + topping.getCount() + ')', topping.getBasePrice()));
        }

        return stringBuilder.toString();
    }
}
