package com.asifrc.ttt;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by archoud on 3/6/14.
 */
public class GameTest {
    @Test
    public void shouldPromptForPlayerOne() throws Exception {
        Board mockedBoard = mock(Board.class);
        GameIO mockedGameIO = mock(GameIO.class);
        Game game = new Game(mockedGameIO, mockedBoard);
        game.nextTurn();
        String playerPrompt = "Player1, please enter a number from 1-9: ";
        verify(mockedGameIO).print(playerPrompt);
    }
}
