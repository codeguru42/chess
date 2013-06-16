/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
package chess;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

    @Test
    public void testCreate() {
        Board board = new Board();
        Assert.assertEquals(0, board.getPawnCount());
    }

    @Test
    public void testAddPawn() {
        Board board = new Board();
        Pawn pawn = new Pawn(Pawn.WHITE);

        List<Pawn> pawns = board.getPawns();
        Assert.assertEquals(0, pawns.size());

        board.addPawn(pawn);
        Assert.assertEquals(1, board.getPawnCount());
        Assert.assertEquals(1, pawns.size());
        Assert.assertEquals(pawn, pawns.get(0));

        Pawn secondPawn = new Pawn(Pawn.BLACK);
        board.addPawn(secondPawn);
        Assert.assertEquals(2, board.getPawnCount());
        Assert.assertEquals(2, pawns.size());
        Assert.assertEquals(pawn, pawns.get(0));
        Assert.assertEquals(secondPawn, pawns.get(1));
    }

}
