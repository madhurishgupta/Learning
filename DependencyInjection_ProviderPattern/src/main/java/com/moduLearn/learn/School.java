package com.moduLearn.learn;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class School {
    private ClassRoom classRoom;
    private ComputerRoom computerRoom;

    public void print() {
        System.out.println(classRoom);
        System.out.println(computerRoom);
    }
}
