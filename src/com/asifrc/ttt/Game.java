package com.asifrc.ttt;

/**
 * Created by archoud on 3/6/14.
 */
public class Game {
    private Board board;
    private GameIO gameIO;

    public Game(GameIO gameIO, Board board) {
        this.board = board;
        this.gameIO = gameIO;
    }

    public void start() {
        displayBoard();
        nextTurn();
    }

    public void displayBoard() {
        gameIO.print(board.display());
    }

    public void nextTurn() {
        Integer choice = getPlayerChoice();
        while (choice < 1 || choice > 9) {
            gameIO.print("Invalid Number, try again. ");
            choice = getPlayerChoice();
        }
        gameIO.print(board.display());
    }

    public Integer getPlayerChoice() {
        //TODO: move into a Player class?
        gameIO.print("Player1, please enter a number from 1-9: ");
        String choiceText = gameIO.getInput();
        return Integer.parseInt(choiceText);
    }
}
