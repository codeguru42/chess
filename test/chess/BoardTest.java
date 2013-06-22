/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
package chess;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {

    private static final String INITIAL_BOARD_STRING = "........\nPPPPPPPP\n........\n........\n........\n........\npppppppp\n........\n";
    private Board board;

    @Before
    public void setUp() {
        this.board = new Board();
    }

    @Test
    public void testCreate() {
        Assert.assertEquals(16, this.board.getPawnCount());
        Assert.assertEquals(INITIAL_BOARD_STRING, this.board.toString());
    }

}
