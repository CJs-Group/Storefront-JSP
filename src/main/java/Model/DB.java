package Model;
import Model.Items.Unit;
import Model.Items.Item;

import java.util.ArrayList;
import java.util.List;

public class DB {
    public static List<Item> items = new ArrayList<>();
    public static List<Unit> units = new ArrayList<>();

    static {
        addItems();
    }

    public static void addItems() {
        items.add(new Item(1, "Router", "A device that forwards data packets between computer networks", null, "images/router.png"));
        items.add(new Item(2, "Switch", "A device that connects devices on a computer network by using packet switching to forward data to its destination", null, "images/switch.png"));
        items.add(new Item(3, "Doorbell", "A device that signals the presence of a visitor at a door", null, "images/doorbell.png"));
        items.add(new Item(4, "Security Camera", "A device that records video footage of a specific area", null, "images/security_camera.png"));
        items.add(new Item(5, "Smart Light", "A light bulb that can be controlled remotely", null, "images/smart_light.png"));
        items.add(new Item(6, "Smart Thermostat", "A device that controls the temperature of a building", null, "images/smart_thermostat.png"));
        items.add(new Item(7, "Smart Lock", "A lock that can be controlled remotely", null, "images/smart_lock.png"));
        items.add(new Item(8, "Smart TV", "A television set that is connected to the internet", null, "images/smart_tv.png"));
        items.add(new Item(9, "Baby Monitor", "A device that allows parents to monitor their baby remotely", null, "images/baby_monitor.png"));
        items.add(new Item(10, "Amazon Echo", "A smart speaker that can control other smart devices", null, "images/amazon_echo.png"));
        items.add(new Item(11, "Google Nest", "A smart speaker that can control other smart devices", null, "images/google_nest.png"));
        int i = 0;
        for (Item item : items) {
            for (int j = 0; j < 10; j++) {
                units.add(new Unit(i, item));
                i++;
            }
        }
    }
}