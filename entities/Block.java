package entities;

public abstract class Block {

	private boolean occupied;
	
	public Block() {
		this.occupied = false;
	}
	
	public boolean isOccupied(){
		return occupied;
	}
	
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	public abstract String getType();
	
}
