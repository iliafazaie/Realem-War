package entities;

import interfaces.Buildable;

public class EmptyBlock extends Block implements Buildable {
    @Override
    public String getType() {
        return "Empty";
    }

    @Override
    public boolean canBuildStructure() {
        return true;
    }
}