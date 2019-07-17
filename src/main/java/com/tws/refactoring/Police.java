package com.tws.refactoring;

public class Police {

    private static final int MIN_ADULTHOOD_AGE = 18;

    public boolean isAdulthood(Driver driver) {
        return driver.getAge() >= MIN_ADULTHOOD_AGE;
    }
}
