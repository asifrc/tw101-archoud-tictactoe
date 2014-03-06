package com.asifrc.ttt;

import com.sun.deploy.util.StringUtils;

/**
 * Created by archoud on 3/6/14.
 */
public class Board {
    private GameIO gameIO;
    private String[][] marks = new String[3][3];
    private final String EMPTY = " ";

    public Board() {
        clear();
    }

    public void clear() {
        for (int row = 0; row < marks.length; row++) {
            String padding = "";
            for (int col = 0; col < marks.length; col++) {
                marks[row][col] = EMPTY;
            }
        }
    }


    public String display() {
        String boardString = "";
        String divider = "";
        for (int row = 0; row < marks.length; row++) {
            String padding = " ";
            boardString += divider;
            divider = "---------\n";
            for (int col = 0; col < marks.length; col++) {
                boardString += padding + marks[row][col];
                padding = " | ";
            }
            boardString += " \n";
        }
        return boardString;
    }
}
