package inventoryStuff.Items;

public class InventoryItem {
    protected int inventorySize;
    protected int posInInventory;
    protected int powerLevel;

    protected String name;
    protected String flavorText;

    InventoryItem(String name, int inventorySize, String flavorText, int powerLevel) {
        this.inventorySize = inventorySize;
        this.name = name;
        this.flavorText = flavorText;
        this.powerLevel = powerLevel;
    }

    public void setInventorySize(int size) {
        this.inventorySize = size;
    }

    public int getInventorySize() {
        return inventorySize;
    }

    public void setPosInInventory(int pos) {
        this.posInInventory = pos;
    }

    public int getPosInInventory() {
        return posInInventory;
    }

    public String getName() {
        return name;
    }

    public String getFlavorText() {
        return flavorText;
    }
}
