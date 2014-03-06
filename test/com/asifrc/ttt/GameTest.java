package com.asifrc.ttt;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by archoud on 3/6/14.
 */
public class GameTest {
    Board mockedBoard;
    GameIO mockedGameIO;
    Game game;

    @Before
    public void setUp() throws Exception {
        mockedBoard = mock(Board.class);
        mockedGameIO = mock(GameIO.class);
        game = new Game(mockedGameIO, mockedBoard);
    }

    @Test
    public void shouldDisplayPromptTextForPlayerOne() throws Exception {
        game.nextTurn();
        String playerPrompt = "Player1, please enter a number from 1-9: ";
        verify(mockedGameIO).print(playerPrompt);
    }

    @Test
    public void shouldPromptForUserInput() throws Exception {
        game.nextTurn();
        verify(mockedGameIO).getInput();
    }

}
