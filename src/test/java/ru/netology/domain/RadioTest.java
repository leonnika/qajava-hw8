package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @ParameterizedTest
    @CsvSource({"'Prev Station current - fistStation',0,20,19",
            "'Prev Station current not fistStation',4,10,3"
    })
    void shouldPrevStation(String testName, int currentStation, int numberStations, int expected) {
        Radio radio = new Radio(numberStations);
        radio.setCurrentStation(currentStation);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"'Next Station current - lastStation',19,20,0",
            "'Next Station current not lastStation',4,10,5"
    })
    void shouldNextStation(String testName, int currentStation, int numberStations, int expected) {
        Radio radio = new Radio(numberStations);
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"'Set Station over max',6,5,0",
            "'Set Station under min',-1,10,0",
            "'Set Station normal ',1,10,1"
    })
    void shouldSetCurrentStation(String testName, int currentStation, int numberStations,int expected) {
        Radio radio = new Radio(numberStations);
        radio.setCurrentStation(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"'Volume up over max',100,100",
            "'Volume up under max',1,2"
    })
    void shouldVolumeUp(String testName, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.volumeUp();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"'Volume down over min',2,1",
            "'Volume down under min',0,0"
    })
    void shouldVolumeDown(String testName, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.volumeDown();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}