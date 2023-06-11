module com.example.java_sudoku_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_sudoku_game to javafx.fxml, javafx.graphics;
    exports com.example.java_sudoku_game;
    exports com.example.java_sudoku_game.userInterface;
    opens com.example.java_sudoku_game.userInterface to javafx.fxml, javafx.graphics;

}