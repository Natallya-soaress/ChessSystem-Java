package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public abstract class chessPiece extends Piece{

	private Color color;

	public chessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		chessPiece p = (chessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
}
