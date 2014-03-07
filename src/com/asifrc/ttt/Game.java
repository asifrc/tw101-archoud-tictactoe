package com.asifrc.ttt;

/**
 * Created by archoud on 3/6/14.
 */
public class Game {
    private Board board;
    private GameIO gameIO;
    private String[] player;
    private int turn;

    public Game(GameIO gameIO, Board board) {
        this.board = board;
        this.gameIO = gameIO;
        player = new String[2];
        player[0] = "X";
        player[1] = "O";
        turn = 0;
    }

    public void start() {
        displayBoard();
        nextTurn();
        nextTurn();
    }

    public void displayBoard() {
        gameIO.print(board.display());
    }

    public void nextTurn() {
        int id = getCurrentPlayerIndex();
        String playerName = "Player " + (id + 1);
        Integer choice = getPlayerChoice(playerName);
        while (choice < 1 || choice > 9) {
            gameIO.print("Invalid Number, try again. ");
            choice = getPlayerChoice(playerName);
        }
        board.mark(choice, player[id]);
        gameIO.print(board.display());

        turn++;
    }

    public Integer getPlayerChoice(String playerName) {
        //TODO: move into a Player class?
        gameIO.print(playerName + ", please enter a number from 1-9: ");
        String choiceText = gameIO.getInput();
        return Integer.parseInt(choiceText);
    }

    private int getCurrentPlayerIndex() {
        return (turn % player.length);
    }
}
