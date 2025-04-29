package entities;

public class Peasant extends Unit {
    public Peasant() {
        super(10, 2, 2, 1, 2, 1, 1);
    }

    @Override
    public String getType() {
        return "Peasant";
    }
}