package com.asifrc.ttt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by archoud on 3/6/14.
 */
public class BoardTest {
    @Test
    public void shouldPrintEmptyBoard() throws Exception {
        //GameIO mockGameIO = mock(GameIO.class);
        Board board = new Board();
        String expected = "   |   |   \n" +
                "---------\n" +
                "   |   |   \n" +
                "---------\n" +
                "   |   |   \n";
        String result = board.display();
        assertEquals(expected, result);
    }
}
