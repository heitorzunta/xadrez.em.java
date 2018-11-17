package application;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {
		for(int i =0; i<pieces.length; i++) {
				System.out.print((8-i) + "\t");
			for(int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("\ta\tb\tc\td\te\tf\tg\th\t");
	}

	private static void printPiece(ChessPiece piece) {
		
		if (piece == null)
			System.out.print("-");
		else
			System.out.println(piece);
		
		System.out.print("\t");
	}

}
