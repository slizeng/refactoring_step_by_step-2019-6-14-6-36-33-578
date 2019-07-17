package com.tws.refactoring;

import static java.util.Objects.nonNull;

public class Police {

    private static final int MIN_ADULTHOOD_AGE = 18;

    public boolean isAdulthood(Driver driver) {
        return nonNull(driver) && driver.getAge() >= MIN_ADULTHOOD_AGE;
    }
}
