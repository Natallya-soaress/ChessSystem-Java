package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.Rook;

public class chessMatch {
	
	private Board board;
	
	public chessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public chessPiece[][] getPieces(){
		chessPiece[][] mat = new chessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (chessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

	public void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
	}
}
