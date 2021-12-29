package application;

import java.util.Scanner;

import chess.chessMatch;
import chess.chessPiece;
import chess.chessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		chessMatch chessMatch = new chessMatch();
		
		while(true) {
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.println("Source: ");
		chessPosition source = UI.readChessPosition(s);
		
		System.out.println();
		System.out.println("Target: ");
		chessPosition target = UI.readChessPosition(s);
		
		chessPiece capturedPiece = chessMatch.performChessMove(source,target);
		
		}
	}

}
