package com.example.java_sudoku_game.userInterface;

import javafx.scene.control.TextField;

public class SudokuTextFiled extends TextField {

    public final int x;
    public final int y;

    public SudokuTextFiled(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;

    }
    @Override
public void replaceText(int i, int i1, String s) {
        if (!s.matches("[0-9]")){
            super.replaceText(i, i1, s);
        }
}
@Override
    public void replaceSelection (String s) {
        if (!s.matches("[0-9]")){
            super.replaceSelection(s);
        }
}

}
