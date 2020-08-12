package com.moduLearn.learn;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ComputerRoom {
    private Benches benches;
    private Computer computer;

    @Inject
    public ComputerRoom (@Named("ComputerRoom") Benches benches, Computer computer) {
        this.benches = benches;
        this.computer = computer;
    }
}
