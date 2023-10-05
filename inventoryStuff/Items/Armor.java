package inventoryStuff.Items;

public class Armor extends InventoryItem{
    protected int protection;

    public Armor(String name, int inventorySize, String flavorText, int powerLevel) {
        super(name, inventorySize, flavorText, powerLevel);
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getProtection() {
        return protection;
    }
}
