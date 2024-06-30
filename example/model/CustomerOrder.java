package model;

import java.util.List;

public class CustomerOrder {
    List<MenuItems> selectedItems;
    float baseCost;
    float tax;
}

class PantryItem {

    String name;
    float currentInventoryLevel;
    float reorderLevel;

};