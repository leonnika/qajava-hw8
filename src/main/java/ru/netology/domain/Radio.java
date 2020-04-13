package ru.netology.domain;

public class Radio {
    private final int fistStation = 0;
    private final int lastStation = 9;
    private final int minVolume = 0;
    private final int maxVolume = 10;
    private int currentStation;
    private int currentVolume;

    public int getFistStation() {
        return fistStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void prevStation() {
        if (currentStation == fistStation) {
            currentStation = lastStation;
            return;
        }
        currentStation--;
    }

    public void nextStation() {
        if (currentStation == lastStation) {
            currentStation = fistStation;
            return;
        }
        currentStation++;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > lastStation) {
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
