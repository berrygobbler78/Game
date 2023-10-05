package characterStuff;

import gameUtilities.exceptions.InvalidPointAllocationException;

public class BaseCharacter {
    protected char gender;

    // Max of 15 points in each category, 75 total
        // Strength affects dmg and reduces damage taken
    protected static int strength;
    protected static int endurance;
        // Dexterity increases attack speed (100% - 200% total) and dodge chance
    protected static int dexterity;
    protected static int intelligence;
    protected static int charisma;
    
    protected String name;

    BaseCharacter(String name, char gender, int strength, int endurance, int dexterity, int intelligence, int charisma) throws InvalidPointAllocationException {
        this.name = name;
        if(strength + endurance + dexterity + intelligence + charisma >= 20) {
            throw new InvalidPointAllocationException("You entered too many points, try again");
        }

        switch (gender) {
            case 'm':
                this.strength = strength + 2;
                this.dexterity = dexterity;
                break;
            case 'f' :
                this.dexterity = dexterity +2;
                this.strength = strength;
                break;
            default:
                break;
        }

        this.endurance = endurance;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }

    public static int getCharacterStats(String statType) {
        switch(statType) {
            case "strength" : 
                return strength;
            case "endurance" :
                return endurance;
            case "dexterity" :
                return dexterity;
            case "intelligence" :
                return intelligence;
            case "charisma" :
                return charisma;
            default :
                return (Integer) null;
        }
    }
}