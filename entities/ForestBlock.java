package entities;

import interfaces.Buildable;

public class ForestBlock extends Block implements Buildable {
    @Override
    public String getType() {
        return "Forest";
    }

    @Override
    public boolean canBuildStructure() {
        return true; // but forest will be destroyed
    }
}