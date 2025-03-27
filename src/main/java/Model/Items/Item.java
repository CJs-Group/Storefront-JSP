package Model.Items;

import java.util.List;
public class Item {
    public int ItemID;
    public List<Unit> units;
    public String name;
    public String description;
    public Enum type;
    public String imagePath;

    public Item(int ItemID, List<Unit> units, String name, String description, Enum type, String imagePath) {
        this.ItemID = ItemID;
        this.units = units;
        this.name = name;
        this.description = description;
        this.type = type;
        this.imagePath = imagePath;
    }

    public Item (int ItemID, String name, String description, Enum type, String imagePath) {
        this.ItemID = ItemID;
        this.name = name;
        this.description = description;
        this.type = type;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }
}