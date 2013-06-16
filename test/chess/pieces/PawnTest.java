/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
package chess.pieces;

import org.junit.Assert;
import org.junit.Test;

public class PawnTest {

    @Test
    public void testCreate() {
        Pawn firstPawn = new Pawn(Pawn.WHITE);
        Assert.assertEquals(Pawn.WHITE, firstPawn.getColor());

        Pawn secondPawn = new Pawn(Pawn.BLACK);
        Assert.assertEquals(Pawn.BLACK, secondPawn.getColor());
    }

}
