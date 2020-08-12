package com.moduLearn.learn;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App
{
    public static void main( String[] args ) {
        Injector injector = Guice.createInjector(new AppModule());
        School school = injector.getInstance(School.class);
        school.print();
    }
}
