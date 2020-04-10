package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionTest {
    @ParameterizedTest
    @CsvSource({"'Increase current temperature under max temperature',-5,5,6,6",
            "'Increase current temperature over max temperature',-5,5,-5,-4"
    })
    void shouldIncreaseCurrentTemperature(String testName, int minTemperature, int maxTemperature, int currentTemperature, int expected) {
        Condition conditioner = new Condition();
        conditioner.setMinTemperature(minTemperature);
        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"'Decrease current temperature over min temperature',-5,5,1,0",
            "'Decrease current temperature under min temperature',-5,5,-6,-6"
    })
    void shouldDecreaseCurrentTemperature(String testName, int minTemperature, int maxTemperature, int currentTemperature, int expected) {
        Condition conditioner = new Condition();
        conditioner.setMinTemperature(minTemperature);
        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}