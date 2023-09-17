package com.hillel.homework21.calculator;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
    @DataProvider(name = "intProvider")
    public Object[][] createData() {
        return new Object[][]{
                new Object[]{7, 13, 20},
                new Object[]{12, 15, 27}
        };
    }
}