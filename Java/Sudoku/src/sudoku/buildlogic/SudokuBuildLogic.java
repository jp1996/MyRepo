package sudoku.buildlogic;

import sudoku.problemdomain.SudokuGame;

import java.io.IOException;

import sudoku.computationlogic.GameLogic;
import sudoku.persistence.LocalStorageImpl;
import sudoku.problemdomain.IStorage;
import sudoku.userinterface.IUserInterfaceContract;
import sudoku.userinterface.logic.ControlLogic;

public class SudokuBuildLogic {

	public static void build(IUserInterfaceContract.View userInterface) throws IOException {
		SudokuGame initialState;
		IStorage storage = new LocalStorageImpl();
		
		
		
		try {
			initialState = storage.getGameData();
		} catch(IOException e) {
			initialState = GameLogic.getNewGame();
			storage.updateGameData(initialState);
		}
		
		
		IUserInterfaceContract.EventListener uiLogic = new ControlLogic(storage, userInterface);
		
		userInterface.setListerner(uiLogic);
		userInterface.updateBoard(initialState);
	}
}
