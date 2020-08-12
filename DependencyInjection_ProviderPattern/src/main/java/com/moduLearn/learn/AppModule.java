package com.moduLearn.learn;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() { }

    @Provides
    @Named("ClassRoom")
    public Benches provideClassRoomBenches() {
        return new ClassRoomBenches();
    }

    @Provides
    @Named("ComputerRoom")
    public Benches provideComputerRoomBenches() {
        return new ComputerRoomBenches();
    }

    @Provides
    public Board provideBoard() {
        return new Board();
    }

    @Provides
    public Computer provideComputer() {
        return new Computer();
    }

    @Provides
    public ClassRoom provideClassRoom(@Named("ClassRoom") Benches benches, Board board) {
        return new ClassRoom(benches, board);
    }

    @Provides
    public ComputerRoom provideComputerRoom(@Named("ComputerRoom") Benches benches, Computer computer) {
        return new ComputerRoom(benches, computer);
    }

    @Provides
    public School provideSchool(ClassRoom classRoom, ComputerRoom computerRoom) {
        return new School(classRoom, computerRoom);
    }
}