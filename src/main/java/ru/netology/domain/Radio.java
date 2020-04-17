package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private int fistStation = 0;
    private int numberStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation;
    private int currentVolume;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public void prevStation() {
        if (currentStation == fistStation) {
            currentStation = (numberStation - 1);
            return;
        }
        currentStation--;
    }

    public void nextStation() {
        if (currentStation == (numberStation - 1)) {
            currentStation = fistStation;
            return;
        }
        currentStation++;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > (numberStation - 1)) {
            return;
        }
        if (currentStation < fistStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void volumeUp() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume++;
    }

    public void volumeDown() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
            return;
        }
        currentVolume--;
    }
}
