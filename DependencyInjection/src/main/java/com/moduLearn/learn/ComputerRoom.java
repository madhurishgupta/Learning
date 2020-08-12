package com.moduLearn.learn;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ComputerRoom {
    @Inject
    @Named("ComputerRoom")
    private Benches benches;
    @Inject
    private Computer computer;
}
