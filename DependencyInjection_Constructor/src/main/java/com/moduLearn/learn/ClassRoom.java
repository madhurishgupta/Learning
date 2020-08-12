package com.moduLearn.learn;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ClassRoom {
    private Board board;
    private Benches benches;

    @Inject
    public ClassRoom(@Named("ClassRoom") Benches cBenches, Board cBoard) {
        this.benches = cBenches;
        this.board = cBoard;
    }
}
