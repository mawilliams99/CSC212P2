package edu.smith.cs.csc212.p2;

public class fallingRock extends Rock{

	public fallingRock(World world) {
		super(world);
	}
	
	@Override
	public void step() {
		this.moveDown();
	}
	

}
