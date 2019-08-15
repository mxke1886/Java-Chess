package ch.ny.meier1;

import java.util.HashMap;

public class Tower extends Piece {

	public Tower(String type, String color) {
		super(type, color);
	}

	@Override
	public boolean canMove(Coordinates position, Coordinates target, HashMap<Piece, Coordinates> positions) {
		// TODO Auto-generated method stub
		return false;
	}

}
