package entities;

public abstract class Unit {
    protected int health;
    protected int movementRange;
    protected int attackPower;
    protected int attackRange;
    protected int goldCost;
    protected int foodCost;
    protected int unitSpace;

    public Unit(int health, int move, int atk, int atkRange, int gold, int food, int space) {
        this.health = health;
        this.movementRange = move;
        this.attackPower = atk;
        this.attackRange = atkRange;
        this.goldCost = gold;
        this.foodCost = food;
        this.unitSpace = space;
    }

    public abstract String getType();
}