package com.asifrc.ttt;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by archoud on 3/6/14.
 */
public class BoardTest {
    @Test
    public void shouldPrintEmptyBoard() throws Exception {
        GameIO mockGameIO = mock(GameIO.class);
        Board board = new Board(mockGameIO);
        board.print();
        String expected = "   |   |\n" +
                "---------\n" +
                "   |   |\n" +
                "---------\n" +
                "   |   |\n";
        verify(mockGameIO).print(expected);
    }
}
