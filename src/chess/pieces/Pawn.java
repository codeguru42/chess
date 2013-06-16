/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
package chess.pieces;

public class Pawn {

    private String color;
    public static final String BLACK = "black";
    public static final String WHITE = "white";

    public Pawn(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}
