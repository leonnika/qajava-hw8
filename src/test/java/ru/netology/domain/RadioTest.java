package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @ParameterizedTest
    @CsvSource({"'Prev Station current - 0',0,9",
            "'Prev Station current not 0',4,3"
    })
    void shouldPrevStation(String testName, int currentStation, int expected) {
        Radio radio = new Radio();
        radio.prevStation(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"'Next Station current - 9',9,0",
            "'Next Station current not 9',4,5"
    })
    void shouldNextStation(String testName, int currentStation, int expected) {
        Radio radio = new Radio();
        radio.nextStation(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"'Set Station over max',10,0",
            "'Set Station under min',-1,0",
            "'Set Station normal ',1,1"
    })
    void shouldSetCurrentStation(String testName, int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"'Volume up over max',11,10",
            "'Volume up under max',1,2"
    })
    void shouldVolumeUp(String testName, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.volumeUp(currentVolume);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"'Volume down over min',2,1",
            "'Volume down under min',0,0"
    })
    void shouldVolumeDown(String testName, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.volumeDown(currentVolume);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}