package chess;

import boardGame.Board;
import chess.pieces.Rook;
import chess.pieces.King;

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
	
	private void placeNewPiece(char column, int row, chessPiece piece) {
		board.placePiece(piece, new chessPosition(column, row).toPosition());
	}

	public void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.WHITE));
	}
}
