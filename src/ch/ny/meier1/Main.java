package ch.ny.meier1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Chessboard chessboard = new Chessboard();
		boolean inputIsValid = false;
		chessboard.start();
		
		
		
		Coordinates cQue = new Coordinates();
		Coordinates cTow = new Coordinates();
		Coordinates cPaw = new Coordinates();
		
		Piece[][] p = chessboard.getBoard();
		
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				if (p[i][j] != null) {
					if (p[i][j].getType() == "q") {
						cQue.setX(i);
						cQue.setY(j);
					}else if (p[i][j].getType() == "t") {
						cTow.setX(i);
						cTow.setY(j);
					}else if (p[i][j].getType() == "p") {
						cPaw.setX(i);
						cPaw.setY(j);
					}
				}
			}
		}
		
		while (!inputIsValid) {
			System.out.println("The pieces are on following positions: \n");
			System.out.println("Queen: " + cQue.getX() + " " + cQue.getY());
			System.out.println("Tower: " + cTow.getX() + " " + cTow.getY());
			System.out.println("Pawn: " + cPaw.getX() + " " + cPaw.getY());
			
			System.out.println("\nWhich piece do you want to move? [Q], [T] or [P]");
			String pieceToMove = s.nextLine();
			if (!pieceToMove.equalsIgnoreCase("q") && !pieceToMove.equalsIgnoreCase("t") && !pieceToMove.equalsIgnoreCase("p")) {
				System.out.println("Input is invalid!");
			}else {
				inputIsValid = true;
			}
		}
		
		System.out.println("Where do you want to move the piece? Must be 'x y'(f.e. '3 5')");
		String targetcoords = s.nextLine();
		String[] tc = targetcoords.split(" ");
		Coordinates target = new Coordinates();
		
		target.setX(Integer.parseInt(tc[0]));
		target.setY(Integer.parseInt(tc[1]));
		
		
		
		
	}

}
