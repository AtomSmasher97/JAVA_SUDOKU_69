package com.example.java_sudoku_game.userInterface;

import com.example.java_sudoku_game.problemDomain.SudokuGame;

public interface IUserInterfaceContract  {
    interface EventListener {
        void  onSudokuInput(int x , int y, int input) ;
        void onDialogClick();

    }

    public interface View {
        void setListener(IUserInterfaceContract.EventListener listener);
        void updateSquare(int x, int y , int input);
        void updateBoard(SudokuGame game);
        void showDialog(String Message);
        void showError(String message);
    }
}
