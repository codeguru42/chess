/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
package chess;

import chess.pieces.Pawn;
import java.util.ArrayList;
import java.util.List;

public class Board {

    private int pawnCount = 0;
    private List<Pawn> pawns = new ArrayList<Pawn>();

    public int getPawnCount() {
        return this.pawnCount;
    }

    public void addPawn(Pawn pawn) {
        ++this.pawnCount;
        this.pawns.add(pawn);
    }

    public List<Pawn> getPawns() {
        return this.pawns;
    }

}
