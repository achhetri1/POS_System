/*
 * Here comes the text of your license
 * Each line should be prefixed with  *
 */
package possystem.menuitems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author dakingofcheckerz
 */
class MenuCategory {

    private String name;
    private Map<String, MenuSubCategory> subCategories;

    public MenuCategory(String name) {
        initialize(name);
    }

    public MenuCategory(Collection<MenuItem> initialItems, String name) {
        initialize(name);

        for (MenuItem menuItem : initialItems) {
            addMenuItem(menuItem);
        }
    }

    private void initialize(String name) {
        this.name = name;
        this.subCategories = new HashMap();
    }

    public void addMenuItem(MenuItem item) {
        String subCategory = item.getSubcategory();

        if (!subCategories.containsKey(subCategory)) {
            addSubCategory(subCategory);
        }

        subCategories.get(subCategory).addMenuItem(item);
    }

    private void addSubCategory(String name) {
        MenuSubCategory subCategory = new MenuSubCategory(name);
        this.subCategories.put(name, subCategory);
    }

}
