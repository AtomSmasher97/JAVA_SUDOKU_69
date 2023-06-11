package com.example.java_sudoku_game.problemDomain;

import java.io.IOException;

public interface IStorage {

    void updateGameData(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws IOException;

}
