package inventoryStuff.Items;

import gameUtilities.GameUtils;
import characterStuff.BaseCharacter;

public class Weapon extends InventoryItem {
    private double dmg;
    private double maxDmg;

    private float atkSpeed = 1f; // 1 (slow) - 20 (fast)
    private int bleed; // 1% - 5% per turn
    private int poison; // 
    private int def; // 
    private int hitPercent; // 1% - 99%
    private int weight; // 1 - any number

    private String weaponClass;

    public Weapon(String name, int inventorySize, String flavorText, int powerLevel, int maxDmg, String initialWeaponClass) throws InterruptedException {
        super(name, inventorySize, flavorText, powerLevel);
        this.maxDmg = maxDmg;

        updatePowerLevel(powerLevel);

        String[] weaponClassArray = initialWeaponClass.split("/");
        this.weaponClass = weaponClassArray[1];
        
        switch(weaponClassArray[0]) {
            // One handed category
            case "oneHanded" :
                // Types of one handed weapons
                switch (weaponClassArray[1]) {
                    case "katana":
                        break;
                    case "shortSword" :
                        break;
                    case "longSword" :
                        break;
                    case "axe" :
                        break;
                    case "sickle" :
                        break;
                    case "hammer" :
                        break;
                    case "club" :
                        break;
                    case "machete" :
                        break;
                    case "flail" :
                        break;
                }
                break;
            // Two handed category
            case "twoHanded" :
                // Types of two handed weapons
                switch (weaponClassArray[1]) {
                    case "claymore":
                        break;
                    case "greatAxe" :
                        break;
                    case "scythe" :
                        break; 
                    case "greatHammer" :
                        break;
                    case "halberd" :
                        break;
                    case "pike" :
                        break;
                    case "pitchfork" :
                        break;
                    case "mace" :
                        break;
                    case "staff" :
                        break;
                }
                break;
            // Fists category
            case "fists" :
                // Types of fist weapons
                switch (weaponClassArray[1]) {
                    case "brassKnuckles":
                        break;
                    case "spikedGlove" :
                        break;
                }
                break;
            default :
                System.out.println("you worded it wrong numbnuts");
                break;
        }
    }

    public void updatePowerLevel(int powerLevel) throws InterruptedException {
        // Checks if power level
        if (powerLevel < 0 || powerLevel > 1000) {
            GameUtils.slowType("Error: Invalid power level", 5);
        } else {
            // For every 100 power lvl, dmg goes up 10%
            for (int i = 0; i <= 10; i ++) {
                if ((int) powerLevel / 100 == i) {
                    dmg = maxDmg * i / 10;
                }
            }
        }
    }

    public void updateAtkSpeed(int newBaseAtkSpeed) {
        atkSpeed = newBaseAtkSpeed * BaseCharacter.getCharacterStats("dexterity");
    }

    public double getDmg() {
        return dmg;
    }

    public String getWeaponClass() {
        return weaponClass;
    }
}