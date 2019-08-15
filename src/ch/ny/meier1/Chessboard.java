package ch.ny.meier1;

import java.util.HashMap;

public class Chessboard {
	
	private Piece[][] board = new Piece[8][8];
	private HashMap<Piece, Coordinates> positions = new HashMap<Piece, Coordinates>();
	
	//default color is black
	Queen q = new Queen("q", "black");
	Tower t = new Tower("t", "black");
	Pawn p = new Pawn("p", "black");	
	
	public Chessboard() {
		super();
	}
	
	public void start() {
		//create pieces and place them on the board
		
		board[2][0] = q;
		board[3][0] = t;
		board[4][0] = p;
		
		Coordinates qc = new Coordinates();
		qc.setX(2);
		qc.setY(0);
		positions.put(q, qc);
		
		Coordinates qt = new Coordinates();
		qc.setX(3);
		qc.setY(0);
		positions.put(t, qt);
		
		Coordinates qp = new Coordinates();
		qc.setX(4);
		qc.setY(0);
		positions.put(p, qp);
	}
	
	public void move(Piece p, Coordinates position, Coordinates target) {
		
		if (p.canMove(position, target, positions)) {
			int positionX = position.getX();
			int positionY = position.getY();
			
			int targetX = target.getX();
			int targetY = target.getX();
			
			board[targetX][targetY] = board[positionX][positionY];
			board[positionX][positionY] = null;
			
		}
		
	}

	public Piece[][] getBoard() {
		return board;
	}

	public void setBoard(Piece[][] board) {
		this.board = board;
	}

	public HashMap<Piece, Coordinates> getPositions() {
		return positions;
	}

	public void setPositions(HashMap<Piece, Coordinates> positions) {
		this.positions = positions;
	}

	public Queen getQ() {
		return q;
	}

	public void setQ(Queen q) {
		this.q = q;
	}

	public Tower getT() {
		return t;
	}

	public void setT(Tower t) {
		this.t = t;
	}

	public Pawn getP() {
		return p;
	}

	public void setP(Pawn p) {
		this.p = p;
	}
	
	
}
