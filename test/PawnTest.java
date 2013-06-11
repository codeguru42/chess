/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
import org.junit.Assert;
import org.junit.Test;

public class PawnTest {

    @Test
    public void testCreate() {
        final String firstColor = "white";
        Pawn firstPawn = new Pawn(firstColor);
        Assert.assertEquals(firstColor, firstPawn.getColor());

        final String secondColor = "black";
        Pawn secondPawn = new Pawn(secondColor);
        Assert.assertEquals(secondColor, secondPawn.getColor());
    }

}
