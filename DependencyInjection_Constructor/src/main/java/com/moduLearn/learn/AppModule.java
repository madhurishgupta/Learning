package com.moduLearn.learn;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Benches.class).annotatedWith(Names.named("ClassRoom")).to(ClassRoomBenches.class);
        bind(Benches.class).annotatedWith(Names.named("ComputerRoom")).to(ComputerRoomBenches.class);
    }
}
