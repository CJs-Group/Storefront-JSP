package Model;
import Model.Items.Unit;
import Model.Items.Item;
import Model.Items.Type;

import java.util.ArrayList;
import java.util.List;

public class DB {
    public static List<Item> items = new ArrayList<>();
    public static List<Unit> units = new ArrayList<>();

    static {
        addItems();
    }

    public static void addItems() {
        items.add(new Item(1, "Router", "A device that forwards data packets between computer networks", Type.Networking, "images/router.png"));
        items.add(new Item(2, "Switch", "A device that connects devices on a computer network by using packet switching to forward data to its destination", Type.Networking, "images/switch.png"));
        items.add(new Item(3, "Doorbell", "A device that signals the presence of a visitor at a door", Type.Security, "images/doorbell.png"));
        items.add(new Item(4, "Security Camera", "A device that records video footage of a specific area", Type.Security, "images/security_camera.png"));
        items.add(new Item(5, "Smart Light", "A light bulb that can be controlled remotely", Type.Smart_Home, "images/smart_light.png"));
        items.add(new Item(6, "Smart Thermostat", "A device that controls the temperature of a building", Type.Smart_Home, "images/smart_thermostat.png"));
        items.add(new Item(7, "Smart Lock", "A lock that can be controlled remotely", Type.Security, "images/smart_lock.png"));
        items.add(new Item(8, "Smart TV", "A television set that is connected to the internet", Type.Smart_Home, "images/smart_tv.png"));
        items.add(new Item(9, "Baby Monitor", "A device that allows parents to monitor their baby remotely", Type.Smart_Home, "images/baby_monitor.png"));
        items.add(new Item(10, "Amazon Echo", "A smart speaker that can control other smart devices", Type.Assistants, "images/amazon_echo.png"));
        items.add(new Item(11, "Google Nest", "A smart speaker that can control other smart devices", Type.Assistants, "images/google_nest.png"));
        int i = 0;
        for (Item item : items) {
            for (int j = 0; j < 10; j++) {
                units.add(new Unit(i, item));
                i++;
            }
        }
    }
}