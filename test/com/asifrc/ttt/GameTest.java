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
        when(mockedGameIO.getInput()).thenReturn("1");
        game.getPlayerChoice();
        String playerPrompt = "Player1, please enter a number from 1-9: ";
        verify(mockedGameIO).print(playerPrompt);
    }

    @Test
    public void shouldPromptForUserInput() throws Exception {
        when(mockedGameIO.getInput()).thenReturn("1");
        game.nextTurn();
        verify(mockedGameIO).getInput();
    }

    @Test
    public void shouldPromptForValidInputWhenInvalidNumberProvided() throws Exception {
        when(mockedGameIO.getInput())
                .thenReturn("10")
                .thenReturn("1");
        game.nextTurn();
        //I'm testing for output instead of actual behavior. Should probably fix;
        verify(mockedGameIO, times(2)).print("Player1, please enter a number from 1-9: ");
        verify(mockedGameIO).print("Invalid Number, try again. ");
    }

    @Test
    public void shouldPromptUserInputOnlyOnceWhenValidInput() throws Exception {
        when(mockedGameIO.getInput()).thenReturn("1");
        game.nextTurn();
        //I'm testing for output instead of actual behavior. Should probably fix;
        verify(mockedGameIO, times(1)).print("Player1, please enter a number from 1-9: ");
    }

    @Test
    public void shouldMarkASquareWhenPlayerOnePicksASquare() throws Exception {
        when(mockedGameIO.getInput()).thenReturn("1");
        game.nextTurn();
        verify(mockedBoard).mark( anyInt(), anyString());
        verify(mockedBoard).display();
    }
}
