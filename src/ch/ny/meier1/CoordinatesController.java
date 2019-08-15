package ch.ny.meier1;

public class CoordinatesController {
	
	public boolean isMoveStraight(Coordinates position, Coordinates target) {
		
		if ((position.getX() < target.getX() && position.getY() == target.getY()) || (position.getX() > target.getX() && position.getY() == target.getY()) || (position.getX() == target.getX() && position.getY() > target.getY() || (position.getX() == target.getX() && position.getY() < target.getY()))) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean isMoveDiagonal(Coordinates position, Coordinates target) {
		
		if ((position.getX() < target.getX() && position.getY() > target.getY()) || (position.getX() > target.getX() && position.getY() < target.getY()) || (position.getX() < target.getX() && position.getY() < target.getY() || (position.getX() > target.getX() && position.getY() > target.getY()))) {
			return true;
		}else {
			return false;
		}
		
	}

}
