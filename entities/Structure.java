package entities;

import interfaces.Attackable;
import interfaces.Upgradeable;

public abstract class Structure implements Attackable, Upgradeable {
    protected int durability;
    protected int level;
    protected int maxLevel;
    protected int maintenanceCost;

    public Structure(int durability, int maintenanceCost, int maxLevel) {
        this.durability = durability;
        this.maintenanceCost = maintenanceCost;
        this.level = 1;
        this.maxLevel = maxLevel;
    }

    public int getDurability() {
        return durability;
    }

    public void takeDamage(int amount) {
        durability -= amount;
    }

    public int getMaintenanceCost() {
        return maintenanceCost;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void upgrade() {
        if (level < maxLevel) {
            level++;
            durability += 10;
        }
    }

    public abstract String getStructureType();
}