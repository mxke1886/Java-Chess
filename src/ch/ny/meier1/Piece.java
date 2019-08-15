package ch.ny.meier1;

import java.util.HashMap;

public abstract class Piece {
	
	private String type;
	private String color;
	
	public Piece(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}

	public abstract boolean canMove(Coordinates position, Coordinates target, HashMap<Piece, Coordinates> positions);

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
