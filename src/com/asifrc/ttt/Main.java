package com.asifrc.ttt;

/**
 * Created by archoud on 3/6/14.
 */
public class Main {
    public static void main(String[] args) {
        new Game(new GameIO(), new Board()).start();
    }
}

