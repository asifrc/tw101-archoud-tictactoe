package com.asifrc.ttt;

import com.sun.deploy.util.StringUtils;

/**
 * Created by archoud on 3/6/14.
 */
public class Board {
    private GameIO gameIO;
    private String[][] squares = new String[3][3];
    private final String EMPTY = " ";

    public Board() {
        clear();
    }

    public void clear() {
        for (int row = 0; row < squares.length; row++) {
            String padding = "";
            for (int col = 0; col < squares.length; col++) {
                squares[row][col] = EMPTY;
            }
        }
    }


    public String display() {
        String boardString = "";
        String divider = "";
        for (int row = 0; row < squares.length; row++) {
            String padding = " ";
            boardString += divider;
            divider = "---------\n";
            for (int col = 0; col < squares.length; col++) {
                boardString += padding + squares[row][col];
                padding = " | ";
            }
            boardString += " \n";
        }
        return boardString;
    }

    public String check(int position) {
        int pos = position - 1;
        int col = (int) Math.floor(pos/3);
        int row = pos % 3;
        return squares[row][col];
    }


    public void mark(Integer pos, String mark) {
    }
}
