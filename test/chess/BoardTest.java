/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
package chess;

import chess.pieces.Pawn;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {

    private Board board;

    @Before
    public void setUp() {
        this.board = new Board();
    }

    @Test
    public void testCreate() {
        Assert.assertEquals(0, this.board.getPawnCount());
    }

    @Test
    public void testAddPawn() {
        Pawn whitePawn = new Pawn(Pawn.WHITE);

        this.board.addPawn(whitePawn);
        Assert.assertEquals(1, this.board.getPawnCount());
        Assert.assertEquals(whitePawn, this.board.getPawn(0));

        Pawn blackPawn = new Pawn(Pawn.BLACK);
        this.board.addPawn(blackPawn);
        Assert.assertEquals(2, this.board.getPawnCount());
        Assert.assertEquals(whitePawn, this.board.getPawn(0));
        Assert.assertEquals(blackPawn, this.board.getPawn(1));
    }

}
