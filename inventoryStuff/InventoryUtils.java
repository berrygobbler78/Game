package inventoryStuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gameUtilities.*;
import inventoryStuff.Items.InventoryItem;

public class InventoryUtils {
    
    public static List<InventoryItem> inventory = new ArrayList<>();

    private static int maxInventorySize = 20;
    private static int currentInventorySize = 0;

    private InventoryUtils() {
        throw new IllegalStateException("Util class");
    }

    public static void addToInventory(InventoryItem item) throws InterruptedException {
        // Check if item fits in inventory
        if((currentInventorySize + item.getInventorySize()) > maxInventorySize) {
            // TODO - Show player can't fit item in inventory
        } else {
        inventory.add(item);
        currentInventorySize = currentInventorySize + item.getInventorySize();

        System.out.println(currentInventorySize);
        }
    }

    public static void removeFromInventory(InventoryItem item) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        boolean actionFufilled = false;

        while(actionFufilled == false) {
            GameUtils.slowType("Are you sure you want to discard this item?", 50);
            String response = scanner.nextLine();

            if(response.equals("yes")) {
                inventory.remove(item.getPosInInventory());

                actionFufilled = true;
            } else if (response.equals("no")) {
                GameUtils.slowType("The item will not be discarded", 50);

                actionFufilled = true;
            } else {
                GameUtils.slowType("That is not a valid answer, try again", 50);
            }
        } 

        scanner.close();
    }
}
