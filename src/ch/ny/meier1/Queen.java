package ch.ny.meier1;

import java.util.HashMap;

public class Queen extends Piece {
	
	public Queen(String type, String color) {
		super(type, color);
	}

	@Override
	public boolean canMove(Coordinates position, Coordinates target, HashMap<Piece, Coordinates> positions) {
		
		return false;
	}

}
