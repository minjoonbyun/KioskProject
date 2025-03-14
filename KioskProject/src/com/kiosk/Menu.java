package com.kiosk;
import java.util.List;
import java.util.ArrayList;

public class Menu {
    List<MenuItem> menuItems;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
