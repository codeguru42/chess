/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
package chess.pieces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PawnTest {

    private Pawn whitePawn;
    private Pawn blackPawn;

    @Before
    public void setUp() {
        this.whitePawn = new Pawn(Pawn.WHITE);
        this.blackPawn = new Pawn(Pawn.BLACK);
    }

    @Test
    public void testCreate() {
        Assert.assertEquals(Pawn.WHITE, this.whitePawn.getColor());
        Assert.assertEquals(Pawn.BLACK, this.blackPawn.getColor());
    }

    @Test
    public void testToString() {
        Assert.assertEquals("p", this.whitePawn.toString());
        Assert.assertEquals("P", this.blackPawn.toString());
    }

}
