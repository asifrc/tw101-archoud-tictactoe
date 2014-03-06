package com.asifrc.ttt;

import java.io.*;

/**
 * Created by archoud on 3/6/14.
 */
public class GameIO {
    public void print(String text) {
        System.out.println(text);
    }
    public String getInput() {
        String input = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            //input already assigned to ""
        }
        return input;
    }
}
