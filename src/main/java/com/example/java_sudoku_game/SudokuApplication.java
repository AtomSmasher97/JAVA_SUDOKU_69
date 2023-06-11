package com.example.java_sudoku_game;

import com.example.java_sudoku_game.buildLogic.SudokuBuildLogic;
import com.example.java_sudoku_game.userInterface.IUserInterfaceContract;
import com.example.java_sudoku_game.userInterface.UserInterfaceImpl;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;


public class SudokuApplication extends Application {
    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws IOException {
        //Get SudokuGame object for a new game
        uiImpl = new UserInterfaceImpl(primaryStage);

        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}