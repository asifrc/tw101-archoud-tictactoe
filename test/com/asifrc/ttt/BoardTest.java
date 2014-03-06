package com.asifrc.ttt;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by archoud on 3/6/14.
 */
public class BoardTest {
    Board board;

    @Before
    public void setUp() throws Exception {
        board = new Board();
    }

    @Test
    public void shouldPrintEmptyBoard() throws Exception {
        //GameIO mockGameIO = mock(GameIO.class);

        String expected = "   |   |   \n" +
                "---------\n" +
                "   |   |   \n" +
                "---------\n" +
                "   |   |   \n";
        String result = board.display();
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnSingleSpaceWhenCheckingEmptySquare() throws Exception {
        Integer pos = 1;
        String result = board.check(pos);
        assertEquals(" ",result);
    }
//    @Test
//    public void shouldSetAndGetASquaresMark() throws Exception {
//        Integer pos = 1;
//        String mark = "X";
//        board.mark(pos, mark);
//        String result = board.check(pos);
//        assertEquals(mark, result);
//    }
}
