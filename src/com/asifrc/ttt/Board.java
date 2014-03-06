package com.asifrc.ttt;

/**
 * Created by archoud on 3/6/14.
 */
public class Board {
    private GameIO gameIO;

    public Board(GameIO gio) {
        this.gameIO = gio;
    }

    public void print() {
        String boardString = "   |   |\n" +
                "---------\n" +
                "   |   |\n" +
                "---------\n" +
                "   |   |\n";
        gameIO.print(boardString);
    }
}
