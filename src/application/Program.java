package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.chessException;
import chess.chessMatch;
import chess.chessPiece;
import chess.chessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		chessMatch chessMatch = new chessMatch();
		List<chessPiece> captured = new ArrayList<>();
	
		
		while(!chessMatch.getCheckMate()) {
			try {
				UI.clearScreen();
				UI.printMatch(chessMatch, captured);
				System.out.println();
				System.out.println("Source: ");
				chessPosition source = UI.readChessPosition(s);
				
				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				
				System.out.println();
				System.out.println("Target: ");
				chessPosition target = UI.readChessPosition(s);
				
				chessPiece capturedPiece = chessMatch.performChessMove(source,target);
				
				if (capturedPiece != null) {
					captured.add(capturedPiece);
				}
			}
			catch(chessException e){
				System.out.println(e.getMessage());
				s.nextLine();
			}
			catch(InputMismatchException e){
				System.out.println(e.getMessage());
				s.nextLine();
			}
		}	
		UI.clearScreen();
		UI.printMatch(chessMatch, captured);
	}

}
