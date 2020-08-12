package com.moduLearn.learn;

import com.google.inject.Inject;

public class School {
    @Inject
    private ClassRoom classRoom;
    @Inject
    private ComputerRoom computerRoom;

    public void print() {
        System.out.println(classRoom);
        System.out.println(computerRoom);
    }
}
