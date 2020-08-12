package com.moduLearn.learn;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ClassRoom {
    @Inject
    private Board board;
    @Inject
    @Named("ClassRoom")
    private Benches benches;
}
