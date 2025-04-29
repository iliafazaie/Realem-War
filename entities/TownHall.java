package entities;

public class TownHall extends Structure {
    private int goldPerTurn;
    private int foodPerTurn;
    private int unitSpace;

    public TownHall() {
        super(50, 0, 1);
        this.goldPerTurn = 5;
        this.foodPerTurn = 5;
        this.unitSpace = 5;
    }

    public int getGoldPerTurn() { return goldPerTurn; }
    public int getFoodPerTurn() { return foodPerTurn; }
    public int getUnitSpace() { return unitSpace; }

    @Override
    public String getStructureType() {
        return "TownHall";
    }
}