<<<<<<< HEAD
package sudoku.problemdomain;

import java.io.Serializable;

import sudoku.computationlogic.SudokuUtilities;
import sudoku.constants.GameState;

public class SudokuGame implements Serializable {
	private final GameState gameState;
	private final int[][] gridState;

	public static final int GRID_BOUNDARY = 9;

	public SudokuGame(GameState gameState, int[][] gridState) {
		this.gameState = gameState;
		this.gridState = gridState;
	}

	public GameState getGameState() {
		return gameState;
	}

	public int[][] getCopyOfGridState() {
		return SudokuUtilities.copyToNewArray(gridState);
	}

}
=======
package sudoku.problemdomain;

import java.io.Serializable;

import sudoku.computationlogic.SudokuUtilities;
import sudoku.constants.GameState;

public class SudokuGame implements Serializable {
	private final GameState gameState;
	private final int[][] gridState;

	public static final int GRID_BOUNDARY = 9;

	public SudokuGame(GameState gameState, int[][] gridState) {
		this.gameState = gameState;
		this.gridState = gridState;
	}

	public GameState getGameState() {
		return gameState;
	}

	public int[][] getCopyOfGridState() {
		return SudokuUtilities.copyToNewArray(gridState);
	}

}
>>>>>>> 02f4d956e9f78ec33fd415a036a6069acef98999