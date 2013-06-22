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

    public static final String NEWLINE = System.getProperty("line.separator");

    private List<Pawn> secondRank = new ArrayList<Pawn>();
    private List<Pawn> seventhRank = new ArrayList<Pawn>();

    public Board() {
        this.initialize();
    }

    public void initialize() {
        for (int i = 0; i < 8; ++i) {
            this.secondRank.add(new Pawn(Pawn.WHITE));
            this.seventhRank.add(new Pawn(Pawn.BLACK));
        }
    }

    public int getPawnCount() {
        return secondRank.size() + seventhRank.size();
    }

    private void addEmptyRank(StringBuilder builder) {
        for (int i = 0; i < 8; ++i) {
            builder.append('.');
        }
        builder.append(NEWLINE);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        this.addEmptyRank(builder);

        for (int i = 0; i < 8; ++i) {
            builder.append(this.seventhRank.get(i).toString());
        }
        builder.append(NEWLINE);

        for (int i = 0; i < 4; ++i) {
            this.addEmptyRank(builder);
        }

        for (int i = 0; i < 8; ++i) {
            builder.append(this.secondRank.get(i).toString());
        }
        builder.append(NEWLINE);

        this.addEmptyRank(builder);

        return builder.toString();
    }

}
